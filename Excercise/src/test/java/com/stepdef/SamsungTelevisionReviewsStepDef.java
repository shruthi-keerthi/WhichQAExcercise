package com.stepdef;

import com.pages.SamsungTelevisionReviews;

import cucumber.api.java.en.When;

public class SamsungTelevisionReviewsStepDef extends SamsungTelevisionReviews {
	@When("^I select televisions from popular categories$")
	public void i_select_televisions_from_popular_categories() throws Throwable {
		televisions_from_popular_categories();
	}

}
