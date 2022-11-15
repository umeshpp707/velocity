package july2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class testclass1 {
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
	
	
	
	
	
	
	
	

}
