package com.abantecart.step_defs;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.abantecart.pages.DashboardPage;
import com.abantecart.pages.HomePage;
import com.abantecart.pages.LoginPage;
import com.abantecart.utilities.Browserutils;
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
	HomePage homePage = new HomePage();
	
	@Given("^I logged into abantecart$")
	public void i_logged_into_abantecart() {
		driver.get(ConfigurationReader.getProperty("url"));
		dashBoardPage.loginOrRegister.click();
		loginPage.login();
	}

	@When("^I hover over Welcome back menu$")
	public void i_hover_over_Welcome_back_menu() {
		Browserutils.hover(dashBoardPage.welcomeBackJava);
	}
	
	@Then("^Items should be displayed:$")
	public void items_should_be_displayed(List<String> expectedItems) {
		List<String> actualItems = new ArrayList<>();
		for (String string : dashBoardPage.listOfElementsFromTopMenuOptions()) {
			actualItems.add(string);
		}
		for (int i = 0 ; i < expectedItems.size() ; i++) {			
			assertEquals(actualItems.get(0), expectedItems.get(0));
		}
	}

}