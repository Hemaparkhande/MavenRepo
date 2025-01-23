package amazon_package.Amazon_Project;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage 
{
WebDriver driver;
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//step1
@FindBy(xpath="//span[@class='nav-line-2 ']")
WebElement accountandlist_hoverover;

@FindBy(xpath="(//span[.='Sign in'])[1]")
WebElement signin_home;

@FindBy(id="twotabsearchtextbox")
WebElement search_textfield;

@FindBy(xpath="//span[.='Sign Out']")
WebElement logout_button;

@FindBy(id="ap_email_login")//for new account
WebElement username;
//step2
public void accountandlist(WebDriver driver)
{
Actions a1 = new Actions(driver);
a1.moveToElement(accountandlist_hoverover).perform();
}
public void signin(WebDriver driver) throws InterruptedException 
{
	Thread.sleep(2000);
//	wait.until(ExpectedConditions.elementToBeClickable(signin_home));
	signin_home.click();
	Thread.sleep(2000);
}
public void search(WebDriver driver) 
{
	search_textfield.sendKeys("book");
	search_textfield.sendKeys(Keys.ENTER);
}
public void logout() throws InterruptedException
{
	Thread.sleep(3000);
	logout_button.click();
	Assert.assertEquals(username.isDisplayed(), true, "Username is available on Homepage");
}


//step3
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


}
