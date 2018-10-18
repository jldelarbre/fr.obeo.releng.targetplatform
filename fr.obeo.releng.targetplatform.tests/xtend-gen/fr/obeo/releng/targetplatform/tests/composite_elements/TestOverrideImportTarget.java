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
import org.junit.Ignore;
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
      Assert.assertEquals(Boolean.valueOf(true), Boolean.valueOf(varDefA.isIsOverride()));
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
      Assert.assertEquals("[2.9.2,3.1.0)", IterableExtensions.<VarDefinition>last(varDefinitionsC).getEffectiveValue());
      final IncludeDeclaration includeC = IterableExtensions.<IncludeDeclaration>head(cTargetPlatform.getIncludes());
      Assert.assertEquals("d2Target.tpd", includeC.getImportURI());
      final EList<Location> locationsC = cTargetPlatform.getLocations();
      Assert.assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", IterableExtensions.<Location>head(locationsC).getUri());
      Assert.assertEquals("[2.9.2,3.1.0)", IterableExtensions.<IU>head(IterableExtensions.<Location>last(locationsC).getIus()).getVersion());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Ignore
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
      Assert.assertEquals("[2.9.2,3.1.0)", IterableExtensions.<VarDefinition>last(varDefinitionsC).getEffectiveValue());
      final IncludeDeclaration includeC = IterableExtensions.<IncludeDeclaration>head(cTargetPlatform.getIncludes());
      Assert.assertEquals("d2Target.tpd", includeC.getImportURI());
      final EList<Location> locationsC = cTargetPlatform.getLocations();
      Assert.assertEquals("http://download.eclipse.org/tools/orbit/downloads/drops/R20180905201904/repository", IterableExtensions.<Location>head(locationsC).getUri());
      Assert.assertEquals("[2.9.2,3.1.0)", IterableExtensions.<IU>head(IterableExtensions.<Location>last(locationsC).getIus()).getVersion());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
