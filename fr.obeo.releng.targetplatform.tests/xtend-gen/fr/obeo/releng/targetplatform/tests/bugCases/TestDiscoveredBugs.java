package fr.obeo.releng.targetplatform.tests.bugCases;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.obeo.releng.targetplatform.TargetPlatform;
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
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(CustomTargetPlatformInjectorProviderTargetReloader.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class TestDiscoveredBugs {
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
      _builder.append("target \"firstLevelTarget\"");
      _builder.newLine();
      _builder.append("include \"secondLevelTarget.tpd\"");
      _builder.newLine();
      final TargetPlatform firstLevelTarget = this.parser.parse(_builder, URI.createURI("tmp:/firstLevelTarget.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"secondLevelTarget\"");
      _builder_1.newLine();
      _builder_1.append("include \"thirdLevelTarget.tpd\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/secondLevelTarget.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"thirdLevelTarget\"");
      _builder_2.newLine();
      _builder_2.append("location \"http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/\" {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("org.eclipse.emf.sdk.feature.group");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/thirdLevelTarget.tpd"), resourceSet);
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(firstLevelTarget);
      Assert.assertEquals(2, ((Object[])Conversions.unwrapArray(importedTargetPlatforms, Object.class)).length);
      this.indexBuilder.checkIncludeCycle(firstLevelTarget);
      this.indexBuilder.getLocationIndex(firstLevelTarget);
      Assert.assertTrue(true);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
