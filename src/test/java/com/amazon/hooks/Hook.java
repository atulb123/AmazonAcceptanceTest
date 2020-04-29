package com.amazon.hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.amazon.baseclass.BaseClass;
import com.google.common.io.Files;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {

	@Before("@Hooks")
	public void browserInitialization(Scenario scenario) throws Throwable {
		launchApp(System.getProperty("deviceType"));
	}

	@After("@Hooks")
	public void closeBrowser(Scenario scenario) throws Exception {
		if (scenario.isFailed())
			scenario.embed(driver.getScreenshotAs(OutputType.BYTES), "image/png");
		driver.quit();
	}
}
