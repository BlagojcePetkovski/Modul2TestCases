package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class ScrollToPageObjects extends Base {
	
	TestD td = new TestD();
	
	@FindBy(xpath = "//a[normalize-space()='About us']")
	WebElement aboutUs;
	
	public ScrollToPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void scrollToAboutUs() {
		aboutUs.click();
	}
	
	public void verifyScrollToAboutUs() {
		Assert.assertEquals(driver.getTitle(), td.aboutUsButoon);
	}
	
}
