package amazon_package.Amazon_Project;

import org.testng.annotations.Test;

//Registration of the amazon application and login using the same credentials	
@Test
public class TestCase3_Registration_login extends LaunchQuit
{
	public void Registration_login() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin(driver);
		
		NewRegistrationPage newregistrationpage = new NewRegistrationPage(driver);
		newregistrationpage.newuseremailormobilenumber(driver);
		newregistrationpage.continueuser();
		newregistrationpage.proceedtocreateanaccount();
		newregistrationpage.enteryourname();
		newregistrationpage.createpassword();
		newregistrationpage.verifymobilenumber();
		

	}
	


	
}
