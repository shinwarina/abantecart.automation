package com.abantecart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abantecart.utilities.Driver;

public class HomePage {
	private WebDriver driver;

	public HomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="APPAREL & ACCESSORIES")
	public WebElement apparelAndAccessories;
	
	@FindBy(linkText="MAKEUP")
	public WebElement makeup;
	
	@FindBy(linkText="SKINCARE")
	public WebElement skincare;
	
	@FindBy(linkText="FRAGRANCE")
	public WebElement fragrance;
	
	@FindBy(linkText="MEN")
	public WebElement men;
	
	@FindBy(linkText="HAIR CARE")
	public WebElement hairCare;
	
	@FindBy(linkText="BOOKS")
	public WebElement books;	

}
