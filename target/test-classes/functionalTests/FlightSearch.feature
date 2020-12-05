Feature: Flight search

Scenario Outline: User searches for flights from source to destination
	Given I am on the Home Page
	When I navigate to hotels page 
	And I search for hotels at "<location>"
	Then I see the hotels displayed
	
Examples:
 |location|
 |Mumbai|
 
 
 Scenario Outline: User searches for flights from source to destination 2
	Given I am on the Home Page
	When I navigate to hotels page 
	And I search for hotels at "<location>"
	Then I see the hotels displayed
	
Examples:
 |location|
 |Pune|
