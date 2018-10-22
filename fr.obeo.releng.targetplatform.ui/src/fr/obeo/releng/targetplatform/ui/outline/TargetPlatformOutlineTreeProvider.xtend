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

import fr.obeo.releng.targetplatform.IncludeDeclaration
import fr.obeo.releng.targetplatform.TargetPlatform
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder
import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.core.runtime.FileLocator
import java.net.URL

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
		val absoluteEnclosingTargetUri = convertToAbsoluteUri(enclosingTargetUri)
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
			val absoluteImportedTargetUri = convertToAbsoluteUri(importedTargetUri)
			
			return absoluteImportedTargetUri.equals(absoluteIncludeUri)
		]
		if (matchingTarget !== null) {
			createNode(parentNode, matchingTarget);
		}
	}
	
	private def URI convertToAbsoluteUri(URI resourceUri) {
		var absoluteResourceUri = resourceUri
		if (resourceUri.isPlatform) {
			absoluteResourceUri = org.eclipse.emf.common.util.URI.createFileURI(FileLocator.toFileURL(new URL(resourceUri.toString)).file);
		}
		absoluteResourceUri
	}
}
