package fr.obeo.releng.targetplatform.tests.util;

import fr.obeo.releng.targetplatform.util.PreferenceSettings;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestOverrideListPrefPageChecker {
  @Test
  public void testEmptyOverrideList() {
    try {
      final String input = "";
      final List<String> result = PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      final ArrayList<Object> expected = CollectionLiterals.<Object>newArrayList();
      Assert.assertEquals(expected, result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideList1() {
    try {
      final String input = "var1=value1";
      final List<String> result = PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      final ArrayList<String> expected = CollectionLiterals.<String>newArrayList();
      expected.add("var1=value1");
      Assert.assertEquals(expected, result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideList2() {
    try {
      final String input = "var1=value1 var2 = value2";
      final List<String> result = PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      final ArrayList<String> expected = CollectionLiterals.<String>newArrayList();
      expected.add("var1=value1");
      expected.add("var2=value2");
      Assert.assertEquals(expected, result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideList3() {
    try {
      final String input = "var1=value1 var2 = value2 var3=\"val with space\"";
      final List<String> result = PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      final ArrayList<String> expected = CollectionLiterals.<String>newArrayList();
      expected.add("var1=value1");
      expected.add("var2=value2");
      expected.add("var3=val with space");
      Assert.assertEquals(expected, result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideList4() {
    try {
      final String input = "var1=value1 var2=\"\" var3=\"val with space\"";
      final List<String> result = PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      final ArrayList<String> expected = CollectionLiterals.<String>newArrayList();
      expected.add("var1=value1");
      expected.add("var2=");
      expected.add("var3=val with space");
      Assert.assertEquals(expected, result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOverrideList5() {
    try {
      final String input = "var1=value1 var2=\"\"";
      final List<String> result = PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      final ArrayList<String> expected = CollectionLiterals.<String>newArrayList();
      expected.add("var1=value1");
      expected.add("var2=");
      Assert.assertEquals(expected, result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test(expected = Exception.class)
  public void testWrongOverrideList1() {
    try {
      final String input = "errorString";
      PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      return;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test(expected = Exception.class)
  public void testWrongOverrideList2() {
    try {
      final String input = "var1=value1 errorString";
      PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      return;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNotWrongOverrideList3() {
    try {
      final String input = "var1=value1 var2= var3=value3";
      final List<String> result = PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      final ArrayList<String> expected = CollectionLiterals.<String>newArrayList();
      expected.add("var1=value1");
      expected.add("var2=var3=value3");
      Assert.assertEquals(expected, result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test(expected = Exception.class)
  public void testWrongOverrideList4() {
    try {
      final String input = "var1=value1 var2=\"";
      PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      return;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test(expected = Exception.class)
  public void testWrongOverrideList5() {
    try {
      final String input = "var1=value1 var2=\"some val";
      PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      return;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test(expected = Exception.class)
  public void testWrongOverrideList6() {
    try {
      final String input = "var1=value1 var2=\"some val\"\"";
      PreferenceSettings.OverrideListSplitter.splitOverrideList(input);
      return;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
