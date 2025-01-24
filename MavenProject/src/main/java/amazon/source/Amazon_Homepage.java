package amazon.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Homepage {
	WebDriver driver;
	@FindBy(xpath="//span[.='Sign in']")
	WebElement signin_button;

	public void sign()
	{
		signin_button.click();
	}
	public Amazon_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
