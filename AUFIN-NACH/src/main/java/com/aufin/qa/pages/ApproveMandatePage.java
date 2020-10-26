package com.aufin.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;

public class ApproveMandatePage extends TestBase {

	// Page Element of Approve Mandate Screen

	@FindBy(xpath = "//input[@value='OK']")
	WebElement btnOk;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement approveMandatwRecord;

	@FindBy(xpath = "//input[@name='approve']")
	WebElement btnApprove;

	@FindBy(xpath = "//a[@id='logoutButtonId']")
	WebElement btnLogout;

	@FindBy(xpath = "//button[@name='logoutBtn1']")
	WebElement confirmBtnLogout;
	
	@FindBy(name="mbUMRN")
	WebElement mbUMRN;

	@FindBy(name="mbSvcProviderCode")
	WebElement utilityTextField;
	
	
	// constructor
	public ApproveMandatePage() {

		PageFactory.initElements(driver, this);
	}

	public ApproveMandatePage approveMandate(Windowhandle win,DataTable credentials) throws InterruptedException {
		win.handlewin();
		List<List<String>> data=credentials.asLists();
		mbUMRN.sendKeys(data.get(0).get(0));
		btnOk.click();
		approveMandatwRecord.click();
		Thread.sleep(3000);
		btnApprove.click();
		btnLogout.click();
		confirmBtnLogout.click();
		return new ApproveMandatePage();
	}
	
	public ApproveMandatePage rejectApproveMandate(Windowhandle win, String UMRN) throws InterruptedException {
		win.handlewin();
		mbUMRN.sendKeys(UMRN);
		btnOk.click();
		approveMandatwRecord.click();
		Thread.sleep(3000);
		btnApprove.click();
		btnLogout.click();
		confirmBtnLogout.click();
		return new ApproveMandatePage();
		
	}
	
	public ApproveMandatePage approveOutwardMandate(Windowhandle win,String Customer_Code) throws InterruptedException {
		
		win.handlewin();
		utilityTextField.sendKeys(Customer_Code);
		btnOk.click();
		approveMandatwRecord.click();
		Thread.sleep(3000);
		btnApprove.click();
		btnLogout.click();
		confirmBtnLogout.click();
		return new ApproveMandatePage();
	}
}
