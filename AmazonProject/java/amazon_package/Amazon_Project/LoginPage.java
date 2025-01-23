package amazon_package.Amazon_Project;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

	@FindBy(xpath="//input[contains(@id,'ap_email')]")
	WebElement username;

	@FindBy(id="continue")//use also for new account
	WebElement cnt_button;

	@FindBy(name="password")
	WebElement pwd;

	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	public void user() throws InterruptedException 
	{
//		wait.until(ExpectedConditions.elementToBeClickable(username));
		Thread.sleep(4000);
		username.sendKeys("sandeep.parkhande@gmail.com");
	}
	public void cntbutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(cnt_button));

		cnt_button.click();
	}
	public void password()
	{
		wait.until(ExpectedConditions.elementToBeClickable(pwd));
																																																																											pwd.sendKeys("Amazon@1503");
	}
	public void signinbutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin_button));

		signin_button.click();
	}
//	step3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
