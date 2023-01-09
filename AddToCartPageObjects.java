package pageObjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class AddToCartPageObjects extends Base {
	
	TestD td = new TestD();

	@FindBy(xpath="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[1]")
	WebElement NikeTailwindImage;
	
	@FindBy(xpath="//*[@id=\"product_attribute_11\"]")
	WebElement SizeButton;
	
	@FindBy(xpath="//option[contains(text(),'3X')]")
	WebElement Size3x;
	
	@FindBy(xpath="//span[normalize-space()='SKU:']")
	WebElement Sku;
	
	@FindBy(xpath="//input[@id='product_enteredQuantity_27']")
	WebElement ProductQuantityField;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-27']")
	WebElement AddToCartButton;
	
	@FindBy(xpath="//span[@class='cart-label']")
	WebElement ShoppingCartButton;
	
	@FindBy(xpath="//span[@class='sku-number']")
	WebElement SkuInShoppingCart;
	
	public AddToCartPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void AddProductsToShoppingcart(String Size3, String SKU, int i, String ShoppingCart, String SkuShoppingCart) {
		NikeTailwindImage.click();
		SizeButton.click();
		Size3x.click();
		Sku.getText();
		ProductQuantityField.clear();
		ProductQuantityField.sendKeys("4");
		AddToCartButton.click();
		ShoppingCartButton.click();
		SkuInShoppingCart.getText();
		
	}
	
	public void verifyIfTheSkuValueIsIdential() {
	
	Assert.assertEquals(Sku.getText(), td.SkuInShoppingCart);
	
	
	
}
}

