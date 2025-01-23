package amazon_package.Amazon_Project;

import org.testng.annotations.Test;

//Login to amazon->search a product->add it to wishlist->remove it from wishlist->logout				
public class TestCase4_Login_Addtowishlist_Removefromwishlist_Logout extends LaunchQuit {
	@Test
	public void Login_Addtowishlist_Removefromwishlist_Logout() throws InterruptedException {
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
		product1page.addtowishlist(driver);
		
		WishlistPage wishlistpage = new WishlistPage(driver);
		wishlistpage.viewyourlist_buttton();
		wishlistpage.delete_buttton();
		
		homepage.accountandlist(driver);
		homepage.logout();

	}

}
