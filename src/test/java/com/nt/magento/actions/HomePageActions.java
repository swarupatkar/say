package com.nt.magento.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nt.magento.element.HomePageElement;
import com.nt.magento.utils.ReadProperties;
import com.nt.magento.webdriver.WebDriverCC;

public class HomePageActions extends HomePageElement {

	public HomePageActions() {
		System.out.println("HomePageActions");
	}

	public static HomePageActions getActions() { // return type of this method is class itself
		return PageFactory.initElements(WebDriverCC.getDriver(), HomePageActions.class);

	}

	public void launchApplication() {
		System.out.println("launchApplication");
		driver.get(ReadProperties.readData("Config.properties", "URL"));
	}

	public void validateapplicationLogo() {
		System.out.println("validateapplicationLogo");
		Assert.assertTrue(logo.isDisplayed());

	}

	public void validateSignIn() {
		System.out.println("validateSignIn");
		Assert.assertTrue(SingIn.isDisplayed());

	}

	public void validateCreateAnAccount() {
		System.out.println("validateCreateAnAccount");
		Assert.assertTrue(CreateAnAccount.isDisplayed());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
