package fr.obeo.releng.targetplatform.util

import fr.obeo.releng.targetplatform.TargetPlatform
import org.eclipse.emf.common.util.URI
import org.eclipse.core.runtime.FileLocator
import java.net.URL
import fr.obeo.releng.targetplatform.TargetPlatformFactory

class PredefinedVariableGenerator {
	
	public static final String CST_USER_DIR            = "userDir"
	public static final String CST_TPD_URI             = "tpdUri"
	public static final String CST_TPD_PATH            = "tpdPath"
	public static final String CST_TPD_FILENAME        = "tpdFileName"
	public static final String CST_TPD_FILENAME_NO_EXT = "tpdFileNameNoExtension"
	public static final String CST_ABS_TPD_URI         = "absoluteTpdUri"
	public static final String CST_ABS_TPD_PATH        = "absoluteTpdPath"
	public static final String CST_TPD_DIR             = "tpdDir"
	public static final String CST_ABS_TPD_DIR         = "absoluteTpdDir"
	public static final int NUM_PREDIFINED_VAR = 9
	
	public def createPreDefinedVariables(TargetPlatform targetPlatform) {
		createPredefinedVariable(targetPlatform, CST_USER_DIR, System.getProperty("user.home"))
		
		val tpdPathVarValue = targetPlatform.eResource.URI
		createPredefinedVariable(targetPlatform, CST_TPD_URI, tpdPathVarValue.toString)
		createPredefinedVariable(targetPlatform, CST_TPD_PATH, tpdPathVarValue.path)
		createPredefinedVariable(targetPlatform, CST_TPD_FILENAME, tpdPathVarValue.lastSegment)
		var tpdFileNameNoExtension = tpdPathVarValue.lastSegment
		if (tpdPathVarValue.lastSegment.endsWith(".tpd")) {
			tpdFileNameNoExtension = tpdFileNameNoExtension.substring(0, tpdFileNameNoExtension.length-4)
		}
		createPredefinedVariable(targetPlatform, CST_TPD_FILENAME_NO_EXT, tpdFileNameNoExtension)
		
		val absoluteTpdPathVarValue = convertToAbsoluteUri(tpdPathVarValue)
		createPredefinedVariable(targetPlatform, CST_ABS_TPD_URI, absoluteTpdPathVarValue.toString)
		createPredefinedVariable(targetPlatform, CST_ABS_TPD_PATH, absoluteTpdPathVarValue.path)
		val lastIndexTpdDir = tpdPathVarValue.path.toString.lastIndexOf("/")
		if (lastIndexTpdDir != -1) {
			val tpdDir = tpdPathVarValue.path.toString.substring(0, lastIndexTpdDir)
			createPredefinedVariable(targetPlatform, CST_TPD_DIR, tpdDir)
		}
		val lastIndexAbsTpdDir = absoluteTpdPathVarValue.path.toString.lastIndexOf("/")
		if (lastIndexAbsTpdDir != -1) {
			val absoluteTpdDir = absoluteTpdPathVarValue.path.toString.substring(0, lastIndexAbsTpdDir)
			createPredefinedVariable(targetPlatform, CST_ABS_TPD_DIR, absoluteTpdDir)
		}
	}
	
	private def createPredefinedVariable(TargetPlatform targetPlatform, String predefinedVarName, String predefinedVarValue) {
		val predefinedVarExist = targetPlatform.varDefinition.exists[
			it.name.equals(predefinedVarName)
		]
		if (!predefinedVarExist) {
			val predefinedVar = TargetPlatformFactory.eINSTANCE.createVarDefinition
			predefinedVar.name = predefinedVarName
			predefinedVar.value = TargetPlatformFactory.eINSTANCE.createCompositeString
			val staticString = TargetPlatformFactory.eINSTANCE.createStaticString
			staticString.value = predefinedVarValue
			predefinedVar.value.stringParts.add(staticString)
			targetPlatform.contents.add(predefinedVar)
		}
	}
	
	public static def URI convertToAbsoluteUri(URI resourceUri) {
		var absoluteResourceUri = resourceUri
		if (resourceUri.isPlatform) {
			absoluteResourceUri = URI.createFileURI(FileLocator.toFileURL(new URL(resourceUri.toString)).file);
		}
		absoluteResourceUri
	}
}