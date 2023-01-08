package testCasesLesson5;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.DiscountPageObjects;
import pageObjects.HomePageObjects;
import testData.TestD;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class DiscountTestCases extends Base {
	HomePageObjects hp;
	DiscountPageObjects dpo;
	TestD td;
	
  @Test
  public void discount1() {
	  
  	hp.mouseHoverApparelCategorry();
  	hp.selectClothingSubcategory();
  	dpo.DicsountGivenToTheProducts(homeUrl, homeUrl, homeUrl, homeUrl, 0, homeUrl);
  	
  
  }
  
  
  @BeforeMethod
	public void Discount() {
		openApplication();
		hp = new HomePageObjects();
		dpo = new DiscountPageObjects();
		td = new TestD();
}
  {
  }

  @AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
}

}
