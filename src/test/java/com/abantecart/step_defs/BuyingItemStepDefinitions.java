package com.abantecart.step_defs;

import org.openqa.selenium.Keys;

import com.abantecart.pages.CartPage;
import com.abantecart.pages.CheckOutPage;
import com.abantecart.pages.DashboardPage;
import com.abantecart.pages.HomePage;
import com.abantecart.pages.SearchResultPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyingItemStepDefinitions {
	DashboardPage dashBoardPage = new DashboardPage();
	SearchResultPage searchResultPage = new SearchResultPage();
	HomePage homePage = new HomePage();
	CartPage cartPage = new CartPage();
	CheckOutPage checkOutPage = new CheckOutPage();

	@Then("^I search for \"([^\"]*)\" from search box$")
	public void i_search_for_from_search_box(String searchItem) {
	dashBoardPage.search.sendKeys(searchItem+Keys.ENTER);
	}

	@Then("^I add item \"([^\"]*)\" to cart and proceed to chekout page$")
	public void i_add_item_to_cart_and_proceed_to_chekout_page(String item) {
		searchResultPage.addItem(item);;
		cartPage.Checkout.click();
		
	}

	@When("^I change my shipping address to \"([^\"]*)\"$")
	public void i_change_my_shipping_address_to(String arg1) {
		checkOutPage.editShipping.click();
//		checkOutPage.changeAddress.click();
	}

	@When("^Confirm my order$")
	public void confirm_my_order() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I navigate to order detailes page and my order exists$")
	public void i_navigate_to_order_detailes_page_and_my_order_exists() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
