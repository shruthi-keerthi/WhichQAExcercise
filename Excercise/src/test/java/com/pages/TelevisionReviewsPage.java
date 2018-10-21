package com.pages;

import org.junit.Assert;

import com.runner.ObjectRepo;

public class TelevisionReviewsPage extends ObjectRepo {
	public void television_reviews_url() throws Throwable {
		driver.navigate().to("https://www.which.co.uk/reviews/televisions");
	}

	public void television_reviews_page() {
		Assert.assertEquals("Television reviews - Which?", driver.getTitle());
	}
}
