package amazon_package.Amazon_Project;
//Login to amazon->search a product->add it to wishlist->add it to cart->Make a paymnet using COD->logout			
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase2_Login_Wishlist_Cart_Payment_Logout extends LaunchQuit
{
	@Test
	public void Login_Wishlist_Cart_Payment_Logout() throws InterruptedException
	{	
	HomePage homepage = new HomePage(driver);
	homepage.accountandlist(driver);
	homepage.signin(driver);
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.user();
//	Thread.sleep(2000);
	loginpage.cntbutton();
	loginpage.password();
//	Thread.sleep(2000);
	loginpage.signinbutton();
	homepage.search(driver);
	
	SearchResultPage searchresultpage= new SearchResultPage(driver);
	searchresultpage.searchresultproduct1();
	
	Product1Page product1page = new Product1Page(driver);
	product1page.addtowishlist(driver);
	product1page.continuebutton();
	product1page.addtocart(driver);
	
	PaymentPage paymentpage = new PaymentPage(driver);
	paymentpage.proceedtobuy();
//	paymentpage.changeaddress();
//	paymentpage.deliveryaddress(driver);
	paymentpage.usethisaddress_button();
//	paymentpage.changepaymentmethod();
	paymentpage.cod();
	paymentpage.usethispaymentmethod();
	paymentpage.placeyourorder();
	
	homepage.accountandlist(driver);
	homepage.logout();
}
}