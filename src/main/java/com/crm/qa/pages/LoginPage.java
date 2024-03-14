package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:

	@FindBy(xpath = "//input[@name= 'username']")
	WebElement username;
	
	@FindBy(xpath  = "//input[@type = 'submit']")
	WebElement nextbutton;
	
	@FindBy(xpath  = "//input[@type ='password']")
	WebElement password;
	
	@FindBy(xpath  = "//input[@class='button button-primary']")
	WebElement loginbutton;
	
	@FindBy(xpath  = "(//span[@title= 'Cisco Logo'])[1]")
	WebElement ciscologo;
	

	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);	
	}
	
	//Scenarios for Login Page.
	  // Title Verification check 
	  // Verifying logo presence check 
	  // Login operation check 
	
	public String titleVerificationcheck() {
		return driver.getTitle();
		
	}
	
	public boolean logoPresenceCheck() {
	return ciscologo.isDisplayed();	
	}
	
	public HomePage userLoginOperationCheck(String un, String pwd) {
		username.sendKeys(un);
		nextbutton.click();
		password.sendKeys(pwd);
		loginbutton.click();
		return new HomePage();
	
		}

}
