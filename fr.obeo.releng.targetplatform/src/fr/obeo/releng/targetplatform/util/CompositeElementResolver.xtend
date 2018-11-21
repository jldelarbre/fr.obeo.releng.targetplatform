package fr.obeo.releng.targetplatform.util

import com.google.inject.Inject
import fr.obeo.releng.targetplatform.IncludeDeclaration
import fr.obeo.releng.targetplatform.TargetPlatform
import fr.obeo.releng.targetplatform.TargetPlatformFactory
import fr.obeo.releng.targetplatform.VarCall
import fr.obeo.releng.targetplatform.VarDefinition
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set

class CompositeElementResolver {

	@Inject
	PredefinedVariableGenerator predefinedVariableGenerator

	@Inject
	LocationIndexBuilder locationIndexBuilder

	@Inject
	ImportVariableManager importVariableManager;

	@Inject
	TargetReloader targetReloader;

	/* Composite elements are string defined by a concatenation of static string and variable call:
	 * "string1" + ${var1} + "aaa" + ${var2} +... */
	def void resolveCompositeElements(TargetPlatform targetPlatform) {
		if (targetPlatform.compositeElementsResolved == true) {
			return
		}

		searchAndAppendDefineFromIncludedTpd(targetPlatform)
		resolveLocations(targetPlatform)
		val importedTargetPlatforms = locationIndexBuilder.
			getImportedTargetPlatformsDoNotResolveCompositeElement(targetPlatform)
		importedTargetPlatforms.forEach [
			resolveLocations(it)
			it.compositeElementsResolved = true
		]
		targetPlatform.compositeElementsResolved = true
	}
	
	/* Override value of variable definition with command line or environment variable */
	private def void overrideVariableDefinition(TargetPlatform targetPlatform) {

		targetPlatform.varDefinition.forEach [
			val varDef = it
			val varDefName = varDef.name

			val variableValue = importVariableManager.getVariableValue(varDefName)
			if (variableValue !== null) {
				varDef.overrideValue = variableValue
			}
		]
	}

	/* Resolve location ("location" directive) means resolve variable call used in location declaration */
	private def resolveLocations(TargetPlatform targetPlatform) {
		targetPlatform.locations.forEach [
			it.resolveUri
			it.resolveIUsVersion
		]
	}
	
	private def searchAndAppendDefineFromIncludedTpd(TargetPlatform targetPlatform) {
		val alreadyVisitedTarget = newHashSet()
		searchAndAppendDefineFromIncludedTpd(targetPlatform, alreadyVisitedTarget)
	}

	/* Search and append to the list of "define": variable definition of the current tpd file (targetPlatform)
	 * the list of "define" found in sub tpd: imported with "include" directive */
	private def void searchAndAppendDefineFromIncludedTpd(TargetPlatform targetPlatform, Set<TargetPlatform> alreadyVisitedTarget) {
		val ImportedDefineFromSubTpd = newHashSet()
		val processedTargetPlatform = newHashMap()

		alreadyVisitedTarget.add(targetPlatform)

		predefinedVariableGenerator.createPreDefinedVariables(targetPlatform)
		overrideVariableDefinition(targetPlatform)

		var directlyImportedTargetPlatforms = searchDirectlyImportedTpd(targetPlatform)

		while (getDistinctTargetPlatforms(directlyImportedTargetPlatforms).size > processedTargetPlatform.size) {
			directlyImportedTargetPlatforms = directlyImportedTargetPlatforms.mapValues[
				// Prevent from circular include
				if (processedTargetPlatform.containsKey(it)) {
					processedTargetPlatform.get(it)
				} else {
					if (alreadyVisitedTarget.contains(it)) {
						processedTargetPlatform.put(it, it)
						it
					} else {
						val notProcessedTargetPlatform = it
						val reloadedTargetPlatform = targetReloader.forceReload(notProcessedTargetPlatform)
						processedTargetPlatform.put(it, reloadedTargetPlatform)
						overrideImportedTargetVariable(reloadedTargetPlatform, targetPlatform)
						searchAndAppendDefineFromIncludedTpd(reloadedTargetPlatform, newHashSet(alreadyVisitedTarget))
						reloadedTargetPlatform.varDefinition.forEach [
							ImportedDefineFromSubTpd.add(it)
						]
						reloadedTargetPlatform
					}
				}
			].immutableCopy

			mergeImportedDefine(targetPlatform, ImportedDefineFromSubTpd)
			directlyImportedTargetPlatforms = searchDirectlyImportedTpd(targetPlatform)
		}

		targetPlatform.importedTargetPlatforms.putAll(directlyImportedTargetPlatforms)
	}

