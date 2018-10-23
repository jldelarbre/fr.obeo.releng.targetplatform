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
import fr.obeo.releng.targetplatform.Location;
import fr.obeo.releng.targetplatform.Options;
import fr.obeo.releng.targetplatform.TargetContent;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.TargetPlatformFactory;
import fr.obeo.releng.targetplatform.VarDefinition;
import fr.obeo.releng.targetplatform.VarDefinitionContainer;
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder;
import fr.obeo.releng.targetplatform.util.PredefinedVariableGenerator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
  
  @Inject
  private PredefinedVariableGenerator predefinedVariableGenerator;
  
  protected void _createChildren(final IOutlineNode parentNode, final IncludeDeclaration includeDeclaration) {
    super._createChildren(parentNode, includeDeclaration);
    EObject _eContainer = includeDeclaration.eContainer();
    final TargetPlatform enclosingTargetPlatform = ((TargetPlatform) _eContainer);
    final URI enclosingTargetUri = enclosingTargetPlatform.eResource().getURI();
    final URI absoluteEnclosingTargetUri = PredefinedVariableGenerator.convertToAbsoluteUri(enclosingTargetUri);
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
        final URI absoluteImportedTargetUri = PredefinedVariableGenerator.convertToAbsoluteUri(importedTargetUri);
        return Boolean.valueOf(absoluteImportedTargetUri.equals(absoluteIncludeUri));
      }
    };
    final TargetPlatform matchingTarget = IterableExtensions.<TargetPlatform>findFirst(importedTargetPlatforms, _function);
    boolean _tripleNotEquals = (matchingTarget != null);
    if (_tripleNotEquals) {
      this.createNode(parentNode, matchingTarget);
    }
  }
  
  protected void _createChildren(final IOutlineNode parentNode, final TargetPlatform targetPlatform) {
    final Function1<TargetContent, Boolean> _function = new Function1<TargetContent, Boolean>() {
      @Override
      public Boolean apply(final TargetContent it) {
        return Boolean.valueOf((it instanceof Options));
      }
    };
    final Consumer<TargetContent> _function_1 = new Consumer<TargetContent>() {
      @Override
      public void accept(final TargetContent it) {
        TargetPlatformOutlineTreeProvider.this.createNode(parentNode, it);
      }
    };
    IterableExtensions.<TargetContent>filter(targetPlatform.getContents(), _function).forEach(_function_1);
    final Consumer<Location> _function_2 = new Consumer<Location>() {
      @Override
      public void accept(final Location it) {
        TargetPlatformOutlineTreeProvider.this.createNode(parentNode, it);
      }
    };
    targetPlatform.getLocations().forEach(_function_2);
    final Consumer<IncludeDeclaration> _function_3 = new Consumer<IncludeDeclaration>() {
      @Override
      public void accept(final IncludeDeclaration it) {
        TargetPlatformOutlineTreeProvider.this.createNode(parentNode, it);
      }
    };
    targetPlatform.getIncludes().forEach(_function_3);
    VarDefinitionContainer _preDefinedVarContainer = targetPlatform.getPreDefinedVarContainer();
    boolean _tripleEquals = (_preDefinedVarContainer == null);
    if (_tripleEquals) {
      targetPlatform.setPreDefinedVarContainer(TargetPlatformFactory.eINSTANCE.createVarDefinitionContainer());
      VarDefinitionContainer _preDefinedVarContainer_1 = targetPlatform.getPreDefinedVarContainer();
      _preDefinedVarContainer_1.setName("Predefined variables");
    }
    final VarDefinitionContainer preDefinedVarContainer = targetPlatform.getPreDefinedVarContainer();
    preDefinedVarContainer.setVarDefList(CollectionLiterals.<VarDefinition>newArrayList());
    final Consumer<VarDefinition> _function_4 = new Consumer<VarDefinition>() {
      @Override
      public void accept(final VarDefinition it) {
        boolean _isPredefinedVariable = TargetPlatformOutlineTreeProvider.this.predefinedVariableGenerator.isPredefinedVariable(it);
        if (_isPredefinedVariable) {
          preDefinedVarContainer.getVarDefList().add(it);
        }
      }
    };
    targetPlatform.getVarDefinition().forEach(_function_4);
    this.createNode(parentNode, preDefinedVarContainer);
    final Consumer<VarDefinition> _function_5 = new Consumer<VarDefinition>() {
      @Override
      public void accept(final VarDefinition it) {
        boolean _isPredefinedVariable = TargetPlatformOutlineTreeProvider.this.predefinedVariableGenerator.isPredefinedVariable(it);
        boolean _not = (!_isPredefinedVariable);
        if (_not) {
          TargetPlatformOutlineTreeProvider.this.createNode(parentNode, it);
        }
      }
    };
    targetPlatform.getVarDefinition().forEach(_function_5);
  }
  
  protected void _createChildren(final IOutlineNode parentNode, final VarDefinitionContainer varDefinitionContainer) {
    final Consumer<VarDefinition> _function = new Consumer<VarDefinition>() {
      @Override
      public void accept(final VarDefinition it) {
        TargetPlatformOutlineTreeProvider.this.createNode(parentNode, it);
      }
    };
    varDefinitionContainer.getVarDefList().forEach(_function);
  }
  
  protected boolean _isLeaf(final VarDefinitionContainer varDefinitionContainer) {
    List<VarDefinition> _varDefList = varDefinitionContainer.getVarDefList();
    boolean _tripleNotEquals = (_varDefList != null);
    if (_tripleNotEquals) {
      int _size = varDefinitionContainer.getVarDefList().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        return false;
      }
    }
    return true;
  }
}
