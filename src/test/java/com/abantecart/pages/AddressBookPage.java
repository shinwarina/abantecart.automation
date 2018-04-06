package com.abantecart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.abantecart.utilities.Driver;

public class AddressBookPage {
	
	private WebDriver driver;
	
	public AddressBookPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-orange pull-right']")
	public WebElement addNewAddress;
	
	@FindBy(id = "AddressFrm_firstname")
	public WebElement firstName;
	
	@FindBy(id = "AddressFrm_lastname")
	public WebElement lastName;
	
	@FindBy(id = "AddressFrm_address_1")
	public WebElement address;
	
	@FindBy(id = "AddressFrm_city")
	public WebElement city;
	
	@FindBy(id = "AddressFrm_zone_id")
	public WebElement regionState;
	
	@FindBy(id = "AddressFrm_postcode")
	public WebElement zipCode;
	
	@FindBy(id = "AddressFrm_country_id")
	public WebElement country;
	
	@FindBy(xpath = "//button[@title='Continue']")
	public WebElement continueButton;
	
	@FindBy(xpath ="//address[contains(text(),'Artem Pashynskyi')]")
	public WebElement addressBookEntries;
	
	public void selectCountryByVisibleText(String countries) {
		Select select = new Select(country);
		select.selectByVisibleText(countries);
		
	}
	
	public void selectRegionStateByVisibleText(String state) {
		Select select = new Select(regionState);
		select.selectByVisibleText(state);
		
	}
	
	public boolean addressBookEntries(String fName) {
		List<WebElement> list = driver.findElements(By.tagName("address"));
		List<String> elemTexts = new ArrayList<>();
		for (WebElement lis : list) {
			if(lis.getText().contains(fName)) {
				return true;
			}
		}
		return false;
		
	}
	
	
	
	
	
}
