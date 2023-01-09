package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class PlpPageObjects extends Base {
	
TestD td = new TestD();
	
	
	@FindBy(xpath = "//img[@title='Show products in category Notebooks']") 
	WebElement notebookimage;
	
	@FindBy(xpath = "//div[@class='picture']//img[@title='Show details for HP Envy 6-1180ca 15.6-Inch Sleekbook']") 
	WebElement hpEnvy6image;
	
	@FindBy(xpath = "//input[@id='attribute-option-6']") 
	WebElement CpuInterCorei5;
	
	@FindBy(xpath = "//input[@id='attribute-option-9']") 
	WebElement Memory8Gb;
	
	
	public PlpPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void plpFunctionality (String computers, String notebook, String hpEnvy6) {
		
		notebookimage.click();
		hpEnvy6image.click();
		
	}
	
    public void filterOption (String IntelCorei5, String Memory) {
		
		notebookimage.click();
		CpuInterCorei5.click();
		Memory8Gb.click();
		
	}
	
	public void verifyThatUserRegister() {
		Assert.assertEquals(driver.getTitle(), td.plpPageTitle);
	}
	
	public void filterOptionIsWorking() {
		Assert.assertEquals(driver.getTitle(), td.plpPageTitle1);
	}
	
	}
