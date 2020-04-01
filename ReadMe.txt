Hi,

The framework is developed using Page Object model Pattern using Junit with Cucumber

All the java codes comes under src/test/java under which we have 9 packages:
acceptancetestpackage->It has runner file for execution
baseclass->Driver Initialization
context->To Store Temporary Values
hooks->performs launching app and closing app before actual test starts
missions->multiple actions are written inside. Mainly for code readability
pages->Page Object model pattern
stepdefs->All stepdefs are present
utils->read data from JSON Files
model->to get JSON objects during deserialization

All non coding stuffs comes under src/test/resources
feature->All feature files are present in this folder

APK file is in apkPath folder

***All desired cababilities for a device has to be mentioned in "DeviceCapabilities.json" and "deviceType" attribute should be unique
HTML report can be found under target report

*******Maven Command to run the test is:******************
mvn test -Dcucumber.options="--tags @TC001" -DdeviceType="android_device"