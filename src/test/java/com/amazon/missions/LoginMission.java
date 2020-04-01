package com.amazon.missions;

import com.amazon.model.UserDataModel;
import com.amazon.pages.LoginScreen;
import com.amazon.utils.GetUserData;

public class LoginMission {
	private LoginScreen loginScreen = new LoginScreen();

	public LoginMission performLogin(String userType) {
		UserDataModel user = GetUserData.getTestData(userType);
		loginScreen.clickAlreadyCustomerButton().enterEmail(user.getEmail()).clickContinueButton()
				.enterPassword(user.getPassword()).clickLoginButton();
		return this;
	}
}
