package amazon.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Loginpage {
	
	FirefoxDriver driver= new FirefoxDriver();
	@FindBy(id ="ap_email_login")
	WebElement un;
	
	@FindBy(xpath= "//input[@class='a-button-input']")
	WebElement continuepage;
	
	@FindBy(id= "ap_password")
	WebElement pwd;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	
	public void username()
	{
		un.sendKeys("hemag.gade@gmail.com");
	}
	public void continuepage()
	{
		continuepage.click();
	}
	public void password()
	{
		signin_button.sendKeys("Hema@123");
	}
	public void signin_button()
	{
		signin_button.click();
	}
	
	public Amazon_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
