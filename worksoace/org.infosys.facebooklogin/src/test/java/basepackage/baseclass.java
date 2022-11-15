package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {

public static WebDriver driver;
public static void browserlaunch(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Desktop\\Automation\\chromedriver.exe");
		driver =new ChromeDriver();
}
	else if(browser.equalsIgnoreCase("Firebox")) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Desktop\\Automation\\firebox.exe");
			driver =new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Desktop\\Automation\\IE.exe");
		driver =new ChromeDriver();
	}
}
}
