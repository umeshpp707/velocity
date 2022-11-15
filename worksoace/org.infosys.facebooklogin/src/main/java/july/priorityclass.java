package july;

import org.testng.annotations.Test;

public class priorityclass {
	
	@Test (priority=1)
	
	public void TCA() {
		System.out.println("TCA");
	}
	@Test (priority=-1)
	public void TCB() {
		System.out.println("TCB");
	}
	@Test (dependsOnMethods="TCB")
	public void TCC() {
		System.out.println("TCC");
	}
	@Test (enabled=false)
	public void TCD() {
		System.out.println("TCD");
	}
	@Test (invocationCount=2)
	public void TCE() {
		System.out.println("TCE");
	}
	@Test (timeOut=2000)
	public void TCF() throws InterruptedException{
	Thread.sleep(3000);
		System.out.println("TCF");
	}
		
	
	

}
