package com.abantecart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	private WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public static boolean verifyAccountPageIsLoaded(WebDriver driver) {
		String urlExpected = "http://34.223.219.142:1022/abantecart/index.php?rt=checkout/cart";
		if(driver.getCurrentUrl().equals(urlExpected) ) {
			return true;
		}
		return false;
	}
	
	@FindBy(id="cart_checkout1")
	public WebElement Checkout;
	
	@FindBy(id="cart_update")
	public WebElement Update;
}
