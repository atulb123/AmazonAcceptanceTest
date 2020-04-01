@Hooks 
Feature: Search Product

@TC001
Scenario: Verify Product details are same across search screen and checkout screen
	Given I login to amazon Appication as "User Type 1"
	When I search for "65-inch tv"
	Then I should see same Product details across search screen and checkout screen for specific project