package com.pages;

import org.openqa.selenium.By;

import com.runner.ObjectRepo;

public class SamsungTelevisionReviews extends ObjectRepo {

	public void televisions_from_popular_categories() {
		driver.findElement(By.cssSelector("a[href='https://www.which.co.uk/reviews/televisions']")).click();
	}

}
