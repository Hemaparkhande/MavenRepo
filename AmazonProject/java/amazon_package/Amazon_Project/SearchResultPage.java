package amazon_package.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage
{
	WebDriver driver;
//	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
	@FindBy(xpath="(//div[@class='aok-relative'])[1]")
	WebElement searchresultproduct1;
	
	public void searchresultproduct1()
	{
		searchresultproduct1.click();
	}

	public SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
