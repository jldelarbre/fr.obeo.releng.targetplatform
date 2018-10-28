package fr.obeo.releng.targetplatform.util;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import fr.obeo.releng.targetplatform.CompositeString;
import fr.obeo.releng.targetplatform.CompositeStringPart;
import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.Location;
import fr.obeo.releng.targetplatform.TargetContent;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.TargetPlatformFactory;
import fr.obeo.releng.targetplatform.VarCall;
import fr.obeo.releng.targetplatform.VarDefinition;
import fr.obeo.releng.targetplatform.util.ImportVariableManager;
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder;
import fr.obeo.releng.targetplatform.util.PredefinedVariableGenerator;
import fr.obeo.releng.targetplatform.util.TargetReloader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;

@SuppressWarnings("all")
public class CompositeElementResolver {
  @Inject
  private PredefinedVariableGenerator predefinedVariableGenerator;
  
  @Inject
  private LocationIndexBuilder locationIndexBuilder;
  
  @Inject
  private ImportVariableManager importVariableManager;
  
  @Inject
  private TargetReloader targetReloader;
  
  /**
   * Composite elements are string defined by a concatenation of static string and variable call:
   * "string1" + ${var1} + "aaa" + ${var2} +...
   */
  public void resolveCompositeElements(final TargetPlatform pTargetPlatform) {
    TargetPlatform targetPlatform = pTargetPlatform;
    boolean _isCompositeElementsResolved = targetPlatform.isCompositeElementsResolved();
    boolean _equals = (_isCompositeElementsResolved == true);
    if (_equals) {
      return;
    }
    final Function1<VarDefinition, Boolean> _function = new Function1<VarDefinition, Boolean>() {
      @Override
      public Boolean apply(final VarDefinition it) {
        return Boolean.valueOf(it.isImported());
      }
    };
    final VarDefinition importedVarDef = IterableExtensions.<VarDefinition>findFirst(targetPlatform.getVarDefinition(), _function);
    boolean _tripleNotEquals = (importedVarDef != null);
    if (_tripleNotEquals) {
      targetPlatform.setInvalidateByEmfXtext(true);
      return;
    }
    this.searchAndAppendDefineFromIncludedTpd(targetPlatform);
    this.resolveLocations(targetPlatform);
    final LinkedList<TargetPlatform> importedTargetPlatforms = this.locationIndexBuilder.getImportedTargetPlatformsDoNotResolveCompositeElement(targetPlatform);
    final Consumer<TargetPlatform> _function_1 = new Consumer<TargetPlatform>() {
      @Override
      public void accept(final TargetPlatform it) {
        CompositeElementResolver.this.resolveLocations(it);
        it.setCompositeElementsResolved(true);
      }
    };
    importedTargetPlatforms.forEach(_function_1);
    targetPlatform.setCompositeElementsResolved(true);
  }
  
  /**
   * Override value of variable definition with command line or environment variable
   */
  private void overrideVariableDefinition(final TargetPlatform targetPlatform) {
    final Consumer<VarDefinition> _function = new Consumer<VarDefinition>() {
      @Override
      public void accept(final VarDefinition it) {
        final VarDefinition varDef = it;
        final String varDefName = varDef.getName();
        final String variableValue = CompositeElementResolver.this.importVariableManager.getVariableValue(varDefName);
        boolean _tripleNotEquals = (variableValue != null);
        if (_tripleNotEquals) {
          varDef.setOverrideValue(variableValue);
        }
      }
    };
    targetPlatform.getVarDefinition().forEach(_function);
  }
  
  /**
   * Resolve location ("location" directive) means resolve variable call used in location declaration
   */
  private void resolveLocations(final TargetPlatform targetPlatform) {
    final Consumer<Location> _function = new Consumer<Location>() {
      @Override
      public void accept(final Location it) {
        it.resolveUri();
        it.resolveIUsVersion();
      }
    };
    targetPlatform.getLocations().forEach(_function);
  }
  
  private void searchAndAppendDefineFromIncludedTpd(final TargetPlatform targetPlatform) {
    final HashSet<TargetPlatform> alreadyVisitedTarget = CollectionLiterals.<TargetPlatform>newHashSet();
    this.searchAndAppendDefineFromIncludedTpd(targetPlatform, alreadyVisitedTarget);
  }
  
