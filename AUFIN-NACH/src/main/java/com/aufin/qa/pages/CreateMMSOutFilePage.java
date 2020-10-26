package com.aufin.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;

public class CreateMMSOutFilePage extends TestBase {

	@FindBy(xpath = "//input[@value='Submit']")
	WebElement btnSubmit;

	/*@FindBy(xpath="//input[@type='submit']")
	WebElement btnConfirm;*/

	@FindBy(xpath="//*[@id=\"mainForm\"]/table[1]/tbody/tr[1]/td/table/tbody/tr/td[3]/input")
	WebElement btnConfirm;
	
	@FindBy(xpath = "//a[@id='logoutButtonId']")
	WebElement btnLogout;

	@FindBy(xpath = "//button[@name='logoutBtn1']")
	WebElement confirmBtnLogout;

	public CreateMMSOutFilePage() {

		PageFactory.initElements(driver, this);

	}
	public CreateMMSOutFilePage createMMSFile(Windowhandle win) throws InterruptedException {
		win.handlewin();
		btnSubmit.click();
		
		/*
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnConfirm.click();*/
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(btnConfirm)); 
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirm)).click();;
		
		
		/*JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("argument[0].click();",btnConfirm);*/
		
		
		btnLogout.click();
		confirmBtnLogout.click();
		return new CreateMMSOutFilePage();
	}
	

}
