package testCasesLesson4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.WishListPageObjects;
import testData.TestD;

public class WishListTestCases extends Base {
	
	HomePageObjects hp;
	WishListPageObjects wlp;
	TestD td;
	
	
	@BeforeMethod
	public void wishListFunctionality() {
		openApplication();
		hp = new HomePageObjects();
		wlp = new WishListPageObjects();
		td = new TestD();
	}
		
		@AfterMethod
		public void end() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();	
		}
		@Test
		public void AddProductToCartFromWishList() {
			  hp.navigatetoComputersPage();
			  wlp.AddToCartFromWishlist(homeUrl, homeUrl, homeUrl, homeUrl);
		}	
		
		@Test
		public void TotalPriceCalculatedCorrectly() {
			  hp.navigatetoComputersPage();
			  wlp.CheckIfTheTotalPriceIsCalculatedCorrectly(homeUrl, homeUrl, 0, homeUrl);
			
		}	 
	

}
