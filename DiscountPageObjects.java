package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class DiscountPageObjects extends Base {
	
	TestD td = new TestD();
	
	@FindBy(xpath = "//img[@title=\"Show details for Levi's 511 Jeans\"]")
	WebElement Lewis511JeansImage;
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-30']")
	WebElement AddToCartButton;
	
	@FindBy(xpath = "//span[@class='cart-label']")
	WebElement ShoppingCartIcon;
	
	@FindBy(xpath = "//span[@class='product-unit-price']")
	WebElement UnitPrice;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	WebElement QuantityField;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	WebElement ClearQuantityField;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	WebElement EnterQuantity;
	
	@FindBy(xpath = "//button[@id='updatecart']")
	WebElement UpdateShoppingCartButton;
	
	@FindBy(xpath = "//span[@class='product-unit-price']")
	WebElement PriceForThree;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	WebElement QuantityField1;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	WebElement ClearQuantityField1;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	WebElement EnterQuantity1;
	
	@FindBy(xpath = "//button[@id='updatecart']")
	WebElement UpdateShoppingCartButton1;
	
	@FindBy(xpath = "//span[@class='product-unit-price']")
	WebElement PriceForSeven;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	WebElement QuantityField2;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	WebElement ClearQuantityField2;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")
	WebElement EnterQuantity2;
	
	@FindBy(xpath = "//button[@id='updatecart']")
	WebElement UpdateShoppingCartButton2;
	
	@FindBy(xpath = "//span[@class='product-unit-price']")
	WebElement PriceForTen;
	
	public DiscountPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void DicsountGivenToTheProducts(String product, String addToCart, String shoppingCart, String quantity, int i, String updatebutton) {
		Lewis511JeansImage.click();
		AddToCartButton.click();
		ShoppingCartIcon.click();
		UnitPrice.getText();
		QuantityField.click();
		ClearQuantityField.clear();
		EnterQuantity.sendKeys(td.QuantityField);
		UpdateShoppingCartButton.click();
		PriceForThree.getText();
		QuantityField1.click();
		ClearQuantityField1.clear();
		EnterQuantity.sendKeys(td.QuantityField1);
		UpdateShoppingCartButton.click();
		PriceForSeven.getText();
		QuantityField2.click();
		ClearQuantityField2.clear();
		EnterQuantity.sendKeys(td.QuantityField2);
		UpdateShoppingCartButton.click();
		PriceForTen.getText();

	}

	public void verifyThePriceChanges () {
		
		Assert.assertEquals(UnitPrice.getText(), td.PriceForOnePiece);
		Assert.assertEquals(PriceForThree.getText(), td.PriceForThreePieces);
		Assert.assertEquals(PriceForSeven.getText(), td.PriceForSevenPieces);
		Assert.assertEquals(PriceForTen.getText(), td.PriceForTenPieces);
		
		
	}
	
	}

