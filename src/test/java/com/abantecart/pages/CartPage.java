package com.abantecart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abantecart.utilities.Driver;

public class CartPage {
	private WebDriver driver;

	public CartPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="bgnone")
	public WebElement itemInfo;
	
	@FindBy(id="cart_checkout1")
	public  WebElement Checkout;
	
	@FindBy(id="cart_update")
	public WebElement Update;
	
	@FindBy(xpath = "//table[@class='table table-striped table-bordered']/tbody/tr/td//div[@class='input-group input-group-sm']//input[@type='text']")
	public WebElement cartQuantity;
	
	@FindBy (className="productfilneprice")
	public WebElement itemPrice;
	
	@FindBy(className = "cart")
	public WebElement addToCart;
	
	@FindBy(xpath = "//i[@class='fa fa-trash-o fa-fw']")
	public WebElement delete;
	
	@FindBy(xpath = "//div[@class='contentpanel']")
	public WebElement isEmpty;


	
	public static boolean verifyAccountPageIsLoaded(WebDriver driver) {
		String urlExpected = "http://34.223.219.142:1022/abantecart/index.php?rt=checkout/cart";
		if(driver.getCurrentUrl().equals(urlExpected) ) {
			return true;
		}
		return false;
	}
	
}
