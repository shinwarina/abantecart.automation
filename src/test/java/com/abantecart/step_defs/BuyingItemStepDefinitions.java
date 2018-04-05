package com.abantecart.step_defs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;

import com.abantecart.pages.CartPage;
import com.abantecart.pages.CheckOutPage;
import com.abantecart.pages.DashboardPage;
import com.abantecart.pages.HomePage;
import com.abantecart.pages.SearchResultPage;
import com.abantecart.utilities.Browserutils;

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
	dashBoardPage.search.sendKeys(searchItem);
	assertEquals(dashBoardPage.search.getAttribute("value"), searchItem);
	dashBoardPage.search.sendKeys(Keys.ENTER);
	}

	@Then("^I add item \"([^\"]*)\" to cart$")
	public void i_add_item_to_cart_and_proceed_to_chekout_page(String item) {
		searchResultPage.addItem(item);
		cartPage.cartQuantity.clear();
		cartPage.cartQuantity.sendKeys("1");
		cartPage.Checkout.click();
		
	}

	@When("^I change my shipping address to \"([^\"]*)\"$")
	public void i_change_my_shipping_address_to(String shippingAddress) {
		checkOutPage.editShipping.click();
		checkOutPage.changeAddress.click();
		checkOutPage.chooseAddress(shippingAddress);
		checkOutPage.continueButton.click();
	}

	@When("^Confirm my order$")
	public void confirm_my_order() {
		checkOutPage.checkout_btn.click();
	}

	@Then("^My order should be processed$")
	public void i_navigate_to_order_detailes_page_and_my_order_exists() {
		assertTrue(checkOutPage.confirmOrderProcessed());
	}
	
	@When("^I select Men from Fragrance menu$")
	public void click_on_Men() {
	   Browserutils.hover(homePage.fragrance);
	   homePage.menFragrance.click();
//	  homePage.fragrance.sendKeys(Keys.DOWN+""+Keys.ENTER);
	}
}
