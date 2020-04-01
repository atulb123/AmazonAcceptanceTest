package com.amazon.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.amazon.baseclass.BaseClass;
import com.amazon.context.Context;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ProductSearchScreen extends BaseClass {

	@FindBy(xpath = "//*[contains(@text,'Search')]")
	public WebElement searchBox;

	@FindBy(xpath = "//*[contains(@text,'close')]")
	public WebElement closePopup;

	@FindBy(xpath = "//*[contains(@resource-id,'item_title')]")
	public List<WebElement> productList;

	public ProductSearchScreen() {
		PageFactory.initElements(driver, this);
	}

	public ProductSearchScreen searchProduct(String productName) {
		wait.until(ExpectedConditions.visibilityOf(closePopup)).click();
		wait.until(ExpectedConditions.visibilityOf(searchBox)).click();
		driver.hideKeyboard();
		wait.until(ExpectedConditions.visibilityOf(searchBox)).sendKeys(productName);
		driver.findElement(By.xpath("(//*[@text='65-inch tv'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(productList));
		if (productList.size() > 2) {
			WebElement tempElement = productList.get(new Random().nextInt(productList.size() - 1) + 1);
			Context.tempValues.put("productName", tempElement.getText());
			tempElement.click();
		} else {
			WebElement tempElement = productList.get(productList.size() - 1);
			Context.tempValues.put("productName", tempElement.getText());
			tempElement.click();
		}
		return this;
	}

}