	private def Set<TargetPlatform> getDistinctTargetPlatforms(Map<?, TargetPlatform> targetPlatform) {
		return newHashSet(targetPlatform.values);
	}

	/**
	 * Override variable of the imported tpd with the one of the tpd importer.
	 * 
	 * target "targetA"
	 * define varA = "valA"
	 * include "targetB"
	 * 
	 * ------------------
	 * 
	 * target "targetB"
	 * define varA = "valB"
	 * 
	 * ------------------
	 * 
	 * In this case varA of targetB will be override with the value "valA"
	 */
	private def overrideImportedTargetVariable(TargetPlatform importedTargetPlatform, TargetPlatform importerTargetPlatform) {
		val varDefImporter = importerTargetPlatform.varDefinition
		varDefImporter.filter [
			!it.imported
		].filter [
			it.isWhollyDefinedByTarget
		].forEach [
			val varDef4Overriding = it
			val varDef4OverridingName = varDef4Overriding.name
			val varDef4OverridingValue = varDef4Overriding.getEffectiveValue()
			overrideCurrentVarDef(importedTargetPlatform, varDef4OverridingName, varDef4OverridingValue)
		]
		importerTargetPlatform.varDef2OverrideInImportedTarget.forEach [
			val varDef4Overriding = it
			val varDef4OverridingName = varDef4Overriding.name
			val varDef4OverridingValue = varDef4Overriding.overrideValue
			overrideCurrentVarDef(importedTargetPlatform, varDef4OverridingName, varDef4OverridingValue)
		]
	}

	private def overrideCurrentVarDef(TargetPlatform importedTargetPlatform, String varDef4OverridingName,
		String varDef4OverridingValue) {
		
		val varDef2Override = importedTargetPlatform.varDefinition.findFirst[it.name.equals(varDef4OverridingName)]
		if (varDef2Override !== null) {
			if (!varDef2Override.constant) {
				varDef2Override.overrideValue = varDef4OverridingValue
			}
		} else {
			val varDef = TargetPlatformFactory.eINSTANCE.createVarDefinition
			varDef.name = varDef4OverridingName
			varDef.overrideValue = varDef4OverridingValue
			importedTargetPlatform.varDef2OverrideInImportedTarget.add(varDef)
		}
	}

	/* Targets that are directly imported, with an "include" directive present in the current
	 * target: "targetPlatform". Do not look for target imported through an imported target */
	private def Map<IncludeDeclaration, TargetPlatform> searchDirectlyImportedTpd(TargetPlatform targetPlatform) {
		targetPlatform.includes.filter[it.isResolved].toInvertedMap [
			locationIndexBuilder.getImportedTargetPlatform(targetPlatform.eResource, it)
		].filter[p1, p2|null !== p2]
	}
	
	/*
	 * "variable define" of deepest include are override by "define" of lowest level
	 */
	private def mergeImportedDefine(TargetPlatform targetPlatform, Set<VarDefinition> ImportedDefineFromSubTpd) {
		val toBeAddedDefine = newHashSet()
		ImportedDefineFromSubTpd.forEach [
			val currentImportedDefine = it
			var boolean toBeAdded = targetPlatform.varDefinition.forall [
				val alreadyExistingDefine = it
				val varName = alreadyExistingDefine.name
				!currentImportedDefine.name.equals(varName)
			]
			if (toBeAdded) {
				if (varDefNeverInclude(currentImportedDefine, toBeAddedDefine)) {
					val currentImportedDefineCopy = createImportedCopy(currentImportedDefine)
					toBeAddedDefine.add(currentImportedDefineCopy)
				} else {
					val alreadyAddedVarDef = searchAlreadyIncludeVarDef(currentImportedDefine, toBeAddedDefine)
					val diamondlyInherited = currentImportedDefine.sourceUUID.equals(alreadyAddedVarDef.sourceUUID)
					if (diamondlyInherited) {
						alreadyAddedVarDef.diamondInherit = true
					} else {
						alreadyAddedVarDef.importedValues.add(currentImportedDefine.value.computeActualString)
					}
				}
			}
		]
		targetPlatform.contents.addAll(toBeAddedDefine)
		updateVariableDefinition(targetPlatform)
	}

