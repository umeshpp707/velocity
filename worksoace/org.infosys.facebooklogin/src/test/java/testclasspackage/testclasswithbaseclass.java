package testclasspackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basepackage.baseclass;


public class testclasswithbaseclass extends baseclass {
    @Parameters("browser")
	@BeforeClass
	public void beforeclasAnnotation(String browservalue) {
		
		System.out.println(browservalue);
		browserlaunch(browservalue);
	}
    @Test
    public void TC01() {
    	System.out.println("TC01");
    }

}
