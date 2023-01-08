package testCasesLesson4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.PlpPageObjects;
import testData.TestD;

public class PlpPageTestCases extends Base {
	
	HomePageObjects hp;
	PlpPageObjects plp;
	TestD td;
	
	@BeforeMethod
	public void plpFunctionality() {
		openApplication();
		hp = new HomePageObjects();
		plp = new PlpPageObjects();
		td = new TestD();
	}
	
	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test
	public void HpNotebookCanBeFoun() {
		  hp.navigatetoComputersPage();
		  plp.plpFunctionality(homeUrl, homeUrl, homeUrl);
	}	 
	
	  
	  @Test
	  public void filterOptionisWorking() {
		  hp.navigatetoComputersPage();
		  plp.filterOption(homeUrl, homeUrl);
		  
	}	 

}
