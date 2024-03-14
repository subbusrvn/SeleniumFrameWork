package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTestcases extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTestcases() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();

		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String logintitle = loginpage.titleVerificationcheck();
		Assert.assertEquals(logintitle, "Log In to Cisco", "Login Title is not matched");
	}

	@Test(priority = 2)
	public void LogopresentTest() {
		Boolean logoflag = loginpage.logoPresenceCheck();
		Assert.assertTrue(logoflag);
	}

	@Test(priority = 3)
	public void LoginOperationTest() {

		homepage = loginpage.userLoginOperationCheck(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
