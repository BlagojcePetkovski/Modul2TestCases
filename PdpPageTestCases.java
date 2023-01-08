package testCasesLesson4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.PdpPageObjects;
import testData.TestD;

public class PdpPageTestCases extends Base {
	
	HomePageObjects hp;
	PdpPageObjects pdp;
	TestD td;
	
	@BeforeMethod
	public void pdpShareOption() {
		openApplication();
		hp = new HomePageObjects();
		pdp = new PdpPageObjects();
		td = new TestD();
	}
	
	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

	
  @Test
  public void ShareProductFunctionality() {
	  hp.navigatetoComputersPage();
	  pdp.ShareProduct("nikola1@yahoo.com", "blagojce2@hotmail.com");
  }    
	  
  }

