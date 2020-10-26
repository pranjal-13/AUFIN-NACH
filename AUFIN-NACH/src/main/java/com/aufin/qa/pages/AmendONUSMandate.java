package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;

public class AmendONUSMandate extends TestBase

{

	@FindBy(name = "mbCustName")
	WebElement name;
	
	@FindBy(name = "mbDRAccountNumber")
	WebElement accountno;
	
	@FindBy(name = "mbAmountStr")
	WebElement amount;
	
	@FindBy(name = "mbSvcProviderName")
	WebElement customerName;
	
	@FindBy(name = "mbSvcProviderCode")
	WebElement customerCode;
	
	@FindBy(name = "mbDRBankCode")
	WebElement ifscCode;
	
	@FindBy(name = "mbFormFileFrnDet")
	WebElement detailedFrontImage;
	
	@FindBy(name = "mbFormFileFront")
	WebElement tiffImage;
	
	@FindBy(name = "mbFormFileBack")
	WebElement backImage;
	
	@FindBy(xpath = "//*[@id='pageBody']/form/table[1]/tbody/tr[3]/td/input")
	WebElement OKbutton;
	
	@FindBy(xpath="//*[@id='pageBody']/form/table/tbody/tr[2]/td/input[2]")
	WebElement ListOkButton;
	
	@FindBy(xpath="//*[@id='LNTablelistable']/tbody/tr[2]")
	WebElement MandateListButton;
	
	@FindBy(name="approve")
	WebElement ApproveButton;
	
	@FindBy(xpath="	//*[@id='mainForm']/table[1]/tbody/tr[1]/td/table/tbody/tr/td[3]/input")
	WebElement CreateMMSButton;
	
	@FindBy(name="modify")
	WebElement modifyButton;
	
	@FindBy(name="approve")
	WebElement deleteButton;
	
	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;
	
	
	public AmendONUSMandate()
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public AmendONUSMandate AmendDetails(String Account_Number, String Amount, String Customer_Name, String Customer_Code, String IFSC_Code, String Image1, String Image2) {
		
		ListOkButton.click();
		MandateListButton.click();
		accountno.sendKeys(Account_Number);
		amount.sendKeys(Amount);
		detailedFrontImage.sendKeys("/AUFIN-NACH/src/main/java/com/Testdata/MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_detailfront.jpg");
		tiffImage.sendKeys("/AUFIN-NACH/src/main/java/com/Testdata/MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_front.tif");
		OKbutton.click();
		OKbutton.click();
		btnLogout.click();
		extBtnLogout.click();
		return new AmendONUSMandate();
		
	}
	
	public AmendONUSMandate ApproveAmendedMandate(String Customer_Code)
	{
		
		customerCode.sendKeys(Customer_Code);
		ListOkButton.click();
		MandateListButton.click();
		ApproveButton.click();
		return new AmendONUSMandate();
		
	}
	

	public AmendONUSMandate CreateMMSFile()
	
	{
		CreateMMSButton.click();
		CreateMMSButton.click();
		return new AmendONUSMandate();
	}
	
	public AmendONUSMandate ViewingMandate()
	{
		ListOkButton.click();
		MandateListButton.click();
		
		return new AmendONUSMandate();
	}

	public AmendONUSMandate RejectingAmendedMandate()
	{	
		ListOkButton.click();
		MandateListButton.click();
		deleteButton.click();
		return new AmendONUSMandate();
	}

	public AmendONUSMandate  ModifyingAmendedMandate(String Customer_Code)
	{	
		
		customerCode.sendKeys(Customer_Code);
		ListOkButton.click();
		MandateListButton.click();
		modifyButton.click();
		return new AmendONUSMandate();
	}
	
	
	public AmendONUSMandate  ModifyingMandate(String Name, String Account_Number, String Amount, String Customer_Name, String Customer_Code, String IFSC_Code, String Image1, String Image2)
	{	
		ListOkButton.click();
		MandateListButton.click();
		name.sendKeys(Name);
		accountno.sendKeys(Account_Number);
		amount.sendKeys(Amount);
		customerName.sendKeys(Customer_Name);
		customerCode.sendKeys(Customer_Code);
		ifscCode.sendKeys(IFSC_Code);
		detailedFrontImage.sendKeys("/AUFIN-NACH/src/main/java/com/Testdata/MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_detailfront.jpg");
		tiffImage.sendKeys("/AUFIN-NACH/src/main/java/com/Testdata/MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_front.tif");
		OKbutton.click();
		OKbutton.click();
		btnLogout.click();
		extBtnLogout.click();
		return new AmendONUSMandate();
	}
}