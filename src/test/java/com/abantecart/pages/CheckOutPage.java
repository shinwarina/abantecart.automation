package com.abantecart.pages;

import java.util.List;

import org.openqa.selenium.By;
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
	String orderNum;
	public WebElement checkout_btn;

	@FindBy(linkText = "Edit Shipping")
	public WebElement editShipping;
	// table[@class='table confirm_shippment_options']/tbody/tr/td//a

	@FindBy(linkText = "Edit Payment")
	public WebElement editPayment;

	@FindBy(linkText = "Edit Coupon")
	public WebElement editCoupon;

	@FindBy(linkText = "Edit Cart")
	public WebElement editCart;

	@FindBy(linkText = "Change Address")
	public WebElement changeAddress;

	@FindBy(xpath = "//button[@class='btn btn-orange pull-right']")
	public WebElement continueButton;

	@FindBy(xpath = "//span[@class='maintext']")
	public WebElement orderProcessed;
	
	@FindBy(xpath = "//a[@class='btn btn-default mr10']")
	public WebElement otherContinueButton;

	@FindBy(xpath = "//section[@class='mb40']//p[contains(text(),'Your order')]")
	public WebElement yourOrderNumber;

	@FindBy(css = "div[class='contentpanel']>div>div")
	List<WebElement> orderNumbers;

	public void chooseAddress(String address) {
		if (address != null) {
			List<WebElement> addresses = driver.findElements(By.xpath("//label[@class='control-label inline']"));
			for (WebElement webElement : addresses) {

				if (webElement.getText().contains(address)) {
					webElement.click();
				}
			}
		}
	}

	public boolean confirmOrderProcessed() {

		if (orderProcessed.isDisplayed()) {
			return true;
		}
		return false;

	}
	public String getOrderNumber() {
		orderNum = (yourOrderNumber.getText().substring(12, 15).trim());
		System.out.println(orderNum);
		return orderNum;
	}

	public boolean confirmOrderNumber(String expect) {
		for (WebElement orderNumL : orderNumbers) {
			if (orderNumL.getText().contains(orderNum)) {
				return true;
			}
		}
		return false;
	}

}

