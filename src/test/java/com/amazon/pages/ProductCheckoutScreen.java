package com.amazon.pages;

import java.util.List;
import com.amazon.context.Context;

import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.amazon.baseclass.BaseClass;
import com.amazon.context.Context;

public class ProductCheckoutScreen extends BaseClass {

	@FindBy(xpath = "//*[@content-desc='Search']")
	public WebElement searchIcon;

	@FindBy(xpath = "//*[contains(@text,'Amazon needs your delivery location')]")
	public WebElement popUpText;

	@FindBy(xpath = "//*[contains(@text,'close')]")
	public WebElement closePopup;

	public ProductCheckoutScreen() {
		PageFactory.initElements(driver, this);
	}

	public String getCheckoutScreenProductName() {
		try {
			wait.until(ExpectedConditions.visibilityOf(popUpText));
		} catch (Exception e) {
		}
		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
		try {
			wait.until(ExpectedConditions.visibilityOf(closePopup)).click();
		} catch (Exception e) {
		}
		return driver.findElement(By.xpath("//*[@text='" + Context.tempValues.get("productName") + "']")).getText();
	}
}
