package grouping;

import org.testng.annotations.Test;

public class testclass2 {

	@Test (groups="Regression1")
	public void TC01() {
		System.out.println("Testclass2 TC01");
	}
	
	@Test (groups="Regression2")
	public void TC02() {
		System.out.println("Testclass2 TC02");
	}
	@Test
	public void TC03() {
		System.out.println("Testclass2 TC03");
	}
	
}
