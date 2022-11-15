package july2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testclass2 {

	@BeforeSuite
	public void TC1() {
		System.out.println("Tc1 class2");
	}
	@AfterSuite
	public void TC2() {
		System.out.println("TC2 Class2");
		
	}
	@BeforeClass
	public void TC3() {
		System.out.println("TC3 class2");
	}
	@AfterClass
	public void TC4() {
		System.out.println("TC4 class2");
	}
	@BeforeTest
	public void TC5() {
		System.out.println("TC5 class2");
	}
	@AfterTest
	public void TC6() {
		System.out.println("TC6 class2");
	}
	@BeforeMethod
	public void TC7() {
		System.out.println("TC7 class2");
	}
	@AfterMethod
	public void TC8() {
		System.out.println("TC8");
	}
	@Test
	public void TC9() {
		System.out.println("TC9");
	}
	
	
	
	
	
	
}
