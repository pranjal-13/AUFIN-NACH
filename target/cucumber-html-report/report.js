$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/TC09-CreateOutwardMandate.feature");
formatter.feature({
  "name": "To test create outward mandate functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create Outward Mandate",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_09_01_CreateOutwardMandatePositiveScenario"
    }
  ]
});
formatter.step({
  "name": "user is on MPS and creates new mandate from create mandate menu",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cName\u003e\" \"\u003cAccount_Number\u003e\" \"\u003cAmount\u003e\" \"\u003cCustomer_Name\u003e\" \"\u003cCustomer_Code\u003e\" \"\u003cIFSC_Code\u003e\" and upload \"\u003cImage1\u003e\" \"\u003cImage2\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on ok and confirm button",
  "keyword": "Then "
});
formatter.step({
  "name": "user approves the mandate \"\u003cCustomer_Code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user creates file from Create MMS file screen menu",
  "keyword": "And "
});
formatter.step({
  "name": "user validates the mandate in list mandate screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Account_Number",
        "Amount",
        "Customer_Name",
        "Customer_Code",
        "IFSC_Code",
        "Image1",
        "Image2",
        "Customer_Code"
      ]
    },
    {
      "cells": [
        "Shankar R",
        "9239893322744",
        "1300",
        "Bajaj Finance",
        "HDFC00053000002841",
        "SBIN0004343",
        "CREATE_01.jpg",
        "CREATE_01.tif",
        "HDFC00053000002841"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Outward Mandate",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_09_01_CreateOutwardMandatePositiveScenario"
    }
  ]
});
formatter.step({
  "name": "user is on MPS and creates new mandate from create mandate menu",
  "keyword": "Given "
});
formatter.match({
  "location": "MndtOutwardStepDefinition.user_is_on_MPS_and_creates_new_mandate_from_create_mandate_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Shankar R\" \"9239893322744\" \"1300\" \"Bajaj Finance\" \"HDFC00053000002841\" \"SBIN0004343\" and upload \"CREATE_01.jpg\" \"CREATE_01.tif\"",
  "keyword": "When "
});
formatter.match({
  "location": "MndtOutwardStepDefinition.user_enters_and_upload(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on ok and confirm button",
  "keyword": "Then "
});
formatter.match({
  "location": "MndtOutwardStepDefinition.user_clicks_on_ok_and_confirm_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user approves the mandate \"HDFC00053000002841\"",
  "keyword": "And "
});
formatter.match({
  "location": "MndtOutwardStepDefinition.user_approves_the_mandate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user creates file from Create MMS file screen menu",
  "keyword": "And "
});
formatter.match({
  "location": "MndtOutwardStepDefinition.user_creates_file_from_Create_MMS_file_screen_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the mandate in list mandate screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OnusCreateMandateStepDefination.user_validates_the_mandate_in_list_mandate_screen()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027pageBody\u0027]/form/table/tbody/tr[2]/td/input[2]\"}\n  (Session info: chrome\u003d85.0.4183.121)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.18363 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027LAPTOP-I46Q2QIK\u0027, ip: \u0027192.168.4.177\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\MONTRAN\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 85.0.4183.121, webStorageEnabled: true}\nSession ID: 4a235d0df2b186469fcc7c9e97140ade\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027pageBody\u0027]/form/table/tbody/tr[2]/td/input[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:217)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:169)\r\n\tat org.openqa.selenium.remote.codec.jwp.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:41)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:83)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:47)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:451)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:394)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.aufin.qa.pages.CreateONUSMandate.ViewingMandate(CreateONUSMandate.java:157)\r\n\tat StepDefinition.OnusCreateMandateStepDefination.user_validates_the_mandate_in_list_mandate_screen(OnusCreateMandateStepDefination.java:95)\r\n\tat ✽.user validates the mandate in list mandate screen(file:src/test/resources/Feature/TC09-CreateOutwardMandate.feature:12)\r\n",
  "status": "failed"
});
});