  /**
   * Search and append to the list of "define": variable definition of the current tpd file (targetPlatform)
   * the list of "define" found in sub tpd: imported with "include" directive
   */
  private void searchAndAppendDefineFromIncludedTpd(final TargetPlatform targetPlatform, final Set<TargetPlatform> alreadyVisitedTarget) {
    final HashSet<VarDefinition> ImportedDefineFromSubTpd = CollectionLiterals.<VarDefinition>newHashSet();
    final HashMap<TargetPlatform, TargetPlatform> processedTargetPlatform = CollectionLiterals.<TargetPlatform, TargetPlatform>newHashMap();
    alreadyVisitedTarget.add(targetPlatform);
    this.predefinedVariableGenerator.createPreDefinedVariables(targetPlatform);
    this.overrideVariableDefinition(targetPlatform);
    Map<IncludeDeclaration, TargetPlatform> directlyImportedTargetPlatforms = this.searchDirectlyImportedTpd(targetPlatform);
    while ((this.getDistinctTargetPlatforms(directlyImportedTargetPlatforms).size() > processedTargetPlatform.size())) {
      {
        final Function1<TargetPlatform, TargetPlatform> _function = new Function1<TargetPlatform, TargetPlatform>() {
          @Override
          public TargetPlatform apply(final TargetPlatform it) {
            TargetPlatform _xifexpression = null;
            boolean _containsKey = processedTargetPlatform.containsKey(it);
            if (_containsKey) {
              _xifexpression = processedTargetPlatform.get(it);
            } else {
              TargetPlatform _xifexpression_1 = null;
              boolean _contains = alreadyVisitedTarget.contains(it);
              if (_contains) {
                TargetPlatform _xblockexpression = null;
                {
                  processedTargetPlatform.put(it, it);
                  _xblockexpression = it;
                }
                _xifexpression_1 = _xblockexpression;
              } else {
                TargetPlatform _xblockexpression_1 = null;
                {
                  final TargetPlatform notProcessedTargetPlatform = it;
                  final TargetPlatform reloadedTargetPlatform = CompositeElementResolver.this.targetReloader.getUpToDateTarget(null, notProcessedTargetPlatform);
                  processedTargetPlatform.put(it, reloadedTargetPlatform);
                  CompositeElementResolver.this.overrideImportedTargetVariable(reloadedTargetPlatform, targetPlatform);
                  CompositeElementResolver.this.searchAndAppendDefineFromIncludedTpd(reloadedTargetPlatform, CollectionLiterals.<TargetPlatform>newHashSet(((TargetPlatform[])Conversions.unwrapArray(alreadyVisitedTarget, TargetPlatform.class))));
                  final Consumer<VarDefinition> _function = new Consumer<VarDefinition>() {
                    @Override
                    public void accept(final VarDefinition it) {
                      ImportedDefineFromSubTpd.add(it);
                    }
                  };
                  reloadedTargetPlatform.getVarDefinition().forEach(_function);
                  _xblockexpression_1 = reloadedTargetPlatform;
                }
                _xifexpression_1 = _xblockexpression_1;
              }
              _xifexpression = _xifexpression_1;
            }
            return _xifexpression;
          }
        };
        directlyImportedTargetPlatforms = ImmutableMap.<IncludeDeclaration, TargetPlatform>copyOf(MapExtensions.<IncludeDeclaration, TargetPlatform, TargetPlatform>mapValues(directlyImportedTargetPlatforms, _function));
        this.mergeImportedDefine(targetPlatform, ImportedDefineFromSubTpd);
        directlyImportedTargetPlatforms = this.searchDirectlyImportedTpd(targetPlatform);
      }
    }
    targetPlatform.getImportedTargetPlatforms().putAll(directlyImportedTargetPlatforms);
  }
  
  private Set<TargetPlatform> getDistinctTargetPlatforms(final Map<?, TargetPlatform> targetPlatform) {
    return CollectionLiterals.<TargetPlatform>newHashSet(((TargetPlatform[])Conversions.unwrapArray(targetPlatform.values(), TargetPlatform.class)));
  }
  
