/*******************************************************************************
 * Copyright (c) 2012-2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mikael Barbero (Obeo) - initial API and implementation
 *******************************************************************************/
package fr.obeo.releng.targetplatform.ui.outline

import com.google.inject.Inject
import fr.obeo.releng.targetplatform.IncludeDeclaration
import fr.obeo.releng.targetplatform.Options
import fr.obeo.releng.targetplatform.TargetPlatform
import fr.obeo.releng.targetplatform.TargetPlatformFactory
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder
import fr.obeo.releng.targetplatform.util.PredefinedVariableGenerator
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import fr.obeo.releng.targetplatform.VarDefinitionContainer

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class TargetPlatformOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	@Inject
	LocationIndexBuilder indexBuilder
	
	@Inject
	PredefinedVariableGenerator predefinedVariableGenerator
	
	protected def void _createChildren(IOutlineNode parentNode, IncludeDeclaration includeDeclaration) {
		super._createChildren(parentNode, includeDeclaration);
		
		val enclosingTargetPlatform = includeDeclaration.eContainer as TargetPlatform
		val enclosingTargetUri = enclosingTargetPlatform.eResource.URI
		val absoluteEnclosingTargetUri = PredefinedVariableGenerator.convertToAbsoluteUri(enclosingTargetUri)
		val importedTargetPlatforms = indexBuilder.getImportedTargetPlatforms(enclosingTargetPlatform)
		
		val includeUri = URI.createURI(includeDeclaration.importURI);
		var tempAbsoluteIncludeUri = includeUri;
		if (includeUri.relative &&
			!includeUri.platform) {
			tempAbsoluteIncludeUri = includeUri.resolve(absoluteEnclosingTargetUri)
		}
		val absoluteIncludeUri = tempAbsoluteIncludeUri
		
		val matchingTarget = importedTargetPlatforms.findFirst[
			val importedTarget = it
			val importedTargetUri = importedTarget.eResource.URI
			val absoluteImportedTargetUri = PredefinedVariableGenerator.convertToAbsoluteUri(importedTargetUri)
			
			return absoluteImportedTargetUri.equals(absoluteIncludeUri)
		]
		if (matchingTarget !== null) {
			createNode(parentNode, matchingTarget);
		}
	}
	
	protected def void _createChildren(IOutlineNode parentNode, TargetPlatform targetPlatform) {
		targetPlatform.contents.filter[
			it instanceof Options
		]
		.forEach[
			createNode(parentNode, it);
		]
		
		targetPlatform.locations.forEach[
			createNode(parentNode, it);
		]
		
		targetPlatform.includes.forEach[
			createNode(parentNode, it);
		]
		
		if (targetPlatform.preDefinedVarContainer === null) {
			targetPlatform.preDefinedVarContainer = TargetPlatformFactory.eINSTANCE.createVarDefinitionContainer
			targetPlatform.preDefinedVarContainer.name = "Predefined variables"
		}
		val preDefinedVarContainer = targetPlatform.preDefinedVarContainer
		preDefinedVarContainer.varDefList = newArrayList()
		targetPlatform.varDefinition.forEach[
			if (predefinedVariableGenerator.isPredefinedVariable(it)) {
				preDefinedVarContainer.varDefList.add(it)
			}
		]
		createNode(parentNode, preDefinedVarContainer);
		
		targetPlatform.varDefinition.forEach[
			if (!predefinedVariableGenerator.isPredefinedVariable(it)) {
				createNode(parentNode, it);
			}
		]
	}
	
	protected def void _createChildren(IOutlineNode parentNode, VarDefinitionContainer varDefinitionContainer) {
		varDefinitionContainer.varDefList.forEach[
			createNode(parentNode, it);
		]
	}
	
	protected def boolean _isLeaf(VarDefinitionContainer varDefinitionContainer) {
		if (varDefinitionContainer.varDefList !== null) {
			if (varDefinitionContainer.varDefList.size > 0) {
				return false
			}
		}
		return true
	}
}
