package com.nt.magento.actions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nt.magento.element.LoginPageElement;
import com.nt.magento.utils.ReadProperties;
import com.nt.magento.webdriver.WebDriverCC;

public class LoginPageActions extends LoginPageElement {

	public void launchApplication() {
		System.out.println("launchApplication");
		driver.get(ReadProperties.readData("Config.properties", "URL"));
	}

	public void validateCustomerLoginText() {
		Assert.assertTrue(txt_CustomerLogin.isDisplayed());
	}

	public void clickonsinginlink() {
		SingIn.click();
	}

	// new with data provider
	public void EnterUsernamePassword(String username, String password) {
		enterInfo(txt_email, username);
		enterInfo(txt_password, password);
		implicitWait(10);
		clickOnElement(btn_signin);

	}

	// old--without data provider
	/*
	 * public void EnterUsernamePassword() { enterInfo(txt_email,
	 * ReadProp.readData("Config.properties", "email")); enterInfo(txt_password,
	 * ReadProp.readData("Config.properties", "password"));
	 * clickOnElement(btn_signin);
	 * 
	 * }
	 */

	public void validateSuccessfullLogin() {
		System.out.println("validateSuccessfullLogin");
		if (driver.getPageSource().contains("welcome")) {
			Assert.assertTrue(true);
		} else {
			implicitWait(5);
			driver.getPageSource()
					.contains("The account sign-in was incorrect or your account is disabled temporarily.");
			Assert.assertFalse(true);
		}
	}// method

	// pagefactory
	public static LoginPageActions getActions() { // return type of this method is class itself
		return PageFactory.initElements(WebDriverCC.getDriver(), LoginPageActions.class);

	}

}
