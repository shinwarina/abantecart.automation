package com.abantecart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abantecart.utilities.Driver;

public class AccountPage {
	private WebDriver driver;

	public AccountPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public static boolean verifyAccountPageIsLoaded(WebDriver driver) {
		String urlExpected = "http://34.223.219.142:1022/abantecart/index.php?rt=account/account";
		if(driver.getCurrentUrl().equals(urlExpected) ) {
			return true;
		}
		return false;
	}
	
	@FindBy(linkText = "Account Dashboard")
	public WebElement AccountDashboard;
	
	@FindBy(linkText = "My wish list")
	public WebElement Mywishlist;
	
	@FindBy(linkText = "Edit account details")
	public WebElement  Editaccountdetails;
	
	
	@FindBy(linkText = "Change password")
	public WebElement Changepassword;
	
	  
	@FindBy(linkText = "Manage Address Book")
	public WebElement ManageAddressBook;
	
	@FindBy(linkText = "Order history")
	public WebElement   Orderhistory;
	 
}




