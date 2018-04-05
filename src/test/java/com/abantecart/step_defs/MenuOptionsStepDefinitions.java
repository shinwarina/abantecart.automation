package com.abantecart.step_defs;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abantecart.pages.HomePage;
import com.abantecart.utilities.Browserutils;
import com.abantecart.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuOptionsStepDefinitions {
	
	HomePage homePage = new HomePage();
	
	@When("^I hover over (Apparel & Accessories|Makeup|Fragrance|Skincare|Men|Haircare|Books) menu$")
	public void i_hover_over_Apparel_Accessories_menu(String menuOption) {
	    switch (menuOption) {
		case "Apparel & Accessories":
			Browserutils.hover(homePage.apparelAndAccessories);			
			break;
		case "Makeup":
			Browserutils.hover(homePage.makeup);			
			break;
		case "Fragrance":
			Browserutils.hover(homePage.fragrance);			
			break;
		case "Skincare":
			Browserutils.hover(homePage.skincare);			
			break;
		case "Men":
			Browserutils.hover(homePage.men);			
			break;
		case "Haircare":
			Browserutils.hover(homePage.hairCare);			
			break;
		case "Books":
			Browserutils.hover(homePage.books);			
			break;
	    }
	}

	@Then("^following menu options should be visible for (Apparel & accessories|Makeup|Fragrance|Skincare|Men|Hair Care|Books):$")
	public void following_menu_options_should_be_visible_for_Apparel_Accessories(String menu, List<String> options) {
		List<WebElement> acOptions = homePage.menuOptions(menu);
	    List<String> actualMenuOptions = Browserutils.getElementsText(acOptions);
	    for (int i = 0; i < actualMenuOptions.size(); i++) {
			if(actualMenuOptions.get(i).substring(0, 4).equals("    ")) {
				actualMenuOptions.set(i, actualMenuOptions.get(i).substring(4));
			}
		}
	    for (int i = 0; i < options.size(); i++) {
	    	assertEquals(actualMenuOptions.get(i), options.get(i));
		}
	}

}
