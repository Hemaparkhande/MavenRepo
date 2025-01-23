package amazon_package.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
WebDriver driver;
	@FindBy(xpath="//button[@data-action='a-stepper-increment']")//for Testcase5
	WebElement quantityplus_button;
	
	@FindBy(xpath="(//input[@data-feature-id='item-delete-button'])[1]")//for Testcase5
	WebElement delete_button;
	
	public void quantityplus_button() throws InterruptedException 
	{
		Thread.sleep(2000);
		
		for(int count=1; count<=3; count++)  //while(count<=3);
		{
			quantityplus_button.click();
			//count++;
		}	
System.out.println("count added");
	}
	public void delete_button() 
	{
		
		delete_button.click();
		System.out.println("count deleted");
	}
	
public CartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
	
}
