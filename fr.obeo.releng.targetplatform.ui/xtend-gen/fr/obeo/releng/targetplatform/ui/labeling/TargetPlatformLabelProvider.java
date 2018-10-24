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
package fr.obeo.releng.targetplatform.ui.labeling;

import com.google.inject.Inject;
import fr.obeo.releng.targetplatform.CompositeString;
import fr.obeo.releng.targetplatform.Environment;
import fr.obeo.releng.targetplatform.IU;
import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.Location;
import fr.obeo.releng.targetplatform.Option;
import fr.obeo.releng.targetplatform.Options;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.VarCall;
import fr.obeo.releng.targetplatform.VarDefinition;
import fr.obeo.releng.targetplatform.VarDefinitionContainer;
import fr.obeo.releng.targetplatform.util.CompositeElementResolver;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class TargetPlatformLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  private CompositeElementResolver compositeElementResolver;
  
  @Inject
  public TargetPlatformLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public StyledString text(final Location object) {
    StyledString _xblockexpression = null;
    {
      final StyledString ss = new StyledString();
      String _uri = object.getUri();
      boolean _tripleEquals = (_uri == null);
      if (_tripleEquals) {
        EObject _eContainer = object.eContainer();
        this.compositeElementResolver.resolveCompositeElements(((TargetPlatform) _eContainer));
        object.resolveUri();
      }
      ss.append(object.getUri());
      String _iD = object.getID();
      boolean _tripleNotEquals = (_iD != null);
      if (_tripleNotEquals) {
        String _iD_1 = object.getID();
        String _plus = (" " + _iD_1);
        ss.append(_plus, StyledString.DECORATIONS_STYLER);
      }
      _xblockexpression = ss;
    }
    return _xblockexpression;
  }
  
  public String image(final Location object) {
    return "obj16/location_obj.gif";
  }
  
  public StyledString text(final IU object) {
    StyledString _xblockexpression = null;
    {
      final StyledString ss = new StyledString();
      ss.append(object.getID());
      String _version = object.getVersion();
      boolean _tripleNotEquals = (_version != null);
      if (_tripleNotEquals) {
        String _version_1 = object.getVersion();
        String _plus = (" " + _version_1);
        ss.append(_plus, StyledString.COUNTER_STYLER);
      }
      _xblockexpression = ss;
    }
    return _xblockexpression;
  }
  
  public String image(final IU object) {
    return "obj16/iu_obj.gif";
  }
  
  public String text(final TargetPlatform object) {
    String _xblockexpression = null;
    {
      boolean _isCompositeElementsResolved = object.isCompositeElementsResolved();
      boolean _not = (!_isCompositeElementsResolved);
      if (_not) {
        this.compositeElementResolver.resolveCompositeElements(object);
      }
      _xblockexpression = object.getName();
    }
    return _xblockexpression;
  }
  
  public String image(final TargetPlatform object) {
    return "obj16/target_obj.gif";
  }
  
  public StyledString text(final IncludeDeclaration object) {
    StyledString _xblockexpression = null;
    {
      final StyledString ss = new StyledString();
      String _importURI = object.getImportURI();
      boolean _tripleEquals = (_importURI == null);
      if (_tripleEquals) {
        EObject _eContainer = object.eContainer();
        this.compositeElementResolver.resolveCompositeElements(((TargetPlatform) _eContainer));
        object.generateImportURI();
      }
      String _computeActualString = object.getCompositeImportURI().computeActualString();
      String _plus = (_computeActualString + " - ");
      String _importURI_1 = object.getImportURI();
      String _plus_1 = (_plus + _importURI_1);
      ss.append(_plus_1);
      _xblockexpression = ss;
    }
    return _xblockexpression;
  }
  
  public String image(final IncludeDeclaration object) {
    return "obj16/inc_obj.gif";
  }
  
  public String text(final CompositeString object) {
    String _name = object.getName();
    String _plus = (_name + " = ");
    String _computeActualString = object.computeActualString();
    return (_plus + _computeActualString);
  }
  
  public String text(final VarCall object) {
    VarDefinition _varName = object.getVarName();
    String _name = null;
    if (_varName!=null) {
      _name=_varName.getName();
    }
    String _plus = ("${" + _name);
    return (_plus + "}");
  }
  
  public String image(final Option object) {
    return "obj16/option_obj.gif";
  }
  
  public String text(final Options object) {
    return "Options";
  }
  
  public String image(final Options object) {
    return "obj16/option_obj.gif";
  }
  
  public String text(final Environment object) {
    return "Environment";
  }
  
  public String image(final Environment object) {
    return "obj16/env_obj.gif";
  }
  
  public String image(final VarDefinitionContainer object) {
    return "obj16/var_group.gif";
  }
  
  public String text(final VarDefinition object) {
    String _name = object.getName();
    String _plus = (_name + " - (effective value = ");
    String _effectiveValue = object.getEffectiveValue();
    String _plus_1 = (_plus + _effectiveValue);
    return (_plus_1 + ")");
  }
  
  public String image(final VarDefinition object) {
    String _xifexpression = null;
    boolean _isImported = object.isImported();
    if (_isImported) {
      String _xifexpression_1 = null;
      boolean _isDiamondInherit = object.isDiamondInherit();
      if (_isDiamondInherit) {
        String _xifexpression_2 = null;
        boolean _isConstant = object.isConstant();
        if (_isConstant) {
          _xifexpression_2 = "obj16/cstImportDiamond_obj.gif";
        } else {
          _xifexpression_2 = "obj16/varImportDiamond_obj.gif";
        }
        _xifexpression_1 = _xifexpression_2;
      } else {
        String _xifexpression_3 = null;
        boolean _isConstant_1 = object.isConstant();
        if (_isConstant_1) {
          _xifexpression_3 = "obj16/cstImport_obj.gif";
        } else {
          _xifexpression_3 = "obj16/varImport_obj.gif";
        }
        _xifexpression_1 = _xifexpression_3;
      }
      _xifexpression = _xifexpression_1;
    } else {
      String _xifexpression_4 = null;
      boolean _isConstant_2 = object.isConstant();
      if (_isConstant_2) {
        _xifexpression_4 = "obj16/cst_obj.gif";
      } else {
        _xifexpression_4 = "obj16/var_obj.gif";
      }
      _xifexpression = _xifexpression_4;
    }
    return _xifexpression;
  }
}
