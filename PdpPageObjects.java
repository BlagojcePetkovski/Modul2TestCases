package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class PdpPageObjects extends Base {
	
	TestD td = new TestD();
	
	@FindBy(xpath = "//img[@title='Show details for Pride and Prejudice']")
	WebElement PrideAndPrejudice;
	
	@FindBy(xpath = "//button[normalize-space()='Email a friend']")
	WebElement EmailAFriendBtn;
	
	@FindBy(xpath = "//input[@id='FriendEmail']")
	WebElement friensemailInputButton;
	
	@FindBy(xpath = "//input[@id='YourEmailAddress']")
	WebElement yourEmailInputButton;
	
	@FindBy(xpath = "//button[normalize-space()='Send email']")
	WebElement sendEmailBtn;
	
	public PdpPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void ShareProduct(String friendsEmail, String yourEmailaddress) {
	
		PrideAndPrejudice.click();
		EmailAFriendBtn.click();
		friensemailInputButton.sendKeys(friendsEmail);
		yourEmailInputButton.sendKeys(yourEmailaddress);
		sendEmailBtn.click();
	}
	
	public void verifyThatEmailIsSent() {
		Assert.assertEquals(driver.getTitle(), td.pdpMailaFriend);
	}

}
