package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;

public class AccountingPage extends TestBase{

	@FindBy(name="accountingCode")
	WebElement accountingCode;
	
	@FindBy(name="accountingDesc")
	WebElement accountingDesc;
	
	@FindBy(name="creditAccNo")
	WebElement creditAccNo;
	
	@FindBy(name="debitAccNo")
	WebElement debitAccNo;
	
	@FindBy(name="chargeAccNo")
	WebElement chargeAccNo;
	
	@FindBy(name="isAutoDebitCharge")
	WebElement isAutoDebitCharge;
	
	@FindBy(xpath="//*[@id=\"myNewTable\"]/tbody/tr[9]/td/input[7]")
	WebElement okBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[5]/td/input[2]")
	WebElement OKBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[5]/td/input[2]")
	WebElement OKBTN;
	
	@FindBy(id="btnAddConf")
	WebElement addConfirmBtn;
	
	@FindBy(id="btnApprove")
	WebElement approveBtn;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(name="logoutBtn1")
	WebElement logoutBtn;
	
	public AccountingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public AccountingPage addAccounting(Windowhandle win,String Accountingcode,String AccountingDesc,String CreditAccNo,String DebitAccNo,String ChargeAccNo,String IsAutoDebitCharge) throws InterruptedException {
		win.handlewin();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		accountingCode.sendKeys(Accountingcode);
		accountingDesc.sendKeys(AccountingDesc);
		creditAccNo.sendKeys(CreditAccNo);
		debitAccNo.sendKeys(DebitAccNo);
		chargeAccNo.sendKeys(ChargeAccNo);
		isAutoDebitCharge.sendKeys(IsAutoDebitCharge);
		okBtn.click();
		addConfirmBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new AccountingPage();
	}
	
	public AccountingPage approveAccounting(Windowhandle win,String Accountingcode) throws InterruptedException {
		win.handlewin();
		accountingCode.sendKeys(Accountingcode);
		OKBtn.click();
		approveBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new AccountingPage();
	}
	
	public AccountingPage listAccounting(Windowhandle win) throws InterruptedException {
		win.handlewin();
		OKBTN.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new AccountingPage();
	}
	
}
