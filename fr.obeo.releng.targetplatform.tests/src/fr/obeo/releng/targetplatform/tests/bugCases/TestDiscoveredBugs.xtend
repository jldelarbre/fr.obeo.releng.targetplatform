package fr.obeo.releng.targetplatform.tests.bugCases

import com.google.inject.Inject
import com.google.inject.Provider
import fr.obeo.releng.targetplatform.TargetPlatform
import fr.obeo.releng.targetplatform.tests.util.CustomTargetPlatformInjectorProviderTargetReloader
import fr.obeo.releng.targetplatform.util.ImportVariableManager
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import fr.obeo.releng.targetplatform.validation.TargetPlatformValidator

@InjectWith(typeof(CustomTargetPlatformInjectorProviderTargetReloader))
@RunWith(typeof(XtextRunner))
class TestDiscoveredBugs {
	
	@Inject
	ParseHelper<TargetPlatform> parser
	
	@Inject
	Provider<XtextResourceSet> resourceSetProvider
	
	@Inject
	LocationIndexBuilder indexBuilder
	
	@Inject
	TargetPlatformValidator targetPlatformValidator
	
	@Inject
	ImportVariableManager importVariableManager;
	
	@Test
	def testIncludeWithMultipleStaticString() {
		val resourceSet = resourceSetProvider.get
		val firstLevelTarget = parser.parse('''
			target "firstLevelTarget"
			include "secondLevelTarget.tpd"
		''', URI.createURI("tmp:/firstLevelTarget.tpd"), resourceSet)
		parser.parse('''
			target "secondLevelTarget"
			include "thirdLevelTarget.tpd"
		''', URI.createURI("tmp:/secondLevelTarget.tpd"), resourceSet)
		parser.parse('''
			target "thirdLevelTarget"
			location "http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/" {
				org.eclipse.emf.sdk.feature.group
			}
		''', URI.createURI("tmp:/thirdLevelTarget.tpd"), resourceSet)
		
		//First we resolve the target (with its included target)
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(firstLevelTarget)
		assertEquals(2, importedTargetPlatforms.length)
		
		//checkIncludeCycle causes forceRelaod of thirdLevelTarget in compositeElementResolver.overrideVariableDefinition
		//but thirdLevelTarget is not correctly reload, so the uri of location in thirdLevelTarget is null
		indexBuilder.checkIncludeCycle(firstLevelTarget)
		
		//getLocationIndex ends with NullPointerException (before bug fix), cause uri of location in thirdLevelTarget is null
		indexBuilder.getLocationIndex(firstLevelTarget)
		
		//The test shall normally reaches this point
		assertTrue(true)
	}
	
