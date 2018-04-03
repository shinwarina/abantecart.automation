package com.abantecart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abantecart.utilities.ConfigurationReader;
import com.abantecart.utilities.Driver;

public class LoginPage {
	private WebDriver driver;

	public LoginPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public WebElement loginFrm_loginname;
	
	public WebElement loginFrm_password;
	
	@FindBy(xpath="//form[@id='loginFrm']/fieldset/button")
	public WebElement loginButton;
	
	public void login() {
		loginFrm_loginname.sendKeys(ConfigurationReader.getProperty("username"));
		loginFrm_password.sendKeys(ConfigurationReader.getProperty("password"));
		loginButton.click();
	}

}