	private def VarDefinition searchAlreadyIncludeVarDef(VarDefinition varDef2Find,
		HashSet<VarDefinition> alreadyAddedVarDefs) {
		val varDefNameToFind = varDef2Find.name
		val alreadyAddedVarDef = alreadyAddedVarDefs.findFirst [
			val currentVarDef = it
			varDefNameToFind.compareTo(currentVarDef.name) == 0
		]
		alreadyAddedVarDef
	}

	private def VarDefinition createImportedCopy(VarDefinition currentImportedDefine) {
		val currentImportedDefineCopy = TargetPlatformFactory.eINSTANCE.createVarDefinition
		currentImportedDefineCopy.name = currentImportedDefine.name
		currentImportedDefineCopy.value = currentImportedDefine.value.copy
		currentImportedDefineCopy.overrideValue = currentImportedDefine.overrideValue
		currentImportedDefineCopy.imported = true
		currentImportedDefineCopy.importedValues.add(currentImportedDefine.value.computeActualString)
		currentImportedDefineCopy._sourceUUID = currentImportedDefine.sourceUUID
		currentImportedDefineCopy.constant = currentImportedDefine.constant
		currentImportedDefineCopy.dirty = currentImportedDefine.dirty
		currentImportedDefineCopy
	}

	private def boolean varDefNeverInclude(VarDefinition varDefToCheck, HashSet<VarDefinition> alreadyAddedVarDef) {
		val varDefToCheckName = varDefToCheck.name
		alreadyAddedVarDef.forall [
			val currentVarDef = it
			!(varDefToCheckName.compareTo(currentVarDef.name) == 0)
		]
	}

	/*
	 * @param targetContent Elements contained in the target, we only processed variable definition.
	 * 
	 * This method "updateVariableDefinition" is called after we have imported each variable definition from subtarget
	 * 
	 * When a variable definition is copied into another target, if it contains some variable calls,
	 * we eventually need to update them
	 * 
	 * target "mainTpd"
	 * include "subTpd.tpd"
	 * define var1 = ${var2}
	 * define var2b = "value2"
	 * 
	 * target "subTpd"
	 * define var2 = ${var2b}
	 * define var2b = "value2Sub"
	 * 
	 * Only var2 is copied in "mainTpd" (var2b is overloaded in "mainTpd"). But (before import)
	 * var2 refers to var2b of "subTpd", hence if we simply copy it into "mainTpd", var1 will take
	 * the value "value2Sub" instead of "value2" => We have to update the newly created var2 in
	 * "mainTpd" to make it refer to var2b of "mainTpd"
	 */
	private def updateVariableDefinition(TargetPlatform targetPlatform) {
		for (varDef : targetPlatform.varDefinition) {
			if (varDef.value !== null) {
				// varDef.value == null: Same case as in "TargetPlatform.xcore: VarDefinition.checkVarCycle"
				for (stringPart : varDef.value.stringParts) {
					if (stringPart instanceof VarCall) {
						var varCall = stringPart as VarCall
						updateVariableCall(varCall, targetPlatform)
					}
				}
			}
		}
	}

	private def updateVariableCall(VarCall varCall, TargetPlatform targetPlatform) {
		for (varDef : targetPlatform.varDefinition) {
			if (varCall.varName.name == varDef.name) {
				varCall.originalVarName = varCall.varName
				varCall.varName = varDef
			}
		}
	}

	def List<VarDefinition> checkVariableDefinitionCycle(VarDefinition varDef) {
		varDef.checkVarCycle
		return varDef.varDefCycle
	}
}
