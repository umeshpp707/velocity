package Assserionspack;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.internal.IResultListener;

public class failtestclass {

	@Test
	public void TC01() {
		System.out.println("TC01");
	}
 
	@Test
	public void TC02() {
		Assert.fail();
		System.out.println("TC02");
	}
	
	@Test
	public void TC03() {
		Assert.fail();
		System.out.println("TC03");
	}
	@AfterMethod
	public void aftermethod(ITestResult result) {
		System.out.println(result.getStatus());
		if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("Failed test class");
		}
		else
			System.out.println("Test class pass");
	}
	
}
