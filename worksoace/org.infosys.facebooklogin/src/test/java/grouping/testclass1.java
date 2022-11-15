package grouping;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test (groups="resister")
public class testclass1 {
	@Test
	public void TC01() {
		System.out.println("Testclass1 TC01");
	}
	
	@Test
	public void TC02() {
		System.out.println("Testclass1 TC02");
	}
	@Test 
	public void TC03() {
		Assert.fail();
		System.out.println("Testclass1 TC03");
		
	}
	

}