  /**
   * Override variable of the imported tpd with the one of the tpd importer.
   * 
   * target "targetA"
   * define varA = "valA"
   * include "targetB"
   * 
   * ------------------
   * 
   * target "targetB"
   * define varA = "valB"
   * 
   * ------------------
   * 
   * In this case varA of targetB will be override with the value "valA"
   */
  private void overrideImportedTargetVariable(final TargetPlatform importedTargetPlatform, final TargetPlatform importerTargetPlatform) {
    final EList<VarDefinition> varDefImporter = importerTargetPlatform.getVarDefinition();
    final Function1<VarDefinition, Boolean> _function = new Function1<VarDefinition, Boolean>() {
      @Override
      public Boolean apply(final VarDefinition it) {
        boolean _isImported = it.isImported();
        return Boolean.valueOf((!_isImported));
      }
    };
    final Function1<VarDefinition, Boolean> _function_1 = new Function1<VarDefinition, Boolean>() {
      @Override
      public Boolean apply(final VarDefinition it) {
        return Boolean.valueOf(it.isWhollyDefinedByTarget());
      }
    };
    final Consumer<VarDefinition> _function_2 = new Consumer<VarDefinition>() {
      @Override
      public void accept(final VarDefinition it) {
        final VarDefinition varDef4Overriding = it;
        final String varDef4OverridingName = varDef4Overriding.getName();
        final String varDef4OverridingValue = varDef4Overriding.getEffectiveValue();
        CompositeElementResolver.this.overrideCurrentVarDef(importedTargetPlatform, varDef4OverridingName, varDef4OverridingValue);
      }
    };
    IterableExtensions.<VarDefinition>filter(IterableExtensions.<VarDefinition>filter(varDefImporter, _function), _function_1).forEach(_function_2);
    final Consumer<VarDefinition> _function_3 = new Consumer<VarDefinition>() {
      @Override
      public void accept(final VarDefinition it) {
        final VarDefinition varDef4Overriding = it;
        final String varDef4OverridingName = varDef4Overriding.getName();
        final String varDef4OverridingValue = varDef4Overriding.getOverrideValue();
        CompositeElementResolver.this.overrideCurrentVarDef(importedTargetPlatform, varDef4OverridingName, varDef4OverridingValue);
      }
    };
    importerTargetPlatform.getVarDef2OverrideInImportedTarget().forEach(_function_3);
  }
  
