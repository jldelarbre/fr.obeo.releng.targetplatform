package fr.obeo.releng.targetplatform.tests.bugCases

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
class TestDiscoveredBugs {
	
	@Inject
	ParseHelper<TargetPlatform> parser
	
	@Inject
	Provider<XtextResourceSet> resourceSetProvider
	
	@Inject
	LocationIndexBuilder indexBuilder
	
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
}
