package com.abantecart.step_defs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.abantecart.beans.ManageAddressBookBean;
import com.abantecart.pages.AccountPage;
import com.abantecart.pages.AddressBookPage;
import com.abantecart.pages.DashboardPage;
import com.abantecart.pages.HomePage;
import com.abantecart.pages.LoginPage;
import com.abantecart.utilities.Browserutils;
import com.abantecart.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManageAddressBookBeansStepDefs {
	
	private WebDriver driver = Driver.getDriver();
	
	DashboardPage dashBoardPage = new DashboardPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	AccountPage accountPage = new AccountPage();
	AddressBookPage addressBookPage = new AddressBookPage();
	
	
	
	@When("^I add a new address using beans:$")
	public void i_add_a_new_address_using_beans(List<ManageAddressBookBean> manageAddress) {
	    Browserutils.hover(dashBoardPage.welcomeBackJava);
	    ManageAddressBookBean contact = manageAddress.get(0);
	    dashBoardPage.welcomeBackJava.click();
	    accountPage.manageAddressBook.click();
	    addressBookPage.addNewAddress.click();
	    addressBookPage.firstName.sendKeys(contact.getFirstname());
	    addressBookPage.lastName.sendKeys(contact.getLastname());
	    addressBookPage.address.sendKeys(contact.getAddress());
	    addressBookPage.city.sendKeys(contact.getCity());
	    addressBookPage.selectRegionStateByVisibleText(contact.getState());
	    addressBookPage.zipCode.sendKeys(contact.getZipcode());
	    addressBookPage.selectCountryByVisibleText(contact.getCountry());
	    addressBookPage.continueButton.click();
	    
	    
	}

	@Then("^I should be able to see the information for \"([^\"]*)\"$")
	public void i_should_be_able_to_see_the_information_for(String fullName) {
	    
	    String firstAndLastName = addressBookPage.addressBookEntries.getText();
	    assertTrue(addressBookPage.addressBookEntries(fullName));
	}
}
