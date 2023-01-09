package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class WishListPageObjects extends Base {
	TestD td = new TestD();
	
	@FindBy(xpath = "//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[3]")
	WebElement addToWishListField;
	
	@FindBy(xpath = "//span[@class='wishlist-label']") 
	WebElement wishListLink;
	
	@FindBy(xpath = "//input[@name='addtocart']") 
	WebElement addToCartBox;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']") 
	WebElement addToCartField;
	
	@FindBy(xpath = "//tbody/tr[1]/td[6]/input[1]") 
	WebElement quantityField;
	
	
	@FindBy(xpath = "//button[@id='updatecart']") 
	WebElement updatecartButton;
	
	public WishListPageObjects() {
		PageFactory.initElements(driver, this );
	
		
	}
    
	public void AddToCartFromWishlist(String addToWishList, String wishList, String addToCartCheckBox, String addToCartButton) {
		addToWishListField.click();
		wishListLink.click();
		addToCartBox.click();
		addToCartField.click();	
	}
	
	public void CheckIfTheTotalPriceIsCalculatedCorrectly(String addToWishList, String wishList, int i, String updateWishlist) {
		addToWishListField.click();
		wishListLink.click();
		quantityField.clear();
		quantityField.sendKeys("5");
		updatecartButton.click();
		
	}
			
	public void verifyThatProductCanBeAddedToCartFromWishlist() {
		Assert.assertEquals(driver.getTitle(), td.wishListTitle);
	}
	
	public void verifyThatTheTotalPriceIsCalculatedCorrectly() {
		Assert.assertEquals(driver.getTitle(), td.wishListTotalPrice);
	}
	
}
