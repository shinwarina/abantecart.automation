package com.abantecart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abantecart.utilities.Driver;

public class CheckOutPage {

	private WebDriver driver;

	public CheckOutPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	
	public WebElement checkout_btn;
	
	@FindBy(linkText ="Edit Shipping")
	public WebElement editShipping;
	//table[@class='table confirm_shippment_options']/tbody/tr/td//a
	
	@FindBy(linkText ="Edit Payment")
	public WebElement editPayment;

	@FindBy(linkText ="Edit Coupon")
	public WebElement editCoupon;
	
	@FindBy(linkText ="Edit Cart")
	public WebElement editCart;
	
	@FindBy(linkText ="Change Address")
	public WebElement changeAddress;
	
	@FindBy(linkText ="//table[@class='table table-striped']/tbody/tr")
	public WebElement allAddressBookEntries;
	
	public void chooseAddress(String address) {
			
		if(allAddressBookEntries.toString().contains(address)) {
			
		}
	}
	
}
