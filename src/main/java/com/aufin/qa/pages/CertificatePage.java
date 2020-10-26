package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;
public class CertificatePage extends TestBase{

	@FindBy(name="userName")
	WebElement enterUsername; 
	
	@FindBy(name="clearingProduct")
	WebElement clearingType;
	
	@FindBy(name="keystoreFileName")
	WebElement fileName;
	
	@FindBy(name="keystorePassphrase")
	WebElement passkeystore;
	
	@FindBy(name="alias")
	WebElement certificateAlias;
	
	@FindBy(name="aliasPassphrase")
	WebElement aliasPass;
	
	@FindBy(id="calImage1")
	WebElement calendarImg1;
	
	@FindBy(id="td17_1")
	WebElement selectDate;
	
	@FindBy(id="calImage2")
	WebElement calendarImg2;
	
	@FindBy(id="td24_1")
	WebElement selectDate1;
	
	@FindBy(name="active")
	WebElement statusActive;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr/td/table/tbody[2]/tr[2]/td/input")
	WebElement addCertificateBtn;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button/img")
	WebElement logoutBtn; 
	
	public CertificatePage() {
		PageFactory.initElements(driver, this);
	}
	
	public CertificatePage AddNEFTCertificate() throws InterruptedException {
		Windowhandle win=new Windowhandle(driver);
		win.handlewin();
		enterUsername.sendKeys(IntfConstants.USER_NAME);
		Select sl=new Select(clearingType);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.selectByValue(IntfConstants.CLEARING_TYPE);
		fileName.sendKeys(IntfConstants.NEFT_CERTIFICATE_PATH);
		passkeystore.sendKeys(IntfConstants.KEYSTORE_PASSPHRASE);
		certificateAlias.sendKeys(IntfConstants.CERTIFICATE_ALIAS);
		aliasPass.sendKeys(IntfConstants.ALIAS_PASSPHRASE);
		calendarImg1.click();
		selectDate.click();
		calendarImg2.click();
		selectDate1.click();
		Select sl1=new Select(statusActive);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl1.selectByValue(IntfConstants.ACTIVE_TYPE);
		addCertificateBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		return new CertificatePage();
	}
	
	public CertificatePage AddNACHCertificate() throws InterruptedException {
		Windowhandle win=new Windowhandle(driver);
		win.handlewin();
		enterUsername.sendKeys(IntfConstants.USER_NAME);
		Select sl=new Select(clearingType);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.selectByValue(IntfConstants.CLEARING_TYPE1);
		fileName.sendKeys(IntfConstants.NACH_CERTIFICATE_PATH);
		passkeystore.sendKeys(IntfConstants.KEYSTORE_PASSPHRASE1);
		certificateAlias.sendKeys(IntfConstants.CERTIFICATE_ALIAS1);
		aliasPass.sendKeys(IntfConstants.ALIAS_PASSPHRASE1);
		calendarImg1.click();
		selectDate.click();
		calendarImg2.click();
		selectDate1.click();
		Select sl1=new Select(statusActive);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl1.selectByValue(IntfConstants.ACTIVE_TYPE);
		addCertificateBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		return new CertificatePage();
	}
	
	public CertificatePage ViewCertificate() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Windowhandle win=new Windowhandle(driver);
		win.handlewin();
		logOutBtn.click();
		logoutBtn.click();
		return new CertificatePage();
	}
	
}
