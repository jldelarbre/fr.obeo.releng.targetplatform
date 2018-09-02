package fr.obeo.releng.targetplatform.tests.util

import org.junit.Test

import static fr.obeo.releng.targetplatform.util.PreferenceSettings.OverrideListSplitter.splitOverrideList
import static org.junit.Assert.*

class TestOverrideListPrefPageChecker {
	
	@Test
	def testEmptyOverrideList() {
		val input = ""
		
		val result = splitOverrideList(input)
		
		val expected = newArrayList
		
		assertEquals(expected, result);
	}
	
	@Test
	def testOverrideList1() {
		val input = "var1=value1"
		
		val result = splitOverrideList(input)
		
		val expected = newArrayList
		expected.add("var1=value1")
		
		assertEquals(expected, result);
	}
	
	@Test
	def testOverrideList2() {
		val input = "var1=value1 var2 = value2"
		
		val result = splitOverrideList(input)
		
		val expected = newArrayList
		expected.add("var1=value1")
		expected.add("var2=value2")
		
		assertEquals(expected, result);
	}
	
	@Test
	def testOverrideList3() {
		val input = "var1=value1 var2 = value2 var3=\"val with space\""
		
		val result = splitOverrideList(input)
		
		val expected = newArrayList
		expected.add("var1=value1")
		expected.add("var2=value2")
		expected.add("var3=val with space")
		
		assertEquals(expected, result);
	}
	
	@Test
	def testOverrideList4() {
		val input = "var1=value1 var2=\"\" var3=\"val with space\""
		
		val result = splitOverrideList(input)
		
		val expected = newArrayList
		expected.add("var1=value1")
		expected.add("var2=")
		expected.add("var3=val with space")
		
		assertEquals(expected, result);
	}
	
	@Test
	def testOverrideList5() {
		val input = "var1=value1 var2=\"\""
		
		val result = splitOverrideList(input)
		
		val expected = newArrayList
		expected.add("var1=value1")
		expected.add("var2=")
		
		assertEquals(expected, result);
	}
	
	@Test(expected = Exception)
	def testWrongOverrideList1() {
		val input = "errorString"
		
		splitOverrideList(input)
		return
	}
	
	@Test(expected = Exception)
	def testWrongOverrideList2() {
		val input = "var1=value1 errorString"
		
		splitOverrideList(input)
		return
	}
	
	@Test
	def testNotWrongOverrideList3() {
		val input = "var1=value1 var2= var3=value3"
		
		val result = splitOverrideList(input)
		
		val expected = newArrayList
		expected.add("var1=value1")
		expected.add("var2=var3=value3")
		
		assertEquals(expected, result);
	}
	
	@Test(expected = Exception)
	def testWrongOverrideList4() {
		val input = "var1=value1 var2=\""
		
		splitOverrideList(input)
		return
	}
	
	@Test(expected = Exception)
	def testWrongOverrideList5() {
		val input = "var1=value1 var2=\"some val"
		
		splitOverrideList(input)
		return
	}
	
	@Test(expected = Exception)
	def testWrongOverrideList6() {
		val input = "var1=value1 var2=\"some val\"\""
		
		splitOverrideList(input)
		return
	}
}
