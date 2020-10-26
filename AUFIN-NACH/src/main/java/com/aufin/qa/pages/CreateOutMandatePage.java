package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.util.Windowhandle;



public class CreateOutMandatePage extends TestBase {

	Windowhandle win;
	// WebElements Xpath

	@FindBy(name = "mbCustName")
	WebElement custNameTextField;

	@FindBy(name = "mbDRAccountNumber")
	WebElement acctNoTextField;

	@FindBy(name = "mbAmountStr")
	WebElement amountTextField;

	@FindBy(name = "mbSvcProviderName")
	WebElement corporateNameTextField;

	@FindBy(name = "mbSvcProviderCode")
	WebElement utilityTextField;

	@FindBy(name = "mbDRBankCode")
	WebElement ifscCodeTextField;

	@FindBy(name = "mbFormFileFrnDet")
	WebElement jpegUploadBtn;

	@FindBy(name = "mbFormFileFront")
	WebElement tiffUploadBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table[1]/tbody/tr[3]/td/input")
	WebElement okButton;

	@FindBy(xpath = "//td[@class='HeaderSubtitle']//input[2]")
	WebElement confirmButton;

	@FindBy(xpath = "//a[@id='logoutButtonId']")
	WebElement btnLogOut;

	@FindBy(xpath = "//button[@name='logoutBtn1']")
	WebElement confirmBtnLogout;

	// Constructor to Initialize above elements
	public CreateOutMandatePage() {
		PageFactory.initElements(driver, this);
	}

	public CreateOutMandatePage createNewOutMandate(Windowhandle win, String Name, String Account_Number, String Amount,
			String Customer_Name, String Customer_Code, String IFSC_Code, String Image1, String Image2)
			throws InterruptedException {

		win.handlewin();
		custNameTextField.sendKeys(Name);
		acctNoTextField.sendKeys(Account_Number);
		amountTextField.sendKeys(Amount);
		corporateNameTextField.sendKeys(Customer_Name);
		utilityTextField.sendKeys(Customer_Code);
		ifscCodeTextField.sendKeys(IFSC_Code);
		jpegUploadBtn.sendKeys(
				"D:\\WorkSpace\\CACIB_Branch_Lot-2\\AUFIN-NACH\\src\\test\\resources\\Feature\\ImageUpload\\CREATE_01.jpg");
		tiffUploadBtn.sendKeys(
				"D:\\WorkSpace\\CACIB_Branch_Lot-2\\AUFIN-NACH\\src\\test\\resources\\Feature\\ImageUpload\\CREATE_01.tif");

		return new CreateOutMandatePage();

	}

	public CreateOutMandatePage confirmMandate() {

		okButton.click();
		confirmButton.click();
		btnLogOut.click();
		confirmBtnLogout.click();

		return new CreateOutMandatePage();
	}

	/*public CreateOutMandatePage validateOutMandate() {
		
	}*/
	
}
