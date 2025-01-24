package amazon.test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import amazon.source.Amazon_Loginpage;

public class LoginToAmazon {
@Test
public void loginwithrightcredentials() throws InterruptedException
{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Amazon_Loginpage l1 = new Amazon_Loginpage(driver);
	l1.username();
	l1.continuepage();
	l1.password();
	Thread.sleep(3000);
	l1.signin_button();
}
}
