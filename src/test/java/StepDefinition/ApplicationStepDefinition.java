package StepDefinition;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.xmlFileReader;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApplicationStepDefinition extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	Windowhandle win;
	SoftAssert sa = new SoftAssert();
	xmlFileReader x = new xmlFileReader();

	@Given("Login to the application")
	public void login_to_the_application() throws InterruptedException, ParserConfigurationException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("MPS NACH", title);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		win.handlewin1();
		x.fileReader();
	}

	

	@Then("Check Application>>Maintenance>>Check Calendar>>View")
	public void check_application_Maintenance_Check_Calendar_View()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonViewCalendarLink();
		win.verifyPages("Calendar_View", sa);
	}

	@Then("Check Application>>Maintenance>>Check Calendar>>Create")
	public void check_application_Maintenance_Check_Calendar_Create()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonCalendarCreateLink();
		win.verifyPages("Calendar_Create", sa);
	}

	@Then("Check Application>>Maintenance>>Check Calendar>>Modify/Repair")
	public void check_application_Maintenance_Check_Calendar_Modify_Repair()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonCalendarModifyLink();
		win.verifyPages("Calendar_Modify_Repair", sa);
	}

	@Then("Check Application>>Maintenance>>Check Calendar>>Approve")
	public void check_application_Maintenance_Check_Calendar_Approve()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonCalendarApproveLink();
		win.verifyPages("Calendar_Approve", sa);
	}

	@Then("Check Application>>Maintenance>>Certificate>>List")
	public void check_Application_Maintenance_Certificate_List()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonCertificateListLink();
		win.verifyPages("Certificate_List", sa);
	}

	@Then("Check Application>>Maintenance>>Certificate>>Add")
	public void check_Application_Maintenance_Certificate_Add()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonCertificateAddLink();
		win.verifyPages("Certificate_Add", sa);
	}

	@Then("Check Application>>Maintenance>>Certificate>>Modify")
	public void check_Application_Maintenance_Certificate_Modify()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonCertificateModifyLink();
		win.verifyPages("Certificate_Modify", sa);
	}

	@Then("Check Application>>Maintenance>>Certificate>>Delete")
	public void check_Application_Maintenance_Certificate_Delete()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonCertificateDeleteLink();
		win.verifyPages("Certificate_Delete", sa);
	}
