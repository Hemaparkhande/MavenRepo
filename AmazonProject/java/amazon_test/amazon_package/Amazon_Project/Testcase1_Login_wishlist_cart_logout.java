package amazon_package.Amazon_Project;
//Login to amazon->search a product->add it to wishlist->add it to cart->logout			
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testcase1_Login_wishlist_cart_logout extends LaunchQuit
{
	@Test
	public void Login_wishlist_cart_logout() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin(driver);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.user();
		loginpage.cntbutton();
		loginpage.password();
		loginpage.signinbutton();
		homepage.search(driver);
		
		SearchResultPage searchresultpage= new SearchResultPage(driver);
		searchresultpage.searchresultproduct1();
		
		Product1Page product1page = new Product1Page(driver);
		product1page.addtowishlist(driver);
		product1page.continuebutton();
		product1page.addtocart(driver);
		homepage.accountandlist(driver);
		homepage.logout();
		

}
}