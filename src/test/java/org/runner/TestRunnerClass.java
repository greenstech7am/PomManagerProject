package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefinition", monochrome=true, snippets=SnippetType.CAMELCASE, 
dryRun = false, plugin = {"html:target\\reports",
						  "junit:target\\reports\\fbjunit.xml",
						  "json:target\\reports\\fblogin.json",
						  "rerun:src\\test\\resources\\Rerun\\Failed.txt"}, tags= {"~@amit"})
public class TestRunnerClass extends JVMReport{
	
	
	@AfterClass
	public static void sample() {
		
		generateJvmReport(System.getProperty("user.dir")+"\\target\\reports\\fblogin.json");
		
		

	}
	
	
	
	

}