@Then("Check Application>>Maintenance>>CorporateCMS>>Customer>>List")
public void check_Application_Maintenance_CorporateCMS_Customer_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSCustomerViewLink();
	win.verifyPages("Customer_Add", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Customer>>Add")
public void check_Application_Maintenance_CorporateCMS_Customer_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSCustomerAddLink();
	win.verifyPages("Customer_List", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Customer>>Approve")
public void check_Application_Maintenance_CorporateCMS_Customer_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSCustomerApproveLink();
	win.verifyPages("Customer_Approve", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Customer>>Modify")
public void check_Application_Maintenance_CorporateCMS_Customer_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSCustomerModifyLink();
	win.verifyPages("Customer_Modify", sa);   
	
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Customer>>Delete")
public void check_Application_Maintenance_CorporateCMS_Customer_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSCustomerDeleteLink();
	win.verifyPages("Customer_Delete", sa);

}

@Then("Check Application>>Maintenance>>CorporateCMS>>Customer>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Customer_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSCustomerConfirmDeleteLink();
	win.verifyPages("Customer_ConfirmDelete", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Customer>>Format Code Mapping")
public void check_Application_Maintenance_CorporateCMS_Customer_Format_Code_Mapping() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSCustomerFormatCodeMappingLink();
	win.verifyPages("Customer_Scheme/Format Code Mapping", sa);

}

@Then("Check Application>>Maintenance>>CorporateCMS>>Charge>>List")
public void check_Application_Maintenance_CorporateCMS_Charge_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSChargeViewLink();
	win.verifyPages("Charge_List", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Charge>>Add")
public void check_Application_Maintenance_CorporateCMS_Charge_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSChargeAddLink();
	win.verifyPages("Charge_Add", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Charge>>Approve")
public void check_Application_Maintenance_CorporateCMS_Charge_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSChargeApproveLink();
	win.verifyPages("Charge_Approve", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Charge>>Modify")
public void check_Application_Maintenance_CorporateCMS_Charge_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSChargeModifyLink();
	win.verifyPages("Charge_Modify", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Charge>>Delete")
public void check_Application_Maintenance_CorporateCMS_Charge_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSChargeDeleteLink();
	win.verifyPages("Charge_Delete", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Charge>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Charge_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSChargeConfirmDeleteLink();
	win.verifyPages("Charge_ConfirmDelete", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Scheme>>List")
public void check_Application_Maintenance_CorporateCMS_Scheme_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSSchemeViewLink();
	win.verifyPages("Scheme_List", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Scheme>>Add")
public void check_Application_Maintenance_CorporateCMS_Scheme_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSSchemeAddLink();
	win.verifyPages("Scheme_Add", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Scheme>>Approve")
public void check_Application_Maintenance_CorporateCMS_Scheme_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSSchemeApproveLink();
	win.verifyPages("Scheme_Approve", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Scheme>>Modify")
public void check_Application_Maintenance_CorporateCMS_Scheme_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSSchemeModifyLink();
	win.verifyPages("Scheme_Modify", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Scheme>>Delete")
public void check_Application_Maintenance_CorporateCMS_Scheme_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSSchemeDeleteLink();
	win.verifyPages("Scheme_Delete", sa);    
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Scheme>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Scheme_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSSchemeConfirmDeleteLink();
	win.verifyPages("Scheme_ConfirmDelete", sa);    
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Scheme>>Upload")
public void check_Application_Maintenance_CorporateCMS_Scheme_Upload() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSSchemeUploadLink();
	win.verifyPages("Scheme_Upload", sa);   

}

@Then("Check Application>>Maintenance>>CorporateCMS>>Scheme>>Download")
public void check_Application_Maintenance_CorporateCMS_Scheme_Download() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSSchemeDownloadLink();
	win.verifyPages("Scheme_Download", sa); 

}

@Then("Check Application>>Maintenance>>CorporateCMS>>Relationship Manager>>List")
public void check_Application_Maintenance_CorporateCMS_Relationship_Manager_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSRelationshipManagerViewLink();
	win.verifyPages("RelationshipManager_List", sa);  

}

@Then("Check Application>>Maintenance>>CorporateCMS>>Relationship Manager>>Add")
public void check_Application_Maintenance_CorporateCMS_Relationship_Manager_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSRelationshipManagerAddLink();
	win.verifyPages("RelationshipManager_Add", sa);  

}

@Then("Check Application>>Maintenance>>CorporateCMS>>Relationship Manager>>Approve")
public void check_Application_Maintenance_CorporateCMS_Relationship_Manager_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSRelationshipManagerApproveLink();
	win.verifyPages("RelationshipManager_Approve", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Relationship Manager>>Modify")
public void check_Application_Maintenance_CorporateCMS_Relationship_Manager_Modify() throws InterruptedException, ParserConfigurationException   {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSRelationshipManagerModifyLink();
	win.verifyPages("RelationshipManager_Modify", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Relationship Manager>>Delete")
public void check_Application_Maintenance_CorporateCMS_Relationship_Manager_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSRelationshipManagerDeleteLink();
	win.verifyPages("RelationshipManager_Delete", sa);    
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Relationship Manager>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Relationship_Manager_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSRelationshipManagerDeleteConfirmLink();
	win.verifyPages("RelationshipManager_ConfirmDelete", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Miscellaneous>>List")
public void check_Application_Maintenance_CorporateCMS_Miscellaneous_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSMiscellaneousViewLink();
	win.verifyPages("Miscellaneous_List", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Miscellaneous>>Add")
public void check_Application_Maintenance_CorporateCMS_Miscellaneous_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSMiscellaneousAddLink();
	win.verifyPages("Miscellaneous_Add", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Miscellaneous>>Approve")
public void check_Application_Maintenance_CorporateCMS_Miscellaneous_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSMiscellaneousApproveLink();
	win.verifyPages("Miscellaneous_Approve", sa); 
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Miscellaneous>>Modify")
public void check_Application_Maintenance_CorporateCMS_Miscellaneous_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSMiscellaneousModifyLink();
	win.verifyPages("Miscellaneous_Modify", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Miscellaneous>>Delete")
public void check_Application_Maintenance_CorporateCMS_Miscellaneous_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSMiscellaneousDeleteLink();
	win.verifyPages("Miscellaneous_Delete", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Miscellaneous>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Miscellaneous_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSMiscellaneousDeleteConfirmLink();
	win.verifyPages("Miscellaneous_ConfirmDelete", sa); 
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Accounting>>List")
public void check_Application_Maintenance_CorporateCMS_Accounting_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAccountingViewLink();
	win.verifyPages("Accounting_List", sa); 
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Accounting>>Add")
public void check_Application_Maintenance_CorporateCMS_Accounting_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAccountingAddLink();
	win.verifyPages("Accounting_Add", sa); 
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Accounting>>Approve")
public void check_Application_Maintenance_CorporateCMS_Accounting_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAccountingApproveLink();
	win.verifyPages("Accounting_Approve", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Accounting>>Modify")
public void check_Application_Maintenance_CorporateCMS_Accounting_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAccountingModifyLink();
	win.verifyPages("Accounting_Modify", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Accounting>>Delete")
public void check_Application_Maintenance_CorporateCMS_Accounting_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAccountingDeleteLink();
	win.verifyPages("Accounting_Delete", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Accounting>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Accounting_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAccountingConfirmDeleteLink();
	win.verifyPages("Accounting_ConfirmDelete", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Authorization>>List")
public void check_Application_Maintenance_CorporateCMS_Authorization_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAuthorizationViewLink();
	win.verifyPages("Authorization_List", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Authorization>>Add")
public void check_Application_Maintenance_CorporateCMS_Authorization_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAuthorizationAddLink();
	win.verifyPages("Authorization_Add", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Authorization>>Approve")
public void check_Application_Maintenance_CorporateCMS_Authorization_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAuthorizationApproveLink();
	win.verifyPages("Authorization_Apporve", sa);    
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Authorization>>Modify")
public void check_Application_Maintenance_CorporateCMS_Authorization_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAuthorizationModifyLink();
	win.verifyPages("Authorization_Modify", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Authorization>>Delete")
public void check_Application_Maintenance_CorporateCMS_Authorization_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAuthorizationDeleteLink();
	win.verifyPages("Authorization_Delete", sa);
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Authorization>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Authorization_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAuthorizationConfirmDeleteLink();
	win.verifyPages("Authorization_ConfirmDelete", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Alert and Notification>>List")
public void check_Application_Maintenance_CorporateCMS_Alert_and_Notification_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAlertViewLink();
	win.verifyPages("Alert_and_Notification_List", sa); 
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Alert and Notification>>Add")
public void check_Application_Maintenance_CorporateCMS_Alert_and_Notification_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAlertAddLink();
	win.verifyPages("Alert_and_Notification_Add", sa);    
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Alert and Notification>>Approve")
public void check_Application_Maintenance_CorporateCMS_Alert_and_Notification_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAlertApproveLink();
	win.verifyPages("Alert_and_Notification_Approve", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Alert and Notification>>Modify")
public void check_Application_Maintenance_CorporateCMS_Alert_and_Notification_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAlertModifyLink();
	win.verifyPages("Alert_and_Notification_Modify", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Alert and Notification>>Delete")
public void check_Application_Maintenance_CorporateCMS_Alert_and_Notification_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAlertDeleteLink();
	win.verifyPages("Alert_and_Notification_Delete", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Alert and Notification>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Alert_and_Notification_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSAlertDeleteConfirmLink();
	win.verifyPages("Alert_and_Notification_ConfirmDelete", sa);    
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Mode Of Operation>>List")
public void check_Application_Maintenance_CorporateCMS_Mode_Of_Operation_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSModeOfOperationViewLink();
	win.verifyPages("Mode_Of_Operation_List", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Mode Of Operation>>Add")
public void check_Application_Maintenance_CorporateCMS_Mode_Of_Operation_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSModeOfOperationAddLink();
	win.verifyPages("Mode_Of_Operation_Add", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Mode Of Operation>>Approve")
public void check_Application_Maintenance_CorporateCMS_Mode_Of_Operation_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSModeOfOperationApproveLink();
	win.verifyPages("Mode_Of_Operation_Approve", sa);    
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Mode Of Operation>>Modify")
public void check_Application_Maintenance_CorporateCMS_Mode_Of_Operation_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSModeOfOperationModifyLink();
	win.verifyPages("Mode_Of_Operation_Modify", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Mode Of Operation>>Delete")
public void check_Application_Maintenance_CorporateCMS_Mode_Of_Operation_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSModeOfOperationDeleteLink();
	win.verifyPages("Mode_Of_Operation_Delete", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Mode Of Operation>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Mode_Of_Operation_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSModeOfOperationDeleteConfirmLink();
	win.verifyPages("Mode_Of_Operation_ConfirmDelete", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Industry Type>>List")
public void check_Application_Maintenance_CorporateCMS_Industry_Type_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSIndustryTypeViewLink();
	win.verifyPages("Industry_Type_List", sa);    
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Industry Type>>Add")
public void check_Application_Maintenance_CorporateCMS_Industry_Type_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSIndustryTypeAddLink();
	win.verifyPages("Industry_Type_Add", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Industry Type>>Approve")
public void check_Application_Maintenance_CorporateCMS_Industry_Type_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSIndustryTypeApproveLink();
	win.verifyPages("Industry_Type_Approve", sa); 
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Industry Type>>Modify")
public void check_Application_Maintenance_CorporateCMS_Industry_Type_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSIndustryTypeModifyLink();
	win.verifyPages("Industry_Type_Modify", sa); 
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Industry Type>>Delete")
public void check_Application_Maintenance_CorporateCMS_Industry_Type_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSIndustryTypeDeleteLink();
	win.verifyPages("Industry_Type_Delete", sa); 
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Industry Type>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Industry_Type_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSIndustryTypeConfirmDeleteLink();
	win.verifyPages("Industry_Type_ConfirmDelete", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Business Group>>List")
public void check_Application_Maintenance_CorporateCMS_Business_Group_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSBusinessGroupViewLink();
	win.verifyPages("Business_Group_List", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Business Group>>Add")
public void check_Application_Maintenance_CorporateCMS_Business_Group_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSBusinessGroupAddLink();
	win.verifyPages("Business_Group_Add", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Business Group>>Approve")
public void check_Application_Maintenance_CorporateCMS_Business_Group_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSBusinessGroupApproveLink();
	win.verifyPages("Business_Group_Approve", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Business Group>>Modify")
public void check_Application_Maintenance_CorporateCMS_Business_Group_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSBusinessGroupModifyLink();
	win.verifyPages("Business_Group_Modify", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Business Group>>Delete")
public void check_Application_Maintenance_CorporateCMS_Business_Group_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSBusinessGroupDeleteLink();
	win.verifyPages("Business_Group_Delete", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Business Group>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Business_Group_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSBusinessGroupDeleteConfirmLink();
	win.verifyPages("Business_Group_ConfirmDelete", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Duplicate Check>>List")
public void check_Application_Maintenance_CorporateCMS_Duplicate_Check_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSDuplicateCheckViewLink();
	win.verifyPages("Duplicate_Check_List", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Duplicate Check>>Add")
public void check_Application_Maintenance_CorporateCMS_Duplicate_Check_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSDuplicateCheckAddLink();
	win.verifyPages("Duplicate_Check_Add", sa);   
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Duplicate Check>>Approve")
public void check_Application_Maintenance_CorporateCMS_Duplicate_Check_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSDuplicateCheckApproveLink();
	win.verifyPages("Duplicate_Check_Approve", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Duplicate Check>>Modify")
public void check_Application_Maintenance_CorporateCMS_Duplicate_Check_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSDuplicateCheckModifyLink();
	win.verifyPages("Duplicate_Check_Modify", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Duplicate Check>>Delete")
public void check_Application_Maintenance_CorporateCMS_Duplicate_Check_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSDuplicateCheckDeleteLink();
	win.verifyPages("Duplicate_Check_Delete", sa);  
}

@Then("Check Application>>Maintenance>>CorporateCMS>>Duplicate Check>>Delete Confirm")
public void check_Application_Maintenance_CorporateCMS_Duplicate_Check_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonCorporateCMSDuplicateCheckConfirmDeleteLink();
	win.verifyPages("Duplicate_Check_ConfirmDelete", sa);  
}

@Then("Check Application>>Maintenance>>Static Data>>IFSC Code>>List")
public void check_Application_Maintenance_Static_Data_IFSC_Code_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataIFSCCodeViewLink();
	win.verifyPages("IFSCCODE_List", sa);  
}

@Then("Check Application>>Maintenance>>Static Data>>IFSC Code>>Add")
public void check_Application_Maintenance_Static_Data_IFSC_Code_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataIFSCCodeAddLink();
	win.verifyPages("IFSCCODE_Add", sa); 
}

@Then("Check Application>>Maintenance>>Static Data>>IFSC Code>>Approve")
public void check_Application_Maintenance_Static_Data_IFSC_Code_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataIFSCCodeApproveLink();
	win.verifyPages("IFSCCODE_Approve", sa);  
}

@Then("Check Application>>Maintenance>>Static Data>>IFSC Code>>Modify")
public void check_Application_Maintenance_Static_Data_IFSC_Code_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataIFSCCodeModifyLink();
	win.verifyPages("IFSCCODE_Modify", sa);   
}

@Then("Check Application>>Maintenance>>Static Data>>IFSC Code>>Delete")
public void check_Application_Maintenance_Static_Data_IFSC_Code_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataIFSCCodeDeleteLink();
	win.verifyPages("IFSCCODE_Delete", sa);   
}

@Then("Check Application>>Maintenance>>Static Data>>IFSC Code>>Delete Confirm")
public void check_Application_Maintenance_Static_Data_IFSC_Code_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataIFSCCodeConfirmDeleteLink();
	win.verifyPages("IFSCCODE_ConfirmDelete", sa); 
}

@Then("Check Application>>Maintenance>>Static Data>>NPCI Codes>>Maintain NPCI Codes")
public void check_Application_Maintenance_Static_Data_NPCI_Codes_Maintain_NPCI_Codes() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataMaintainNPCICodeLink();
	win.verifyPages("NPCICodes_MaintainNPCICodes", sa);  
}

@Then("Check Application>>Maintenance>>Static Data>>NPCI Codes>>List NPCI Codes")
public void check_Application_Maintenance_Static_Data_NPCI_Codes_List_NPCI_Codes() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataListNPCICodeLink();
	win.verifyPages("NPCICodes_ListNPCICodes", sa);  
}

@Then("Check Application>>Maintenance>>Static Data>>DB Loads")
public void check_Application_Maintenance_Static_Data_DB_Loads() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataDBLoadsLink();
	win.verifyPages("StaticData_DBLoads", sa);  
}
@Then ("Check Application>>Maintenance>>Static Data>>Sub Member IFSC Code>>Upload")

public void check_Application_Maintenance_Static_Data_Sub_Member_IFSC_Code_Upload() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataSubMemberIFSCCodeUploadLink();
	win.verifyPages("Sub_Member_IFSCCODE_Upload", sa);   
}

@Then("Check Application>>Maintenance>>Static Data>>Sub Member IFSC Code>>List")

public void check_Application_Maintenance_Static_Data_Sub_MemberIFSC_Code_List() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataSubMemberIFSCCodeViewLink();
	win.verifyPages("Sub_Member_IFSCCODE_List", sa);    
}

@Then("Check Application>>Maintenance>>Static Data>>Sub MemberIFSC Code>>Add")

public void check_Application_Maintenance_Static_Data_Sub_MemberIFSC_Code_Add() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataSubMemberIFSCCodeAddLink();
	win.verifyPages("Sub_Member_IFSCCODE_Add", sa);  
}

@Then("Check Application>>Maintenance>>Static Data>>Sub MemberIFSC Code>>Approve")

public void check_Application_Maintenance_Static_Data_Sub_MemberIFSC_Code_Approve() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataSubMemberIFSCCodeApproveLink();
	win.verifyPages("Sub_Member_IFSCCODE_Approve", sa);

}

@Then("Check Application>>Maintenance>>Static Data>>Sub MemberIFSC Code>>Modify")

public void check_Application_Maintenance_Static_Data_Sub_MemberIFSC_Code_Modify() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataSubMemberIFSCCodeModifyLink();
	win.verifyPages("Sub_Member_IFSCCODE_Modify", sa); 
}
@Then("Check Application>>Maintenance>>Static Data>>Sub MemberIFSC Code>>Delete")

public void check_Application_Maintenance_Static_Data_Sub_MemberIFSC_Code_Delete() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataSubMemberIFSCCodeDeleteLink();
	win.verifyPages("Sub_Member_IFSCCODE_Delete", sa);  
}

@Then("Check Application>>Maintenance>>Static Data>>Sub MemberIFSC Code>>Delete Confirm")

public void check_Application_Maintenance_Static_Data_Sub_MemberIFSC_Code_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonStaticDataSubMemberIFSCCodeDeleteConfirmLink();
	win.verifyPages("Sub_Member_IFSCCODE_ConfirmDelete", sa);  
}
@Then("Check Application>>Maintenance>>Check Parameter Maintenance")
public void check_application_Maintenance_Check_Parameter_Maintenance()
		throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonParameterMaintenanceLink();
	win.verifyPages("Parameter_Maintenance", sa);
}

@Then("Check Application>>Maintenance>>Email>>Distribution Sets>>List")
public void check_Application_Maintenance_Email_Distribution_Sets_List()
		throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonDistributionSetViewLink();
	win.verifyPages("Distribution_Sets_List", sa);
}

@Then("Check Application>>Maintenance>>Email>>Distribution Sets>>Add")
public void check_Application_Maintenance_Email_Distribution_Sets_Add()
		throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonDistributionSetsAddLink();
	win.verifyPages("Distribution_Sets_Add", sa);
}

@Then("Check Application>>Maintenance>>Email>>Distribution Sets>>Approve")
public void check_Application_Maintenance_Email_Distribution_Sets_Approve()
		throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonDistributionSetsApproveLink();
	win.verifyPages("Distribution_Sets_Approve", sa);
}

@Then("Check Application>>Maintenance>>Email>>Distribution Sets>>Modify")
public void check_Application_Maintenance_Email_Distribution_Sets_Modify()
		throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonDistributionSetsModifyLink();
	win.verifyPages("Distribution_Sets_Modify", sa);
}

@Then("Check Application>>Maintenance>>Email>>Distribution Sets>>Delete")
public void check_Application_Maintenance_Email_Distribution_Sets_Delete()
		throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonDistributionSetsDeleteLink();
	win.verifyPages("Distribution_Sets_Delete", sa);
}

@Then("Check Application>>Maintenance>>Email>>Messages-View")
public void check_Application_Maintenance_Email_Messages_View()
		throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonEmailMessagesViewLink();
	win.verifyPages("Messages_View", sa);
}

@Then("Check Application>>Maintenance>>Email>>Messages-New")
public void check_Application_Maintenance_Email_Messages_New()
		throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonEmailMessagesNewLink();
	win.verifyPages("Messages_View", sa);
}


	@Then("Check Application>>Maintenance>>Schedule>>List")
	public void check_Application_Maintenance_Schedule_List()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonScheduleListLink();
		win.verifyPages("Schedule_List", sa);
	}

	@Then("Check Application>>Maintenance>>Schedule>>New")
	public void check_Application_Maintenance_Schedule_New() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonScheduleNewLink();
		win.verifyPages("Schedule_New", sa);
	}

	@Then("Check Application>>Maintenance>>Schedule>>Modify")
	public void check_Application_Maintenance_Schedule_Modify()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonScheduleModifyLink();
		win.verifyPages("Schedule_Modify", sa);
	}

	@Then("Check Application>>Maintenance>>Schedule>>Control")
	public void check_Application_Maintenance_Schedule_Control()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonScheduleControlLink();
		win.verifyPages("Schedule_Control", sa);
	}


	@Then("Check Application>>Maintenance>>FTP-SFTP Parameters>>List")
	public void check_Application_Maintenance_FTP_SFTP_Parameters_List()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFTPSFTPParametersListLink();
		win.verifyPages("FTP_SFTP_Parameters_List", sa);
	}

	@Then("Check Application>>Maintenance>>FTP-SFTP Parameters>>Add")
	public void check_Application_Maintenance_FTP_SFTP_Parameters_Add()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFTPSFTPParametersAddLink();
		win.verifyPages("FTP_SFTP_Parameters_Add", sa);
	}

	@Then("Check Application>>Maintenance>>FTP-SFTP Parameters>>Modify")
	public void check_Application_Maintenance_FTP_SFTP_Parameters_Modify()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFTPSFTPParametersModifyLink();
		win.verifyPages("FTP-SFTP Parameters>>Modify", sa);
	}

	@Then("Check Application>>Maintenance>>FTP-SFTP Parameters>>FTP-SFTP File List")
	public void check_Application_Maintenance_FTP_SFTP_Parameters_FTP_SFTP_File_List()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFTPSFTPParametersFTPSFTPFileListLink();
		win.verifyPages("FTP_SFTP_Parameters_FTP_SFTP_File_List", sa);
	}
	
	

	@Then("Check Application>>Maintenance>>FAQ>>Maintain FAQ")
	public void check_Application_Maintenance_FAQ_Maintain_FAQ() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMaintainFAQLink();
		win.verifyPages("FAQ_MaintainFAQ", sa);	   
	}

	@Then("Check Application>>Maintenance>>FAQ>>List FAQ")
	public void check_Application_Maintenance_FAQ_List_FAQ() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonListFAQLink();
		win.verifyPages("FAQ_ListFAQ", sa);	   
			}

	@Then("Check Application>>Free Format Code>>List")
	public void check_Application_Free_Format_Code_List() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFreeFormatCodeLink();
		win.verifyPages("Free_Format_Code_List", sa);	 
			}

	@Then("Check Application>>Free Format Code>>Add")
	public void check_Application_Free_Format_Code_Add() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFreeFormatCodeAddLink();
		win.verifyPages("Free_Format_Code_Add", sa);	
			}
	
	@Then("Check Application>>Free Format Code>>Copy")
	public void check_Application_Free_Format_Code_Copy() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFreeFormatCodeCopyLink();
		win.verifyPages("Free_Format_Code_Copy", sa);	
	}


	@Then("Check Application>>Free Format Code>>Approve")
	public void check_Application_Free_Format_Code_Approve() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFreeFormatCodeApproveLink();
		win.verifyPages("Free_Format_Code_Approve", sa);	 
	}

	@Then("Check Application>>Free Format Code>>Modify")
	public void check_Application_Free_Format_Code_Modify() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFreeFormatCodeModifyLink();
		win.verifyPages("Free_Format_Code_Modify", sa);	 
	}

	@Then("Check Application>>Free Format Code>>Delete")
	public void check_Application_Free_Format_Code_Delete() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFreeFormatCodeDeleteLink();
		win.verifyPages("Free_Format_Code_Delete", sa);	 
	}

	@Then("Check Application>>Free Format Code>>Delete Confirm")
	public void check_Application_Free_Format_Code_Delete_Confirm() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFreeFormatCodeDeleteConfirmLink();
		win.verifyPages("Free_Format_Code_DeleteConfirm", sa);	 
		
	}


	@Then("Check Application>>File Manager>>List")
	public void check_Application_File_Manager_List() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerListLink();
		win.verifyPages("File_Manager_List", sa);
	}

	
	@Then("Check Application>>File Manager>>Approve Posting File")
	public void check_Application_File_Manager_Approve_Posting_File()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerApprovePostingLink();
		win.verifyPages("File_Manager_Approve_Posting_File", sa);
	}

	@Then("Check Application>>File Manager>>Create ACH File")
	public void check_Application_File_Manager_Create_ACH_File()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerCreateACHFileLink();
		win.verifyPages("File_Manager_Create_ACH_File", sa);
	}

	@Then("Check Application>>File Manager>>Create Return ACH File")
	public void check_Application_File_Manager_Create_Return_ACH_File()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerCreateReturnACHLink();
		win.verifyPages("File_Manager_Create_Return_ACH_File", sa);
	}

	
	@Then("Check Application>>File Manager>>Return Posting File")
	public void check_Application_File_Manager_Return_Posting_File()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerReturnPostingFileLink();
		win.verifyPages("File_Manager_Return_Posting_File", sa);
	}

	@Then("Check Application>>File Manager>>Accept")
	public void check_Application_File_Manager_Accept()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerAcceptLink();
		win.verifyPages("File_Manager_Accept", sa);
	}

	@Then("Check Application>>File Manager>>Approve CBDT")
	public void check_Application_File_Manager_Approve_CBDT()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerpaymentApproveCBDTLink();
		win.verifyPages("File_Manager_Approve_CBDT", sa);
	}

	@Then("Check Application>>File Manager>>ReCreate Posting")
	public void check_Application_File_Manager_ReCreate_Posting() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerRecreatePostingLink();
		win.verifyPages("File_Manager_ReCreate_Posting", sa);

	}

	@Then("Check Application>>File Manager>>Create Return Posting")
	public void check_Application_File_Manager_Create_Return_Posting() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerCreateReturnPostingLink();
		win.verifyPages("File_Manager_Create_Return_Posting", sa);
	}

	@Then("Check Application>>File Manager>>Upload")
	public void check_Application_File_Manager_Upload() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerUploadLink();
		win.verifyPages("File_Manager_Upload", sa);	    
	}

	@Then("Check Application>>File Manager>>Upload Aadhar Mapper")
	public void check_Application_File_Manager_Upload_Aadhar_Mapper() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerUploadAadharMapperLink();
		win.verifyPages("File_Manager_Upload_Aadhar_Mapper", sa);	    

	}

	@Then("Check Application>>File Manager>>CBDT Manual Tray>>List")
	public void check_Application_File_Manager_CBDT_Manual_Tray_List() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerCBDTManualTrayListLink();
		win.verifyPages("File_Manager_CBDT_Manual_Tray_List", sa);	
	}

	@Then("Check Application>>File Manager>>CBDT Manual Tray>>Manual")
	public void check_Application_File_Manager_CBDT_Manual_Tray_Manual() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonFileManagerCBDTManualTrayManualLink();
		win.verifyPages("File_Manager_CBDT_Manual_Tray_Manual", sa);	
	}

	@Then("Check Application>>Payment>>List")
	public void check_Application_Payment_List() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonPaymentListLink();
		win.verifyPages("Payment_List", sa);
	}

	@Then("Check Application>>Payment>>Approve Return")
	public void check_Application_Payment_Approve_Return() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonPaymentApproveReturnLink();
		win.verifyPages("Payment_ApproveReturn", sa);
	}

	@Then("Check Application>>Payment>>Verify Receives")
	public void check_Application_Payment_Verify_Receives() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonPaymentVerifyRecieveLink();
		win.verifyPages("Payment_VerifyReceives", sa);
	}

	@Then("Check Application>>Mandate Management>>From Utility>>Load Customer File")
	public void check_Application_Mandate_Management_From_Utility_Load_Customer_File()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementFromUtilityLoadCustomerFileLink();
		win.verifyPages("From_Utility_Load_Customer_File", sa);
	}

	@Then("Check Application>>Mandate Management>>From Utility>>Initial Load")
	public void check_Application_Mandate_Management_From_Utility_Initial_Load()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementFromUtilityInitialLoadLink();
		win.verifyPages("From_Utility_Initial_Load", sa);
	}

	@Then("Check Application>>Mandate Management>>From Utility>>Mandate Image Mapping")
	public void check_Application_Mandate_Management_From_Utility_Mandate_Image_Mapping()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementFromUtilityMandateImageMappingLink();
		win.verifyPages("From_Utility_Mandate_Image_Mapping", sa);
	}

	@Then("Check Application>>Mandate Management>>List Mandates")
	public void check_Application_Mandate_Management_List_Mandates()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementListMandatesLink();
		win.verifyPages("Mandate_Management_List_Mandates", sa);
	}

	@Then("Check Application>>Mandate Management>>Create New Mandate")
	public void check_Application_Mandate_Management_Create_New_Mandate()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementCreateNewMandateLink();
		win.verifyPages("Mandate_Management_Create_New_Mandate", sa);
	}

	@Then("Check Application>>Mandate Management>>Approve Mandate")
	public void check_Application_Mandate_Management_Approve_Mandate()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementApproveMandateLink();
		win.verifyPages("Mandate_Management_Approve_Mandate", sa);
	}

	@Then("Check Application>>Mandate Management>>Modify Mandate")
	public void check_Application_Mandate_Management_Modify_Mandate()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementModifyMandateLink();
		win.verifyPages("Mandate_Management_Modify_Mandate", sa);
	}

	@Then("Check Application>>Mandate Management>>Amend Mandate")
	public void check_Application_Mandate_Management_Amend_Mandate()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementAmendMandateLink();
		win.verifyPages("Mandate_Management_Amend_Mandate", sa);
	}

	@Then("Check Application>>Mandate Management>>Cancel Mandate")
	public void check_Application_Mandate_Management_Cancel_Mandate()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementCancelMandateLink();
		win.verifyPages("Mandate_Management_Cancel_Mandate", sa);
	}

	@Then("Check Application>>Mandate Management>>Accept Mandates")
	public void check_Application_Mandate_Management_Accept_Mandates()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementAcceptMandatesLink();
		win.verifyPages("Mandate_Management_Accept_Mandates", sa);
	}

	@Then("Check Application>>Mandate Management>>Accept Esign Mandate")
	public void check_Application_Mandate_Management_Accept_Esign_Mandate()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementAcceptEsignMandateLink();
		win.verifyPages("Mandate_Management_Accept_Esign_Mandate", sa);
	}



	@Then("Check Application>>Mandate Management>>Create MMS OutFile")
	public void check_Application_Mandate_Management_Create_MMS_OutFile()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementCreateMMSOutFileLink();
		win.verifyPages("Mandate_Management_Create_MMS_OutFile", sa);
	}

	@Then("Check Application>>Mandate Management>>Mandates Regeneration")
	public void check_Application_Mandate_Management_Mandates_Regeneration()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonMandateManagementMandatesRegenerationLink();
		win.verifyPages("Mandate_Management_Mandates_Regeneration", sa);
	}


	@Then("Check Application>>Mandate Management>>Mandate Manual")
	public void check_Application_Mandate_Management_Mandate_Manual()
			throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonmandateManagementMandateManualLink();
		win.verifyPages("Mandate_Management_Mandate_Manual", sa);
	}


@Then("Check Application>>Guide>>Mandate Flow [NPCI]")
public void check_Application_Guide_Mandate_Flow_NPCI() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonGuideMandateFlowNPCILink();
	win.verifyPages("Guide_Mandate_Flow[NPCI]", sa);   
}

@Then("Check Application>>Guide>>Mandate In Flow")
public void check_Application_Guide_Mandate_In_Flow() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonGuideMandateInFlowLink();
	win.verifyPages("Guide_Mandate_In_Flow", sa);  
}

@Then("Check Application>>Guide>>Mandate Out Flow")
public void check_Application_Guide_Mandate_Out_Flow() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonGuideMandateOutFlowLink();
	win.verifyPages("Guide_Mandate_Out_Flow", sa);   
}

@Then("Check Application>>Server Folder View")
public void check_Application_Server_Folder_View() throws InterruptedException, ParserConfigurationException {
	driver.switchTo().frame("toc");
	homePage.ClickonServerFolderViewLink();
	win.verifyPages("Application_Server_Folder_View", sa); 
}


	@Then("logout")
	public void logout() throws InterruptedException {
		driver.switchTo().frame("content");
		homePage.ClickonLogoutBtn();

	}

}
