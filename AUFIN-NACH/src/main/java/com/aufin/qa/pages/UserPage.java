package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aufin.qa.base.TestBase;

public class UserPage extends TestBase {

	// User Page Xpath
	@FindBy(name = "username")
	WebElement lblUserName;

	@FindBy(name = "fullName")
	WebElement lblFullName;

	@FindBy(name = "profileId")
	WebElement lblProfile;

	@FindBy(name = "password")
	WebElement lblPassword;

	@FindBy(name = "verifyPassword")
	WebElement lblVerifyPswd;

	@FindBy(xpath = "//*[@id='pageBody']/form/table/tbody/tr/td/table/tbody/tr[32]/td/input[3]")
	WebElement btnOk;

	// Confirm btn
	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/p/input[2]")
	WebElement btnConfirm;

	// logout btn
	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	// External logout btn
	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;

	// User Approve Page Elements
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement approveRecord;

	// User Confirm approve
	@FindBy(name = "approve")
	WebElement confirmApprove;
	
	@FindBy(name = "oldPassword")
	WebElement OldPswd;
	
	@FindBy(name = "newPassword")
	WebElement NewPswd;
	
	@FindBy(name = "verifyPassword")
	WebElement VerifyPswd;
	
	@FindBy(xpath = "//*[@id='pageBody']/table[2]/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
	WebElement SubmitButton;
	
	

	public UserPage() {

		PageFactory.initElements(driver, this);
	}

	public UserPage addUser(String un, String fn, String Profile, String Password, String Verifypassword) {
		lblUserName.sendKeys(un);
		lblFullName.sendKeys(fn);
		lblPassword.sendKeys(Password);
		lblVerifyPswd.sendKeys(Verifypassword);
		Select sel = new Select(lblProfile);
		sel.selectByIndex(1);
		btnOk.click();
		btnConfirm.click();
		btnLogout.click();
		extBtnLogout.click();
		return new UserPage();
	}

	public UserPage approveUser() {
		approveRecord.click();
		confirmApprove.click();
		btnLogout.click();
		extBtnLogout.click();
		return new UserPage();
	}
	
	public UserPage PswdChange()
	{
		OldPswd.sendKeys("Secure");
		NewPswd.sendKeys("secure@123");
		VerifyPswd.sendKeys("secure@123");
		SubmitButton.click();
		extBtnLogout.click();
		return new UserPage();
		
	}

	public UserPage newuserlogin()
	{
		
		return new UserPage() ;
		
	}
}
