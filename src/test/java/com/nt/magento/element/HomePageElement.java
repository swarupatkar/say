package com.nt.magento.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.nt.magento.commons.WebCommonsCC;

public class HomePageElement extends WebCommonsCC {

	public HomePageElement() {
		System.out.println("HomePageElement");
	}

	@FindBy(xpath = "//img[@title='']")
	public WebElement logo;

	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	public WebElement SingIn;

	@FindBy(xpath = "//a[text()='Create an Account']")
	public WebElement CreateAnAccount;
	
	@FindBy(xpath = "//span[contains(text(),'Welcome')]")
	@CacheLookup
	public WebElement welcomeLink;
}
