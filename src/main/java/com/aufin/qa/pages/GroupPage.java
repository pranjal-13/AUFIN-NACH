package com.aufin.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aufin.qa.base.TestBase;
//import com.Aufin.qa.base.TestBase;

@SuppressWarnings("serial")
public class GroupPage extends TestBase{

	// Group Page Xpath

		@FindBy(name = "name")
		WebElement txtName;

		@FindBy(name = "sortPriority")
		WebElement txtPriority;

		@FindBy(name = "profileId")
		WebElement dropDownProfile;

		@FindBy(name = "details")
		WebElement txtDetails;

		@FindBy(name = "admin")
		WebElement chkboxAdmin;

		/*
		 * @FindBy(name="drModeLogin") WebElement chkboxNonInquiry;
		 */

		@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[20]/td/input[3]")
		WebElement btnOk;

		@FindBy(xpath = "//*[@id=\"pageBody\"]/form/p/input[2]")
		WebElement confirmOk;

		// Group Approve Page Elements
		@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
		WebElement approveRecord;

		// Group Confirm approve
		@FindBy(name = "approve")
		WebElement btnconfirmApprove;

		// logout btn
		@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
		WebElement btnLogout;

		// External logout btn
		@FindBy(name = "logoutBtn1")
		WebElement extBtnLogout;

		public GroupPage() {

			WebDriver driver = null;
			PageFactory.initElements(driver, this);
		}

		public void addGroup(String textname, String sortPriority, String Priority, String details) {

			txtName.sendKeys(textname);
			txtPriority.sendKeys(sortPriority);
			Select sel = new Select(dropDownProfile);
			sel.selectByIndex(1);
			txtDetails.sendKeys(details);
			chkboxAdmin.click();
			btnOk.click();
			confirmOk.click();
			btnLogout.click();
			extBtnLogout.click();
		}

		public GroupPage approveGroup() {
			approveRecord.click();
			btnconfirmApprove.click();
			btnLogout.click();
			extBtnLogout.click();
			
			return new GroupPage();
		}

	
	
}
