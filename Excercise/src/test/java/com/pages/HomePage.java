package com.pages;

import org.openqa.selenium.By;

import com.runner.ObjectRepo;

public class HomePage extends ObjectRepo {
	String BaseURL = "https://www.which.co.uk";

	public void homepage() {
		driver.get(BaseURL);
	}

	public void search_for_televisions() {
		driver.findElement(By.cssSelector("#sli_search_1")).sendKeys("televisions");
	}

	public void search_button() {
		driver.findElement(By.cssSelector("button[class='_3ys9t xpm7D _2UzbB']")).click();
	}

	public void technology_from_topnavigation() {
		driver.findElements(By.cssSelector("span[class='gn-top-level-menu__link-title']")).get(0).click();
	}

	public void televisions_under_TV_home_entertainment() {
		driver.findElement(By.cssSelector("a[href='/reviews/televisions']")).click();
	}

	public void all_televisions_from_advertisements() {
		driver.findElements(By.cssSelector("a[class='VK_NP']")).get(5).click();
	}

	public void lowest_price_retailers_from_advertisements() {
		driver.findElements(By.cssSelector("div[class='W6LPW']")).get(4).click();
	}
}
