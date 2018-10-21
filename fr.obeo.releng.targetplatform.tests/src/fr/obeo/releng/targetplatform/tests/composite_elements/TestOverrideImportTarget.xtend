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
	
	@Test
	def testOverrideVarToManyTargets() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			include "cTarget.tpd"
			define b = "overrideVal1"
			define c = "overrideVal2"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			define b = "baseVal"
			define b2 = ${b}
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define c = "baseVal"
			define c2 = ${c}
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(2, importedTargetPlatforms.length)
		
		val bTargetPlatform = importedTargetPlatforms.last
		
		val varDefB = bTargetPlatform.varDefinition.head
		assertEquals("b", varDefB.name)
		assertEquals("overrideVal1", varDefB.overrideValue)
		
		val varDefB2 = bTargetPlatform.varDefinition.get(1)
		assertEquals("b2", varDefB2.name)
		assertEquals("overrideVal1", varDefB2.value.stringParts.head.actualString)
		
		val cTargetPlatform = importedTargetPlatforms.first
		
		val varDefC = cTargetPlatform.varDefinition.head
		assertEquals("c", varDefC.name)
		assertEquals("overrideVal2", varDefC.overrideValue)
		
		val varDefC2 = cTargetPlatform.varDefinition.get(1)
		assertEquals("c2", varDefC2.name)
		assertEquals("overrideVal2", varDefC2.value.stringParts.head.actualString)
	}
	
	@Test
	def testNotOverrideImported1() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "b1Target.tpd"
			include "b2Target.tpd"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "b1Target"
			define b = "valB1"
		''', URI.createURI("tmp:/b1Target.tpd"), resourceSet)
		parser.parse('''
			target "b2Target"
			define b = "valB2"
		''', URI.createURI("tmp:/b2Target.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(2, importedTargetPlatforms.length)
		
		val b2TargetPlatform = importedTargetPlatforms.first
		assertEquals("b2Target", b2TargetPlatform.name)
		
		val varDefB = b2TargetPlatform.varDefinition.head
		assertEquals("b", varDefB.name)
		assertEquals(null, varDefB.overrideValue)
		assertEquals("valB2", varDefB.effectiveValue)
	}
	
	@Test
	def testNotOverrideImported2() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "b2Target.tpd"
			include "b1Target.tpd"
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "b1Target"
			define b = "valB1"
		''', URI.createURI("tmp:/b1Target.tpd"), resourceSet)
		parser.parse('''
			target "b2Target"
			define b = "valB2"
		''', URI.createURI("tmp:/b2Target.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(2, importedTargetPlatforms.length)
		
		val b2TargetPlatform = importedTargetPlatforms.last
		assertEquals("b2Target", b2TargetPlatform.name)
		
		val varDefB = b2TargetPlatform.varDefinition.head
		assertEquals("b", varDefB.name)
		assertEquals(null, varDefB.overrideValue)
		assertEquals("valB2", varDefB.effectiveValue)
	}
	
	@Test
	def testNotOverrideImported3() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			include ${includeTargetURI}
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			define b = "valB_B"
			define includeTargetURI = "cTarget.tpd"
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define b = "valB_C"
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(2, importedTargetPlatforms.length)
		
		val cTargetPlatform = importedTargetPlatforms.head
		assertEquals("cTarget", cTargetPlatform.name)
		
		val varDefB = cTargetPlatform.varDefinition.head
		assertEquals("b", varDefB.name)
		assertEquals(null, varDefB.overrideValue)
		assertEquals("valB_C", varDefB.effectiveValue)
	}
	
	@Test
	def testNotOverridePartiallyDefinedVariable1() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			include "cTarget.tpd"
			define partiallyDefineVarInA = "foo_" + ${b}
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			define b = "valB_B"
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define partiallyDefineVarInA = "value_C"
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(2, importedTargetPlatforms.length)
		
		val cTargetPlatform = importedTargetPlatforms.head
		assertEquals("cTarget", cTargetPlatform.name)
		
		val varDefB = cTargetPlatform.varDefinition.head
		assertEquals("partiallyDefineVarInA", varDefB.name)
		assertEquals(null, varDefB.overrideValue)
		assertEquals("value_C", varDefB.effectiveValue)
	}
	
	@Test
	def testNotOverridePartiallyDefinedVariable2() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			include ${includeTargetURI}
			define partiallyDefineVarInA = "foo_" + ${b}
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			define b = "valB_B"
			define includeTargetURI = "cTarget.tpd"
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define partiallyDefineVarInA = "value_C"
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(2, importedTargetPlatforms.length)
		
		val cTargetPlatform = importedTargetPlatforms.head
		assertEquals("cTarget", cTargetPlatform.name)
		
		val varDefB = cTargetPlatform.varDefinition.head
		assertEquals("partiallyDefineVarInA", varDefB.name)
		assertEquals(null, varDefB.overrideValue)
		assertEquals("value_C", varDefB.effectiveValue)
	}
	
	@Test
	def testOverrideWithCompositeVarDef1() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "cTarget.tpd"
			define b = "valB"
			define a = "foo_" + ${b}
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define a = "value_C"
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(1, importedTargetPlatforms.length)
		
		val cTargetPlatform = importedTargetPlatforms.head
		assertEquals("cTarget", cTargetPlatform.name)
		
		val varDefA = cTargetPlatform.varDefinition.head
		assertEquals("a", varDefA.name)
		assertEquals("foo_valB", varDefA.overrideValue)
		assertEquals("foo_valB", varDefA.effectiveValue)
	}
	
	@Test
	def testOverrideWithCompositeVarDef2() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "cTarget.tpd"
			define c = "valC"
			define b = ${c}
			define a = "foo_" + ${b}
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define a = "value_C"
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(1, importedTargetPlatforms.length)
		
		val cTargetPlatform = importedTargetPlatforms.head
		assertEquals("cTarget", cTargetPlatform.name)
		
		val varDefA = cTargetPlatform.varDefinition.head
		assertEquals("a", varDefA.name)
		assertEquals("foo_valC", varDefA.overrideValue)
		assertEquals("foo_valC", varDefA.effectiveValue)
	}
	
	@Test
	def testNotOverridePartiallyDefinedVariable3() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "bTarget.tpd"
			include "cTarget.tpd"
			define b = ${b2}
			define a = "foo_" + ${b}
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "bTarget"
			define b2 = "valB2"
		''', URI.createURI("tmp:/bTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define a = "value_C"
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(2, importedTargetPlatforms.length)
		
		val cTargetPlatform = importedTargetPlatforms.head
		assertEquals("cTarget", cTargetPlatform.name)
		
		val varDefA = cTargetPlatform.varDefinition.head
		assertEquals("a", varDefA.name)
		assertEquals(null, varDefA.overrideValue)
		assertEquals("value_C", varDefA.effectiveValue)
	}
	
	@Test
	def testNotOverrideErroneousDefinedVariable() {
		val resourceSet = resourceSetProvider.get
		val aTarget = parser.parse('''
			target "aTarget"
			include "cTarget.tpd"
			define b = ${a}
			define a = "foo_" + ${b}
		''', URI.createURI("tmp:/aTarget.tpd"), resourceSet)
		parser.parse('''
			target "cTarget"
			define a = "value_C"
		''', URI.createURI("tmp:/cTarget.tpd"), resourceSet)
		
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(aTarget)
		assertEquals(1, importedTargetPlatforms.length)
		
		val cTargetPlatform = importedTargetPlatforms.head
		assertEquals("cTarget", cTargetPlatform.name)
		
		val varDefA = cTargetPlatform.varDefinition.head
		assertEquals("a", varDefA.name)
		assertEquals(null, varDefA.overrideValue)
		assertEquals("value_C", varDefA.effectiveValue)
	}
}