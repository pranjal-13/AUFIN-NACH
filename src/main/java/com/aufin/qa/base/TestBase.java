package com.aufin.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;


	public TestBase() {

		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("src/main/java/com/aufin/qa/config/config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void Initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/main/java/com/aufin/qa/config/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "/AUFIN-NACH/src/main/java/com/aufin/qa/config/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "/AUFIN-NACH/src/main/java/com/aufin/qa/config/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
	
	
	
}
