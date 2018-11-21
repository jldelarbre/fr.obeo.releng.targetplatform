package fr.obeo.releng.targetplatform.tests.composite_elements;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.obeo.releng.targetplatform.CompositeStringPart;
import fr.obeo.releng.targetplatform.IU;
import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.Location;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.VarDefinition;
import fr.obeo.releng.targetplatform.tests.util.CustomTargetPlatformInjectorProviderTargetReloader;
import fr.obeo.releng.targetplatform.util.ImportVariableManager;
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder;
import java.util.LinkedList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(CustomTargetPlatformInjectorProviderTargetReloader.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class TestOverrideImportTarget {
  @Inject
  private ParseHelper<TargetPlatform> parser;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Inject
  private LocationIndexBuilder indexBuilder;
  
  @Inject
  private ImportVariableManager importVariableManager;
  
  @Test
  public void testOverrideVarOnly() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define a = \"overrideVal\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define a = \"baseVal\"");
      _builder_1.newLine();
      _builder_1.append("define b = ${a}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(1, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getFirst();
      final VarDefinition varDefA = IterableExtensions.<VarDefinition>head(bTargetPlatform.getVarDefinition());
      Assert.assertEquals("a", varDefA.getName());
      Assert.assertEquals("overrideVal", varDefA.getOverrideValue());
      final VarDefinition varDefB = bTargetPlatform.getVarDefinition().get(1);
      Assert.assertEquals("b", varDefB.getName());
      Assert.assertEquals("overrideVal", IterableExtensions.<CompositeStringPart>head(varDefB.getValue().getStringParts()).getActualString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideIncludeIndirect() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define a = \"dTarget.tpd\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define a = \"cTarget.tpd\"");
      _builder_1.newLine();
      _builder_1.append("define b = ${a}");
      _builder_1.newLine();
      _builder_1.append("include ${b}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"cTarget\"");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("target \"dTarget\"");
      _builder_3.newLine();
      this.parser.parse(_builder_3, URI.createURI("tmp:/dTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getFirst();
      final LinkedList<TargetPlatform> importedBTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(bTargetPlatform);
      Assert.assertEquals("dTarget", IterableExtensions.<TargetPlatform>head(importedBTargetPlatforms).getName());
      Assert.assertEquals("dTarget", importedTargetPlatforms.getLast().getName());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideIncludeDirect() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define a = \"dTarget.tpd\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define a = \"cTarget.tpd\"");
      _builder_1.newLine();
      _builder_1.append("include ${a}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"cTarget\"");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("target \"dTarget\"");
      _builder_3.newLine();
      this.parser.parse(_builder_3, URI.createURI("tmp:/dTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getFirst();
      final LinkedList<TargetPlatform> importedBTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(bTargetPlatform);
      Assert.assertEquals("dTarget", IterableExtensions.<TargetPlatform>head(importedBTargetPlatforms).getName());
      Assert.assertEquals("dTarget", importedTargetPlatforms.getLast().getName());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideVersion() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define emfVer = \"[2.9.2,3.0.0)\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define emfVer = \"[2.9.2,2.9.3)\"");
      _builder_1.newLine();
      _builder_1.append("location \"http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/\" {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("org.eclipse.emf.sdk.feature.group ${emfVer}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(1, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getFirst();
      final Location emfLocation = IterableExtensions.<Location>head(bTargetPlatform.getLocations());
      Assert.assertEquals("[2.9.2,3.0.0)", IterableExtensions.<IU>head(emfLocation.getIus()).getVersion());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideLocation() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define locationURL = \"http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define locationURL = \"http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/\"");
      _builder_1.newLine();
      _builder_1.append("location ${locationURL} {");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(1, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getFirst();
      final Location location = IterableExtensions.<Location>head(bTargetPlatform.getLocations());
      Assert.assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", location.getUri());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideRecursive() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define a = \"d2Target.tpd\"");
      _builder.newLine();
      _builder.append("define emfVer = \"[2.9.2,3.1.0)\"");
      _builder.newLine();
      _builder.append("define locationURL = \"http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("include \"cTarget.tpd\"");
      _builder_1.newLine();
      _builder_1.append("define a = \"dxxxTarget.tpd\"");
      _builder_1.newLine();
      _builder_1.append("define emfVer = \"[2.9.2,3.0.0)\"");
      _builder_1.newLine();
      _builder_1.append("define locationURL = \"http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"cTarget\"");
      _builder_2.newLine();
      _builder_2.append("define a = \"d1Target.tpd\"");
      _builder_2.newLine();
      _builder_2.append("include ${a}");
      _builder_2.newLine();
      _builder_2.append("define locationURL = \"http://download.eclipse.org/eclipse/updates/4.8\"");
      _builder_2.newLine();
      _builder_2.append("location ${locationURL} {");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("define emfVer = \"[2.9.2,2.9.3)\"");
      _builder_2.newLine();
      _builder_2.append("location \"http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/\" {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("org.eclipse.emf.sdk.feature.group ${emfVer}");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("target \"d1Target\"");
      _builder_3.newLine();
      this.parser.parse(_builder_3, URI.createURI("tmp:/d1Target.tpd"), resourceSet);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("target \"d2Target\"");
      _builder_4.newLine();
      this.parser.parse(_builder_4, URI.createURI("tmp:/d2Target.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(3, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform cTargetPlatform = importedTargetPlatforms.get(1);
      Assert.assertEquals("cTarget", cTargetPlatform.getName());
      final EList<VarDefinition> varDefinitionsC = cTargetPlatform.getVarDefinition();
      Assert.assertEquals("d2Target.tpd", IterableExtensions.<VarDefinition>head(varDefinitionsC).getEffectiveValue());
      Assert.assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", varDefinitionsC.get(1).getEffectiveValue());
      Assert.assertEquals("[2.9.2,3.1.0)", varDefinitionsC.get(2).getEffectiveValue());
      final IncludeDeclaration includeC = IterableExtensions.<IncludeDeclaration>head(cTargetPlatform.getIncludes());
      Assert.assertEquals("d2Target.tpd", includeC.getImportURI());
      final EList<Location> locationsC = cTargetPlatform.getLocations();
      Assert.assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", IterableExtensions.<Location>head(locationsC).getUri());
      Assert.assertEquals("[2.9.2,3.1.0)", IterableExtensions.<IU>head(IterableExtensions.<Location>last(locationsC).getIus()).getVersion());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideRecursiveWithJump() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define a = \"d2Target.tpd\"");
      _builder.newLine();
      _builder.append("define emfVer = \"[2.9.2,3.1.0)\"");
      _builder.newLine();
      _builder.append("define locationURL = \"http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("include \"cTarget.tpd\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"cTarget\"");
      _builder_2.newLine();
      _builder_2.append("define a = \"d1Target.tpd\"");
      _builder_2.newLine();
      _builder_2.append("include ${a}");
      _builder_2.newLine();
      _builder_2.append("define locationURL = \"http://download.eclipse.org/eclipse/updates/4.8\"");
      _builder_2.newLine();
      _builder_2.append("location ${locationURL} {");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("define emfVer = \"[2.9.2,2.9.3)\"");
      _builder_2.newLine();
      _builder_2.append("location \"http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/\" {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("org.eclipse.emf.sdk.feature.group ${emfVer}");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("target \"d1Target\"");
      _builder_3.newLine();
      this.parser.parse(_builder_3, URI.createURI("tmp:/d1Target.tpd"), resourceSet);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("target \"d2Target\"");
      _builder_4.newLine();
      this.parser.parse(_builder_4, URI.createURI("tmp:/d2Target.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(3, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform cTargetPlatform = importedTargetPlatforms.get(1);
      Assert.assertEquals("cTarget", cTargetPlatform.getName());
      final EList<VarDefinition> varDefinitionsC = cTargetPlatform.getVarDefinition();
      Assert.assertEquals("d2Target.tpd", IterableExtensions.<VarDefinition>head(varDefinitionsC).getEffectiveValue());
      Assert.assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", varDefinitionsC.get(1).getEffectiveValue());
      Assert.assertEquals("[2.9.2,3.1.0)", varDefinitionsC.get(2).getEffectiveValue());
      final IncludeDeclaration includeC = IterableExtensions.<IncludeDeclaration>head(cTargetPlatform.getIncludes());
      Assert.assertEquals("d2Target.tpd", includeC.getImportURI());
      final EList<Location> locationsC = cTargetPlatform.getLocations();
      Assert.assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", IterableExtensions.<Location>head(locationsC).getUri());
      Assert.assertEquals("[2.9.2,3.1.0)", IterableExtensions.<IU>head(IterableExtensions.<Location>last(locationsC).getIus()).getVersion());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideRecursiveWith2Jumps() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"b1Target.tpd\"");
      _builder.newLine();
      _builder.append("define a = \"d2Target.tpd\"");
      _builder.newLine();
      _builder.append("define emfVer = \"[2.9.2,3.1.0)\"");
      _builder.newLine();
      _builder.append("define locationURL = \"http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"b1Target\"");
      _builder_1.newLine();
      _builder_1.append("include \"b2Target.tpd\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/b1Target.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"b2Target\"");
      _builder_2.newLine();
      _builder_2.append("include \"cTarget.tpd\"");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/b2Target.tpd"), resourceSet);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("target \"cTarget\"");
      _builder_3.newLine();
      _builder_3.append("define a = \"d1Target.tpd\"");
      _builder_3.newLine();
      _builder_3.append("include ${a}");
      _builder_3.newLine();
      _builder_3.append("define locationURL = \"http://download.eclipse.org/eclipse/updates/4.8\"");
      _builder_3.newLine();
      _builder_3.append("location ${locationURL} {");
      _builder_3.newLine();
      _builder_3.append("}");
      _builder_3.newLine();
      _builder_3.append("define emfVer = \"[2.9.2,2.9.3)\"");
      _builder_3.newLine();
      _builder_3.append("location \"http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/\" {");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("org.eclipse.emf.sdk.feature.group ${emfVer}");
      _builder_3.newLine();
      _builder_3.append("}");
      _builder_3.newLine();
      this.parser.parse(_builder_3, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("target \"d1Target\"");
      _builder_4.newLine();
      this.parser.parse(_builder_4, URI.createURI("tmp:/d1Target.tpd"), resourceSet);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("target \"d2Target\"");
      _builder_5.newLine();
      this.parser.parse(_builder_5, URI.createURI("tmp:/d2Target.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(4, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform cTargetPlatform = importedTargetPlatforms.get(2);
      Assert.assertEquals("cTarget", cTargetPlatform.getName());
      final EList<VarDefinition> varDefinitionsC = cTargetPlatform.getVarDefinition();
      Assert.assertEquals("d2Target.tpd", IterableExtensions.<VarDefinition>head(varDefinitionsC).getEffectiveValue());
      Assert.assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", varDefinitionsC.get(1).getEffectiveValue());
      Assert.assertEquals("[2.9.2,3.1.0)", varDefinitionsC.get(2).getEffectiveValue());
      final IncludeDeclaration includeC = IterableExtensions.<IncludeDeclaration>head(cTargetPlatform.getIncludes());
      Assert.assertEquals("d2Target.tpd", includeC.getImportURI());
      final EList<Location> locationsC = cTargetPlatform.getLocations();
      Assert.assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", IterableExtensions.<Location>head(locationsC).getUri());
      Assert.assertEquals("[2.9.2,3.1.0)", IterableExtensions.<IU>head(IterableExtensions.<Location>last(locationsC).getIus()).getVersion());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideVarToManyTargets() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("include \"cTarget.tpd\"");
      _builder.newLine();
      _builder.append("define b = \"overrideVal1\"");
      _builder.newLine();
      _builder.append("define c = \"overrideVal2\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define b = \"baseVal\"");
      _builder_1.newLine();
      _builder_1.append("define b2 = ${b}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"cTarget\"");
      _builder_2.newLine();
      _builder_2.append("define c = \"baseVal\"");
      _builder_2.newLine();
      _builder_2.append("define c2 = ${c}");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getLast();
      final VarDefinition varDefB = IterableExtensions.<VarDefinition>head(bTargetPlatform.getVarDefinition());
      Assert.assertEquals("b", varDefB.getName());
      Assert.assertEquals("overrideVal1", varDefB.getOverrideValue());
      final VarDefinition varDefB2 = bTargetPlatform.getVarDefinition().get(1);
      Assert.assertEquals("b2", varDefB2.getName());
      Assert.assertEquals("overrideVal1", IterableExtensions.<CompositeStringPart>head(varDefB2.getValue().getStringParts()).getActualString());
      final TargetPlatform cTargetPlatform = importedTargetPlatforms.getFirst();
      final VarDefinition varDefC = IterableExtensions.<VarDefinition>head(cTargetPlatform.getVarDefinition());
      Assert.assertEquals("c", varDefC.getName());
      Assert.assertEquals("overrideVal2", varDefC.getOverrideValue());
      final VarDefinition varDefC2 = cTargetPlatform.getVarDefinition().get(1);
      Assert.assertEquals("c2", varDefC2.getName());
      Assert.assertEquals("overrideVal2", IterableExtensions.<CompositeStringPart>head(varDefC2.getValue().getStringParts()).getActualString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNotOverrideImported1() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"b1Target.tpd\"");
      _builder.newLine();
      _builder.append("include \"b2Target.tpd\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"b1Target\"");
      _builder_1.newLine();
      _builder_1.append("define b = \"valB1\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/b1Target.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"b2Target\"");
      _builder_2.newLine();
      _builder_2.append("define b = \"valB2\"");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/b2Target.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform b2TargetPlatform = importedTargetPlatforms.getFirst();
      Assert.assertEquals("b2Target", b2TargetPlatform.getName());
      final VarDefinition varDefB = IterableExtensions.<VarDefinition>head(b2TargetPlatform.getVarDefinition());
      Assert.assertEquals("b", varDefB.getName());
      Assert.assertEquals(null, varDefB.getOverrideValue());
      Assert.assertEquals("valB2", varDefB.getEffectiveValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNotOverrideImported2() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"b2Target.tpd\"");
      _builder.newLine();
      _builder.append("include \"b1Target.tpd\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"b1Target\"");
      _builder_1.newLine();
      _builder_1.append("define b = \"valB1\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/b1Target.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"b2Target\"");
      _builder_2.newLine();
      _builder_2.append("define b = \"valB2\"");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/b2Target.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform b2TargetPlatform = importedTargetPlatforms.getLast();
      Assert.assertEquals("b2Target", b2TargetPlatform.getName());
      final VarDefinition varDefB = IterableExtensions.<VarDefinition>head(b2TargetPlatform.getVarDefinition());
      Assert.assertEquals("b", varDefB.getName());
      Assert.assertEquals(null, varDefB.getOverrideValue());
      Assert.assertEquals("valB2", varDefB.getEffectiveValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNotOverrideImported3() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("include ${includeTargetURI}");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define b = \"valB_B\"");
      _builder_1.newLine();
      _builder_1.append("define includeTargetURI = \"cTarget.tpd\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"cTarget\"");
      _builder_2.newLine();
      _builder_2.append("define b = \"valB_C\"");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform cTargetPlatform = IterableExtensions.<TargetPlatform>head(importedTargetPlatforms);
      Assert.assertEquals("cTarget", cTargetPlatform.getName());
      final VarDefinition varDefB = IterableExtensions.<VarDefinition>head(cTargetPlatform.getVarDefinition());
      Assert.assertEquals("b", varDefB.getName());
      Assert.assertEquals(null, varDefB.getOverrideValue());
      Assert.assertEquals("valB_C", varDefB.getEffectiveValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNotOverridePartiallyDefinedVariable1() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("include \"cTarget.tpd\"");
      _builder.newLine();
      _builder.append("define partiallyDefineVarInA = \"foo_\" + ${b}");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define b = \"valB_B\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"cTarget\"");
      _builder_2.newLine();
      _builder_2.append("define partiallyDefineVarInA = \"value_C\"");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform cTargetPlatform = IterableExtensions.<TargetPlatform>head(importedTargetPlatforms);
      Assert.assertEquals("cTarget", cTargetPlatform.getName());
      final VarDefinition varDefB = IterableExtensions.<VarDefinition>head(cTargetPlatform.getVarDefinition());
      Assert.assertEquals("partiallyDefineVarInA", varDefB.getName());
      Assert.assertEquals(null, varDefB.getOverrideValue());
      Assert.assertEquals("value_C", varDefB.getEffectiveValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNotOverridePartiallyDefinedVariable2() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("include ${includeTargetURI}");
      _builder.newLine();
      _builder.append("define partiallyDefineVarInA = \"foo_\" + ${b}");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define b = \"valB_B\"");
      _builder_1.newLine();
      _builder_1.append("define includeTargetURI = \"cTarget.tpd\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"cTarget\"");
      _builder_2.newLine();
      _builder_2.append("define partiallyDefineVarInA = \"value_C\"");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform cTargetPlatform = IterableExtensions.<TargetPlatform>head(importedTargetPlatforms);
      Assert.assertEquals("cTarget", cTargetPlatform.getName());
      final VarDefinition varDefB = IterableExtensions.<VarDefinition>head(cTargetPlatform.getVarDefinition());
      Assert.assertEquals("partiallyDefineVarInA", varDefB.getName());
      Assert.assertEquals(null, varDefB.getOverrideValue());
      Assert.assertEquals("value_C", varDefB.getEffectiveValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideWithCompositeVarDef1() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"cTarget.tpd\"");
      _builder.newLine();
      _builder.append("define b = \"valB\"");
      _builder.newLine();
      _builder.append("define a = \"foo_\" + ${b}");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"cTarget\"");
      _builder_1.newLine();
      _builder_1.append("define a = \"value_C\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(1, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform cTargetPlatform = IterableExtensions.<TargetPlatform>head(importedTargetPlatforms);
      Assert.assertEquals("cTarget", cTargetPlatform.getName());
      final VarDefinition varDefA = IterableExtensions.<VarDefinition>head(cTargetPlatform.getVarDefinition());
      Assert.assertEquals("a", varDefA.getName());
      Assert.assertEquals("foo_valB", varDefA.getOverrideValue());
      Assert.assertEquals("foo_valB", varDefA.getEffectiveValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideWithCompositeVarDef2() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"cTarget.tpd\"");
      _builder.newLine();
      _builder.append("define c = \"valC\"");
      _builder.newLine();
      _builder.append("define b = ${c}");
      _builder.newLine();
      _builder.append("define a = \"foo_\" + ${b}");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"cTarget\"");
      _builder_1.newLine();
      _builder_1.append("define a = \"value_C\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(1, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform cTargetPlatform = IterableExtensions.<TargetPlatform>head(importedTargetPlatforms);
      Assert.assertEquals("cTarget", cTargetPlatform.getName());
      final VarDefinition varDefA = IterableExtensions.<VarDefinition>head(cTargetPlatform.getVarDefinition());
      Assert.assertEquals("a", varDefA.getName());
      Assert.assertEquals("foo_valC", varDefA.getOverrideValue());
      Assert.assertEquals("foo_valC", varDefA.getEffectiveValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNotOverridePartiallyDefinedVariable3() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("include \"cTarget.tpd\"");
      _builder.newLine();
      _builder.append("define b = ${b2}");
      _builder.newLine();
      _builder.append("define a = \"foo_\" + ${b}");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define b2 = \"valB2\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"cTarget\"");
      _builder_2.newLine();
      _builder_2.append("define a = \"value_C\"");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform cTargetPlatform = IterableExtensions.<TargetPlatform>head(importedTargetPlatforms);
      Assert.assertEquals("cTarget", cTargetPlatform.getName());
      final VarDefinition varDefA = IterableExtensions.<VarDefinition>head(cTargetPlatform.getVarDefinition());
      Assert.assertEquals("a", varDefA.getName());
      Assert.assertEquals(null, varDefA.getOverrideValue());
      Assert.assertEquals("value_C", varDefA.getEffectiveValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNotOverrideErroneousDefinedVariable() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"cTarget.tpd\"");
      _builder.newLine();
      _builder.append("define b = ${a}");
      _builder.newLine();
      _builder.append("define a = \"foo_\" + ${b}");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"cTarget\"");
      _builder_1.newLine();
      _builder_1.append("define a = \"value_C\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/cTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(1, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform cTargetPlatform = IterableExtensions.<TargetPlatform>head(importedTargetPlatforms);
      Assert.assertEquals("cTarget", cTargetPlatform.getName());
      final VarDefinition varDefA = IterableExtensions.<VarDefinition>head(cTargetPlatform.getVarDefinition());
      Assert.assertEquals("a", varDefA.getName());
      Assert.assertEquals(null, varDefA.getOverrideValue());
      Assert.assertEquals("value_C", varDefA.getEffectiveValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNotOverrideCst() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define const a = \"overrideVal\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define const a = \"baseVal\"");
      _builder_1.newLine();
      _builder_1.append("define b = ${a}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(1, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getFirst();
      final VarDefinition varDefA = IterableExtensions.<VarDefinition>head(bTargetPlatform.getVarDefinition());
      Assert.assertEquals("a", varDefA.getName());
      Assert.assertEquals(null, varDefA.getOverrideValue());
      final VarDefinition varDefB = bTargetPlatform.getVarDefinition().get(1);
      Assert.assertEquals("b", varDefB.getName());
      Assert.assertEquals("baseVal", IterableExtensions.<CompositeStringPart>head(varDefB.getValue().getStringParts()).getActualString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideConstAndVarReference() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define const varConst = \"subDirA\"");
      _builder.newLine();
      _builder.append("define varA = ${varB}");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define const varConst = \"subDirB\"");
      _builder_1.newLine();
      _builder_1.append("define varB = ${varConst}");
      _builder_1.newLine();
      _builder_1.append("include ${varB} + \"/cTarget.tpd\"");
      _builder_1.newLine();
      _builder_1.append("location ${varB}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"cTarget\"");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/subDirB/cTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getFirst();
      final VarDefinition varDefA = IterableExtensions.<VarDefinition>head(bTargetPlatform.getVarDefinition());
      Assert.assertEquals("varConst", varDefA.getName());
      Assert.assertEquals(null, varDefA.getOverrideValue());
      final VarDefinition varDefB = bTargetPlatform.getVarDefinition().get(1);
      Assert.assertEquals("varB", varDefB.getName());
      Assert.assertEquals("subDirB", IterableExtensions.<CompositeStringPart>head(varDefB.getValue().getStringParts()).getActualString());
      final IncludeDeclaration include = IterableExtensions.<IncludeDeclaration>head(bTargetPlatform.getIncludes());
      Assert.assertEquals("subDirB/cTarget.tpd", include.getImportURI());
      final Location location = IterableExtensions.<Location>head(bTargetPlatform.getLocations());
      Assert.assertEquals("subDirB", location.getUri());
      final VarDefinition varA = aTarget.getVarDefinition().get(1);
      Assert.assertEquals("varA", varA.getName());
      Assert.assertEquals("subDirA", varA.getValue().computeActualString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNotOverrideCstFromNotConst() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define a = \"overrideVal\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define const a = \"baseVal\"");
      _builder_1.newLine();
      _builder_1.append("define b = ${a}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(1, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getFirst();
      final VarDefinition varDefA = IterableExtensions.<VarDefinition>head(bTargetPlatform.getVarDefinition());
      Assert.assertEquals("a", varDefA.getName());
      Assert.assertEquals(null, varDefA.getOverrideValue());
      final VarDefinition varDefB = bTargetPlatform.getVarDefinition().get(1);
      Assert.assertEquals("b", varDefB.getName());
      Assert.assertEquals("baseVal", IterableExtensions.<CompositeStringPart>head(varDefB.getValue().getStringParts()).getActualString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideFromConst() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define const a = \"overrideVal\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define a = \"baseVal\"");
      _builder_1.newLine();
      _builder_1.append("define b = ${a}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(1, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getFirst();
      final VarDefinition varDefA = IterableExtensions.<VarDefinition>head(bTargetPlatform.getVarDefinition());
      Assert.assertEquals("a", varDefA.getName());
      Assert.assertEquals("overrideVal", varDefA.getOverrideValue());
      final VarDefinition varDefB = bTargetPlatform.getVarDefinition().get(1);
      Assert.assertEquals("b", varDefB.getName());
      Assert.assertEquals("overrideVal", IterableExtensions.<CompositeStringPart>head(varDefB.getValue().getStringParts()).getActualString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideFromCommandLineOverImporterTarget() {
    try {
      final String[] args = { "aTarget.tpd", ImportVariableManager.OVERRIDE, "a=overrideValCmdLine" };
      this.importVariableManager.processCommandLineArguments(args);
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"aTarget\"");
      _builder.newLine();
      _builder.append("include \"bTarget.tpd\"");
      _builder.newLine();
      _builder.append("define a = \"overrideVal\"");
      _builder.newLine();
      final TargetPlatform aTarget = this.parser.parse(_builder, URI.createURI("tmp:/aTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"bTarget\"");
      _builder_1.newLine();
      _builder_1.append("define a = \"baseVal\"");
      _builder_1.newLine();
      _builder_1.append("define b = ${a}");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/bTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(aTarget);
      Assert.assertEquals(1, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      final TargetPlatform bTargetPlatform = importedTargetPlatforms.getFirst();
      final VarDefinition varDefA = IterableExtensions.<VarDefinition>head(bTargetPlatform.getVarDefinition());
      Assert.assertEquals("a", varDefA.getName());
      Assert.assertEquals("overrideValCmdLine", varDefA.getOverrideValue());
      final VarDefinition varDefB = bTargetPlatform.getVarDefinition().get(1);
      Assert.assertEquals("b", varDefB.getName());
      Assert.assertEquals("overrideValCmdLine", IterableExtensions.<CompositeStringPart>head(varDefB.getValue().getStringParts()).getActualString());
      this.importVariableManager.clear();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
