package fr.obeo.releng.targetplatform.tests.bugCases;

import com.google.common.collect.ListMultimap;
import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.obeo.releng.targetplatform.CompositeString;
import fr.obeo.releng.targetplatform.CompositeStringPart;
import fr.obeo.releng.targetplatform.IU;
import fr.obeo.releng.targetplatform.IncludeDeclaration;
import fr.obeo.releng.targetplatform.Location;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.tests.util.CustomTargetPlatformInjectorProviderTargetReloader;
import fr.obeo.releng.targetplatform.util.ImportVariableManager;
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder;
import fr.obeo.releng.targetplatform.validation.TargetPlatformValidator;
import java.util.LinkedList;
import java.util.List;
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
public class TestDiscoveredBugs {
  @Inject
  private ParseHelper<TargetPlatform> parser;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Inject
  private LocationIndexBuilder indexBuilder;
  
  @Inject
  private TargetPlatformValidator targetPlatformValidator;
  
  @Inject
  private ImportVariableManager importVariableManager;
  
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
  
  @Test
  public void testCompleteCaseAfterRunAllChecks() {
    try {
      final String[] args = { "", ImportVariableManager.OVERRIDE, "someLocation=http://download.eclipse.org/eclipse/updates/4.7" };
      this.importVariableManager.processCommandLineArguments(args);
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"completeTpd\"");
      _builder.newLine();
      _builder.append("include \"subTpd.tpd\"");
      _builder.newLine();
      _builder.append("define subDirNameRef = ${subDirName} + \"/\"");
      _builder.newLine();
      _builder.append("include ${subDirNameRef} + \"subInclude.tpd\"");
      _builder.newLine();
      _builder.append("define someLocation = \"otherLocationURL\"");
      _builder.newLine();
      _builder.append("location ${someLocation} {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("org.eclipse.pde.core");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final TargetPlatform completeTpd = this.parser.parse(_builder, URI.createURI("tmp:/completeTpd.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"subTpd\"");
      _builder_1.newLine();
      _builder_1.append("define someLocation = \"locationURL\"");
      _builder_1.newLine();
      _builder_1.append("define subDirName=\"subdir\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/subTpd.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"subInclude\"");
      _builder_2.newLine();
      _builder_2.append("include \"subSubInclude.tpd\"");
      _builder_2.newLine();
      _builder_2.append("define emfVerStart = \"2.9.2\"");
      _builder_2.newLine();
      _builder_2.append("define emfVer = \"[\" + ${emfVerStart} + \",\" + ${emfVerEnd} + \")\"");
      _builder_2.newLine();
      _builder_2.append("define someLocationUri = ${serverAddress} + \"modeling/emf/emf/updates/2.9.x/core/R201402030812/\"");
      _builder_2.newLine();
      _builder_2.append("location ${someLocationUri} {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("org.eclipse.emf.sdk.feature.group ${emfVer}");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/subdir/subInclude.tpd"), resourceSet);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("target \"subSubInclude\"");
      _builder_3.newLine();
      _builder_3.append("define serverAddress = \"http://download.eclipse.org/\"");
      _builder_3.newLine();
      _builder_3.append("define emfVerStart = \"2.8.0\"");
      _builder_3.newLine();
      _builder_3.append("define emfVerEnd = \"3.0.0\"");
      _builder_3.newLine();
      this.parser.parse(_builder_3, URI.createURI("tmp:/subdir/subSubInclude.tpd"), resourceSet);
      this.indexBuilder.getLocationIndex(completeTpd);
      this.indexBuilder.checkIncludeCycle(completeTpd);
      this.targetPlatformValidator.checkAllEnvAndRequiredAreSelfExluding(completeTpd);
      this.targetPlatformValidator.checkNoDuplicateOptions(completeTpd);
      this.targetPlatformValidator.checkOptionsOnLocationAreIdentical(completeTpd);
      this.targetPlatformValidator.checkIDUniqueOnAllLocations(completeTpd);
      this.targetPlatformValidator.checkImportCycle(completeTpd);
      this.targetPlatformValidator.checkVarDefinitionCycle(completeTpd);
      this.targetPlatformValidator.checkSameIDForAllLocationWithSameURI(completeTpd);
      this.targetPlatformValidator.checkOneEnvironment(completeTpd);
      this.targetPlatformValidator.checkOneOptions(completeTpd);
      this.targetPlatformValidator.checkNoDuplicateEnvironmentOptions(completeTpd);
      this.targetPlatformValidator.checkNoDuplicatedIU(completeTpd);
      this.targetPlatformValidator.checkNoDuplicatedDefine(completeTpd);
      final ListMultimap<String, Location> locationIndex = this.indexBuilder.getLocationIndex(completeTpd);
      Assert.assertEquals(2, locationIndex.size());
      final List<Location> firstLoc = locationIndex.get("http://download.eclipse.org/eclipse/updates/4.7");
      Assert.assertEquals("http://download.eclipse.org/eclipse/updates/4.7", IterableExtensions.<Location>head(firstLoc).getUri());
      final List<Location> secondLoc = locationIndex.get("http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/");
      Assert.assertEquals("http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/", IterableExtensions.<Location>head(secondLoc).getUri());
      final CompositeString compositeImportURI = IterableExtensions.<IncludeDeclaration>last(completeTpd.getIncludes()).getCompositeImportURI();
      Assert.assertEquals("subdir/", IterableExtensions.<CompositeStringPart>head(compositeImportURI.getStringParts()).getActualString());
      final LinkedList<TargetPlatform> importedTargetPlatforms = this.indexBuilder.getImportedTargetPlatforms(completeTpd);
      Assert.assertEquals(3, importedTargetPlatforms.size());
      final TargetPlatform targetPlatform = importedTargetPlatforms.getFirst();
      Assert.assertEquals("subInclude", targetPlatform.getName());
      final Location locationEMF = IterableExtensions.<Location>last(targetPlatform.getLocations());
      Assert.assertEquals("http://download.eclipse.org/modeling/emf/emf/updates/2.9.x/core/R201402030812/", locationEMF.getUri());
      Assert.assertEquals("[2.9.2,3.0.0)", IterableExtensions.<IU>head(locationEMF.getIus()).getVersion());
      final Location locationEclipse = IterableExtensions.<Location>head(completeTpd.getLocations());
      Assert.assertEquals("http://download.eclipse.org/eclipse/updates/4.7", locationEclipse.getUri());
      this.importVariableManager.clear();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testComplexCaseManyInterleavedResolution() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("target \"completeTpd\"");
      _builder.newLine();
      _builder.append("include \"subTpd.tpd\"");
      _builder.newLine();
      _builder.append("define subDirNameRef = ${subDirName} + \"/\"");
      _builder.newLine();
      _builder.append("include ${subDirNameRef} + \"subInclude.tpd\"");
      _builder.newLine();
      final TargetPlatform completeTpd = this.parser.parse(_builder, URI.createURI("tmp:/completeTpd.tpd"), resourceSet);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("target \"subTpd\"");
      _builder_1.newLine();
      _builder_1.append("define subDirName=\"subdir\"");
      _builder_1.newLine();
      this.parser.parse(_builder_1, URI.createURI("tmp:/subTpd.tpd"), resourceSet);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("target \"subInclude\"");
      _builder_2.newLine();
      _builder_2.append("include \"subSubInclude.tpd\"");
      _builder_2.newLine();
      _builder_2.append("include ${subsubInclude2Adress}");
      _builder_2.newLine();
      _builder_2.append("location ${locationURL} {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("org.eclipse.pde.core");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      this.parser.parse(_builder_2, URI.createURI("tmp:/subdir/subInclude.tpd"), resourceSet);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("target \"subSubInclude\"");
      _builder_3.newLine();
      _builder_3.append("define subsubInclude2Adress=\"subSubInclude2.tpd\"");
      _builder_3.newLine();
      this.parser.parse(_builder_3, URI.createURI("tmp:/subdir/subSubInclude.tpd"), resourceSet);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("target \"subSubInclude2\"");
      _builder_4.newLine();
      _builder_4.append("define locationURL=\"http://download.eclipse.org/eclipse/updates/4.7\"");
      _builder_4.newLine();
      this.parser.parse(_builder_4, URI.createURI("tmp:/subdir/subSubInclude2.tpd"), resourceSet);
      final ListMultimap<String, Location> locationIndex = this.indexBuilder.getLocationIndex(completeTpd);
      Assert.assertEquals(1, locationIndex.size());
      final List<Location> firstLoc = locationIndex.get("http://download.eclipse.org/eclipse/updates/4.7");
      Assert.assertEquals("http://download.eclipse.org/eclipse/updates/4.7", IterableExtensions.<Location>head(firstLoc).getUri());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
