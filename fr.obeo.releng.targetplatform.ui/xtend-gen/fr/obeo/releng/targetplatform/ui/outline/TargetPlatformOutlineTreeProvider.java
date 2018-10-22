/**
 * Copyright (c) 2012-2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mikael Barbero (Obeo) - initial API and implementation
 */
package fr.obeo.releng.targetplatform.ui.outline;

import com.google.inject.Inject;
import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.util.CompositeElementResolver;
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder;
import java.util.LinkedList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
@SuppressWarnings("all")
public class TargetPlatformOutlineTreeProvider extends DefaultOutlineTreeProvider {
  @Inject
  private LocationIndexBuilder indexBuilder;
  
  protected void _createChildren(final IOutlineNode parentNode, final IncludeDeclaration includeDeclaration) {
    super._createChildren(parentNode, includeDeclaration);
    EObject _eContainer = includeDeclaration.eContainer();
    final TargetPlatform enclosingTargetPlatform = ((TargetPlatform) _eContainer);
    final URI enclosingTargetUri = enclosingTargetPlatform.eResource().getURI();
    final URI absoluteEnclosingTargetUri = CompositeElementResolver.convertToAbsoluteUri(enclosingTargetUri);
    final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(enclosingTargetPlatform);
    final URI includeUri = URI.createURI(includeDeclaration.getImportURI());
    URI tempAbsoluteIncludeUri = includeUri;
    if ((includeUri.isRelative() && 
      (!includeUri.isPlatform()))) {
      tempAbsoluteIncludeUri = includeUri.resolve(absoluteEnclosingTargetUri);
    }
    final URI absoluteIncludeUri = tempAbsoluteIncludeUri;
    final Function1<TargetPlatform, Boolean> _function = new Function1<TargetPlatform, Boolean>() {
      @Override
      public Boolean apply(final TargetPlatform it) {
        final TargetPlatform importedTarget = it;
        final URI importedTargetUri = importedTarget.eResource().getURI();
        final URI absoluteImportedTargetUri = CompositeElementResolver.convertToAbsoluteUri(importedTargetUri);
        return Boolean.valueOf(absoluteImportedTargetUri.equals(absoluteIncludeUri));
      }
    };
    final TargetPlatform matchingTarget = IterableExtensions.<TargetPlatform>findFirst(importedTargetPlatforms, _function);
    boolean _tripleNotEquals = (matchingTarget != null);
    if (_tripleNotEquals) {
      this.createNode(parentNode, matchingTarget);
    }
  }
}
