package com.nt.magento.tests;

import org.testng.annotations.Test;

import com.nt.magento.actions.HomePageActions;
import com.nt.magento.webdriver.WebDriverCC;

public class HomePageTest extends WebDriverCC {

	HomePageActions homepage;

	@Test(priority = 1)
	public void verifyApplicationLogo() {
		System.out.println("verifyApplicationLogo");
		homepage = HomePageActions.getActions();
		homepage.launchApplication();
		homepage.validateapplicationLogo();

	}

	@Test(priority = 2)
	public void verifySignIn() {
		homepage = HomePageActions.getActions();
		homepage.launchApplication();
		homepage.validateSignIn();

	}

	@Test(priority = 3)
	public void verifyCreateAnAccount() {
		homepage = HomePageActions.getActions();
		homepage.launchApplication();
		homepage.validateCreateAnAccount();

	}

}
