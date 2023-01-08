package testCasesLesson4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.ScrollToPageObjects;
import testData.TestD;

public class ScrollToTestCases extends Base {
	
	HomePageObjects hp;
	ScrollToPageObjects sp;
	TestD td;

	@BeforeMethod
	public void start() {
		openApplication();
		hp = new HomePageObjects();
		sp = new ScrollToPageObjects();
		td = new TestD();
	}
	
	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@Test
	  public void scrollToWorkCorectlly() {
		  sp.scrollToAboutUs();
	  }
}
