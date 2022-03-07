package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPojo extends BaseClass{
	
	//1. Default COnstructor
	
	public FBLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	//2. Annotation and private webelement
	
	// And Operator
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@type='text']")
		
	})
	private WebElement txtUser;
	
	// OR Operator
	@FindAll({
		@FindBy(id="pas"),
		@FindBy(xpath="//input[@placeholder='Password']")
	})
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnLogin;
	
	//3. Getters to access private webElement

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	

}
