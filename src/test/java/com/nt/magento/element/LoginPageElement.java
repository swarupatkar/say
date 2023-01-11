package com.nt.magento.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.nt.magento.commons.WebCommonsCC;

public class LoginPageElement extends WebCommonsCC {
	// constructor
	public LoginPageElement() {
		System.out.println("LoginPageElement");
	}

	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	@CacheLookup
	public WebElement SingIn;

	@FindBy(xpath = "//span[text()='Customer Login']")
	@CacheLookup
	public WebElement txt_CustomerLogin;

	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	public WebElement txt_email;

	@FindBy(xpath = "//input[@id='pass']")
	@CacheLookup
	public WebElement txt_password;

	@FindBy(xpath = "//button[@class='action login primary']")
	@CacheLookup
	public WebElement btn_signin;

	@FindBy(xpath = "//div[contains(text(),'The account sign-in was incorrect')]")
	@CacheLookup
	public WebElement errorMassage;

	@FindBy(xpath = "//div[contains(text(),'Incorrect CAPTCHA')]")
	@CacheLookup
	public WebElement captcha;

	// div[contains(text(),'The account sign-in was incorrect')]
}
