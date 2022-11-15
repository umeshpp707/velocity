package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclas1 {
	public static WebDriver driver;
	public static void browserlaunch(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Desktop\\Automation\\chromedriver.exe");
		driver =new ChromeDriver();
		System.out.println("Chrome");
		}
		else if(browser.equalsIgnoreCase("Firebox")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Desktop\\Automation\\chromedriver.exe");
			driver =new ChromeDriver();
			System.out.println("Firbox");
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Desktop\\Automation\\chromedriver.exe");
			driver =new ChromeDriver();	
			System.out.println("IE");
		}
	}
	
	

}
