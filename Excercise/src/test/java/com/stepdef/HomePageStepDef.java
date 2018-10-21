package com.stepdef;

import com.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDef extends HomePage {
	@Given("^I am in homepage$")
	public void i_am_in_homepage() throws Throwable {
		homepage();
	}

	@When("^I enter valid search for televisions$")
	public void i_enter_valid_search_for_televisions() throws Throwable {
		search_for_televisions();
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
		search_button();
	}

	@When("^I select technology from topnavigation$")
	public void i_select_technology_from_topnavigation() throws Throwable {
		technology_from_topnavigation();
	}

	@When("^I select televisions under TV & home entertainment$")
	public void i_select_televisions_under_TV_home_entertainment() throws Throwable {
		televisions_under_TV_home_entertainment();
	}

	@When("^I select all televisions from advertisements in the homepage$")
	public void i_select_All_televisions_from_advertisements_in_the_homepage() throws Throwable {
		all_televisions_from_advertisements();
	}

	@When("^I select lowest price television retailors link from the advertisements in the homepage$")
	public void i_select_lowest_price_television_retailors_link_from_the_advertisements_in_the_homepage()
			throws Throwable {
		lowest_price_retailers_from_advertisements();
	}
}
