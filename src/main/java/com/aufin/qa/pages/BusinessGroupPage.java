package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;

public class BusinessGroupPage extends TestBase {

	@FindBy(name = "businessGroupName")
	WebElement groupname;

	@FindBy(xpath="//p[@class='errormessages']")
	WebElement errormessages;
	
	@FindBy(name = "businessGroupDesc")
	WebElement groupdescription;

	@FindBy(xpath = "//*[@id=\"myNewTable\"]/tbody/tr[5]/td/input[6]")
	WebElement okbtn;

	@FindBy(id = "btnAddConf")
	WebElement addConfirmBtn;

	@FindBy(name = "name")
	WebElement entergroup;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
	WebElement OKBTN;

	@FindBy(id = "btnApprove")
	WebElement approveBtn;

	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(name = "logoutBtn1")
	WebElement logoutBtn;

	public BusinessGroupPage() {
		PageFactory.initElements(driver, this);
	}

	public BusinessGroupPage addBusinessGroup(Windowhandle win, String Groupname, String GroupDesc)
			throws InterruptedException {
		win.handlewin();
		groupname.sendKeys(Groupname);
		groupdescription.sendKeys(GroupDesc);
		okbtn.click();
		addConfirmBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new BusinessGroupPage();
	}

	public BusinessGroupPage addBusinessGroup1(Windowhandle win, String Groupname, String GroupDesc) throws InterruptedException {
		win.handlewin();
		groupname.sendKeys(Groupname);
		groupdescription.sendKeys(GroupDesc);
		okbtn.click();
		String a=errormessages.getText();
		System.out.println(a);
		String b="Invalid Business Group Name\r\n" + 
				"Invalid Business Group Description" ;
		System.out.println(b);
		if(a.contains(b)) {
			System.out.println("Business group and Business group description fields are validated successfully");
		}
		else {
			System.out.println("Validtion failed for Business Group");
		}
		return new BusinessGroupPage();
	}

	public BusinessGroupPage approveBusinessGroup(Windowhandle win, String Groupname) throws InterruptedException {
		win.handlewin();
		entergroup.sendKeys(Groupname);
		OKBTN.click();
		approveBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new BusinessGroupPage();
	}

	public BusinessGroupPage listBusinessGroup(Windowhandle win) throws InterruptedException {
		win.handlewin();
		OKBTN.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new BusinessGroupPage();
	}
}
