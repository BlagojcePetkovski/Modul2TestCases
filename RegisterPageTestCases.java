package testCasesLesson4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.RegisterPageObjects;
import testData.TestD;

public class RegisterPageTestCases extends Base {
	
	HomePageObjects hp;
	RegisterPageObjects rp;
	TestD td;
	
	@BeforeMethod
	public void start() {
		openApplication();
		hp = new HomePageObjects();
		rp = new RegisterPageObjects();
		td = new TestD();
	}
	
	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
  @Test
  public void fregisterWithValidCredential() {
	  hp.navigateRegisterPage();
	  rp.registerUser(td.firstname, td.lastname, td.email, td.password, td.confirmpassword);
	  rp.verifyThatUserRegister();
  }
  
  @Test
  public void registerWithInvalidCredentials() {
	  hp.navigateRegisterPage();
	  rp.registerUser(td.firstname, td.lastname,td.email,td.password,td.invalidconfirmpassword);
	  rp.verifyThatUserRegister();
  }
}
