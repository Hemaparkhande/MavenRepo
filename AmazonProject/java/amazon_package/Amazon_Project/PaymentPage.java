package amazon_package.Amazon_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedtobuy;
	
	@FindBy(xpath="(//a[@class='a-link-normal expand-panel-button celwidget'])[1]")
	WebElement changeaddress_button;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-radio'])[1]")
	WebElement deliveryaddress_radiobutton;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement usethisaddress_button;
	
	@FindBy(xpath="(//a[@class='a-link-normal expand-panel-button celwidget'])[2]")
	WebElement changepaymentmethod_button;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[11]")
	WebElement cod;

	@FindBy(xpath="//input[@data-csa-c-purchase-id='404-2017685-3925903']")
	WebElement usethispaymentmethod;
	
	@FindBy(name="placeYourOrder1")
	WebElement placeyourorder;
	
	public void proceedtobuy()
	{
		proceedtobuy.click();
	}
/*	public void changeaddress() throws InterruptedException
	{
		Thread.sleep(4000);
//		wait.until(ExpectedConditions.elementToBeClickable(changeaddress_button));
		changeaddress_button.click();
		
	}
	public void deliveryaddress(WebDriver driver) throws InterruptedException
	{
//		wait.until(ExpectedConditions.elementToBeClickable(deliveryaddress_radiobutton));
Thread.sleep(3000);

		deliveryaddress_radiobutton.click();

	}*/
	public void usethisaddress_button() 
	{
		wait.until(ExpectedConditions.elementToBeClickable(usethisaddress_button));
//		Thread.sleep(3000);
		usethisaddress_button.click();
		
	}
	/*public void changepaymentmethod() throws InterruptedException
	{
//		wait.until(ExpectedConditions.elementToBeClickable(changepaymentmethod));
		Thread.sleep(5000);
		changepaymentmethod_button.click();
		
	}*/
	public void cod() throws InterruptedException 
	{
		Thread.sleep(4000);
//		wait.until(ExpectedConditions.elementToBeClickable(cod));
		cod.click();
		
		System.out.println("cod selected");
		Thread.sleep(15000);
	}

	public void usethispaymentmethod()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usethispaymentmethod));
		usethispaymentmethod.click();
		System.out.println("used payment method");
	}
	public void placeyourorder() throws InterruptedException
	{
		Thread.sleep(4000);
		placeyourorder.click();
	}
	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
