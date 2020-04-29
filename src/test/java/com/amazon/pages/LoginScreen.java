package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.amazon.baseclass.BaseClass;

import io.appium.java_client.MobileElement;

public class LoginScreen extends BaseClass {

	@FindBy(xpath = "//*[contains(@text,'Already a customer')]")
	public WebElement alreadyCustomerButton;

	@FindBy(xpath = "//*[@resource-id='ap_email_login']")
	public WebElement emailTextBox;
	
	@FindBy(xpath = "//*[@resource-id='continue']")
	public WebElement continueButton;
	
	@FindBy(xpath = "//*[@resource-id='ap_password']")
	public WebElement passwordTextBox;
	
	@FindBy(xpath = "//*[@resource-id='signInSubmit']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@content-desc=\"Home\"]")
	public WebElement amazonLogo;
	


	public LoginScreen() {
		PageFactory.initElements(driver, this);
	}

	public LoginScreen enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(emailTextBox)).sendKeys(email);
		return this;
	}

	public LoginScreen clickAlreadyCustomerButton() {
		wait.until(ExpectedConditions.visibilityOf(alreadyCustomerButton)).click();
		return this;
	}

	public LoginScreen clickContinueButton() {
		wait.until(ExpectedConditions.visibilityOf(continueButton)).click();
		return this;
	}

	public LoginScreen enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(passwordTextBox)).sendKeys(password);
		return this;
	}

	public LoginScreen clickLoginButton() {
		wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
		return this;
	}
}
