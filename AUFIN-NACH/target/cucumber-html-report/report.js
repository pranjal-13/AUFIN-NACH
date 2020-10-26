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
        "Priynaka K",
        "9239893398761",
        "14400",
        "Aditi",
        "AUBL00000000000000",
        "SBIN0004343",
        "CREATE_01.jpg",
        "CREATE_01.tif",
        "AUBL00000000000000"
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
  "name": "user enters \"Priynaka K\" \"9239893398761\" \"14400\" \"Aditi\" \"AUBL00000000000000\" \"SBIN0004343\" and upload \"CREATE_01.jpg\" \"CREATE_01.tif\"",
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
  "name": "user approves the mandate \"AUBL00000000000000\"",
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
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d84.0.4147.89)\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027DESKTOP-0NUN9DU\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_252\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.89, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\MONTRAN\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:53985}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f3767e728d3b6e2f28a422754857d74f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:316)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat sun.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.aufin.qa.pages.CreateMMSOutFilePage.createMMSFile(CreateMMSOutFilePage.java:32)\r\n\tat StepDefinition.MndtOutwardStepDefinition.user_creates_file_from_Create_MMS_file_screen_menu(MndtOutwardStepDefinition.java:75)\r\n\tat ✽.user creates file from Create MMS file screen menu(file:src/test/resources/Feature/TC09-CreateOutwardMandate.feature:11)\r\n",
  "status": "failed"
});
});