  private Boolean overrideCurrentVarDef(final TargetPlatform importedTargetPlatform, final String varDef4OverridingName, final String varDef4OverridingValue) {
    boolean _xblockexpression = false;
    {
      final Function1<VarDefinition, Boolean> _function = new Function1<VarDefinition, Boolean>() {
        @Override
        public Boolean apply(final VarDefinition it) {
          return Boolean.valueOf(it.getName().equals(varDef4OverridingName));
        }
      };
      final VarDefinition varDef2Override = IterableExtensions.<VarDefinition>findFirst(importedTargetPlatform.getVarDefinition(), _function);
      boolean _xifexpression = false;
      boolean _tripleNotEquals = (varDef2Override != null);
      if (_tripleNotEquals) {
        boolean _isConstant = varDef2Override.isConstant();
        boolean _not = (!_isConstant);
        if (_not) {
          varDef2Override.setOverrideValue(varDef4OverridingValue);
        }
      } else {
        boolean _xblockexpression_1 = false;
        {
          final VarDefinition varDef = TargetPlatformFactory.eINSTANCE.createVarDefinition();
          varDef.setName(varDef4OverridingName);
          varDef.setOverrideValue(varDef4OverridingValue);
          _xblockexpression_1 = importedTargetPlatform.getVarDef2OverrideInImportedTarget().add(varDef);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  /**
   * Targets that are directly imported, with an "include" directive present in the current
   * target: "targetPlatform". Do not look for target imported through an imported target
   */
  private Map<IncludeDeclaration, TargetPlatform> searchDirectlyImportedTpd(final TargetPlatform targetPlatform) {
    final Function1<IncludeDeclaration, Boolean> _function = new Function1<IncludeDeclaration, Boolean>() {
      @Override
      public Boolean apply(final IncludeDeclaration it) {
        return Boolean.valueOf(it.isResolved());
      }
    };
    final Function1<IncludeDeclaration, TargetPlatform> _function_1 = new Function1<IncludeDeclaration, TargetPlatform>() {
      @Override
      public TargetPlatform apply(final IncludeDeclaration it) {
        return CompositeElementResolver.this.locationIndexBuilder.getImportedTargetPlatform(targetPlatform.eResource(), it);
      }
    };
    final Function2<IncludeDeclaration, TargetPlatform, Boolean> _function_2 = new Function2<IncludeDeclaration, TargetPlatform, Boolean>() {
      @Override
      public Boolean apply(final IncludeDeclaration p1, final TargetPlatform p2) {
        return Boolean.valueOf((null != p2));
      }
    };
    return MapExtensions.<IncludeDeclaration, TargetPlatform>filter(IterableExtensions.<IncludeDeclaration, TargetPlatform>toInvertedMap(IterableExtensions.<IncludeDeclaration>filter(targetPlatform.getIncludes(), _function), _function_1), _function_2);
  }
  
  /**
   * "variable define" of deepest include are override by "define" of lowest level
   */
  private void mergeImportedDefine(final TargetPlatform targetPlatform, final Set<VarDefinition> ImportedDefineFromSubTpd) {
    final HashSet<VarDefinition> toBeAddedDefine = CollectionLiterals.<VarDefinition>newHashSet();
    final EList<TargetContent> targetContent = targetPlatform.getContents();
    final Consumer<VarDefinition> _function = new Consumer<VarDefinition>() {
      @Override
      public void accept(final VarDefinition it) {
        final VarDefinition currentImportedDefine = it;
        final Function1<TargetContent, Boolean> _function = new Function1<TargetContent, Boolean>() {
          @Override
          public Boolean apply(final TargetContent it) {
            return Boolean.valueOf((it instanceof VarDefinition));
          }
        };
        final Function1<TargetContent, Boolean> _function_1 = new Function1<TargetContent, Boolean>() {
          @Override
          public Boolean apply(final TargetContent it) {
            boolean _xblockexpression = false;
            {
              final VarDefinition alreadyExistingDefine = ((VarDefinition) it);
              final String varName = alreadyExistingDefine.getName();
              boolean _equals = currentImportedDefine.getName().equals(varName);
              _xblockexpression = (!_equals);
            }
            return Boolean.valueOf(_xblockexpression);
          }
        };
        boolean toBeAdded = IterableExtensions.<TargetContent>forall(IterableExtensions.<TargetContent>filter(targetContent, _function), _function_1);
        if (toBeAdded) {
          boolean _varDefNeverInclude = CompositeElementResolver.this.varDefNeverInclude(currentImportedDefine, toBeAddedDefine);
          if (_varDefNeverInclude) {
            final VarDefinition currentImportedDefineCopy = CompositeElementResolver.this.createImportedCopy(currentImportedDefine);
            toBeAddedDefine.add(currentImportedDefineCopy);
          } else {
            final VarDefinition alreadyAddedVarDef = CompositeElementResolver.this.searchAlreadyIncludeVarDef(currentImportedDefine, toBeAddedDefine);
            final boolean diamondlyInherited = currentImportedDefine.getSourceUUID().equals(alreadyAddedVarDef.getSourceUUID());
            if (diamondlyInherited) {
              alreadyAddedVarDef.setDiamondInherit(true);
            } else {
              alreadyAddedVarDef.getImportedValues().add(currentImportedDefine.getValue().computeActualString());
            }
          }
        }
      }
    };
    ImportedDefineFromSubTpd.forEach(_function);
    targetContent.addAll(toBeAddedDefine);
    this.updateVariableDefinition(targetContent);
  }
  
  private VarDefinition searchAlreadyIncludeVarDef(final VarDefinition varDef2Find, final HashSet<VarDefinition> alreadyAddedVarDefs) {
    VarDefinition _xblockexpression = null;
    {
      final String varDefNameToFind = varDef2Find.getName();
      final Function1<VarDefinition, Boolean> _function = new Function1<VarDefinition, Boolean>() {
        @Override
        public Boolean apply(final VarDefinition it) {
          boolean _xblockexpression = false;
          {
            final VarDefinition currentVarDef = it;
            int _compareTo = varDefNameToFind.compareTo(currentVarDef.getName());
            _xblockexpression = (_compareTo == 0);
          }
          return Boolean.valueOf(_xblockexpression);
        }
      };
      final VarDefinition alreadyAddedVarDef = IterableExtensions.<VarDefinition>findFirst(alreadyAddedVarDefs, _function);
      _xblockexpression = alreadyAddedVarDef;
    }
    return _xblockexpression;
  }
  
  private VarDefinition createImportedCopy(final VarDefinition currentImportedDefine) {
    VarDefinition _xblockexpression = null;
    {
      final VarDefinition currentImportedDefineCopy = TargetPlatformFactory.eINSTANCE.createVarDefinition();
      currentImportedDefineCopy.setName(currentImportedDefine.getName());
      currentImportedDefineCopy.setValue(currentImportedDefine.getValue().getCopy());
      currentImportedDefineCopy.setOverrideValue(currentImportedDefine.getOverrideValue());
      currentImportedDefineCopy.setImported(true);
      currentImportedDefineCopy.getImportedValues().add(currentImportedDefine.getValue().computeActualString());
      currentImportedDefineCopy.set_sourceUUID(currentImportedDefine.getSourceUUID());
      currentImportedDefineCopy.setConstant(currentImportedDefine.isConstant());
      _xblockexpression = currentImportedDefineCopy;
    }
    return _xblockexpression;
  }
  
  private boolean varDefNeverInclude(final VarDefinition varDefToCheck, final HashSet<VarDefinition> alreadyAddedVarDef) {
    boolean _xblockexpression = false;
    {
      final String varDefToCheckName = varDefToCheck.getName();
      final Function1<VarDefinition, Boolean> _function = new Function1<VarDefinition, Boolean>() {
        @Override
        public Boolean apply(final VarDefinition it) {
          boolean _xblockexpression = false;
          {
            final VarDefinition currentVarDef = it;
            int _compareTo = varDefToCheckName.compareTo(currentVarDef.getName());
            boolean _equals = (_compareTo == 0);
            _xblockexpression = (!_equals);
          }
          return Boolean.valueOf(_xblockexpression);
        }
      };
      _xblockexpression = IterableExtensions.<VarDefinition>forall(alreadyAddedVarDef, _function);
    }
    return _xblockexpression;
  }
  
  /**
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
  private void updateVariableDefinition(final EList<TargetContent> targetContent) {
    for (final TargetContent varDef : targetContent) {
      if ((varDef instanceof VarDefinition)) {
        CompositeString _value = ((VarDefinition)varDef).getValue();
        boolean _tripleNotEquals = (_value != null);
        if (_tripleNotEquals) {
          EList<CompositeStringPart> _stringParts = ((VarDefinition)varDef).getValue().getStringParts();
          for (final CompositeStringPart stringPart : _stringParts) {
            if ((stringPart instanceof VarCall)) {
              VarCall varCall = ((VarCall) stringPart);
              this.updateVariableCall(varCall, targetContent);
            }
          }
        }
      }
    }
  }
  
  private void updateVariableCall(final VarCall varCall, final EList<TargetContent> targetContent) {
    for (final TargetContent varDef : targetContent) {
      if ((varDef instanceof VarDefinition)) {
        String _name = varCall.getVarName().getName();
        String _name_1 = ((VarDefinition)varDef).getName();
        boolean _equals = Objects.equal(_name, _name_1);
        if (_equals) {
          varCall.setOriginalVarName(varCall.getVarName());
          varCall.setVarName(((VarDefinition)varDef));
        }
      }
    }
  }
  
  public List<VarDefinition> checkVariableDefinitionCycle(final VarDefinition varDef) {
    varDef.checkVarCycle();
    return varDef.getVarDefCycle();
  }
}
