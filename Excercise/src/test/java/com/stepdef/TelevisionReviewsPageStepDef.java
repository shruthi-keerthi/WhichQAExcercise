package com.stepdef;

import com.pages.TelevisionReviewsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TelevisionReviewsPageStepDef extends TelevisionReviewsPage {
	@When("^I launch the Television reviews url in the browser$")
	public void i_launch_the_Television_reviews_url_in_the_browser() throws Throwable {
		television_reviews_url();
	}

	@Then("^I shall be navigated to Television reviews page$")
	public void i_shall_be_navigated_to_Television_reviews_page() throws Throwable {
		television_reviews_page();
	}
}
