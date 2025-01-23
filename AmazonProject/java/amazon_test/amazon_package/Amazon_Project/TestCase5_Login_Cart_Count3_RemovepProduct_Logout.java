package amazon_package.Amazon_Project;

import org.testng.annotations.Test;

//Login to amazon->search a product->add it to cart->increment its count by 3->remove the product which are present in cart->logout			
public class TestCase5_Login_Cart_Count3_RemovepProduct_Logout extends LaunchQuit{
@Test
public void Login_Cart_Count3_RemovepProduct_Logout() throws InterruptedException
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

	SearchResultPage searchresultpage = new SearchResultPage(driver);
	searchresultpage.searchresultproduct1();

	Product1Page product1page = new Product1Page(driver);
	product1page.addtocart(driver);
	product1page.gotocart_button();
	
	CartPage cartpage = new CartPage(driver);
	cartpage.quantityplus_button();
	cartpage.delete_button();
	
	homepage.accountandlist(driver);
	homepage.logout();

	
}
}
