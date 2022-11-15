package july2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class facebooklogin {
	public facebooklogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();

	driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   facebooklogin fblogin=new facebooklogin(driver1);
   
		
		
		
		
		
		
		
		
		
	}


		
  
	
	
	}	


