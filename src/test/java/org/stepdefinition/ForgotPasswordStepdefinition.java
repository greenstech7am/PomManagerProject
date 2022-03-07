package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class ForgotPasswordStepdefinition extends BaseClass{
	
	@Given("User should launch the chrome browser and load the facebook url")
	public void userShouldLaunchTheChromeBrowserAndLoadTheFacebookUrl() {

	}

	@When("User should click the forgot password link")
	public void userShouldClickTheForgotPasswordLink() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
	   
	}

	@When("User should type the invalid mobile number")
	public void userShouldTypeTheInvalidMobileNumber() {
		
		WebElement txtMobile = driver.findElement(By.xpath("//input[@id='identify_email']"));
		txtMobile.sendKeys("1234567890");
	  
	}

	@When("User should click the search button")
	public void userShouldClickTheSearchButton() throws InterruptedException {
		driver.findElement(By.id("did_submit")).click();
		Thread.sleep(2000);
		    
	}

	@Then("User should naviage to password reset recover page")
	public void userShouldNaviageToPasswordResetRecoverPage() {
		
		String current = driver.getCurrentUrl();
		
	    Assert.assertTrue("Verify the current URl", current.contains("recover"));
	    System.out.println("the forgot password scenario is passsed");
	}
	
	@When("User should type the invalid mobile Number")
	public void userShouldTypeTheInvalidMobileNumber(io.cucumber.datatable.DataTable d) {
		WebElement txtMobile = driver.findElement(By.xpath("//input[@id='identify_email']"));
		
		//2D Map
		List<Map<String, String>> mp = d.asMaps();
		
		fill(txtMobile,mp.get(0).get("anil"));
		
	
	    
	}



}