	//Bug in version 2.3 due to run of many check before resolving target definition
	//Test a complete case and run all checks (in the same run) to simulate eclipse environment
	//In tests all checks are never run together
	@Test
	def testCompleteCaseAfterRunAllChecks() {
		val String[] args = #["", ImportVariableManager.OVERRIDE, "someLocation=http://download.eclipse.org/eclipse/updates/4.7"]
		importVariableManager.processCommandLineArguments(args)
		
		val resourceSet = resourceSetProvider.get
		val completeTpd = parser.parse('''
			target "completeTpd"
			include "subTpd.tpd"
			define subDirNameRef = ${subDirName} + "/"
			include ${subDirNameRef} + "subInclude.tpd"
			define someLocation = "otherLocationURL"
			location ${someLocation} {
				org.eclipse.pde.core
			}
		''', URI.createURI("tmp:/completeTpd.tpd"), resourceSet)
		parser.parse('''
			target "subTpd"
			define someLocation = "locationURL"
			define subDirName="subdir"
		''', URI.createURI("tmp:/subTpd.tpd"), resourceSet)
		parser.parse('''
			target "subInclude"
			include "subSubInclude.tpd"
			define emfVerStart = "2.9.2"
			define emfVer = "[" + ${emfVerStart} + "," + ${emfVerEnd} + ")"
			define someLocationUri = ${serverAddress} + "modeling/emf/emf/updates/2.9.x/core/R201402030812/"
			location ${someLocationUri} {
				org.eclipse.emf.sdk.feature.group ${emfVer}
			}
		''', URI.createURI("tmp:/subdir/subInclude.tpd"), resourceSet)
		parser.parse('''
			target "subSubInclude"
			define serverAddress = "http://download.eclipse.org/"
			define emfVerStart = "2.8.0"
			define emfVerEnd = "3.0.0"
		''', URI.createURI("tmp:/subdir/subSubInclude.tpd"), resourceSet)
		
		//Resolve target 1st time
		indexBuilder.getLocationIndex(completeTpd)
		
 		// Call all checks		
		indexBuilder.checkIncludeCycle(completeTpd)
		targetPlatformValidator.checkAllEnvAndRequiredAreSelfExluding(completeTpd)
		targetPlatformValidator.checkNoDuplicateOptions(completeTpd)
		targetPlatformValidator.checkOptionsOnLocationAreIdentical(completeTpd)
		targetPlatformValidator.checkIDUniqueOnAllLocations(completeTpd)
		targetPlatformValidator.checkImportCycle(completeTpd)
		targetPlatformValidator.checkVarDefinitionCycle(completeTpd)
		targetPlatformValidator.checkSameIDForAllLocationWithSameURI(completeTpd)
		targetPlatformValidator.checkOneEnvironment(completeTpd)
		targetPlatformValidator.checkOneOptions(completeTpd)
		targetPlatformValidator.checkNoDuplicateEnvironmentOptions(completeTpd)
		targetPlatformValidator.checkNoDuplicatedIU(completeTpd)
		targetPlatformValidator.checkNoDuplicatedDefine(completeTpd)

		//Resolve target 2nd time (check no errors appear if resolve target 2 times)
		val locationIndex = indexBuilder.getLocationIndex(completeTpd)
		assertEquals(2, locationIndex.size)
		val firstLoc = locationIndex.get("http://download.eclipse.org/eclipse/updates/4.7")
		assertEquals("http://download.eclipse.org/eclipse/updates/4.7", firstLoc.head.uri)
		val secondLoc = locationIndex.get("http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/")
		assertEquals("http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/", secondLoc.head.uri)
		
		val compositeImportURI = completeTpd.includes.last.compositeImportURI
		assertEquals("subdir/", compositeImportURI.stringParts.head.actualString)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(completeTpd)
		assertEquals(3, importedTargetPlatforms.size)
		val targetPlatform = importedTargetPlatforms.first
		assertEquals("subInclude", targetPlatform.name)
		val locationEMF = targetPlatform.locations.last
		assertEquals("http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/", locationEMF.uri)
		assertEquals("[2.9.2,3.0.0)", locationEMF.ius.head.version)
		
		val locationEclipse = completeTpd.locations.head
		assertEquals("http://download.eclipse.org/eclipse/updates/4.7", locationEclipse.uri)
		
		importVariableManager.clear
	}
	
	// Not a bug case, but a kind of torture test
	@Test
	def testComplexCaseManyInterleavedResolution() {
		val resourceSet = resourceSetProvider.get
		val completeTpd = parser.parse('''
			target "completeTpd"
			include "subTpd.tpd"
			define subDirNameRef = ${subDirName} + "/"
			include ${subDirNameRef} + "subInclude.tpd"
		''', URI.createURI("tmp:/completeTpd.tpd"), resourceSet)
		parser.parse('''
			target "subTpd"
			define subDirName="subdir"
		''', URI.createURI("tmp:/subTpd.tpd"), resourceSet)
		parser.parse('''
			target "subInclude"
			include "subSubInclude.tpd"
			include ${subsubInclude2Adress}
			location ${locationURL} {
				org.eclipse.pde.core
			}
		''', URI.createURI("tmp:/subdir/subInclude.tpd"), resourceSet)
		parser.parse('''
			target "subSubInclude"
			define subsubInclude2Adress="subSubInclude2.tpd"
		''', URI.createURI("tmp:/subdir/subSubInclude.tpd"), resourceSet)
		parser.parse('''
			target "subSubInclude2"
			define locationURL="http://download.eclipse.org/eclipse/updates/4.7"
		''', URI.createURI("tmp:/subdir/subSubInclude2.tpd"), resourceSet)
		
		val locationIndex = indexBuilder.getLocationIndex(completeTpd)
		assertEquals(1, locationIndex.size)
		val firstLoc = locationIndex.get("http://download.eclipse.org/eclipse/updates/4.7")
		assertEquals("http://download.eclipse.org/eclipse/updates/4.7", firstLoc.head.uri)
	}
}
