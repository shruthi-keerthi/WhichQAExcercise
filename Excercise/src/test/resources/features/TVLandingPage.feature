Feature: TV Landing Page

Scenario: Navigating to TV landing page via search 
Given I am in homepage
When I enter valid search for televisions
And click on search button
Then I shall be navigated to Television reviews page

Scenario: Navigating to TV landing page via topnavigation
Given I am in homepage
When I select technology from topnavigation
And I select televisions under TV & home entertainment
Then I shall be navigated to Television reviews page

Scenario: Navigating to TV landing page from advertisements
Given I am in homepage
When I select all televisions from advertisements in the homepage
Then I shall be navigated to Television reviews page

Scenario: Navigating to TV landing page via lowest price television retailors link
Given I am in homepage
When I select lowest price television retailors link from the advertisements in the homepage
And I select televisions from popular categories
Then I shall be navigated to Television reviews page

Scenario: Navigating to TV landing page using valid TV landing page url
When I launch the Television reviews url in the browser
Then I shall be navigated to Television reviews page
