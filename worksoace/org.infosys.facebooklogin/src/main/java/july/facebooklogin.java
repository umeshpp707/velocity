package july;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebooklogin {
	WebDriver driver;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	private WebElement username;

	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//button[@name=\"login\"]")
	private WebElement loginbutton;
	facebooklogin(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void enteruername() {
		username.sendKeys("Umesh");
	}
	public void password() {
		password.sendKeys("Umesh@99");
	}
	public void clickonlogin() {
		loginbutton.click();
	}
}
