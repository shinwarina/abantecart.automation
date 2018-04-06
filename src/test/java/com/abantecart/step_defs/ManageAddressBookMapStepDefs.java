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

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class ManageAddressBookMapStepDefs {

	private WebDriver driver = Driver.getDriver();

	DashboardPage dashBoardPage = new DashboardPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	AccountPage accountPage = new AccountPage();
	AddressBookPage addressBookPage = new AddressBookPage();
	
	@When("^I add a new address using maps:$")
	public void i_add_a_new_address_using_maps(Map<String, String> manageAddress) {
	    Browserutils.hover(dashBoardPage.welcomeBackJava);
	    dashBoardPage.welcomeBackJava.click();
	    accountPage.manageAddressBook.click();
	    addressBookPage.addNewAddress.click();
	}
}
