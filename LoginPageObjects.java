package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
 

import base.Base;
import testData.TestD;

public class LoginPageObjects extends Base {
	
	TestD td = new TestD();
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement emailInputField;
	
	@FindBy(xpath = "//input[@id='Password']") 
	WebElement passwordInputField;
	
	@FindBy(xpath = "//button[normalize-space()='Log in']") 
	WebElement loginBtn;
	
	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginUser(String username, String password ) {
		emailInputField.sendKeys(username);
		passwordInputField.sendKeys(password);
		loginBtn.click();
	
	
	}
	public void verifyThatUserLogin1() {
		Assert.assertEquals(driver.getTitle(), td.homePageTitle);
	}
	
	public void verifyUnsuccessfulLogin1() {
		Assert.assertEquals(driver.getTitle(), td.pdpMailaFriend);
	}

	
	
}



