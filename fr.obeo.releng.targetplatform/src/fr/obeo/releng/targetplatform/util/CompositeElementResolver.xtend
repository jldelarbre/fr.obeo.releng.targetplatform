package fr.obeo.releng.targetplatform.util

import com.google.inject.Inject
import fr.obeo.releng.targetplatform.TargetContent
import fr.obeo.releng.targetplatform.TargetPlatform
import fr.obeo.releng.targetplatform.TargetPlatformFactory
import fr.obeo.releng.targetplatform.VarCall
import fr.obeo.releng.targetplatform.VarDefinition
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.common.util.EList
import org.eclipse.swt.widgets.Display

class CompositeElementResolver {
	
	@Inject
	LocationIndexBuilder locationIndexBuilder
	
	@Inject
	ImportVariableManager importVariableManager;
	
	@Inject
	TargetReloader targetReloader;
	
	/* Composite elements are string defined by a concatenation of static string and variable call:
	 * "string1" + ${var1} + "aaa" + ${var2} +... */ 
	def resolveCompositeElements(TargetPlatform targetPlatform) {
		if (targetPlatform.compositeElementsResolved == true) {
			return
		}
		
		overrideVariableDefinition(targetPlatform)
		
		searchAndAppendDefineFromIncludedTpd(targetPlatform)
		resolveLocations(targetPlatform)
		val importedTargetPlatforms = locationIndexBuilder.getImportedTargetPlatformsDoNotResolveCompositeElement(targetPlatform)
		importedTargetPlatforms.forEach[
			resolveLocations(it)
		]
		
		cleanReferenceResolvingError(targetPlatform)
	}
	
	private def cleanReferenceResolvingError(TargetPlatform targetPlatform) {
		val referenceResolvingErrorClearer = new ReferenceResolvingErrorClearer(targetPlatform.eResource.URI.toString,
																				targetPlatform.varCallFromOnlyImportedVariable)
		Display.^default.asyncExec(referenceResolvingErrorClearer)
	}
	
	private def overrideVariableDefinition(TargetPlatform targetPlatform) {
		val alreadyVisitedTarget = newHashSet()
		overrideVariableDefinition(targetPlatform, alreadyVisitedTarget)
	}
	
	/* Override value of variable definition with command line or environment variable */
	private def void overrideVariableDefinition(TargetPlatform targetPlatform, Set<TargetPlatform> alreadyVisitedTarget) {
		
		alreadyVisitedTarget.add(targetPlatform)
		
		targetPlatform.varDefinition
			.forEach[
				val varDef = it
				val varDefName = varDef.name
				
				val variableValue = importVariableManager.getVariableValue(varDefName)
				if (variableValue !== null) {
					varDef.overrideValue = variableValue
				}
				targetPlatform.modified = true
			]

		val directlyImportedTargetPlatforms = searchDirectlyImportedTpd(targetPlatform)
		directlyImportedTargetPlatforms
			.filter[
				//Prevent from circular include
				!alreadyVisitedTarget.contains(it)
			]
			.forEach[
				val importedTarget = it
				var reloadedImportTarget = it
				if (importedTarget.modified) {
					reloadedImportTarget = targetReloader.forceReloadTarget(targetPlatform, importedTarget)
				}
				overrideVariableDefinition(reloadedImportTarget, newHashSet(alreadyVisitedTarget))
			]
	}
	
	/* Resolve location ("location" directive) means resolve variable call used in location declaration */
	private def resolveLocations(TargetPlatform targetPlatform) {
		targetPlatform.locations.forEach[
			it.resolveUri
			it.resolveIUsVersion
		]
		targetPlatform.compositeElementsResolved = true
		targetPlatform.modified = true
	}
	
	private def searchAndAppendDefineFromIncludedTpd(TargetPlatform targetPlatform) {
		val alreadyVisitedTarget = newHashSet()
		searchAndAppendDefineFromIncludedTpd(targetPlatform, alreadyVisitedTarget)
	}
	
	/* Search and append to the list of "define": variable definition of the current tpd file (targetPlatform)
	 * the list of "define" found in sub tpd: imported with "include" directive */
	private def void searchAndAppendDefineFromIncludedTpd(TargetPlatform targetPlatform, Set<TargetPlatform> alreadyVisitedTarget) {
		val ImportedDefineFromSubTpd = newHashSet()
		val processedTargetPlatform = newLinkedList()
		
		alreadyVisitedTarget.add(targetPlatform)
		
		var directlyImportedTargetPlatforms = searchDirectlyImportedTpd(targetPlatform)
		
		while(directlyImportedTargetPlatforms.size > processedTargetPlatform.size) {
			directlyImportedTargetPlatforms
				.filter[
					//Prevent from circular include
					!alreadyVisitedTarget.contains(it)
				]
				.filter[
					!processedTargetPlatform.contains(it)
				]
				.forEach[
					var notProcessedTargetPlatform = it
					overrideVariableDefinition(notProcessedTargetPlatform, alreadyVisitedTarget)
					searchAndAppendDefineFromIncludedTpd(notProcessedTargetPlatform, newHashSet(alreadyVisitedTarget))
					notProcessedTargetPlatform.varDefinition.forEach[
						ImportedDefineFromSubTpd.add(it)
					]
				]
			val newlyProcessedTarget = directlyImportedTargetPlatforms
				.filter [
					!processedTargetPlatform.contains(it)
				]
				.toSet
			processedTargetPlatform.addAll(newlyProcessedTarget)
			mergeImportedDefine(targetPlatform, ImportedDefineFromSubTpd)
			directlyImportedTargetPlatforms = searchDirectlyImportedTpd(targetPlatform)
		}
	}
	
