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
	
	@FindBy(linkText = "  Account Dashboard")
	public WebElement accountDashboard;
	
	@FindBy(linkText = "  My wish list")
	public WebElement mywishlist;
	
	@FindBy(linkText = "  Edit account details")
	public WebElement  editaccountdetails;
	
	
	@FindBy(linkText = "  Change password")
	public WebElement changepassword;
	
	@FindBy(linkText = "  Manage Address Book")
	public WebElement manageAddressBook;
	
	@FindBy(linkText = "  Order history")
	public WebElement   orderhistory;
	 
}