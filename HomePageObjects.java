package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePageObjects extends Base {
	
	Actions actions = new Actions(driver);
	
	//Web elements locators Home page
	
	@FindBy(xpath = "//a[normalize-space()='Log in']")
	WebElement loginLink;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement registerlink;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
	WebElement computerslink;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
	WebElement bookslink;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
	WebElement ApparelButton;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Clothing']")
	WebElement ClothingButton;


	
	//Init
	
	public HomePageObjects () {
		PageFactory.initElements(driver, this);	
		
	}
	
	//Methods related to home page
	
	public void navigateToLoginPage() {
		loginLink.click();
	}
	public void navigateRegisterPage() {
		registerlink.click();
	
	}
	
	public void navigatetoComputersPage() {
		computerslink.click();
	
	}
	
	public void mouseHoverApparelCategorry() {
		actions.moveToElement(ApparelButton).perform();
	
	}
	
	public void selectClothingSubcategory() {
		ClothingButton.click();
	
	}

}
