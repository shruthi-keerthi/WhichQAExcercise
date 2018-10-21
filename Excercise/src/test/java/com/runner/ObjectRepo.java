package com.runner;

import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.SamsungTelevisionReviews;
import com.pages.TelevisionReviewsPage;

public class ObjectRepo {
	public static WebDriver driver;
	public static HomePage HomePage = new HomePage();
	public static TelevisionReviewsPage televisionReviewsPage = new TelevisionReviewsPage();
	public static SamsungTelevisionReviews samsungTelevisionReviews = new SamsungTelevisionReviews();
}
