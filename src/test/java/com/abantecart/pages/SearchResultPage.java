package com.abantecart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abantecart.utilities.Driver;

public class SearchResultPage {
	private WebDriver driver;

	public SearchResultPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='Mens Fine Cotton Giraffe Polo Shirts']")
	public WebElement mensCottonPolo;
	
	@FindBy(className = "cart")
	public WebElement addToCart;
	
	
	public void addItem(String itemName) {
		WebElement item=null;
		if(itemName!=null) {
			String xpath = "//a[@title='"+itemName+"']";
			 item= driver.findElement(By.xpath(xpath));
		}
		item.click();
		addToCart.click();
	}
}
