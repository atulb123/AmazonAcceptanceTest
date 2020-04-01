package com.amazon.model;

public class DeviceCapabilityModel {

	private String deviceType;
	private String deviceName;
	private String platformVersion;
	private String browserName;
	private String noReset;
	private String platformName;
	private String appiumVersion;
	private String appiumServerUrl;
	private String appPackage;
	private String appActivity;
	
	public String getAppPackage() {
		return appPackage;
	}

	public void setAppPackage(String appPackage) {
		this.appPackage = appPackage;
	}

	public String getAppActivity() {
		return appActivity;
	}

	public void setAppActivity(String appActivity) {
		this.appActivity = appActivity;
	}

	public String getAppiumServerUrl() {
		return appiumServerUrl;
	}

	public void setAppiumServerUrl(String appiumServerUrl) {
		this.appiumServerUrl = appiumServerUrl;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	private String appName;

	public String getAppiumVersion() {
		return appiumVersion;
	}

	public void setAppiumVersion(String appiumVersion) {
		this.appiumVersion = appiumVersion;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public String getNoReset() {
		return noReset;
	}

	public void setNoReset(String noReset) {
		this.noReset = noReset;
	}
}
