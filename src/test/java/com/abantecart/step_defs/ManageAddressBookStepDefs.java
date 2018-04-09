package com.abantecart.step_defs;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.abantecart.pages.AccountPage;
import com.abantecart.pages.AddressBookPage;
import com.abantecart.pages.DashboardPage;
import com.abantecart.pages.HomePage;
import com.abantecart.pages.LoginPage;
import com.abantecart.utilities.Browserutils;
import com.abantecart.utilities.Driver;

import cucumber.api.java.en.When;

public class ManageAddressBookStepDefs {
	
private WebDriver driver = Driver.getDriver();
	
	DashboardPage dashBoardPage = new DashboardPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	AccountPage accountPage = new AccountPage();
	AddressBookPage addressBookPage = new AddressBookPage();
	
	@When("^I am at the manage address book page$")
	public void i_am_at_the_manage_address_book_page(Map<String, String> manageAddress) {
	    Browserutils.hover(dashBoardPage.welcomeBackJava);
	    dashBoardPage.welcomeBackJava.click();
	    
	    
	    
	    if(manageAddress.get("firstname") != null) {
		   addressBookPage.firstName.sendKeys(manageAddress.get("firstname"));
		    }
	    if(manageAddress.get("lastname") != null) {
			   addressBookPage.lastName.sendKeys(manageAddress.get("lastname"));
			    }
	    if(manageAddress.get("address") != null) {
	    	addressBookPage.address.sendKeys(manageAddress.get("address"));
		    }
	}
}
