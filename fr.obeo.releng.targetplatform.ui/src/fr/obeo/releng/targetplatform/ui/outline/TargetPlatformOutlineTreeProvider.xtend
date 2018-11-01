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
import fr.obeo.releng.targetplatform.VarDefinitionContainer
import fr.obeo.releng.targetplatform.util.CompositeElementResolver
import fr.obeo.releng.targetplatform.util.PredefinedVariableGenerator
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.swt.graphics.Image
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class TargetPlatformOutlineTreeProvider extends DefaultOutlineTreeProvider {

	@Inject
	PredefinedVariableGenerator predefinedVariableGenerator

	@Inject
	CompositeElementResolver compositeElementResolver

	protected def void _createNode(DocumentRootNode parentNode, TargetPlatform targetPlatform) {
		compositeElementResolver.resolveCompositeElements(targetPlatform)
		super._createNode(parentNode, targetPlatform)
	}

	protected def void _createChildren(IOutlineNode parentNode, IncludeDeclaration includeDeclaration) {
		super._createChildren(parentNode, includeDeclaration);

		val enclosingTargetPlatform = includeDeclaration.eContainer as TargetPlatform
		val importedTargetPlatforms = enclosingTargetPlatform.importedTargetPlatforms
		val matchingTarget = importedTargetPlatforms.get(includeDeclaration)
		if (matchingTarget !== null) {
			createNode(parentNode, matchingTarget);
		}
	}

	private static final class TargetPlatformEObjectNode extends EObjectNode {
		Boolean isChildrenAdded = null
		EObject modelElement

		new(EObject eObject, IOutlineNode parent, Image image, Object text, boolean isLeaf) {
			super(eObject, parent, image, text, isLeaf)
			this.modelElement = eObject
		}

		override List<IOutlineNode> getChildren() {
			if (!hasChildren)
				Collections.emptyList();
			if (null === isChildrenAdded) {
				getTreeProvider().createChildren(this, modelElement);
				if (null === isChildrenAdded || Boolean.FALSE == isChildrenAdded) {
					Collections.emptyList();
				}
			}
			
			super.children;
		}

		override protected addChild(IOutlineNode outlineNode) {
			isChildrenAdded = true
			super.addChild(outlineNode)
		}

		override hasChildren() {
			if (null === isChildrenAdded) {
				return super.hasChildren
			} else {
				return isChildrenAdded
			}
		}
	}

	protected override EObjectNode createEObjectNode(IOutlineNode parentNode, EObject modelElement, Image image,
		Object text, boolean isLeaf) {
		val eObjectNode = new TargetPlatformEObjectNode(modelElement, parentNode, image, text, isLeaf)

		val parserNode = NodeModelUtils.getNode(modelElement);
		if (parserNode !== null)
			eObjectNode.setTextRegion(parserNode.getTextRegion());
		if (isLocalElement(parentNode, modelElement))
			eObjectNode.setShortTextRegion(locationInFileProvider.getSignificantTextRegion(modelElement));
		return eObjectNode;
	}

	protected def void _createChildren(IOutlineNode parentNode, TargetPlatform targetPlatform) {
		targetPlatform.contents.filter [
			it instanceof Options
		].forEach [
			createNode(parentNode, it);
		]

		targetPlatform.locations.forEach [
			createNode(parentNode, it);
		]

		targetPlatform.includes.forEach [
			createNode(parentNode, it);
		]

		if (targetPlatform.preDefinedVarContainer === null) {
			targetPlatform.preDefinedVarContainer = TargetPlatformFactory.eINSTANCE.createVarDefinitionContainer
			targetPlatform.preDefinedVarContainer.name = "Predefined variables"
		}
		val preDefinedVarContainer = targetPlatform.preDefinedVarContainer
		preDefinedVarContainer.varDefList = newArrayList()
		targetPlatform.varDefinition.forEach [
			if (predefinedVariableGenerator.isPredefinedVariable(it)) {
				preDefinedVarContainer.varDefList.add(it)
			}
		]
		createNode(parentNode, preDefinedVarContainer);

		targetPlatform.varDefinition.forEach [
			if (!predefinedVariableGenerator.isPredefinedVariable(it)) {
				createNode(parentNode, it);
			}
		]
	}

	protected def void _createChildren(IOutlineNode parentNode, VarDefinitionContainer varDefinitionContainer) {
		varDefinitionContainer.varDefList.forEach [
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
