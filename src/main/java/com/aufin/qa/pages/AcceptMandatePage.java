package com.aufin.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;

public class AcceptMandatePage extends TestBase {

	//Windowhandle win;
	// Page Elements of Accept Mandate Screen

	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td/input[2]")
	WebElement okAcceptButton;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement acceptMandateRecord;

	@FindBy(xpath = "//input[@name='accept']")
	WebElement btnAcceptMandate;

	@FindBy(xpath = "//input[@name='confirm']")
	WebElement btnConfirm;

	@FindBy(xpath = "//a[@id='logoutButtonId']")
	WebElement btnLogOut;

	@FindBy(xpath = "//button[@name='logoutBtn1']")
	WebElement confirmBtnLogout;
	
	@FindBy(name="mbUMRN")
	WebElement mbUMRN;
	
	@FindBy(name="delete")
	WebElement btnReject;
	
	@FindBy(xpath="//select[@name='mbChangeReason']")
	WebElement rejectDropdownList;
	// constructor
	public AcceptMandatePage() {
		PageFactory.initElements(driver, this);

	}

	public AcceptMandatePage acceptMandate(Windowhandle win,DataTable credentials) throws InterruptedException {
		win.handlewin();
		List<List<String>> data=credentials.asLists();
		mbUMRN.sendKeys(data.get(0).get(0));
		okAcceptButton.click();
		acceptMandateRecord.click();
		Thread.sleep(3000);
		btnAcceptMandate.click();
		btnConfirm.click();
		btnLogOut.click();
		confirmBtnLogout.click();
		return new AcceptMandatePage();
	}
	
	public AcceptMandatePage rejectMandate(Windowhandle win, String UMRN, String RejectReason) throws InterruptedException {
		win.handlewin();
		mbUMRN.sendKeys(UMRN);
		okAcceptButton.click();
		acceptMandateRecord.click();
		Select sel=new Select(rejectDropdownList);
		sel.selectByIndex(4);
		btnReject.click();
		btnLogOut.click();
		confirmBtnLogout.click();
		
		return new AcceptMandatePage();
	}

}
