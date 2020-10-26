package com.aufin.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;

public class CustomerPage extends TestBase{

	@FindBy(name="customerCode")
	WebElement customerCode;
	
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(name="sponsorCode")
	WebElement sponsorCode;
	
	@FindBy(name="contactPerson")
	WebElement contactPerson;
	
	@FindBy(name="addressLine1")
	WebElement addressLine1;
	
	@FindBy(name="zipCode")
	WebElement zipCode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(name="stateName")
	WebElement stateName;
	
	@FindBy(name="emailId")
	WebElement emailId;
	
	@FindBy(name="remarks")
	WebElement remarks;
	
	@FindBy(name="customerType")
	WebElement customerType;
	
	@FindBy(name="effectiveFrom")
	WebElement effectiveFrom; 
	
	@FindBy(name="businessGrpCode")
	WebElement businessGrpCode;
	
	@FindBy(name="accountingCode")
	WebElement accountingCode;
	
	@FindBy(xpath="//*[@id=\"myNewTable\"]/tbody/tr[33]/td/input[6]")
	WebElement okBtn;
	
	@FindBy(id="btnAddConf")
	WebElement addConfirmBtn;
	
	@FindBy(id="btnApprove")
	WebElement btnApprove;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[6]/td/input[2]")
	WebElement OKBtn;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;
	
	public CustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CustomerPage addCustomer(Windowhandle win,DataTable credentials) throws InterruptedException {
		win.handlewin();
		List<List<String>> data=credentials.asLists();
		customerCode.sendKeys(data.get(0).get(0));
		name.sendKeys(data.get(0).get(1));
		sponsorCode.sendKeys(data.get(0).get(2));
		contactPerson.sendKeys(data.get(1).get(0));
		addressLine1.sendKeys(data.get(1).get(1));
		zipCode.sendKeys(data.get(1).get(2));
		country.sendKeys(data.get(1).get(3));
		Select sl=new Select(stateName);
		sl.selectByVisibleText(data.get(1).get(4));
		emailId.sendKeys(data.get(1).get(5));
		remarks.sendKeys(data.get(1).get(6));
		customerType.sendKeys(data.get(1).get(7));
		effectiveFrom.sendKeys(data.get(2).get(0));
		businessGrpCode.click();
		Select sl1=new Select(businessGrpCode);
		sl1.selectByVisibleText(data.get(2).get(1));
		accountingCode.click();
		Select sl2=new Select(accountingCode);
		sl2.selectByVisibleText(data.get(3).get(0));
		okBtn.click();
		addConfirmBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CustomerPage();
	}
	
	public CustomerPage approveCustomer(Windowhandle win) throws InterruptedException {
		win.handlewin();
		OKBtn.click();
		btnApprove.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CustomerPage();
	}
	
	public CustomerPage listCustomer(Windowhandle win) throws InterruptedException {
		win.handlewin();
		OKBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CustomerPage();
	}
}
