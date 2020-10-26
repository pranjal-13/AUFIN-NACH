package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aufin.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(name="j_user")
	WebElement username;
	
	@FindBy(name="j_pass")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement btnLogin;
	
	
	//constructor to initialize the above element
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage login(String un, String pwd) {
		
		username.sendKeys(un);;
		password.sendKeys(pwd);
		btnLogin.click();
		
		return new HomePage();
				
	}
}
