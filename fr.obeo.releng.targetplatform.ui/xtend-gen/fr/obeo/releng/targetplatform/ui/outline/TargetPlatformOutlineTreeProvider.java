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

import com.google.common.base.Objects;
import com.google.inject.Inject;
import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.Location;
import fr.obeo.releng.targetplatform.Options;
import fr.obeo.releng.targetplatform.TargetContent;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.TargetPlatformFactory;
import fr.obeo.releng.targetplatform.VarDefinition;
import fr.obeo.releng.targetplatform.VarDefinitionContainer;
import fr.obeo.releng.targetplatform.util.CompositeElementResolver;
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder;
import fr.obeo.releng.targetplatform.util.PredefinedVariableGenerator;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
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
  private static final class TargetPlatformEObjectNode extends EObjectNode {
    private Boolean isChildrenAdded = null;
    
    private EObject modelElement;
    
    public TargetPlatformEObjectNode(final EObject eObject, final IOutlineNode parent, final Image image, final Object text, final boolean isLeaf) {
      super(eObject, parent, image, text, isLeaf);
      this.modelElement = eObject;
    }
    
    @Override
    public List<IOutlineNode> getChildren() {
      List<IOutlineNode> _xblockexpression = null;
      {
        boolean _hasChildren = this.hasChildren();
        boolean _not = (!_hasChildren);
        if (_not) {
          Collections.<Object>emptyList();
        }
        boolean _tripleEquals = (null == this.isChildrenAdded);
        if (_tripleEquals) {
          this.getTreeProvider().createChildren(this, this.modelElement);
          if (((null == this.isChildrenAdded) || Objects.equal(Boolean.FALSE, this.isChildrenAdded))) {
            Collections.<Object>emptyList();
          }
        }
        _xblockexpression = super.getChildren();
      }
      return _xblockexpression;
    }
    
    @Override
    protected boolean addChild(final IOutlineNode outlineNode) {
      boolean _xblockexpression = false;
      {
        this.isChildrenAdded = Boolean.valueOf(true);
        _xblockexpression = super.addChild(outlineNode);
      }
      return _xblockexpression;
    }
    
    @Override
    public boolean hasChildren() {
      boolean _tripleEquals = (null == this.isChildrenAdded);
      if (_tripleEquals) {
        return super.hasChildren();
      } else {
        return (this.isChildrenAdded).booleanValue();
      }
    }
  }
  
  @Inject
  private LocationIndexBuilder indexBuilder;
  
  @Inject
  private PredefinedVariableGenerator predefinedVariableGenerator;
  
  @Inject
  private CompositeElementResolver compositeElementResolver;
  
  protected void _createNode(final DocumentRootNode parentNode, final TargetPlatform targetPlatform) {
    this.compositeElementResolver.resolveCompositeElements(targetPlatform);
    super._createNode(parentNode, targetPlatform);
  }
  
  protected void _createChildren(final IOutlineNode parentNode, final IncludeDeclaration includeDeclaration) {
    super._createChildren(parentNode, includeDeclaration);
    EObject _eContainer = includeDeclaration.eContainer();
    final TargetPlatform enclosingTargetPlatform = ((TargetPlatform) _eContainer);
    final EMap<IncludeDeclaration, TargetPlatform> importedTargetPlatforms = enclosingTargetPlatform.getImportedTargetPlatforms();
    final TargetPlatform matchingTarget = importedTargetPlatforms.get(includeDeclaration);
    boolean _tripleNotEquals = (matchingTarget != null);
    if (_tripleNotEquals) {
      this.createNode(parentNode, matchingTarget);
    }
  }
  
  @Override
  protected EObjectNode createEObjectNode(final IOutlineNode parentNode, final EObject modelElement, final Image image, final Object text, final boolean isLeaf) {
    final TargetPlatformOutlineTreeProvider.TargetPlatformEObjectNode eObjectNode = new TargetPlatformOutlineTreeProvider.TargetPlatformEObjectNode(modelElement, parentNode, image, text, isLeaf);
    final ICompositeNode parserNode = NodeModelUtils.getNode(modelElement);
    boolean _tripleNotEquals = (parserNode != null);
    if (_tripleNotEquals) {
      eObjectNode.setTextRegion(parserNode.getTextRegion());
    }
    boolean _isLocalElement = this.isLocalElement(parentNode, modelElement);
    if (_isLocalElement) {
      eObjectNode.setShortTextRegion(this.locationInFileProvider.getSignificantTextRegion(modelElement));
    }
    return eObjectNode;
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
