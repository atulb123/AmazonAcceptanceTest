package com.amazons.missions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.amazon.baseclass.BaseClass;
import com.amazon.model.UserDataModel;
import com.amazon.pages.LoginScreen;
import com.amazon.utils.GetUserData;

public class LoginMission extends BaseClass{

	private LoginScreen loginScreen = new LoginScreen();

	public boolean performLogin(String userType) {
		UserDataModel user = GetUserData.getTestData(userType);
		loginScreen.clickAlreadyCustomerButton().enterEmail(user.getEmail()).clickContinueButton()
				.enterPassword(user.getPassword()).clickLoginButton();
		return wait.until(ExpectedConditions.visibilityOf(loginScreen.amazonLogo)).isDisplayed();
	}
}
