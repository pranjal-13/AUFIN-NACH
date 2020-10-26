package com.aufin.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;

public class AmendMandatePage extends TestBase {

	@FindBy(name = "mbUMRN")
	WebElement umrn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td/input[2]")
	WebElement OKBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[3]/td/input")
	WebElement okbtn;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement revealmandate;

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

	@FindBy(name = "mbCustIdent")
	WebElement mbCustIdent;

	@FindBy(name = "mbRefNumber")
	WebElement mbRefNumber;

	@FindBy(name = "mbRelRefNumber")
	WebElement mbRelRefNumber;

	@FindBy(name = "schemeCode")
	WebElement schemeCode;

	@FindBy(name = "mbMandateCategory")
	WebElement mbMandateCategory;

	@FindBy(name = "mandateNote")
	WebElement mandateNote;

	@FindBy(name = "mbChangeReason")
	WebElement mbChangeReason;

	@FindBy(name = "mbSource")
	WebElement mbSource;

	@FindBy(name = "mbCycleDate")
	WebElement mbCycleDate;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement validationmsg;
	
	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[3]/td/input[3]")
	WebElement confirmBtn;

	@FindBy(name = "mbFormFileFront")
	WebElement mbFormFileFront;

	@FindBy(name = "mbFormFileBack")
	WebElement mbFormFileBack;

	@FindBy(name = "mbFormFileFrnDet")
	WebElement mbFormFileFrnDet;

	@FindBy(name = "approve")
	WebElement approveBtn;

	@FindBy(name = "back")
	WebElement back;

	@FindBy(name = "textShow")
	WebElement textShow;

	@FindBy(name="accept")
	WebElement accept;
	
	@FindBy(name="confirm")
	WebElement confirm;
	
	@FindBy(name = "list")
	WebElement list;

	@FindBy(name = "modify")
	WebElement modify;

