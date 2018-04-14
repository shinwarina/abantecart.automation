package com.abantecart.step_defs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.abantecart.beans.CustomerBean;
import com.abantecart.pages.RegistrationPage;
import com.abantecart.utilities.Browserutils;
import com.abantecart.utilities.ConfigurationReader;
import com.abantecart.utilities.Driver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefs {

	private WebDriver driver = Driver.getDriver();

	RegistrationPage registrationPage = new RegistrationPage();

	@Given("^I navigate to the registration page$")
	public void i_navigate_to_the_registration_page() {
		driver.get(ConfigurationReader.getProperty("url"));
		registrationPage.loginOrRegister.click();
		registrationPage.ContinueButton.click();
		assertTrue(registrationPage.isAt());
	}

	@Then("^I should (see|not see) \"([^\"]*)\"$")
	public void i_should_see(String menu, String str) {
		if (menu.equals("see")) {
			assertTrue(Browserutils.isTextPresent(str));
		} else {
			assertFalse(Browserutils.isTextPresent(str));
		}
	}

	@And("^all labels with their fields should be present:$")
	public void all_labels_with_their_fields_should_be_present(List<String> labelList) {
		List<WebElement> eleList = registrationPage.getElementsFromLabels(labelList);

		for (int i = 0; i < eleList.size(); i++) {
			assertEquals(eleList.get(i).getText().replace(":", ""), labelList.get(i).replace(":", ""));
			assertTrue(registrationPage.getLabelsField(eleList.get(i)).isDisplayed());
		}
	}

	@When("^I click on Continue$")
	public void i_click_on_Continue() {
		registrationPage.continueButton.click();
		Browserutils.waitFor(1);
	}

	@Then("^all help messages should be displayed:$")
	public void all_help_messages_should_be_displayed(List<String> msgs) {
		for (String msg : msgs) {
			assertTrue(Browserutils.isTextPresent(msg));
		}
	}

	@And("^I enter (personal details|address|login details):$")
	public void i_enter_personal_details(String menu, List<CustomerBean> customer) {
		CustomerBean c = customer.get(0);

		if (menu.equals("personal details")) {
			registrationPage.firstName.sendKeys(registrationPage.customerFieldCheck(c.getFirstName()));
			registrationPage.lastName.sendKeys(registrationPage.customerFieldCheck(c.getLastName()));
			if (!registrationPage.customerFieldCheck(c.getEmail()).isEmpty()) {
				c.setEmail(registrationPage.generateRandomEmail(c.getEmail()));
				registrationPage.email.sendKeys(c.getEmail());
			}
			registrationPage.telephone.sendKeys(registrationPage.customerFieldCheck(c.getTelephone()));
			registrationPage.fax.sendKeys(registrationPage.customerFieldCheck(c.getFax()));
		}

		if (menu.equals("address")) {
			registrationPage.company.sendKeys(registrationPage.customerFieldCheck(c.getCompany()));
			registrationPage.address.sendKeys(registrationPage.customerFieldCheck(c.getAddress()));
			registrationPage.address2.sendKeys(registrationPage.customerFieldCheck(c.getAddress2()));
			registrationPage.city.sendKeys(registrationPage.customerFieldCheck(c.getCity()));
			registrationPage.zipCode.sendKeys(registrationPage.customerFieldCheck(c.getZipCode()));
			if (!registrationPage.customerFieldCheck(c.getCountry()).isEmpty()) {
				Browserutils.selectDropDownByVisibleText(registrationPage.country, c.getCountry());
			}
			if (!registrationPage.customerFieldCheck(c.getState()).isEmpty()) {
				Browserutils.selectDropDownByVisibleText(registrationPage.state, c.getState());
			}
		}

		if (menu.equals("login details")) {
			if (!registrationPage.customerFieldCheck(c.getLoginName()).isEmpty()) {
				c.setLoginName(registrationPage.generateRandomLoginName(c.getLoginName()));
				registrationPage.loginName.sendKeys(c.getLoginName());
			}
			registrationPage.password.sendKeys(registrationPage.customerFieldCheck(c.getPassword()));
			registrationPage.passwordConfirm.sendKeys(registrationPage.customerFieldCheck(c.getPasswordConfirm()));
		}
	}

	@Given("^I agree to the Privacy Policy$")
	public void i_agree_to_the_Privacy_Policy() {
		registrationPage.agreePrivacyPolicy.click();
	}

	@Then("^all my account links (should|should not) be displayed:$")
	public void all_my_account_links_should_be_displayed(String menu, List<String> expectedLinks) {
		if (menu.equals("should")) {
			List<WebElement> actualLinks = registrationPage.accountLinks;
			for (int i = 0; i < actualLinks.size(); i++) {
				assertEquals(actualLinks.get(i).getText().trim(), expectedLinks.get(i));
			}
		} else {
			for (String alert : expectedLinks) {
				assertFalse(Browserutils.isTextPresent(alert));
			}
		}
	}

	@Then("^warning alert should be displayed$")
	public void warning_alert_should_be_displayed() {
		assertTrue(registrationPage.warningAlert.isDisplayed());
	}
}
