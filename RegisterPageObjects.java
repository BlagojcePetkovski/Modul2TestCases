package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class RegisterPageObjects extends Base {
	
	TestD td = new TestD();
	
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstNamelInputField;
	
	@FindBy(xpath = "//input[@id='LastName']") 
	WebElement lastNameInputField;
	
	@FindBy(xpath = "//input[@id='Email']") 
	WebElement emailInputField1;
	
	@FindBy(xpath = "//input[@id='Password']") 
	WebElement passwordInputField;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']") 
	WebElement confirmPassInputField;
	
	@FindBy(xpath = "//button[@id='register-button']") 
	WebElement registerBtn;
	
	public RegisterPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void registerUser(String firstname, String lastname, String email, String password, String confirmpass ) {
		firstNamelInputField.sendKeys(firstname);
		lastNameInputField.sendKeys(lastname);
		emailInputField1.sendKeys(email);
		passwordInputField.sendKeys(password);
		confirmPassInputField.sendKeys(confirmpass);
		registerBtn.click();
	}
	
	public void verifyThatUserRegister() {
		Assert.assertEquals(driver.getTitle(), td.registerPagetitle);
	}
	
	public void verifyUnsuccessfulRegister() {
		Assert.assertEquals(driver.getTitle(), td.registerPagetitle);
		
	}
}
	


