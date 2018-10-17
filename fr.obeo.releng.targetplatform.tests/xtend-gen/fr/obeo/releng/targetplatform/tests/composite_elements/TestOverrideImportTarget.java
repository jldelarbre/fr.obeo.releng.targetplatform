package fr.obeo.releng.targetplatform.tests.composite_elements;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.obeo.releng.targetplatform.CompositeStringPart;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.VarDefinition;
import fr.obeo.releng.targetplatform.tests.util.CustomTargetPlatformInjectorProviderTargetReloader;
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder;
import java.util.LinkedList;
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
  
  @Test
  public void testIncludeWithMultipleStaticString() {
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
      final VarDefinition varDefA = bTargetPlatform.getVarDefinition().get(0);
      Assert.assertEquals("a", varDefA.getName());
      Assert.assertEquals("overrideVal", varDefA.getOverrideValue());
      final VarDefinition varDefB = bTargetPlatform.getVarDefinition().get(1);
      Assert.assertEquals("b", varDefB.getName());
      Assert.assertEquals("overrideVal", IterableExtensions.<CompositeStringPart>head(varDefB.getValue().getStringParts()).getActualString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
