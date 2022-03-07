
@smoke @regression
Feature: To validate the forgot password functionality

Scenario: To validate the forgot password with invalid mobilenumber
Given User should launch the chrome browser and load the facebook url
When User should click the forgot password link
And User should type the invalid mobile Number
						# With Header - 2D Map - List<Map<String, String>>
							|dhoni|virat|sachin|anil|dravid|
							|12345|67890|987654|7565|164778|
							|33421|98647|523536|7432|098762|
		
And User should click the search button
Then User should naviage to password reset recover page