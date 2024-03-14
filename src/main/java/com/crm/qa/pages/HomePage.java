package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page Factory - OR:

	// HomePageLogo verification
	@FindBy(xpath = "//span[@class = 'icon-cisco']")
	WebElement homePageLogo;

	// Personallogo
	@FindBy(xpath = "//span[@class='icon-medium icon-contact']")
	WebElement personalLogo;

	// Personaltitle
	@FindBy(xpath = "(//span[@class= 'profile-tab-label'])[2]")
	WebElement personalTitle;

	// PersonalTablclick
	@FindBy(xpath = "(//span[@class= 'profile-tab-label'])[2]")
	WebElement personalTitleClick;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Scenarios for Login Page.
	// Title Verification check
	// Verifying Screen logo presence check
	// Personal Tab Logo Presence Check
	// Personal Tab Label Presence Check
	// Personal Tab click Operation Check

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyHomePageLogo() {
		return homePageLogo.isDisplayed();
	}

	public boolean verifyPersonalLogo() {
		return personalLogo.isDisplayed();
	}

	public String verifyPersonalTabTilecheck() {
		return personalTitle.getText();
	}

	public void verifyPersonalTabclick() {
		personalTitleClick.click();
	}
	
	}


