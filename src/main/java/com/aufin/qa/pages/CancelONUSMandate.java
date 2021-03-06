package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aufin.qa.base.TestBase;

public class CancelONUSMandate extends TestBase{
	

	@FindBy(name="mbUMRN")
	WebElement UMRNField;
	
	@FindBy(xpath="//*[@id='pageBody']/form/table/tbody/tr[2]/td/input[2]")
	WebElement OkButton;
	
	@FindBy(xpath="//*[@id='LNTablelistable']/tbody/tr[2]")
	WebElement MandateListButton;
	
	@FindBy(xpath="//*[@id='pageBody']/form/table[1]/tbody/tr[1]/td[1]/div/table[7]/tbody/tr[8]/td[2]/select")
	WebElement ReasonCode;
		
	@FindBy(name="delete")
	WebElement CancelButton;
	
	@FindBy(name="textShow")
	WebElement ShowXMLButton;
	
	@FindBy(name="delete")
	WebElement ConfirmCancelButton;
	
	@FindBy(name="approve")
	WebElement ApproveButton;
	
	@FindBy(name="delete")
	WebElement RemoveCancellationButton;
	
	@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
	WebElement btnLogout;

	@FindBy(name = "logoutBtn1")
	WebElement extBtnLogout;
	
	public CancelONUSMandate() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void CancelMandate(String UMRN)
	{	
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
	
	public CancelONUSMandate CancelonusMandateApprove(String UMRN)
	{	
		
		UMRNField.sendKeys(UMRN);
		OkButton.click();
		MandateListButton.click();
		ApproveButton.click();
		btnLogout.click();
		extBtnLogout.click();
	return new CancelONUSMandate();
	}
	

}
