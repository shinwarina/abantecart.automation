package com.abantecart.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
private WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
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
