package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.util.Windowhandle;


public class IndustryTypePage extends TestBase{
 
	@FindBy(xpath="//*[@id=\"industryTypeCodetr\"]/td[2]/input")
	WebElement industryTypeCode;
	
	@FindBy(name="industryTypeCode")
	WebElement industryTypeCode1;
	
	@FindBy(xpath="//*[@id=\"industryTypeDesctr\"]/td[2]/input")
	WebElement industryTypeDesc;
	
	@FindBy(xpath="//*[@id=\"myNewTable\"]/tbody/tr[5]/td/input[7]")
	WebElement okBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
	WebElement OKBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
	WebElement OK;
	
	@FindBy(id="btnAddConf")
	WebElement addConfirmBtn;
	
	@FindBy(id="btnApprove")
	WebElement approveBtn;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(name="logoutBtn1")
	WebElement logoutBtn;
	
	
	public IndustryTypePage() {
		PageFactory.initElements(driver, this);
	} 
	
	public IndustryTypePage addIndustrytype(Windowhandle win,String IndustryTypecode,String IndustryTypedesc) throws InterruptedException {
		win.handlewin();
		industryTypeCode.sendKeys(IndustryTypecode);
		industryTypeDesc.sendKeys(IndustryTypedesc);
		okBtn.click();
		addConfirmBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IndustryTypePage();
	}
	
	public IndustryTypePage approveIndustryType(Windowhandle win,String IndustryTypecode) throws InterruptedException {
		win.handlewin();
		industryTypeCode1.sendKeys(IndustryTypecode);
		OKBtn.click();
		approveBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IndustryTypePage();
	}
	
	public IndustryTypePage listIndustryType(Windowhandle win) throws InterruptedException {
		win.handlewin();
		OK.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IndustryTypePage();
	}
	
}
