package com.abantecart.step_defs;

import org.openqa.selenium.WebDriver;

import com.abantecart.pages.DashboardPage;
import com.abantecart.pages.LoginPage;
import com.abantecart.utilities.ConfigurationReader;
import com.abantecart.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WelcomeBackMenuStepDefinitions {
	
	private WebDriver driver = Driver.getDriver();
	DashboardPage dashBoardPage = new DashboardPage();
	LoginPage loginPage = new LoginPage();
	
	@Given("^I logged into abantecart$")
	public void i_logged_into_abantecart() {
		driver.get(ConfigurationReader.getProperty("url"));
		dashBoardPage.loginOrRegister.click();
		loginPage.login();
	}

	@When("^I hover over Welcome back menu$")
	public void i_hover_over_Welcome_back_menu() {
		
	}

	@Then("^Items should be displayed:$")
	public void items_should_be_displayed(DataTable arg1) {
		
	}

}
