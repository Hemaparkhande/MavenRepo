package amazon_package.Amazon_Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Product1Page 
{
	WebDriver driver;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement addtowishlist_button;
	
	@FindBy(id="continue-shopping")
	WebElement continue_button;
	
	@FindBy(id="add-to-cart-button")//span[.='Add to Cart']
	WebElement addtocart_button;
	
	@FindBy(id="sw-gtc")//for Testcase5
	WebElement gotocart_button;
	
	public void addtowishlist(WebDriver driver) throws InterruptedException
	{
		Set<String> pcid= driver.getWindowHandles();
		Iterator<String> pciditr = pcid.iterator();
		String parentid=pciditr.next();
		String childid= pciditr.next();
		driver.switchTo().window(childid);
		Thread.sleep(6000);
		addtowishlist_button.click();
		Thread.sleep(5000);
	}
	public void continuebutton() throws InterruptedException
	{
		Thread.sleep(2000);
		continue_button.click();
	}
	public void addtocart(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(4000);
		Set<String>pcid=driver.getWindowHandles();
		Iterator<String>pciditerator=pcid.iterator();
		String parentid= pciditerator.next();
		String chiildid= pciditerator.next();
		driver.switchTo().window(chiildid);
		Thread.sleep(4000);
		addtocart_button.click();
	}
	public void gotocart_button()// throws InterruptedException
	{
//		Thread.sleep(3000);
		gotocart_button.click();
	}
		public Product1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

