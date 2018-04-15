package com.abantecart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abantecart.utilities.Driver;

public class WishlistPage {
	private WebDriver driver;

	public WishlistPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "View Card")
	public WebElement viewCard;
	
	@FindBy(linkText = "Continue Shopping")
	public WebElement continueShopping;
	
	@FindBy(xpath = "//a[@class='cart']")
	public  WebElement addToCard;
	
	@FindBy(xpath = "//span[@class='maintext']")
	public WebElement addedToList;
	
	@FindBy(xpath = "//i[@class='fa fa-trash-o fa-fw']")
	public  WebElement deleteItem;
	
	@FindBy(xpath = "//div[@class='contentpanel']")
	public WebElement isEmpty;

	
	
	
	
	public  boolean verifyWishlistPageIsLoaded(WebDriver driver) {
		String urlExpected = "http://34.223.219.142:1022/abantecart/index.php?rt=account/wishlist";
		if(driver.getCurrentUrl().equals(urlExpected) ) {
			return true;
		}
		return false;
	}
	
	public  boolean confirm() {

		
		if (addedToList.isDisplayed()) {
			return true;
		}
		return false;

	}
}
