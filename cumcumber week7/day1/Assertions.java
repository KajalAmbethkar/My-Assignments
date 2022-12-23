package week7.day1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class Assertions {
	public static void main(String[] args)
	{
	String s1="Testleaf";
	String s2="testleaf";
	//Hard Assertion
	//Assert.assertNotEquals(s1,s2);
	//Assert.assertEquals(false, false);
	//Assert.assertEquals(s1, s2);
	Assert.assertTrue(s1.equals(s2));
	Assert.assertFalse(s1.contains(s2));
	System.out.println("Last line of programs");
SoftAssert sa=new SoftAssert();
sa.assertEquals(s1,s2);
System.out.println("Last program");
sa.assertAll();

}}
