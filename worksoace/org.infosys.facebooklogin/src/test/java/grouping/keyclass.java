package grouping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		 	driver.manage().window().maximize();
		 	driver.get("https://www.facebook.com/");
		 	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 	Actions act=new Actions(driver);
		 	
driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//select[@id=\"month\"]")).click();

	

//act.sendKeys(Keys.ARROW_DOWN).perform();
//Thread.sleep(3000);
//act.sendKeys(Keys.ARROW_DOWN).perform();
//Thread.sleep(3000);
//act.sendKeys(Keys.ARROW_DOWN).perform();
//Thread.sleep(3000);
//act.sendKeys(Keys.ARROW_UP).perform();
//Thread.sleep(3000);
act.sendKeys(Keys.ARROW_UP).click().build().perform();
Thread.sleep(3000);


	}

}
