package Assserionspack;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertclass {
    
	String expurl="Google.com";
	String acturl1="Google.com";
	String acturl2="Google.co";
	@Test
	public void TC1() {
		System.out.println("A1");
		Assert.assertEquals(acturl1, expurl);
		System.out.println("A2");
		Assert.assertNotEquals(acturl2, expurl);
		System.out.println("A3");
		Assert.assertTrue(true);
		System.out.println("A4");
		Assert.assertFalse(true,"Assertion fialed due to");
		System.out.println("A5");
	}
	@Test
	public void TC2() {
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(acturl1, expurl);
		System.out.println("class1");
		soft.assertNotEquals(acturl2, expurl);
		System.out.println("Class2");
		soft.assertTrue(false);
		System.out.println("Class3");
		soft.assertFalse(false);
		System.out.println("Class4");
		soft.assertAll();
		soft.fail();
		System.out.println("last");
		
		
		
	}
	
}
