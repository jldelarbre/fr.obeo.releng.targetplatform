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
import fr.obeo.releng.targetplatform.TargetPlatform
import fr.obeo.releng.targetplatform.util.CompositeElementResolver
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class TargetPlatformOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	@Inject
	LocationIndexBuilder indexBuilder
	
	protected def void _createChildren(IOutlineNode parentNode, IncludeDeclaration includeDeclaration) {
		super._createChildren(parentNode, includeDeclaration);
		
		val enclosingTargetPlatform = includeDeclaration.eContainer as TargetPlatform
		val enclosingTargetUri = enclosingTargetPlatform.eResource.URI
		val absoluteEnclosingTargetUri = CompositeElementResolver.convertToAbsoluteUri(enclosingTargetUri)
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
			val absoluteImportedTargetUri = CompositeElementResolver.convertToAbsoluteUri(importedTargetUri)
			
			return absoluteImportedTargetUri.equals(absoluteIncludeUri)
		]
		if (matchingTarget !== null) {
			createNode(parentNode, matchingTarget);
		}
	}

//	protected def void _createChildren(IOutlineNode parentNode, VarDefinition varDefinition) {
//		if (varDefinition.name.equals(CompositeElementResolver.CST_USER_DIR) ||
//			varDefinition.name.equals(CompositeElementResolver.CST_TPD_URI) ||
//			varDefinition.name.equals(CompositeElementResolver.CST_TPD_PATH) ||
//			varDefinition.name.equals(CompositeElementResolver.CST_TPD_FILENAME) ||
//			varDefinition.name.equals(CompositeElementResolver.CST_TPD_FILENAME_NO_EXT) ||
//			varDefinition.name.equals(CompositeElementResolver.CST_ABS_TPD_URI) ||
//			varDefinition.name.equals(CompositeElementResolver.CST_ABS_TPD_PATH) ||
//			varDefinition.name.equals(CompositeElementResolver.CST_TPD_DIR) ||
//			varDefinition.name.equals(CompositeElementResolver.CST_ABS_TPD_DIR)
//		) {
//			return
//		}
//		
//		super._createChildren(parentNode, varDefinition);
//	}
}
