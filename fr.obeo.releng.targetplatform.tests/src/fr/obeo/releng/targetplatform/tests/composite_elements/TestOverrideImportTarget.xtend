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
	def testIncludeWithMultipleStaticString() {
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
		
		val varDefA = bTargetPlatform.varDefinition.get(0)
		assertEquals("a", varDefA.name)
		assertEquals("overrideVal", varDefA.overrideValue)
		
		val varDefB = bTargetPlatform.varDefinition.get(1)
		assertEquals("b", varDefB.name)
		assertEquals("overrideVal", varDefB.value.stringParts.head.actualString)
	}
}