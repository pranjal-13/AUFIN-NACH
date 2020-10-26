package com.aufin.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;

public class ModifyMandatePage extends TestBase{

	@FindBy(name = "mbUMRN")
	WebElement umrn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td/input[2]")
	WebElement OKBtn;
	
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement revealmandate;
	
	@FindBy(name="mbCustName")
	WebElement mbCustName;
	
	@FindBy(name = "mbDRAccountNumber")
	WebElement mbDRAccountNumber;
	
	@FindBy(name = "mbDRAccountType")
	WebElement mbDRAccountType;
	
	@FindBy(name = "mbAmountStr")
	WebElement mbAmountStr;

	@FindBy(name = "mbFixedAmount")
	WebElement mbFixedAmount;

	@FindBy(name = "mbFrequencyType")
	WebElement mbFrequencyType;

	@FindBy(name = "mbFrequencyCode")
	WebElement mbFrequencyCode;
	
	@FindBy(name = "mbDateFrom")
	WebElement mbDateFrom;

	@FindBy(name = "mbDateTo")
	WebElement mbDateTo;
	
	@FindBy(name = "mbCustFonLandNum")
	WebElement mbCustFonLandNum;

	@FindBy(name = "mbCustFonCellNum")
	WebElement mbCustFonCellNum;

	@FindBy(name = "mbCustMailId")
	WebElement mbCustMailId;
	
	@FindBy(name="mbSvcProviderName")
	WebElement mbSvcProviderName;

	@FindBy(name = "mbCustIdent")
	WebElement mbCustIdent;

	@FindBy(name="mandateCode")
	WebElement mandateCode;
	
	@FindBy(name = "mbRefNumber")
	WebElement mbRefNumber;

	@FindBy(name = "mbRelRefNumber")
	WebElement mbRelRefNumber;
	
	@FindBy(name = "schemeCode")
	WebElement schemeCode;
	
	@FindBy(name="mandateNote")
	WebElement mandateNote;
	
	@FindBy(name="mbCreateDate")
	WebElement mbCreateDate;
	
	@FindBy(name="mbSvcProviderCode")
	WebElement mbSvcProviderCode;
	
	@FindBy(name="mbSource")
	WebElement mbSource;
	
	@FindBy(name="mbDRBankCode")
	WebElement mbDRBankCode;
	
	@FindBy(name = "mbCycleDate")
	WebElement mbCycleDate;
	
	@FindBy(name = "approve")
	WebElement modifyBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[3]/td/input[3]")
	WebElement confirmBtn;
	
	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;
	public ModifyMandatePage() {
		PageFactory.initElements(driver, this);
	}
	
	public ModifyMandatePage modifyamendMandate(Windowhandle win, DataTable credentials) throws InterruptedException {
		win.handlewin();
		List<List<String>> data = credentials.asLists();
		umrn.sendKeys(data.get(0).get(0));
		OKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		revealmandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		mbCustName.clear();
		mbCustName.sendKeys(data.get(0).get(1));
		mbDRAccountNumber.clear();
		mbDRAccountNumber.sendKeys(data.get(0).get(2));
		Select sl = new Select(mbDRAccountType);
		sl.selectByVisibleText(data.get(0).get(3));
		mbAmountStr.clear();
		mbAmountStr.sendKeys(data.get(0).get(4));
		Select sl1 = new Select(mbFixedAmount);
		sl1.selectByVisibleText(data.get(0).get(5));
		Select sl2 = new Select(mbFrequencyType);
		sl2.selectByVisibleText(data.get(0).get(6));
		Select sl3 = new Select(mbFrequencyCode);
		sl3.selectByVisibleText(data.get(0).get(7));
		mbDateFrom.clear();
		mbDateFrom.sendKeys(data.get(0).get(8));
		mbDateTo.clear();
		mbDateTo.sendKeys(data.get(0).get(9));
		mbCustFonLandNum.clear();
		mbCustFonLandNum.sendKeys(data.get(1).get(0));
		mbCustFonCellNum.clear();
		mbCustFonCellNum.sendKeys(data.get(1).get(1));
		mbCustMailId.clear();
		mbCustMailId.sendKeys(data.get(1).get(2));
		mbSvcProviderName.clear();
		mbSvcProviderName.sendKeys(data.get(1).get(3));
		mbCustIdent.clear();
		mbCustIdent.sendKeys(data.get(1).get(4));
		mandateCode.clear();
		mandateCode.sendKeys(data.get(1).get(5));
		mbRefNumber.clear();
		mbRefNumber.sendKeys(data.get(1).get(6));
		mbRelRefNumber.clear();
		mbRelRefNumber.sendKeys(data.get(1).get(7));
		schemeCode.clear();
		schemeCode.sendKeys(data.get(1).get(8));
		mandateNote.clear();
		mandateNote.sendKeys(data.get(2).get(0));
		mbCreateDate.clear();
		mbCreateDate.sendKeys(data.get(2).get(1));
		mbSvcProviderCode.clear();
		mbSvcProviderCode.sendKeys(data.get(2).get(2));
		mbSource.clear();
		mbSource.sendKeys(data.get(2).get(3));
		mbDRBankCode.clear();
		mbDRBankCode.sendKeys(data.get(2).get(4));
		mbCycleDate.clear();
		mbCycleDate.sendKeys(data.get(2).get(5));
		modifyBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		confirmBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		return new ModifyMandatePage();
	}
	
}
