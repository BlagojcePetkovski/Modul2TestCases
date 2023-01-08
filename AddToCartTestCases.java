package testCasesLesson5;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.AddToCartPageObjects;
import pageObjects.HomePageObjects;
import testData.TestD;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AddToCartTestCases extends Base {
	HomePageObjects hp;
	AddToCartPageObjects atc;
	TestD td;
	
  @Test
  public void AddToCartProducts() {
	  hp.mouseHoverApparelCategorry();
	  hp.selectClothingSubcategory();
	  atc.AddProductsToShoppingcart(homeUrl, homeUrl, 4, homeUrl, homeUrl);
  }
  
	  @BeforeMethod
		public void AddTocart() {
			openApplication();
			hp = new HomePageObjects();
			atc = new AddToCartPageObjects();
			td = new TestD();
  }

	  @AfterMethod
		public void end() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
	  }

}
