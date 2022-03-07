package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	
	@Before(order=1)   // execute 1st
	public void beforeScenario() {
		System.out.println("Before Scenario got executed");
		launchChrome();
		loadUrl("https://www.facebook.com");
		winMax();

	}
	
	@Before(order =2) // execute 2nd
	public void startTimeScenario() {
		System.out.println("Start Time");

	}
	
	@Before(order=3) // execute 3rd
	public void beforeChecking() {
		System.out.println("Before Checking");

	}
	
	@After(order=3)  // execute 1st
	public void afterScenario(Scenario s) throws IOException {
		System.out.println("After Scenatio got executed");
		
		if (s.isFailed()) {
			
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
			
		}
	
	}
	
	@After(order=2) //execute  2nd
	public void endTimeSceanrio() {
		System.out.println("End Time");

	}
	
	@After(order=1)   // execute 3rd
	public void afterChecking() {
		System.out.println("After Checking");

	}

}
