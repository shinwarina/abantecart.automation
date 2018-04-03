package com.abantecart.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abantecart.utilities.Driver;

public class DashboardPage {
	
private WebDriver driver;
	
	public DashboardPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='filter_keyword']")
	public WebElement search;
	
	@FindBy(linkText="Login or register")
	public WebElement loginOrRegister;
	
	@FindBy(linkText = "Welcome back Admin")
	public WebElement welcomeBackAdmin;
	
	@FindBy(linkText = "SPECIALS")
	public WebElement specials;
	
	@FindBy(linkText = "ACCOUNT")
	public WebElement account;
	
	@FindBy(linkText = "CART")
	public WebElement cart;
	
	@FindBy(linkText = "CHECKOUT")
	public WebElement checkOut;
	
	public List<WebElement> topMenuOptions(String link){
			String xpath = "//a[contains(text(),'"+ link +"')]/../../li/a";
			Set<WebElement> set = (Set<WebElement>) driver.findElements(By.xpath(xpath));
			return new ArrayList(set);
		}
	
}
