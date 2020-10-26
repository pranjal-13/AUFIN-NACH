package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;

public class IFSCCODEList extends TestBase {

	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[7]/td/input[2]")
	WebElement OKBtn;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;
	
	public IFSCCODEList() {
		PageFactory.initElements(driver, this);
	}

	public IFSCCODEList listIFSCCODEcode(Windowhandle win) throws InterruptedException {
		win.handlewin();
		OKBtn.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new IFSCCODEList();
	}
}
