package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;

public class CancelInwardMandate extends TestBase {
	@FindBy(name = "mbUMRN")
	WebElement UMRNField;

	@FindBy(xpath = "//*[@id='pageBody']/form/table/tbody/tr[2]/td/input[2]")
	WebElement OkButton;

	@FindBy(xpath = "//*[@id='LNTablelistable']/tbody/tr[2]")
	WebElement MandateListButton;

	@FindBy(name = "accept")
	WebElement AcceptButton;

	@FindBy(name = "confirm")
	WebElement confirmButton;

	@FindBy(name = "approve")
	WebElement ApproveButton;

	@FindBy(name = "delete")
	WebElement DeleteButton;

	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;

	@FindBy(xpath = "//*[@id='pageBody']/form/table/tbody/tr[2]/td/input[2]")
	WebElement ListOkButton;

	public CancelInwardMandate() {
		PageFactory.initElements(driver, this);

	}

	public void InwardCancelMandate(String UMRN) {
		UMRNField.sendKeys(UMRN);
		OkButton.click();
		MandateListButton.click();
		AcceptButton.click();
		confirmButton.click();
		btnLogout.click();
		extBtnLogout.click();

	}

	public CancelInwardMandate InwardCancelMandateApprove(String UMRN) {
		UMRNField.sendKeys(UMRN);
		OkButton.click();
		MandateListButton.click();
		ApproveButton.click();
		btnLogout.click();
		extBtnLogout.click();
		return new CancelInwardMandate();
	}

	public CancelInwardMandate ViewingMandate() throws InterruptedException {

		ListOkButton.click();
		MandateListButton.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();

		/*
		 * OkButton.click(); MandateListButton.click();
		 */
		return new CancelInwardMandate();

	}
}
