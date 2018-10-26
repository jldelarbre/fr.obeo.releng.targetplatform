package fr.obeo.releng.targetplatform.util;

import fr.obeo.releng.targetplatform.StaticString;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.TargetPlatformFactory;
import fr.obeo.releng.targetplatform.VarDefinition;
import java.net.URL;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PredefinedVariableGenerator {
  public final static String CST_USER_DIR = "userDir";
  
  public final static String CST_TPD_URI = "tpdUri";
  
  public final static String CST_TPD_PATH = "tpdPath";
  
  public final static String CST_TPD_FILENAME = "tpdFileName";
  
  public final static String CST_TPD_FILENAME_NO_EXT = "tpdFileNameNoExtension";
  
  public final static String CST_ABS_TPD_URI = "absoluteTpdUri";
  
  public final static String CST_ABS_TPD_PATH = "absoluteTpdPath";
  
  public final static String CST_ABS_TPD_DEVICE_PATH = "absoluteTpdDevicePath";
  
  public final static String CST_TPD_DIR = "tpdDir";
  
  public final static String CST_ABS_TPD_DIR = "absoluteTpdDir";
  
  public final static String CST_ABS_TPD_DEVICE_DIR = "absoluteTpdDeviceDir";
  
  public final static int NUM_PREDIFINED_VAR = 11;
  
  public boolean createPreDefinedVariables(final TargetPlatform targetPlatform) {
    boolean _xblockexpression = false;
    {
      this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_USER_DIR, System.getProperty("user.home"));
      final URI tpdPathVarValue = targetPlatform.eResource().getURI();
      this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_TPD_URI, tpdPathVarValue.toString());
      this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_TPD_PATH, tpdPathVarValue.path());
      this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_TPD_FILENAME, tpdPathVarValue.lastSegment());
      String tpdFileNameNoExtension = tpdPathVarValue.lastSegment();
      boolean _endsWith = tpdPathVarValue.lastSegment().endsWith(".tpd");
      if (_endsWith) {
        int _length = tpdFileNameNoExtension.length();
        int _minus = (_length - 4);
        tpdFileNameNoExtension = tpdFileNameNoExtension.substring(0, _minus);
      }
      this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_TPD_FILENAME_NO_EXT, tpdFileNameNoExtension);
      final URI absoluteTpdPathVarValue = PredefinedVariableGenerator.convertToAbsoluteUri(tpdPathVarValue);
      this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_ABS_TPD_URI, absoluteTpdPathVarValue.toString());
      this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_ABS_TPD_PATH, absoluteTpdPathVarValue.path());
      this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_ABS_TPD_DEVICE_PATH, absoluteTpdPathVarValue.devicePath());
      final int lastIndexTpdDir = tpdPathVarValue.path().toString().lastIndexOf("/");
      if ((lastIndexTpdDir != (-1))) {
        final String tpdDir = tpdPathVarValue.path().toString().substring(0, lastIndexTpdDir);
        this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_TPD_DIR, tpdDir);
      }
      final int lastIndexAbsTpdDir = absoluteTpdPathVarValue.path().toString().lastIndexOf("/");
      if ((lastIndexAbsTpdDir != (-1))) {
        final String absoluteTpdDir = absoluteTpdPathVarValue.path().toString().substring(0, lastIndexAbsTpdDir);
        this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_ABS_TPD_DIR, absoluteTpdDir);
      }
      final int lastIndexAbsTpdDeviceDir = absoluteTpdPathVarValue.devicePath().toString().lastIndexOf("/");
      boolean _xifexpression = false;
      if ((lastIndexAbsTpdDeviceDir != (-1))) {
        boolean _xblockexpression_1 = false;
        {
          final String absoluteTpdDeviceDir = absoluteTpdPathVarValue.devicePath().toString().substring(0, lastIndexAbsTpdDeviceDir);
          _xblockexpression_1 = this.createPredefinedVariable(targetPlatform, PredefinedVariableGenerator.CST_ABS_TPD_DEVICE_DIR, absoluteTpdDeviceDir);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private boolean createPredefinedVariable(final TargetPlatform targetPlatform, final String predefinedVarName, final String predefinedVarValue) {
    boolean _xblockexpression = false;
    {
      final Function1<VarDefinition, Boolean> _function = new Function1<VarDefinition, Boolean>() {
        @Override
        public Boolean apply(final VarDefinition it) {
          return Boolean.valueOf(it.getName().equals(predefinedVarName));
        }
      };
      final boolean predefinedVarExist = IterableExtensions.<VarDefinition>exists(targetPlatform.getVarDefinition(), _function);
      boolean _xifexpression = false;
      if ((!predefinedVarExist)) {
        boolean _xblockexpression_1 = false;
        {
          final VarDefinition predefinedVar = TargetPlatformFactory.eINSTANCE.createVarDefinition();
          predefinedVar.setName(predefinedVarName);
          predefinedVar.setConstant(true);
          predefinedVar.setValue(TargetPlatformFactory.eINSTANCE.createCompositeString());
          final StaticString staticString = TargetPlatformFactory.eINSTANCE.createStaticString();
          staticString.setValue(predefinedVarValue);
          predefinedVar.getValue().getStringParts().add(staticString);
          _xblockexpression_1 = targetPlatform.getContents().add(predefinedVar);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean isPredefinedVariable(final VarDefinition varDefinition) {
    if (((((((((((varDefinition.getName().equals(PredefinedVariableGenerator.CST_USER_DIR) || 
      varDefinition.getName().equals(PredefinedVariableGenerator.CST_TPD_URI)) || 
      varDefinition.getName().equals(PredefinedVariableGenerator.CST_TPD_PATH)) || 
      varDefinition.getName().equals(PredefinedVariableGenerator.CST_TPD_FILENAME)) || 
      varDefinition.getName().equals(PredefinedVariableGenerator.CST_TPD_FILENAME_NO_EXT)) || 
      varDefinition.getName().equals(PredefinedVariableGenerator.CST_ABS_TPD_URI)) || 
      varDefinition.getName().equals(PredefinedVariableGenerator.CST_ABS_TPD_PATH)) || 
      varDefinition.getName().equals(PredefinedVariableGenerator.CST_TPD_DIR)) || 
      varDefinition.getName().equals(PredefinedVariableGenerator.CST_ABS_TPD_DEVICE_PATH)) || 
      varDefinition.getName().equals(PredefinedVariableGenerator.CST_ABS_TPD_DEVICE_DIR)) || 
      varDefinition.getName().equals(PredefinedVariableGenerator.CST_ABS_TPD_DIR))) {
      return true;
    }
    return false;
  }
  
  public static URI convertToAbsoluteUri(final URI resourceUri) {
    try {
      URI _xblockexpression = null;
      {
        URI absoluteResourceUri = resourceUri;
        boolean _isPlatform = resourceUri.isPlatform();
        if (_isPlatform) {
          String _string = resourceUri.toString();
          URL _uRL = new URL(_string);
          absoluteResourceUri = URI.createFileURI(FileLocator.toFileURL(_uRL).getFile());
        }
        _xblockexpression = absoluteResourceUri;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
