Feature: To validate the login functionality of facebook page
Background:
Given User should launch the browser and load the facebook page

@kannan
Scenario: Validate the login page with invalid username and invalid password

When User should type the username in the facebook page
And I need to print the title of my page
And User should type the password in the facebook page
And User should click the login button
Then User should navigate to incorrect credential page

@amit
Scenario Outline: To validate the login page with valid username and invalid password

When User should type the valid username "<user>" in the facebook page
And I need to print the current url of my page
And User should type the invalid password in the facebook page "<pass>"
And User should click the login button
Then User should navigate to incorrect credential page

Examples:
				|user|pass|
				|java|java@123|





