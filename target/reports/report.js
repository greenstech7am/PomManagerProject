$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/FBLogin.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the browser and load the facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "FBLoginStepDefinition.user_should_launch_the_browser_and_load_the_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the login page with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@kannan"
    }
  ]
});
formatter.step({
  "name": "User should type the username in the facebook page",
  "keyword": "When "
});
formatter.match({
  "location": "FBLoginStepDefinition.user_should_type_the_username_in_the_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to print the title of my page",
  "keyword": "And "
});
formatter.match({
  "location": "FBLoginStepDefinition.iNeedToPrintTheTitleOfMyPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should type the password in the facebook page",
  "keyword": "And "
});
formatter.match({
  "location": "FBLoginStepDefinition.user_should_type_the_password_in_the_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FBLoginStepDefinition.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FBLoginStepDefinition.user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the login page with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User should type the valid username \"\u003cuser\u003e\" in the facebook page",
  "keyword": "When "
});
formatter.step({
  "name": "I need to print the current url of my page",
  "keyword": "And "
});
formatter.step({
  "name": "User should type the invalid password in the facebook page \"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "java",
        "java@123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the browser and load the facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "FBLoginStepDefinition.user_should_launch_the_browser_and_load_the_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login page with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User should type the valid username \"java\" in the facebook page",
  "keyword": "When "
});
formatter.match({
  "location": "FBLoginStepDefinition.userShouldTypeTheValidUsernameInTheFacebookPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to print the current url of my page",
  "keyword": "And "
});
formatter.match({
  "location": "FBLoginStepDefinition.iNeedToPrintTheCurrentUrlOfMyPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should type the invalid password in the facebook page \"java@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "FBLoginStepDefinition.userShouldTypeTheInvalidPasswordInTheFacebookPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FBLoginStepDefinition.user_should_click_the_login_button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.stepdefinition.FBLoginStepDefinition.user_should_click_the_login_button(FBLoginStepDefinition.java:41)\r\n\tat ✽.User should click the login button(file:src/test/resources/FeatureFiles/FBLogin.feature:20)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FBLoginStepDefinition.user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/ForgotPassword.feature");
formatter.feature({
  "name": "To validate the forgot password functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "To validate the forgot password with invalid mobilenumber",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the chrome browser and load the facebook url",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordStepdefinition.userShouldLaunchTheChromeBrowserAndLoadTheFacebookUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the forgot password link",
  "keyword": "When "
});
formatter.match({
  "location": "ForgotPasswordStepdefinition.userShouldClickTheForgotPasswordLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should type the invalid mobile Number",
  "rows": [
    {
      "cells": [
        "dhoni",
        "virat",
        "sachin",
        "anil",
        "dravid"
      ]
    },
    {
      "cells": [
        "12345",
        "67890",
        "987654",
        "7565",
        "164778"
      ]
    },
    {
      "cells": [
        "33421",
        "98647",
        "523536",
        "7432",
        "098762"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordStepdefinition.userShouldTypeTheInvalidMobileNumber(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordStepdefinition.userShouldClickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should naviage to password reset recover page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPasswordStepdefinition.userShouldNaviageToPasswordResetRecoverPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});