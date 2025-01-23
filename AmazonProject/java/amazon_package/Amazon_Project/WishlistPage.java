package amazon_package.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Login to amazon->search a product->add it to wishlist->remove it from wishlist->logout				
public class WishlistPage {
	WebDriver driver;
	@FindBy(id="huc-view-your-list-button")
	WebElement viewyourlist_buttton;
	
	@FindBy(name="submit.deleteItem")
	WebElement delete_buttton;
	
	
	public void viewyourlist_buttton()
	{
		viewyourlist_buttton.click();
	}
	public void delete_buttton()
	{
		delete_buttton.click();
	}
	public WishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