	@FindBy(name = "delete")
	WebElement delete;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[1]/div/table[3]/tbody/tr[1]/td[2]/span")
	WebElement namefield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[1]/div/table[3]/tbody/tr[2]/td[2]/span")
	WebElement accountnumberfield;

	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[1]/div/table[3]/tbody/tr[4]/td[2]/span")
	WebElement amountfield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[1]/div/table[3]/tbody/tr[6]/td[2]/span")
	WebElement fixedfield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[1]/div/table[5]/tbody/tr[6]/td[2]/span")
	WebElement startdatefield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[1]/div/table[5]/tbody/tr[10]/td[2]/span")
	WebElement mobilenofield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[1]/div/table[5]/tbody/tr[12]/td[2]/span")
	WebElement customernamefield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[1]/div/table[7]/tbody/tr[2]/td[2]/span")
	WebElement consumerReffield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[1]/div/table[7]/tbody/tr[5]/td[2]/span")
	WebElement categoryfield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/span")
	WebElement createdatefield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/span")
	WebElement utilitycodefield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/span")
	WebElement lastupdatedonfield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td[4]/span")
	WebElement destinationBankfield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]/span")
	WebElement sponserBankfield;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td[6]/span")
	WebElement destinationbanknamefield;
	
	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;

	public AmendMandatePage() {
		PageFactory.initElements(driver, this);
	}

	public AmendMandatePage revealMandate(Windowhandle win, DataTable credentials) throws InterruptedException {
		win.handlewin();
		List<List<String>> data = credentials.asLists();
		umrn.sendKeys(data.get(0).get(0));
		OKBtn.click();
		revealmandate.click();
		return new AmendMandatePage();
	}
	
	public AmendMandatePage revealMandate1(Windowhandle win,String UMRN) throws InterruptedException {
		win.handlewin();
		umrn.sendKeys(UMRN);
		OKBtn.click();
		revealmandate.click();
		return new AmendMandatePage();
	}
	
	public AmendMandatePage acceptmandate() throws InterruptedException {
		textShow.click();
		accept.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		confirm.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}

	public AmendMandatePage amendMandate(DataTable credentials) throws InterruptedException {
		List<List<String>> data = credentials.asLists();
		okbtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		textShow.click();
		System.out.println("ShowXML button worked");
		Thread.sleep(IntfConstants.TIMEOUT);
		back.click();
		System.out.println("back button worked");
		mbDRAccountNumber.clear();
		mbDRAccountNumber.sendKeys(data.get(0).get(0));
		Select sl = new Select(mbDRAccountType);
		sl.selectByVisibleText(data.get(0).get(1));
		mbAmountStr.clear();
		mbAmountStr.sendKeys(data.get(0).get(2));
		Select sl1 = new Select(mbFixedAmount);
		sl1.selectByVisibleText(data.get(0).get(3));
		Select sl2 = new Select(mbFrequencyType);
		sl2.selectByVisibleText(data.get(0).get(4));
		Select sl3 = new Select(mbFrequencyCode);
		sl3.selectByVisibleText(data.get(0).get(5));
		mbDateFrom.clear();
		mbDateFrom.sendKeys(data.get(0).get(6));
		mbDateTo.clear();
		mbDateTo.sendKeys(data.get(0).get(7));
		mbCustFonLandNum.clear();
		mbCustFonLandNum.sendKeys(data.get(1).get(0));
		mbCustFonCellNum.clear();
		mbCustFonCellNum.sendKeys(data.get(1).get(1));
		mbCustMailId.clear();
		mbCustMailId.sendKeys(data.get(1).get(2));
		mbCustIdent.clear();
		mbCustIdent.sendKeys(data.get(1).get(3));
		mbRefNumber.clear();
		mbRefNumber.sendKeys(data.get(1).get(4));
		mbRelRefNumber.clear();
		mbRelRefNumber.sendKeys(data.get(1).get(5));
		schemeCode.clear();
		schemeCode.sendKeys(data.get(1).get(6));
		Select sl4 = new Select(mbMandateCategory);
		sl4.selectByVisibleText(data.get(1).get(7));
		mandateNote.sendKeys(data.get(2).get(0));
		Select sl5 = new Select(mbChangeReason);
		sl5.selectByVisibleText(data.get(2).get(1));
		mbSource.clear();
		mbSource.sendKeys(data.get(2).get(2));
		mbCycleDate.clear();
		mbCycleDate.sendKeys(data.get(2).get(3));
		mbFormFileFront.clear();
		mbFormFileFront.sendKeys(data.get(2).get(4));
		mbFormFileFrnDet.clear();
		mbFormFileFrnDet.sendKeys(data.get(2).get(5));
		okbtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("ok button worked");
		confirmBtn.click();
		System.out.println("confirm button worked");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}

	public AmendMandatePage approveamendMandate(Windowhandle win, DataTable credentials) throws InterruptedException {
		win.handlewin();
		List<List<String>> data = credentials.asLists();
		umrn.sendKeys(data.get(0).get(0));
		OKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		revealmandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		list.click();
		System.out.println("Back to List button worked");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		revealmandate.click();
		textShow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Show XML button worked");
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Approve button worked");
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}
	
	public AmendMandatePage approveamendMandate1(Windowhandle win,String UMRN) throws InterruptedException {
		win.handlewin();
		umrn.sendKeys(UMRN);
		OKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		revealmandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		list.click();
		System.out.println("Back to List button worked");
		revealmandate.click();
		textShow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Show XML button worked");
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Approve button worked");
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}

	public AmendMandatePage rejectamendMandate(Windowhandle win, DataTable credentials) throws InterruptedException {
		win.handlewin();
		List<List<String>> data = credentials.asLists();
		umrn.sendKeys(data.get(0).get(0));
		OKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		revealmandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		list.click();
		System.out.println("Back to List button worked");
		revealmandate.click();
		textShow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Show XML button worked");
		delete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Reject button worked");
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}
	
	public AmendMandatePage rejectmandate(Windowhandle win,String UMRN) throws InterruptedException {
		win.handlewin();
		umrn.sendKeys(UMRN);
		OKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		revealmandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		list.click();
		System.out.println("Back to List button worked");
		revealmandate.click();
		textShow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Show XML button worked");
		delete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Reject button worked");
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}

	public AmendMandatePage modifybuttonamendMandate(Windowhandle win,DataTable credentials) throws InterruptedException {
		win.handlewin();
		List<List<String>> data = credentials.asLists();
		umrn.sendKeys(data.get(0).get(0));
		OKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		revealmandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		list.click();
		System.out.println("Back to List button worked");
		revealmandate.click();
		textShow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Show XML button worked");
		modify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Modify button worked");
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}
	
	public AmendMandatePage modifymandatequeue(Windowhandle win,String UMRN) throws InterruptedException {
		win.handlewin();
		umrn.sendKeys(UMRN);
		OKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		revealmandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		list.click();
		System.out.println("Back to List button worked");
		revealmandate.click();
		textShow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Show XML button worked");
		modify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		System.out.println("Modify button worked");
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}
	
	public AmendMandatePage amountfield(String Amount) throws InterruptedException {
		mbAmountStr.clear();
		mbAmountStr.sendKeys(Amount);
		okbtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a=validationmsg.getText();
		String b1="Invalid Amount " +Amount;
		if(a.contains(b1))  
		{
			System.out.println("Amount field is validated and showing proper message");
		}
		else {
			System.out.println("Testcase failed for Amount field validation");
		}
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}
	
	public AmendMandatePage startdatefield(String StartDate) throws InterruptedException {
		mbDateFrom.clear();
		mbDateFrom.sendKeys(StartDate);
		okbtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a=validationmsg.getText();
		String b2="Invalid Start Date " +StartDate;
		System.out.println(b2);
		if(a.contains(b2))
		{
			System.out.println("Start Date field is validated and showing proper message");
		}
		else {
			System.out.println("Testcase failed for Start Date field validation");
		}
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}
	
	public AmendMandatePage enddatefield(String EndDate) throws InterruptedException {
		mbDateTo.sendKeys(EndDate);
		okbtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a=validationmsg.getText();
		String b3="Invalid End Date " +EndDate;
		System.out.println(b3);
		if(a.contains(b3))
		{
			System.out.println("End Date field is validated and showing proper message");
		}
		else {
			System.out.println("Testcase failed for End Date field validation");
		}
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	} 
	
	public AmendMandatePage landlinenofield(String LandlineNo) throws InterruptedException {
		mbCustFonLandNum.sendKeys(LandlineNo);
		okbtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a=validationmsg.getText();
		String b4="Customer LandLine No. not conform to NPCI Requirement";
		System.out.println(b4);
		if(a.contains(b4))
		{
			System.out.println("Landline no.field is validated and showing proper message");
		}
		else {
			System.out.println("Testcase failed for Landline no.field validation");
		}
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}
	
	public AmendMandatePage mobilenofield(String MobileNo) throws InterruptedException {
		mbCustFonCellNum.clear();
		mbCustFonCellNum.sendKeys(MobileNo);
		okbtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a=validationmsg.getText();
		String b5="Customer Cell No. not conform to NPCI Requirement";
		System.out.println(b5);
		if(a.contains(b5))
		{
			System.out.println("Customer cell no. field is validated and showing proper message");
		}
		else {
			System.out.println("Testcase failed for Mobile no.field validation");
		}
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}
	
	public AmendMandatePage emailidfield(String EmailID) throws InterruptedException {
		mbCustMailId.sendKeys(EmailID);
		okbtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a=validationmsg.getText();
		String b6="Customer Email Address not conform to NPCI Requirement";
		System.out.println(b6);
		if(a.contains(b6))
		{
			System.out.println("EMail field is validated and showing proper message");
		}
		else {
			System.out.println("Testcase failed for Email id field validation");
		}
		logOutBtn.click();
		logoutBtn.click();
		return new AmendMandatePage();
	}
	
	public void validateName(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=namefield.getText();
		 System.out.println("Actual Value= "+ ActualValue);
		 sa.assertEquals(ActualValue, ExpectedValue);	
	}
	
	public void validateAccountnumber(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=accountnumberfield.getText();
		 System.out.println("Actual Value= "+ ActualValue);
		 sa.assertEquals(ActualValue, ExpectedValue);
		 }
	
	public void validateAmount(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=amountfield.getText();
		 System.out.println("Actual Value= "+ ActualValue);
		 sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateFixed(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=fixedfield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateStartdate(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=startdatefield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateMobileno(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=mobilenofield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}

	public void validateCustomername(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=customernamefield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateConsumerRef(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=consumerReffield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateCategory(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=categoryfield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateCreatedate(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=createdatefield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateUtilitycode(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=utilitycodefield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateLastupdatedon(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=lastupdatedonfield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateDestinationbank(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=destinationBankfield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateSponserbank(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=sponserBankfield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateDestinationbankname(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=destinationbanknamefield.getText();
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public AmendMandatePage verifynamefield(String key, SoftAssert sa) {
		validateName(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifyaccountnumberfield(String key, SoftAssert sa) {
		validateAccountnumber(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifyamountfield(String key, SoftAssert sa) {
		validateAmount(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifyfixedfield(String key, SoftAssert sa) {
		validateFixed(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifystartdatefield(String key, SoftAssert sa) {
		validateStartdate(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifymobilenofield(String key,SoftAssert sa) {
		validateMobileno(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifycustomernamefield(String key,SoftAssert sa) {
		validateCustomername(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifyconsumerreffield(String key,SoftAssert sa) {
		validateConsumerRef(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifycategoryfield(String key,SoftAssert sa) {
		validateCategory(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifycreatedatefield(String key,SoftAssert sa) {
		validateCreatedate(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifyutilitycodefield(String key,SoftAssert sa) {
		validateUtilitycode(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifylastupdatedonfield(String key,SoftAssert sa) {
		validateLastupdatedon(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifydestinationbankfield(String key,SoftAssert sa) {
		validateDestinationbank(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifysponserbankfield(String key,SoftAssert sa) {
		validateSponserbank(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
	
	public AmendMandatePage verifydestinationbanknamefield(String key,SoftAssert sa) {
		validateDestinationbankname(xmlFileReader.mapTitle.get(key),sa);
		return new AmendMandatePage();
	}
}
