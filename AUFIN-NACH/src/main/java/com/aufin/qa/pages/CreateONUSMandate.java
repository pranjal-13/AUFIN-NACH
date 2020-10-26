package com.aufin.qa.pages;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;

public class CreateONUSMandate extends TestBase
{  
	
	Windowhandle win = new Windowhandle(driver);
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
	
	@FindBy(name = "mbDateFrom")
	WebElement StartDate;
	
	@FindBy(name = "mbDateTo")
	WebElement Enddate;
	
	@FindBy(name = "mbFixedAmount")
	WebElement FixedField;
	
	@FindBy(name = "mbLastUpdatedOn")
	WebElement LastUpdatedOn;
	
	@FindBy(name = "mbSponserBankCode")
	WebElement SponserBankField;
	
	@FindBy(name = "mbDRBankName")
	WebElement DestinationBankNameField;
	
	@FindBy(name = "mbCreateDate")
	WebElement CreatedDateField;
	
	@FindBy(name = "mbMandateCategory")
	WebElement CategoryField;
	
	@FindBy(name = "mbRefNumber")
	WebElement RefIdField;
	
	@FindBy(name = "mbFormFileFrnDet")
	WebElement detailedFrontImage;
	
	@FindBy(name = "mbFormFileFront")
	WebElement tiffImage;
	
	@FindBy(name = "mbFormFileBack")
	WebElement backImage;
	
	@FindBy(xpath = "//*[@id='pageBody']/form/table[1]/tbody/tr[3]/td/input")
	WebElement OKbutton;
	
	@FindBy(xpath = "//*[@id='pageBody']/form/table[1]/tbody/tr[3]/td/input[2]")
	WebElement Confirmbutton;

	@FindBy(xpath="//*[@id='pageBody']/form/table/tbody/tr[2]/td/input[2]")
	WebElement ListOkButton;
	
	@FindBy(xpath="//*[@id='LNTablelistable']/tbody/tr[2]")
	WebElement MandateListButton;
	
	@FindBy(name="approve")
	WebElement ApproveButton;
	
	@FindBy(xpath="	//*[@id='mainForm']/table[1]/tbody/tr[1]/td/table/tbody/tr/td[3]/input")
	WebElement CreateMMSButton;
	
	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;
	
	public CreateONUSMandate()
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public CreateONUSMandate EnterDetails(String Name, String Account_Number, String Amount, String Customer_Name, String Customer_Code, String IFSC_Code, String Image1, String Image2) {

		name.sendKeys(Name);
		accountno.sendKeys(Account_Number);
		amount.sendKeys(Amount);
		customerName.sendKeys(Customer_Name);
		customerCode.sendKeys(Customer_Code);
		ifscCode.sendKeys(IFSC_Code);
		detailedFrontImage.sendKeys("D:\\Selenium\\AUFIN-NACH\\src\\main\\java\\com\\Testdata\\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_detailfront.jpg");
		tiffImage.sendKeys("D:\\Selenium\\AUFIN-NACH\\src\\main\\java\\com\\Testdata\\MMS-CREATE-HDFC-HDFCH2HUSER1-11052020-000001_front.tif");
		return new CreateONUSMandate();
		
	}
	
	
	public CreateONUSMandate CreateMandate()
	{
		
		OKbutton.click();
 		Confirmbutton.click();
		btnLogout.click();
		extBtnLogout.click();
		
		return new CreateONUSMandate();
		
	}


	public CreateONUSMandate ApproveMandate(String Customer_Code) throws InterruptedException
	{
		 
		customerCode.sendKeys(Customer_Code);
		ListOkButton.click();
		MandateListButton.click();
		ApproveButton.click();
		btnLogout.click();
		extBtnLogout.click();
		return new CreateONUSMandate();
		
	}
	
	public CreateONUSMandate CreateMMSFile() throws InterruptedException
	
	{	
		CreateMMSButton.click();
		 Thread.sleep(IntfConstants.TIMEOUT);
		CreateMMSButton.click();
		 Thread.sleep(IntfConstants.TIMEOUT);
		btnLogout.click();
		extBtnLogout.click();
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate ViewingMandate()
	{
		ListOkButton.click();
		MandateListButton.click();
		
		return new CreateONUSMandate();

	}
	
	

	public void validateName(CreateONUSMandate createONUSMandate,String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
	 String actualValue=name.getAttribute("value");
	 System.out.println("Actual Value= "+ actualValue);
	 sa.assertEquals(actualValue, ExpectedValue);	
	}
	
	public void validateAccountnumber(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=accountno.getAttribute("value");
		 System.out.println("Actual Value= "+ ActualValue);
		 sa.assertEquals(ActualValue, ExpectedValue);
		 }
	
	public void validateAmount(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=amount.getAttribute("value");
		 System.out.println("Actual Value= "+ ActualValue);
		 sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateFixed(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=FixedField.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateStartdate(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=StartDate.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	

	public void validateCustomername(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=customerName.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateConsumerRef(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=RefIdField.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateCategory(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=CategoryField.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateCreatedate(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=CreatedDateField	.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateUtilitycode(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=customerCode.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateLastupdatedon(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=LastUpdatedOn.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateDestinationbank(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=ifscCode.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateSponserbank(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=SponserBankField.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void validateDestinationbankname(String ExpectedValue,SoftAssert sa) {
		System.out.println("Expected Value=" + ExpectedValue);
		String ActualValue=DestinationBankNameField.getAttribute("value");
		System.out.println("Actual Value= "+ ActualValue);
		sa.assertEquals(ActualValue, ExpectedValue);
	}
	
	public void verifynamefield(CreateONUSMandate createONUSMandate, String key, SoftAssert sa) {
		validateName(createONUSMandate,xmlFileReader2.mapTitle.get(key),sa);
	}
	
	public CreateONUSMandate verifyaccountnumberfield(String key, SoftAssert sa) {
		validateAccountnumber(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifyamountfield(String key, SoftAssert sa) {
		validateAmount(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifyfixedfield(String key, SoftAssert sa) {
		validateFixed(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifystartdatefield(String key, SoftAssert sa) {
		validateStartdate(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	
	public CreateONUSMandate verifycustomernamefield(String key,SoftAssert sa) {
		validateCustomername(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifyconsumerreffield(String key,SoftAssert sa) {
		validateConsumerRef(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifycategoryfield(String key,SoftAssert sa) {
		validateCategory(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifycreatedatefield(String key,SoftAssert sa) {
		validateCreatedate(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifyutilitycodefield(String key,SoftAssert sa) {
		validateUtilitycode(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifylastupdatedonfield(String key,SoftAssert sa) throws InterruptedException, ParserConfigurationException {
		LastUpdatedOn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Last_Updated_on", sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifydestinationbankfield(String key,SoftAssert sa) {
		validateDestinationbank(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifysponserbankfield(String key,SoftAssert sa) {
		validateSponserbank(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}
	
	public CreateONUSMandate verifydestinationbanknamefield(String key,SoftAssert sa) {
		validateDestinationbankname(xmlFileReader2.mapTitle.get(key),sa);
		return new CreateONUSMandate();
	}

}
