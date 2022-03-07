package org.stepdefinition;

import java.io.IOException;
import org.junit.Assert;
import org.managers.PageObjectManager;
import org.openqa.selenium.By;
import org.utilities.BaseClass;
import org.utilities.FBLoginPojo;
import io.cucumber.java.en.*;

public class FBLoginStepDefinition extends BaseClass {
	
	PageObjectManager instance;
	FBLoginPojo fbLoginPage;
	
	@Given("User should launch the browser and load the facebook page")
	public void user_should_launch_the_browser_and_load_the_facebook_page() {
		

	}

	@When("User should type the username in the facebook page")
	public void user_should_type_the_username_in_the_facebook_page() throws IOException {

		instance = PageObjectManager.getInstance();
		fbLoginPage = instance.getFbLoginPage();
		fill(fbLoginPage.getTxtUser(), getData(1, 0));

	}

	@When("User should type the password in the facebook page")
	public void user_should_type_the_password_in_the_facebook_page() throws IOException {
	
		
		fill(fbLoginPage.getTxtPass(), getData(1, 1));

	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		btnClick(fbLoginPage.getBtnLogin());
		Thread.sleep(2000);

	}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("verify the url", currentUrl.contains("privacy"));
		System.out.println("My Sceaniro 1 is passed");

	}
	
	
	@When("I need to print the title of my page")
	public void iNeedToPrintTheTitleOfMyPage() {
		printTitle();
		Assert.assertTrue("Checking", true);
	}
	
	
	@When("User should type the valid username in the facebook page")
	public void userShouldTypeTheValidUsernameInTheFacebookPage() throws IOException {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtUser(), getData(2, 0));
	
	}

	@When("I need to print the current url of my page")
	public void iNeedToPrintTheCurrentUrlOfMyPage() {
		printCurrentUrl();
	}

	@When("User should type the invalid password in the facebook page")
	public void userShouldTypeTheInvalidPasswordInTheFacebookPage() throws IOException {
	
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtPass(), getData(2, 1));
	}
	
	@When("User should type the valid username {string} in the facebook page")
	public void userShouldTypeTheValidUsernameInTheFacebookPage(String s1) {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtUser(), s1);
	   
	}

	@When("User should type the invalid password in the facebook page {string}")
	public void userShouldTypeTheInvalidPasswordInTheFacebookPage(String s2) {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtPass(), s2);
	}
	
	


}
