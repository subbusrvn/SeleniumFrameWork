package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.userLoginOperationCheck(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void verifyHomePagetitle() {
		String title = homepage.verifyHomePageTitle();
		Assert.assertEquals(title, "Log In to Cisco", "Home Page title is not matched");
	}
	
	@Test
	public void verifyHomePageLogo() {
		boolean homePageflag = homepage.verifyHomePageLogo();
		Assert.assertTrue(homePageflag);		
	}
	
	@Test
	public void verifyPersonalLogocheck() {
		boolean personalflag = homepage.verifyPersonalLogo();
		Assert.assertTrue(personalflag);		
	}
	
	@Test
	public void verifyPersonalTabTilecheck() {
		String pertitlecheck = homepage.verifyPersonalTabTilecheck();
		Assert.assertEquals(pertitlecheck, "Profile Management", "Title is not match with Profile Management");		
	}
	
	@Test
	public void verifyPersonalTabclick() {
		homepage.verifyPersonalTabTilecheck();
		System.out.println("Personal Tab ic Clicked");
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
