package fr.obeo.releng.targetplatform.tests.composite_elements

import com.google.inject.Inject
import com.google.inject.Provider
import fr.obeo.releng.targetplatform.TargetPlatform
import fr.obeo.releng.targetplatform.tests.util.CustomTargetPlatformInjectorProviderTargetReloader
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@InjectWith(typeof(CustomTargetPlatformInjectorProviderTargetReloader))
@RunWith(typeof(XtextRunner))
class TestOverrideImportTarget {
	
	@Inject
	ParseHelper<TargetPlatform> parser
	
	@Inject
	Provider<XtextResourceSet> resourceSetProvider
	
	@Inject
	LocationIndexBuilder indexBuilder
	
	@Test
	def testOverrideVarOnly() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			define a = "overrideVal"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			define a = "baseVal"
			define b = ${a}
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(1, importedTargetPlatforms.length)
		
		val bTargetPlatform = importedTargetPlatforms.first
		
		val varDefA = bTargetPlatform.varDefinition.head
		assertEquals("a", varDefA.name)
		assertEquals("overrideVal", varDefA.overrideValue)
		
		val varDefB = bTargetPlatform.varDefinition.get(1)
		assertEquals("b", varDefB.name)
		assertEquals("overrideVal", varDefB.value.stringParts.head.actualString)
	}
	
	@Test
	def testOverrideIncludeIndirect() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			define a = "dTarget.tpd"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			define a = "cTarget.tpd"
			define b = ${a}
			include ${b}
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		parser.parse('''
			target "dTarget"
		''', URI.createURI("tmp:/dTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(2, importedTargetPlatforms.length)
		
		val bTargetPlatform = importedTargetPlatforms.first
		val importedBTargetPlatforms = indexBuilder.getImportedTargetPlatforms(bTargetPlatform)
		
		assertEquals("dTarget", importedBTargetPlatforms.head.name)
		
		assertEquals("dTarget", importedTargetPlatforms.last.name)
	}
	
	@Test
	def testOverrideIncludeDirect() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			define a = "dTarget.tpd"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			define a = "cTarget.tpd"
			include ${a}
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		parser.parse('''
			target "dTarget"
		''', URI.createURI("tmp:/dTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(2, importedTargetPlatforms.length)
		
		val bTargetPlatform = importedTargetPlatforms.first
		val importedBTargetPlatforms = indexBuilder.getImportedTargetPlatforms(bTargetPlatform)
		
		assertEquals("dTarget", importedBTargetPlatforms.head.name)
		
		assertEquals("dTarget", importedTargetPlatforms.last.name)
	}
	
	@Test
	def testOverrideVersion() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			define emfVer = "[2.9.2,3.0.0)"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			define emfVer = "[2.9.2,2.9.3)"
			location "http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/" {
				org.eclipse.emf.sdk.feature.group ${emfVer}
			}
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(1, importedTargetPlatforms.length)
		
		val bTargetPlatform = importedTargetPlatforms.first
		val emfLocation = bTargetPlatform.locations.head
		
		assertEquals("[2.9.2,3.0.0)", emfLocation.ius.head.version)
	}
	
	@Test
	def testOverrideLocation() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			define locationURL = "http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			define locationURL = "http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/"
			location ${locationURL} {
			}
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(1, importedTargetPlatforms.length)
		
		val bTargetPlatform = importedTargetPlatforms.first
		val location = bTargetPlatform.locations.head
		
		assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", location.uri)
	}
	
	@Test
	def testOverrideRecursive() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			define a = "d2Target.tpd"
			define emfVer = "[2.9.2,3.1.0)"
			define locationURL = "http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			include "cTarget.tpd"
			define a = "dxxxTarget.tpd"
			define emfVer = "[2.9.2,3.0.0)"
			define locationURL = "http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/"
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define a = "d1Target.tpd"
			include ${a}
			define locationURL = "http://download.eclipse.org/eclipse/updates/4.8"
			location ${locationURL} {
			}
			define emfVer = "[2.9.2,2.9.3)"
			location "http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/" {
				org.eclipse.emf.sdk.feature.group ${emfVer}
			}
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		parser.parse('''
			target "d1Target"
		''', URI.createURI("tmp:/d1Target.tpd"), resourceSet)
		parser.parse('''
			target "d2Target"
		''', URI.createURI("tmp:/d2Target.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(3, importedTargetPlatforms.length)
		
		val cTargetPlatform = importedTargetPlatforms.get(1)
		assertEquals("cTarget", cTargetPlatform.name)
		
		val varDefinitionsC = cTargetPlatform.varDefinition
		assertEquals("d2Target.tpd", varDefinitionsC.head.effectiveValue)
		assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", varDefinitionsC.get(1).effectiveValue)
		assertEquals("[2.9.2,3.1.0)", varDefinitionsC.last.effectiveValue)
		
		val includeC = cTargetPlatform.includes.head
		assertEquals("d2Target.tpd", includeC.importURI)
		
		val locationsC = cTargetPlatform.locations
		assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", locationsC.head.uri)
		assertEquals("[2.9.2,3.1.0)", locationsC.last.ius.head.version)
	}
	
	@Test
	def testOverrideRecursiveWithJump() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			define a = "d2Target.tpd"
			define emfVer = "[2.9.2,3.1.0)"
			define locationURL = "http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			include "cTarget.tpd"
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define a = "d1Target.tpd"
			include ${a}
			define locationURL = "http://download.eclipse.org/eclipse/updates/4.8"
			location ${locationURL} {
			}
			define emfVer = "[2.9.2,2.9.3)"
			location "http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/" {
				org.eclipse.emf.sdk.feature.group ${emfVer}
			}
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		parser.parse('''
			target "d1Target"
		''', URI.createURI("tmp:/d1Target.tpd"), resourceSet)
		parser.parse('''
			target "d2Target"
		''', URI.createURI("tmp:/d2Target.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(3, importedTargetPlatforms.length)
		
		val cTargetPlatform = importedTargetPlatforms.get(1)
		assertEquals("cTarget", cTargetPlatform.name)
		
		val varDefinitionsC = cTargetPlatform.varDefinition
		assertEquals("d2Target.tpd", varDefinitionsC.head.effectiveValue)
		assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", varDefinitionsC.get(1).effectiveValue)
		assertEquals("[2.9.2,3.1.0)", varDefinitionsC.last.effectiveValue)
		
		val includeC = cTargetPlatform.includes.head
		assertEquals("d2Target.tpd", includeC.importURI)
		
		val locationsC = cTargetPlatform.locations
		assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", locationsC.head.uri)
		assertEquals("[2.9.2,3.1.0)", locationsC.last.ius.head.version)
	}
	
	@Test
	def testOverrideRecursiveWith2Jumps() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "b1Target.tpd"
			define a = "d2Target.tpd"
			define emfVer = "[2.9.2,3.1.0)"
			define locationURL = "http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "b1Target"
			include "b2Target.tpd"
		''', URI.createURI("tmp:/b1Target.tpd"), resourceSet)
		parser.parse('''
			target "b2Target"
			include "cTarget.tpd"
		''', URI.createURI("tmp:/b2Target.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define a = "d1Target.tpd"
			include ${a}
			define locationURL = "http://download.eclipse.org/eclipse/updates/4.8"
			location ${locationURL} {
			}
			define emfVer = "[2.9.2,2.9.3)"
			location "http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/" {
				org.eclipse.emf.sdk.feature.group ${emfVer}
			}
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		parser.parse('''
			target "d1Target"
		''', URI.createURI("tmp:/d1Target.tpd"), resourceSet)
		parser.parse('''
			target "d2Target"
		''', URI.createURI("tmp:/d2Target.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(4, importedTargetPlatforms.length)
		
		val cTargetPlatform = importedTargetPlatforms.get(2)
		assertEquals("cTarget", cTargetPlatform.name)
		
		val varDefinitionsC = cTargetPlatform.varDefinition
		assertEquals("d2Target.tpd", varDefinitionsC.head.effectiveValue)
		assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", varDefinitionsC.get(1).effectiveValue)
		assertEquals("[2.9.2,3.1.0)", varDefinitionsC.last.effectiveValue)
		
		val includeC = cTargetPlatform.includes.head
		assertEquals("d2Target.tpd", includeC.importURI)
		
		val locationsC = cTargetPlatform.locations
		assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", locationsC.head.uri)
		assertEquals("[2.9.2,3.1.0)", locationsC.last.ius.head.version)
	}
}