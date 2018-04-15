package com.abantecart.step_defs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;

import com.abantecart.pages.CartPage;
import com.abantecart.pages.DashboardPage;
import com.abantecart.pages.HomePage;
import com.abantecart.pages.SearchResultPage;
import com.abantecart.pages.WishlistPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WishlistStepDefinitions {
	DashboardPage dashBoardPage = new DashboardPage();
	SearchResultPage searchResultPage = new SearchResultPage();
	HomePage homePage = new HomePage();
	WishlistPage wishlistPage=new WishlistPage();
	CartPage cartPage=new CartPage();
	
	@When("^I add item \"([^\"]*)\" to wishlist$")
	public void i_add_item_to_wishlist(String item) {
		dashBoardPage.search.sendKeys(item);
		assertEquals(dashBoardPage.search.getAttribute("value"), item);
		dashBoardPage.search.sendKeys(Keys.ENTER);
		wishlistPage.addToCard.click();
	}

	@Then("^My item \"([^\"]*)\" should be in wishlist$")
	public void my_item_should_be_in_wishlist(String arg1) {
		assertTrue(wishlistPage.confirm());
	}

	@When("^I delete item from wishlist$")
	public void i_delete_item_from_wishlist() {
	    wishlistPage.deleteItem.click();
	}

	@Then("^Wishlist should be empty$")
	public void wishlist_should_be_empty() {
	    wishlistPage.isEmpty.isDisplayed();
	}




	

}
