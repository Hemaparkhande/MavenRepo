package facebook.test;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import facebook.source.Facebook_Loginpage;

public class Login_Facebook {
	@Test
	public void loginwithrightcredentials() throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Facebook_Loginpage f1 = new Facebook_Loginpage(driver);
		f1.username();
		f1.password();
		Thread.sleep(3000);
		f1.login();
	}

}
