package com.nt.magento.tests;

import org.testng.annotations.Test;

import com.nt.magento.actions.LoginPageActions;
import com.nt.magento.webdriver.WebDriverCC;

public class LoginPageTest extends WebDriverCC {

	LoginPageActions loginpage;

	@Test(priority = 1, groups = { "Smoke" })
	public void verifCustomerLoginText() {
		System.out.println("verifCustomerLoginText");
		loginpage = LoginPageActions.getActions();
		loginpage.launchApplication();
		loginpage.clickonsinginlink();
		loginpage.validateCustomerLoginText();

	}

	@Test(priority = 2, dataProvider = "testdata", groups = { "Swaroop" })
	public void verifValidCustomerLogin(String username, String password) {
		System.out.println("verifValidCustomerLogin");
		loginpage = LoginPageActions.getActions();
		loginpage.launchApplication();
		loginpage.clickonsinginlink();
		// loginpage.EnterUsernamePassword();
		loginpage.EnterUsernamePassword(username, password);
		loginpage.validateSuccessfullLogin();

	}

}
