package com.amazon.stepdefs;

import org.junit.Assert;

import com.amazon.baseclass.BaseClass;
import com.amazon.missions.LoginMission;
import com.amazon.model.UserDataModel;
import com.amazon.pages.LoginScreen;
import com.amazon.pages.ProductCheckoutScreen;
import com.amazon.pages.ProductSearchScreen;
import com.amazon.utils.GetUserData;
import com.amazon.context.Context;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStepdef extends BaseClass{

	private LoginMission loginMission =new LoginMission();
	private ProductSearchScreen productSearchPage=new ProductSearchScreen();
	private ProductCheckoutScreen productCheckoutScreen=new ProductCheckoutScreen();

	@Given("I launch amazon app on {string}")
	public void i_launch_amazon_app_on(String deviceType) throws Throwable {
		launchApp(deviceType);
	}

	@Given("I login to amazon Appication as {string}")
	public void i_login_to_amazon_Appication_as(String userType) {
		loginMission.performLogin(userType);
	}

	@When("I search for {string}")
	public void i_search_for(String produtName) {
		productSearchPage.searchProduct(produtName);
	}

	@Then("I should see same Product details across search screen and checkout screen for specific project")
	public void i_should_see_same_Product_details_across_search_screen_and_checkout_screen_for_specific_project() {
		Assert.assertTrue("Mismatch in Product Name",
				productCheckoutScreen.getCheckoutScreenProductName().equals(Context.tempValues.get("productName")));
	}

}
