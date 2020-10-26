package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;

public class CancelOutwardMandate extends TestBase {

	@FindBy(name = "mbUMRN")
	WebElement UMRNField;

	@FindBy(xpath = "//*[@id='pageBody']/form/table/tbody/tr[2]/td/input[2]")
	WebElement OkButton;

	@FindBy(xpath = "//*[@id='LNTablelistable']/tbody/tr[2]")
	WebElement MandateListButton;

	@FindBy(xpath = "//*[@id='pageBody']/form/table[1]/tbody/tr[1]/td[1]/div/table[7]/tbody/tr[8]/td[2]/select")
	WebElement ReasonCode;

	@FindBy(name = "delete")
	WebElement CancelButton;

	@FindBy(name = "textShow")
	WebElement ShowXMLButton;

	@FindBy(name = "delete")
	WebElement ConfirmCancelButton;

	@FindBy(name = "approve")
	WebElement ApproveButton;

	@FindBy(name = "delete")
	WebElement RemoveCancellationButton;

	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;

	@FindBy(xpath = "	//*[@id='mainForm']/table[1]/tbody/tr[1]/td/table/tbody/tr/td[3]/input")
	WebElement CreateMMSButton;

	@FindBy(xpath="//*[@id='pageBody']/form/table/tbody/tr[2]/td/input[2]")
	WebElement ListOkButton;
	
	public CancelOutwardMandate() {
		PageFactory.initElements(driver, this);

	}

	public void CancelMandate(String UMRN) {
		UMRNField.sendKeys(UMRN);
		OkButton.click();
		MandateListButton.click();
		Select sel = new Select(ReasonCode);
		sel.selectByIndex(1);
		CancelButton.click();
		ConfirmCancelButton.click();
		btnLogout.click();
		extBtnLogout.click();

	}

	public CancelOutwardMandate CancelMandateApprove(String UMRN) {
		// UMRNField.sendKeys(UMRN);
		OkButton.click();
		MandateListButton.click();
		ApproveButton.click();
		btnLogout.click();
		extBtnLogout.click();
		return new CancelOutwardMandate();
	}

	public CancelOutwardMandate CreateMMSFile()

	{
		CreateMMSButton.click();
		CreateMMSButton.click();
		return new CancelOutwardMandate();
	}

	public CancelOutwardMandate ViewingMandate() throws InterruptedException {
		
		ListOkButton.click();
		MandateListButton.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();

		
		/*OkButton.click();
		MandateListButton.click();*/
		return new CancelOutwardMandate();

	}

}