	/* Targets that are directly imported, with an "include" directive present in the current
	 * target: "targetPlatform". Do not look for target imported through an imported target */
	private def List<TargetPlatform> searchDirectlyImportedTpd(TargetPlatform targetPlatform) {
		targetPlatform.includes
			.filter[
				it.isResolved
			]
			.map[
				locationIndexBuilder.getImportedTargetPlatform(targetPlatform.eResource, it)
			]
			.filter[
				it !== null
			]
			.toList
	}
	
	/*
	 * "variable define" of deepest include are override by "define" of lowest level
	 */
	private def mergeImportedDefine(TargetPlatform targetPlatform, Set<VarDefinition> ImportedDefineFromSubTpd) {
		val toBeAddedDefine = newHashSet()
		val targetContent = targetPlatform.contents
		ImportedDefineFromSubTpd
			.forEach[
				val currentImportedDefine = it
				var boolean toBeAdded = targetContent
					.filter[
						it instanceof VarDefinition
					]
					.forall[
						val alreadyExistingDefine = it as VarDefinition
						val varName = alreadyExistingDefine.name
						!currentImportedDefine.name.equals(varName)
					]
				if (toBeAdded) {
					if (varDefNeverInclude(currentImportedDefine, toBeAddedDefine)) {
						val currentImportedDefineCopy = createImportedCopy(currentImportedDefine)
						toBeAddedDefine.add(currentImportedDefineCopy)
					}
					else {
						val alreadyAddedVarDef = searchAlreadyIncludeVarDef(currentImportedDefine, toBeAddedDefine)
						val diamondlyInherited = currentImportedDefine.sourceUUID.equals(alreadyAddedVarDef.sourceUUID)
						if (diamondlyInherited) {
							alreadyAddedVarDef.diamondInherit = true
						}
						else {
							alreadyAddedVarDef.importedValues.add(currentImportedDefine.value.computeActualString)
						}
					}
				}
			]
		targetContent.addAll(toBeAddedDefine)
		val varCallFromImpVar = updateVariableDefinition(targetContent)
		updateVarCallFromImportedVar(targetPlatform, varCallFromImpVar)
		targetPlatform.modified = true
	}
	
	/* Purpose of updateVarCallFromImportedVar
	 * see TestVariableVariableDefinition.testExtractVarCallFromOnlyImportedVariable
	 * 
	 * Consider the following case:
	 * 
	 * maintTpd.tpd
	 * ============
	 * target "mainTpd"
	 * include "subTpd.tpd"
	 * define var = ${impVar}
	 * 
	 * subTpd.tpd
	 * ==========
	 * target "subTpd"
	 * define impVar = "value"
	 * 
	 * Inside mainTpd, we have the varCall ${impVar}, XTExt does not know how to manage variable call from imported target.
	 * So it raises an error in eclipse editor. It is just a displayed warning and it does not disturb the generation of target.
	 * 
	 * To make a clearer editor display, we list all this case to clean them with method:
	 */
	private def updateVarCallFromImportedVar(TargetPlatform targetPlatform, Set<String> varCallFromImpVar) {
		targetPlatform.varCallFromOnlyImportedVariable = varCallFromImpVar.toString.substring(1, varCallFromImpVar.toString.length - 1)
	}
	
	private def VarDefinition searchAlreadyIncludeVarDef(VarDefinition varDef2Find, HashSet<VarDefinition> alreadyAddedVarDefs) {
		val varDefNameToFind = varDef2Find.name
		val alreadyAddedVarDef = alreadyAddedVarDefs.findFirst[
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
		currentImportedDefineCopy
	}
	
	private def boolean varDefNeverInclude(VarDefinition varDefToCheck, HashSet<VarDefinition> alreadyAddedVarDef) {
		val varDefToCheckName = varDefToCheck.name
		alreadyAddedVarDef.forall[
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
	private def Set<String> updateVariableDefinition(EList<TargetContent> targetContent) {
		val varCallFromImpVar = newHashSet()
		for (varDef : targetContent) {
			if (varDef instanceof VarDefinition) {
				for (stringPart : varDef.value.stringParts) {
					if (stringPart instanceof VarCall) {
						var varCall = stringPart as VarCall
						val tmpVarCallFromImpVar = updateVariableCall(varCall, targetContent)
						varCallFromImpVar.addAll(tmpVarCallFromImpVar)
					}
				}
			}
		}
		varCallFromImpVar
	}
	
	private def Set<String> updateVariableCall(VarCall varCall, EList<TargetContent> targetContent) {
		val varCallFromImpVar = newHashSet()
		for (varDef : targetContent) {
			if (varDef instanceof VarDefinition) {
				if (varCall.varName.name == varDef.name) {
					varCall.originalVarName = varCall.varName
					varCall.varName = varDef
					if (varDef.imported) {
						varCallFromImpVar.add(varDef.name)
					}
				}
			}
		}
		varCallFromImpVar
	}
	
	def List<VarDefinition> checkVariableDefinitionCycle(VarDefinition varDef) {
		varDef.checkVarCycle
		return varDef.varDefCycle
	}
}