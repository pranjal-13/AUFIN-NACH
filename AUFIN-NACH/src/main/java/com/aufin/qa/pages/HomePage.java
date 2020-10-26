package com.aufin.qa.pages;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.aufin.qa.pages.GroupPage;
import com.aufin.qa.pages.UserPage;
import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;

public class HomePage extends TestBase {

	Windowhandle win = new Windowhandle(driver);

	@FindBy(xpath = "//a[contains(text(),'Session')]")
	WebElement sessionLink;

	@FindBy(xpath = "//a[contains(text(),'Password')]")
	WebElement passwordLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[4]/td[3]/a")
	WebElement administrationMenu;

	// System Menu Xpath
	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[5]/td[4]/a")
	WebElement systemMenu;

	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[6]/td[5]/a")
	WebElement logViewMenu;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[7]/td[5]/a")
	WebElement HouseKeepingMenu;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[8]/td[6]/a")
	WebElement SecurityParametersMenu;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[9]/td[7]/a")
	WebElement SecurityParametersViewMenu;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[10]/td[7]/a")
	WebElement SecurityParametersModifyMenu;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[11]/td[7]/a")
	WebElement SecurityParametersApproveMenu;

	// Link Check User Menu
	@FindBy(xpath = "//a[contains(text(),'User')]")
	WebElement linkUserMenu;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[7]/td[5]/a")
	WebElement userList;

	@FindBy(xpath = "//a[contains(text(),'Modify/Repair')]")
	WebElement userModify;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement userAdd;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr/td[2]/input[2]")
	WebElement userOk;

	@FindBy(xpath = "//a[contains(text(),'Block/Unblock')]")
	WebElement userBlockUnblock;

	@FindBy(xpath = "//a[contains(text(),'Remove')]")
	WebElement userRemove;

	@FindBy(xpath = "//a[contains(text(),'Report-View')]")
	WebElement userReportView;

	// User Approve Menu Xpath
	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[10]/td[5]/a")
	WebElement approveMenu;

	// link Approve Menu
	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement linkUserApprove;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement approveOkBtn;

	// Group Menu Xpath
	@FindBy(xpath = "//a[contains(text(),'Group')]")
	WebElement groupMenu;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement groupAdd;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement approveGrp;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement linkGroupList;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement linkGroupModify;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement linkGroupApprove;

	@FindBy(xpath = "//a[contains(text(),'Block')]")
	WebElement linkGroupBlock;

	@FindBy(xpath = "//a[contains(text(),'Unblock')]")
	WebElement linkGroupUnblock;

	@FindBy(xpath = "//a[contains(text(),'Remove')]")
	WebElement linkGroupRemove;

	@FindBy(xpath = "//a[contains(text(),'Report')]")
	WebElement linkGroupReport;

	@FindBy(xpath = "//a[contains(text(),'Build')]")
	WebElement linkGroupReportBuild;

	@FindBy(xpath = "//a[contains(text(),'View')]")
	WebElement linkGroupReportView;

	// Profile Menu Xpath
	@FindBy(xpath = "//a[contains(text(),'Profiles')]")
	WebElement profileMenu;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement linkProfileList;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement profileAdd;

	@FindBy(xpath = "//a[contains(text(),'Modify/Repair')]")
	WebElement linkProfileModify;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement profileApprove;

	@FindBy(xpath = "//a[contains(text(),'Remove')]")
	WebElement linkProfileRemove;

	@FindBy(xpath = "//a[contains(text(),'Report')]")
	WebElement linkProfileReport;

	@FindBy(xpath = "//a[contains(text(),'Build')]")
	WebElement linkProfileReportBuild;

	@FindBy(xpath = "//a[contains(text(),'View')]")
	WebElement linkProfileReportView;

	// Enviornment Link

	@FindBy(xpath = "//a[contains(text(),'Environment')]")
	WebElement environmentLink;

	@FindBy(xpath = "//a[contains(text(),'Run')]")
	WebElement environmentRunLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[7]/td[4]/a")
	WebElement linkShow;

	// Application Menu Xpath
	@FindBy(xpath = "//a[contains(text(),'Application')]")
	WebElement applicationLink;

	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[7]/td[4]/a")
	WebElement maintenanceLink;

	// Calendar Link
	@FindBy(xpath = "//a[contains(text(),'Calendar')]")
	WebElement calendarLink;

	@FindBy(xpath = "//a[contains(text(),'Create')]")
	WebElement calendarCreateLink;

	@FindBy(xpath = "//a[contains(text(),'Modify/Repair')]")
	WebElement CALENDARModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement CALENDARDeleteLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement calendarApproveLink;

	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[9]/td[6]/a")
	WebElement calendarViewLink;

	@FindBy(xpath = "//*[@id=\"frmLogout\"]/button[1]")
	WebElement logoutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/div[3]/div[3]/div/button[2]")
	WebElement logoutOKBtn;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logoutLink;

	// Certificate Link
	@FindBy(xpath = "//a[contains(text(),'Certificate')]")
	WebElement certificateLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement certificateAddLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement certificateListLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[12]/td[6]/a")
	WebElement certificateModifyLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[13]/td[6]/a")
	WebElement certificateDeleteLink;

	// Corporate CMS link
	@FindBy(xpath = "//a[contains(text(),'Corporate CMS')]")
	WebElement corporateCMSlink;

	@FindBy(xpath = "//a[contains(text(),'Customer')]")
	WebElement CorporateCustomer;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[12]/td[7]/a")
	WebElement CorporateCustomerList;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[13]/td[7]/a")
	WebElement CorporateCustomerAdd;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[14]/td[7]/a")
	WebElement CorporateCustomerApprove;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[15]/td[7]/a")
	WebElement CorporateCustomerModify;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[7]/a")
	WebElement CorporateCustomerDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[7]/a")
	WebElement CorporateCustomerConfirmDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[7]/a")
	WebElement CorporateCustomerFormatCode;

	@FindBy(xpath = "//a[contains(text(),'Industry Type')]")
	WebElement industryTypeLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement industryTypeaddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement industryTypeapproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement industryTypelistLink;

	@FindBy(xpath = "//a[contains(text(),'Business Group')]")
	WebElement businessGroupLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement businessGroupaddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement businessGroupapproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement businessGrouplistLink;

	@FindBy(xpath = "//a[contains(text(),'Accounting')]")
	WebElement accountingLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement accountingaddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement accountingapproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement accountingviewLink;

	@FindBy(xpath = "//a[contains(text(),'Customer')]")
	WebElement customerLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement customerAddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement customerApproveLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement customerListLink;

	@FindBy(xpath = "//a[contains(text(),'Charge')]")
	WebElement CorporateCharge;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement CorporateChargeList;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement CorporateChargeAdd;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement CorporateChargeApprove;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement CorporateChargeModify;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement CorporateChargeDelete;

	@FindBy(xpath = "//a[contains(text(),'Confirm Delete')]")
	WebElement CorporateChargeConfirmDelete;

	@FindBy(xpath = "//a[contains(text(),'Scheme')]")
	WebElement CorporateScheme;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[14]/td[7]/a")
	WebElement CorporateSchemeList;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[15]/td[7]/a")
	WebElement CorporateSchemeAdd;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[7]/a")
	WebElement CorporateSchemeApprove;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[7]/a")
	WebElement CorporateSchemeModify;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[7]/a")
	WebElement CorporateSchemeDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[19]/td[7]/a")
	WebElement CorporateSchemeConfirmDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[20]/td[7]/a")
	WebElement CorporateSchemeUpload;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[21]/td[7]/a")
	WebElement CorporateSchemeDownload;

	@FindBy(xpath = "//a[contains(text(),'Relationship Manager')]")
	WebElement CorporateRelationship;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[15]/td[7]/a")
	WebElement CorporateRelationshipList;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[7]/a")
	WebElement CorporateRelationshipAdd;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[7]/a")
	WebElement CorporateRelationshipApprove;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[7]/a")
	WebElement CorporateRelationshipModify;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[19]/td[7]/a")
	WebElement CorporateRelationshipDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[20]/td[7]/a")
	WebElement CorporateRelationshipConfirmDelete;

	@FindBy(xpath = "//a[contains(text(),'Miscellaneous')]")
	WebElement CorporateMiscellaneous;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[7]/a")
	WebElement CorporateMiscellaneousList;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[7]/a")
	WebElement CorporateMiscellaneousAdd;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[7]/a")
	WebElement CorporateMiscellaneousApprove;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[19]/td[7]/a")
	WebElement CorporateMiscellaneousModify;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[20]/td[7]/a")
	WebElement CorporateMiscellaneousDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[21]/td[7]/a")
	WebElement CorporateMiscellaneousConfirmDelete;

	@FindBy(xpath = "//a[contains(text(),'Authorization')]")
	WebElement CorporateAuthorization;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[7]/a")
	WebElement CorporateAuthorizationList;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[19]/td[7]/a")
	WebElement CorporateAuthorizationAdd;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[20]/td[7]/a")
	WebElement CorporateAuthorizationApprove;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[21]/td[7]/a")
	WebElement CorporateAuthorizationModify;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[22]/td[7]/a")
	WebElement CorporateAuthorizationDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[23]/td[7]/a")
	WebElement CorporateAuthorizationConfirmDelete;

	@FindBy(xpath = "//a[contains(text(),'Alert and Notification')]")
	WebElement CorporateAlerts;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[19]/td[7]/a")
	WebElement CorporateAlertsList;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[20]/td[7]/a")
	WebElement CorporateAlertsAdd;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[21]/td[7]/a")
	WebElement CorporateAlertsApprove;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[22]/td[7]/a")
	WebElement CorporateAlertsModify;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[23]/td[7]/a")
	WebElement CorporateAlertsDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[24]/td[7]/a")
	WebElement CorporateAlertsConfirmDelete;

	@FindBy(xpath = "//a[contains(text(),'Mode Of Operation')]")
	WebElement CorporateModeOfOperation;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[20]/td[7]/a")
	WebElement CorporateModeOfOperationList;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[21]/td[7]/a")
	WebElement CorporateModeOfOperationAdd;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[22]/td[7]/a")
	WebElement CorporateModeOfOperationApprove;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[23]/td[7]/a")
	WebElement CorporateModeOfOperationModify;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[24]/td[7]/a")
	WebElement CorporateModeOfOperationDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[25]/td[7]/a")
	WebElement CorporateModeOfOperationConfirmDelete;

	@FindBy(xpath = "//a[contains(text(),'Industry Type')]")
	WebElement CorporateIndustryType;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[21]/td[7]/a")
	WebElement CorporateIndustryTypeList;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[22]/td[7]/a")
	WebElement CorporateIndustryTypeAdd;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[23]/td[7]/a")
	WebElement CorporateIndustryTypeApprove;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[24]/td[7]/a")
	WebElement CorporateIndustryTypeModify;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[25]/td[7]/a")
	WebElement CorporateIndustryTypeDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[26]/td[7]/a")
	WebElement CorporateIndustryTypeConfirmDelete;

	// Business
	@FindBy(xpath = "//a[contains(text(),'Business Group')]")
	WebElement CorporateBusinessGroup;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement CorporateBusinessGroupList;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement CorporateBusinessGroupAdd;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement CorporateBusinessGroupApprove;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement CorporateBusinessGroupModify;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement CorporateBusinessGroupDelete;

	@FindBy(xpath = "//a[contains(text(),'Confirm Delete')]")
	WebElement CorporateBusinessGroupConfirmDelete;

	@FindBy(xpath = "//a[contains(text(),'Duplicate Check')]")
	WebElement CorporateDuplicateCheck;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement CorporateDuplicateCheckList;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement CorporateDuplicateCheckAdd;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement CorporateDuplicateCheckApprove;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement CorporateDuplicateCheckModify;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement CorporateDuplicateCheckDelete;

	@FindBy(xpath = "//a[contains(text(),'Confirm Delete')]")
	WebElement CorporateDuplicateCheckConfirmDelete;

	@FindBy(xpath = "//a[contains(text(),'Accounting')]")
	WebElement CorporateAccounting;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[7]/a")
	WebElement CorporateAccountingList;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[7]/a")
	WebElement CorporateAccountingAdd;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[19]/td[7]/a")
	WebElement CorporateAccountingApprove;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[20]/td[7]/a")
	WebElement CorporateAccountingModify;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[21]/td[7]/a")
	WebElement CorporateAccountingDelete;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[22]/td[7]/a")
	WebElement CorporateAccountingConfirmDelete;

	@FindBy(xpath = "//a[contains(text(),'Static Data')]")
	WebElement staticDataLink;

	@FindBy(xpath = "//a[contains(text(),'DB Loads')]")
	WebElement dbLoadsLink;

	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[12]/td[6]/a")
	WebElement ifsccodeLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement ifsccodelistLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[14]/td[7]/a")
	WebElement ifscCODEAddLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[15]/td[7]/a")
	WebElement ifscCODEApproveLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[7]/a")
	WebElement ifscCODEModifyLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[7]/a")
	WebElement ifscCODEDeleteLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[7]/a")
	WebElement ifscCODEConfirmDeleteLink;

	@FindBy(xpath = "//a[contains(text(),'Application')]")
	WebElement applicationMenu;

	@FindBy(xpath = "//a[contains(text(),'NPCI Codes')]")
	WebElement NPCICodeLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[14]/td[7]/a")
	WebElement NPCICodeMaintainLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[15]/td[7]/a")
	WebElement ListNPCICodeLink;

	@FindBy(xpath = "//a[contains(text(),'DB Loads')]")
	WebElement DBLoadsLink;

	@FindBy(xpath = "//a[contains(text(),'Sub-Member IFSCCODE')]")
	WebElement SubMemberIfscCodeLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[7]/a")
	WebElement SubMemberIfscCodeUploadLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[7]/a")
	WebElement SubMemberIfscCodeListLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[7]/a")
	WebElement SubMemberIfscAddLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[19]/td[7]/a")
	WebElement SubMemberIfscCodeApproveLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[20]/td[7]/a")
	WebElement SubMemberIfscCodeModifyLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[21]/td[7]/a")
	WebElement SubMemberIfscCodeDeleteLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[22]/td[7]/a")
	WebElement SubMemberIfscCodeDeleteConfirmLink;

	@FindBy(xpath = "//a[contains(text(),'Parameter Maintenance')]")
	WebElement parameterMaintenanceLink;

	@FindBy(xpath = "//a[contains(text(),'Email')]")
	WebElement emailLink;

	@FindBy(xpath = "//a[contains(text(),'Distribution Sets')]")
	WebElement distributionSetsLink;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/p[1]")
	WebElement distributionSetMessage;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement distributionSetsListLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement distributionSetsAddLink;

	@FindBy(xpath = "//a[contains(text(),'Approve')]")
	WebElement distributionSetsApproveLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement distributionSetsModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement distributionSetsDeleteLink;

	@FindBy(xpath = "//a[contains(text(),'Messages')]")
	WebElement emailMessagesLink;

	@FindBy(xpath = "//a[contains(text(),'View')]")
	WebElement emailMessagesViewLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[7]/a")
	WebElement emailmessageNewLink;

	@FindBy(xpath = "//a[contains(text(),'Schedule')]")
	WebElement scheduleLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement scheduleListLink;

	@FindBy(xpath = "//a[contains(text(),'New')]")
	WebElement scheduleNewLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement scheduleModifyLink;

	@FindBy(xpath = "//a[contains(text(),'Control')]")
	WebElement scheduleControlLink;

	@FindBy(xpath = "//a[contains(text(),'FTP-SFTP Parameters')]")
	WebElement ftpSFTPParametersLink;

	@FindBy(xpath = "//*[@id=\"menuBody\"]/table/tbody/tr[19]/td[6]/a")
	WebElement ftpSFTPParametersListLink;

	@FindBy(xpath = "//a[contains(text(),'Add')]")
	WebElement ftpSFTPParametersAddLink;

	@FindBy(xpath = "//a[contains(text(),'Modify')]")
	WebElement ftpSFTPParametersModifyLink;

	@FindBy(xpath = "//a[contains(text(),'FTP-SFTP File List')]")
	WebElement ftpSFTPParametersFTPSFTPFileListLink;

	@FindBy(xpath = "//a[contains(text(),'FAQ')]")
	WebElement FAQLink;

	@FindBy(xpath = "//a[contains(text(),'Maintain FAQ')]")
	WebElement MaintainFAQLink;

	@FindBy(xpath = "//a[contains(text(),'List FAQ')]")
	WebElement ListFAQLink;

	@FindBy(xpath = "//a[contains(text(),'Free Format Code')]")
	WebElement FreeFormatCodeLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[9]/td[5]/a")
	WebElement FreeFormatCodeListLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[10]/td[5]/a")
	WebElement FreeFormatCodeAddLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[11]/td[5]/a")
	WebElement FreeFormatCodeCopyLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[12]/td[5]/a")
	WebElement FreeFormatCodeApproveLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[13]/td[5]/a")
	WebElement FreeFormatCodeModifyLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[14]/td[5]/a")
	WebElement FreeFormatCodeDeleteLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[15]/td[5]/a")
	WebElement FreeFormatCodeDeleteConfirmLink;

	@FindBy(xpath = "//a[contains(text(),'File Manager')]")
	WebElement FileManagerLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[10]/td[5]/a")
	WebElement ListLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[11]/td[5]/a")
	WebElement ApprovePostingLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[12]/td[5]/a")
	WebElement CreateACHFileLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[13]/td[5]/a")
	WebElement CreateReturnACHLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[14]/td[5]/a")
	WebElement ReturnPostingFileLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[15]/td[5]/a")
	WebElement AcceptLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[5]/a")
	WebElement paymentApproveCBDTLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[5]/a")
	WebElement RecreatePostingLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[5]/a")
	WebElement CreateReturnPostingLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[19]/td[5]/a")
	WebElement UploadLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[20]/td[5]/a")
	WebElement UploadAadharMapperLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[21]/td[5]/a")
	WebElement CBDTManualTrayLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[22]/td[6]/a")
	WebElement CBDTManualTrayListLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[23]/td[6]/a")
	WebElement CBDTManualTrayManualLink;

	@FindBy(xpath = "//a[contains(text(),'Payment')]")
	WebElement PaymentLink;

	@FindBy(xpath = "//a[contains(text(),'List')]")
	WebElement paymentListLink;

	@FindBy(xpath = "//a[contains(text(),'Approve Return')]")
	WebElement paymentApproveReturnLink;

	@FindBy(xpath = "//a[contains(text(),'Verify Receives')]")
	WebElement paymentVerifyRecieveLink;

	// Mandate Management MEnu Xpath
	@FindBy(xpath = "//a[contains(text(),'Mandate Management')]")
	WebElement mandateManagementLink;

	@FindBy(xpath = "//a[contains(text(),'From Utility')]")
	WebElement mandateManagementFromUtilityLink;

	@FindBy(xpath = "//a[contains(text(),'Load Customer File')]")
	WebElement mandateManagementFromUtilityLoadCustomerFileLink;

	@FindBy(xpath = "//a[contains(text(),'Initial Load')]")
	WebElement mandateManagementFromUtilityInitialLoadLink;

	@FindBy(xpath = "//a[contains(text(),'Mandate Image Mapping')]")
	WebElement mandateManagementFromUtilityMandateImageMappingLink;

	@FindBy(xpath = "//a[contains(text(),'List Mandates')]")
	WebElement mandateManagementListMandatesLink;

	@FindBy(xpath = "//a[contains(text(),'Create New Mandate')]")
	WebElement mandateManagementCreateNewMandateLink;

	@FindBy(xpath = "//a[contains(text(),'Accept Mandates')]")
	WebElement acceptMandateMenu;

	@FindBy(xpath = "//a[contains(text(),'Approve Mandate')]")
	WebElement mandateManagementApproveMandateLink;

	@FindBy(xpath = "//a[contains(text(),'Amend Mandate')]")
	WebElement amendMandateLink;

	@FindBy(xpath = "//a[contains(text(),'Modify Mandate')]")
	WebElement modifyMandateLink;

	@FindBy(xpath = "//a[contains(text(),'Cancel Mandate')]")
	WebElement mandateManagementCancelMandateLink;

	@FindBy(xpath = "//a[contains(text(),'Create MMS OutFile')]")
	WebElement createMMSOutfileMenu;

	@FindBy(xpath = "//a[contains(text(),'Accept Esign Mandate')]")
	WebElement mandateManagementAcceptEsignMandateLink;

	@FindBy(xpath = "//a[contains(text(),'Mandates Regeneration')]")
	WebElement mandateManagementMandatesRegenerationLink;

	@FindBy(xpath = "//a[contains(text(),'Mandate Manual')]")
	WebElement mandateManagementMandateManualLink;

	// Guide menu XPath
	@FindBy(xpath = "//a[contains(text(),'Guide')]")
	WebElement GuideLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[13]/td[5]/a")
	WebElement GuideMandateFlowNPCILink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[14]/td[5]/a")
	WebElement GuideMandateInFlowLink;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[15]/td[5]/a")
	WebElement GuideMandateOutFlowLink;

	@FindBy(xpath = "//a[contains(text(),'Server Folder View')]")
	WebElement ServerFolderViewLink;

	// Utility
	@FindBy(xpath = "//a[contains(text(),'Utility')]")
	WebElement Utility;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[8]/td[4]/a")
	WebElement Dashboard;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[9]/td[5]/a")
	WebElement OutwardTransaction;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[10]/td[5]/a")
	WebElement InwardTransaction;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[11]/td[5]/a")
	WebElement OutwardMandates;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[12]/td[5]/a")
	WebElement OutwardAPIMandates;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[13]/td[5]/a")
	WebElement InwardMandates;

	@FindBy(xpath = "//a[contains(text(),'Inward API Mandates')]")
	WebElement InwardAPIMandates;

	@FindBy(xpath = "//a[contains(text(),'Report')]")
	WebElement Report;

	@FindBy(xpath = "//a[contains(text(),'EOD Reconciliation')]")
	WebElement EODReconciliation;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[11]/td[5]/a")
	WebElement UserActivity;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[12]/td[5]/a")
	WebElement Mandate;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[13]/td[6]/a")
	WebElement InwardMandate;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[14]/td[6]/a")
	WebElement OutwardMandate;

	@FindBy(xpath = "//a[contains(text(),'Payments')]")
	WebElement UtilityPayments;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[14]/td[6]/a")
	WebElement UtilityInwardPayments;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[15]/td[6]/a")
	WebElement UtilityOutwardPayments;

	@FindBy(xpath = "//a[contains(text(),'Charging Report')]")
	WebElement ChargingReport;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[15]/td[6]/a")
	WebElement ChargingBookingReport;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[6]/a")
	WebElement ChargingBillingInvoiceReport;

	@FindBy(xpath = "//a[contains(text(),'Productivity')]")
	WebElement Productivity;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[6]/a")
	WebElement ProductivityMandate;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[7]/a")
	WebElement ProductivityInwardMandate;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[7]/a")
	WebElement ProductivityOutwardMandate;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[5]/a")
	WebElement Summary;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[5]/a")
	WebElement AadharMapper;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[5]/a")
	WebElement CBDTReport;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[19]/td[5]/a")
	WebElement ReturnMemo;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[20]/td[5]/a")
	WebElement CorporateFundingReport;

	// Application Support Tools
	@FindBy(xpath = "//a[contains(text(),'Application Support Tools')]")
	WebElement linkApplicationSupport;

	@FindBy(xpath = "//a[contains(text(),'Space Dump')]")
	WebElement linkSpaceDump;

	@FindBy(xpath = "//a[contains(text(),'Space Rebuild')]")
	WebElement linkSpaceRebuild;

	@FindBy(xpath = "//a[contains(text(),'System Info')]")
	WebElement linkSystemInfo;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[12]/td[4]/a")
	WebElement linkTraceLevelInfo;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[13]/td[4]/a")
	WebElement linkDBExplorer;

	@FindBy(xpath = "//a[contains(text(),'Log Explorer')]")
	WebElement linkLogExplorer;

	@FindBy(xpath = "//a[contains(text(),'Lock Management')]")
	WebElement linkLockMgmt;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[16]/td[4]/a")
	WebElement linkParamConstants;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[17]/td[4]/a")
	WebElement linkBranchUnitAttributes;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[18]/td[4]/a")
	WebElement linkUploadMandates;

	@FindBy(xpath = "//*[@id='menuBody']/table/tbody/tr[19]/td[4]/a")
	WebElement linkapptoolsmandate;

	// Create New Mandate path
	@FindBy(xpath = "//a[contains(text(),'Create New Mandate')]")
	WebElement createNewMandateMenu;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	// User Page Methods
	public UserPage CreateUser() throws InterruptedException {
		administrationMenu.click();
		linkUserMenu.click();
		userAdd.click();
		win.handlewin();
		userOk.click();
		return new UserPage();
	}

	public UserPage approveMenu() throws InterruptedException {
		administrationMenu.click();
		linkUserMenu.click();
		approveMenu.click();
		win.handlewin();
		approveOkBtn.click();
		return new UserPage();
	}

	// Group Page Methods
	public GroupPage createGroup() throws InterruptedException {
		administrationMenu.click();
		groupMenu.click();
		groupAdd.click();
		win.handlewin();
		return new GroupPage();
	}

	public GroupPage approveGroupMenu() throws InterruptedException {
		administrationMenu.click();
		groupMenu.click();
		approveGrp.click();
		win.handlewin();
		return new GroupPage();
	}

	// Profile Page
	public ProfilePage createProfile() throws InterruptedException {
		administrationMenu.click();
		profileMenu.click();
		profileAdd.click();
		win.handlewin();
		return new ProfilePage();

	}

	public ProfilePage approveProfileMenu() throws InterruptedException {
		administrationMenu.click();
		profileMenu.click();
		profileApprove.click();
		win.handlewin();
		return new ProfilePage();
	}

	// Cancel Outward Mandate
	public CancelOutwardMandate cancelmandate() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		mandateManagementCancelMandateLink.click();
		win.handlewin();
		return new CancelOutwardMandate();

	}

	public CancelOutwardMandate approvecancelmandate() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		mandateManagementApproveMandateLink.click();
		win.handlewin();
		return new CancelOutwardMandate();

	}
	// Cancel Inward Mandate

	public CancelInwardMandate INWcancelmandate() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		mandateManagementCancelMandateLink.click();
		win.handlewin();
		return new CancelInwardMandate();

	}

	public CancelInwardMandate approveINWcancelmandate() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		mandateManagementApproveMandateLink.click();
		win.handlewin();
		return new CancelInwardMandate();

	}

	// Cancel ONUS

	public CancelONUSMandate onuscancelmandate() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		mandateManagementCancelMandateLink.click();
		win.handlewin();
		return new CancelONUSMandate();

	}

	public CancelONUSMandate onusapprovecancelmandate() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		mandateManagementApproveMandateLink.click();
		win.handlewin();
		return new CancelONUSMandate();

	}

	// Create ONUS Mandate

	public CreateONUSMandate CreateMandate() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		mandateManagementCreateNewMandateLink.click();
		win.handlewin();
		return new CreateONUSMandate();
	}

	// Accept Mandate Management
	public AcceptMandatePage acceptInwardMandate() {
		applicationMenu.click();
		mandateManagementLink.click();
		acceptMandateMenu.click();
		return new AcceptMandatePage();
	}

	public EnvironmentPage clickonEnvironmentRunLink() throws InterruptedException {
		environmentLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		environmentRunLink.click();
		return new EnvironmentPage();
	}

	public void clickonLogoutBtn() throws InterruptedException {
		logoutBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logoutOKBtn.click();
	}

	// Calendar Page method
	public CalendarPage clickonCreateCalendarLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		calendarLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		calendarCreateLink.click();
		return new CalendarPage();
	}

	public CalendarPage clickonApproveCalendarLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		calendarLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		calendarApproveLink.click();
		return new CalendarPage();
	}

	public CalendarPage clickonViewCalendarLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		calendarLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		calendarViewLink.click();
		return new CalendarPage();
	}

	// Industry Menu method
	public IndustryTypePage clickonAddIndustryTypeLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		industryTypeLink.click();
		industryTypeaddLink.click();
		return new IndustryTypePage();
	}

	public IndustryTypePage clickonApproveIndustryTypeLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		industryTypeLink.click();
		industryTypeapproveLink.click();
		return new IndustryTypePage();
	}

	public IndustryTypePage clickonListIndustryTypeLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		industryTypeLink.click();
		industryTypelistLink.click();
		return new IndustryTypePage();
	}

	// Business Group Method
	public BusinessGroupPage clickonaddBusinessgroupLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		businessGroupLink.click();
		businessGroupaddLink.click();
		return new BusinessGroupPage();
	}

	public BusinessGroupPage clickonapproveBusinessgroupLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		businessGroupLink.click();
		businessGroupapproveLink.click();
		return new BusinessGroupPage();
	}

	public BusinessGroupPage clickonlistBusinessgroupLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		businessGroupLink.click();
		businessGrouplistLink.click();
		return new BusinessGroupPage();
	}

	// Account Menu Methods
	public AccountingPage clickonaddAccountingLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		accountingLink.click();
		accountingaddLink.click();
		return new AccountingPage();
	}

	public AccountingPage clickonapproveAccountingLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		accountingLink.click();
		accountingapproveLink.click();
		return new AccountingPage();
	}

	public AccountingPage clickonlistAccountingLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		accountingLink.click();
		accountingviewLink.click();
		return new AccountingPage();
	}

	// Customer Menu Method
	public CustomerPage clickonaddCustomerLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		customerLink.click();
		customerAddLink.click();
		return new CustomerPage();
	}

	public CustomerPage clickonapproveCustomerLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		customerLink.click();
		customerApproveLink.click();
		return new CustomerPage();
	}

	public CustomerPage clickonlistCustomerLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		corporateCMSlink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		customerLink.click();
		customerListLink.click();
		return new CustomerPage();
	}

	// Db Load Menu Method
	public DBLoadsPage clickonStaticDataDBLoadsLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		staticDataLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		dbLoadsLink.click();
		return new DBLoadsPage();
	}

	public IFSCCODEList clickonlistIFSCCodeLink() throws InterruptedException {
		applicationMenu.click();
		maintenanceLink.click();
		staticDataLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		ifsccodeLink.click();
		ifsccodelistLink.click();
		return new IFSCCODEList();
	}

	// Create Outward Mandate
	public CreateOutMandatePage createOutwardMandate() {

		applicationMenu.click();
		mandateManagementLink.click();
		createNewMandateMenu.click();

		return new CreateOutMandatePage();

	}

	public ApproveMandatePage approveMandateRecord() {

		applicationMenu.click();
		mandateManagementLink.click();
		mandateManagementApproveMandateLink.click();

		return new ApproveMandatePage();
	}

	public CreateMMSOutFilePage createMMSFileRecord() {

		applicationMenu.click();
		mandateManagementLink.click();
		createMMSOutfileMenu.click();

		return new CreateMMSOutFilePage();
	}

	// Amend Mandate
	public AmendMandatePage clickonamendOutwardmandateLink() {
		applicationMenu.click();
		mandateManagementLink.click();
		amendMandateLink.click();
		return new AmendMandatePage();
	}

	public AmendMandatePage clickonacceptInwardmandateLink() {
		applicationMenu.click();
		mandateManagementLink.click();
		acceptMandateMenu.click();
		return new AmendMandatePage();
	}

	public AmendMandatePage clickonapproveamendmandateLink() {
		applicationMenu.click();
		mandateManagementLink.click();
		mandateManagementApproveMandateLink.click();
		return new AmendMandatePage();
	}

	// Modify Mandate
	public ModifyMandatePage clickonmodifyamendmandateLink() {
		applicationMenu.click();
		mandateManagementLink.click();
		modifyMandateLink.click();
		return new ModifyMandatePage();
	}

	// Methods To Check All Menus on click
	public CertificatePage ClickonCreateCertificateLink() throws InterruptedException {
		certificateLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		certificateAddLink.click();
		return new CertificatePage();
	}

	public CertificatePage ClickonListCertificateLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		certificateLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		certificateListLink.click();
		return new CertificatePage();
	}

	public void ClickonCertificateListLink() throws InterruptedException {
		certificateLink.click();
		certificateListLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCertificateAddLink() throws InterruptedException {
		certificateAddLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCertificateModifyLink() throws InterruptedException {
		certificateModifyLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCertificateDeleteLink() throws InterruptedException {
		certificateDeleteLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSCustomerViewLink() throws InterruptedException {
		corporateCMSlink.click();
		CorporateCustomer.click();
		CorporateCustomerList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSCustomerAddLink() throws InterruptedException {
		CorporateCustomerAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSCustomerApproveLink() throws InterruptedException {
		CorporateCustomerApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSCustomerModifyLink() throws InterruptedException {
		CorporateCustomerModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSCustomerDeleteLink() throws InterruptedException {
		CorporateCustomerDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSCustomerConfirmDeleteLink() throws InterruptedException {
		CorporateCustomerConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSCustomerFormatCodeMappingLink() throws InterruptedException {
		CorporateCustomerFormatCode.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSChargeViewLink() throws InterruptedException {
		CorporateCharge.click();
		CorporateChargeList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSChargeAddLink() throws InterruptedException {
		CorporateChargeAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSChargeApproveLink() throws InterruptedException {
		CorporateChargeApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSChargeModifyLink() throws InterruptedException {
		CorporateChargeModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSChargeDeleteLink() throws InterruptedException {
		CorporateChargeDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSChargeConfirmDeleteLink() throws InterruptedException {
		CorporateChargeConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSSchemeViewLink() throws InterruptedException {
		CorporateScheme.click();
		CorporateSchemeList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSSchemeAddLink() throws InterruptedException {
		CorporateSchemeAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSSchemeApproveLink() throws InterruptedException {
		CorporateSchemeApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSSchemeModifyLink() throws InterruptedException {
		CorporateSchemeModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSSchemeDeleteLink() throws InterruptedException {
		CorporateSchemeDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSSchemeConfirmDeleteLink() throws InterruptedException {
		CorporateSchemeConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSSchemeUploadLink() throws InterruptedException {
		CorporateSchemeUpload.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSSchemeDownloadLink() throws InterruptedException {
		CorporateSchemeDownload.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSRelationshipManagerViewLink() throws InterruptedException {
		CorporateRelationship.click();
		CorporateRelationshipList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSRelationshipManagerAddLink() throws InterruptedException {
		CorporateRelationshipAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSRelationshipManagerApproveLink() throws InterruptedException {
		CorporateRelationshipApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSRelationshipManagerModifyLink() throws InterruptedException {
		CorporateRelationshipModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSRelationshipManagerDeleteLink() throws InterruptedException {
		CorporateRelationshipDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSRelationshipManagerDeleteConfirmLink() throws InterruptedException {
		CorporateRelationshipConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSMiscellaneousViewLink() throws InterruptedException {
		CorporateMiscellaneous.click();
		CorporateMiscellaneousList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSMiscellaneousAddLink() throws InterruptedException {
		CorporateMiscellaneousAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSMiscellaneousApproveLink() throws InterruptedException {
		CorporateMiscellaneousApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSMiscellaneousModifyLink() throws InterruptedException {
		CorporateMiscellaneousModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSMiscellaneousDeleteLink() throws InterruptedException {
		CorporateMiscellaneousDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSMiscellaneousDeleteConfirmLink() throws InterruptedException {
		CorporateMiscellaneousConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAccountingViewLink() throws InterruptedException {
		CorporateAccounting.click();
		CorporateAccountingList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAccountingAddLink() throws InterruptedException {
		CorporateAccountingAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAccountingApproveLink() throws InterruptedException {
		CorporateAccountingApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAccountingModifyLink() throws InterruptedException {
		CorporateAccountingModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAccountingDeleteLink() throws InterruptedException {
		CorporateAccountingDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAccountingConfirmDeleteLink() throws InterruptedException {
		CorporateAccountingConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAuthorizationViewLink() throws InterruptedException {
		CorporateAuthorization.click();
		CorporateAuthorizationList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAuthorizationAddLink() throws InterruptedException {
		CorporateAuthorizationAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAuthorizationApproveLink() throws InterruptedException {
		CorporateAuthorizationApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAuthorizationModifyLink() throws InterruptedException {
		CorporateAuthorizationModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAuthorizationDeleteLink() throws InterruptedException {
		CorporateAuthorizationDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAuthorizationConfirmDeleteLink() throws InterruptedException {
		CorporateAuthorizationConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAlertViewLink() throws InterruptedException {
		CorporateAlerts.click();
		CorporateAlertsList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAlertAddLink() throws InterruptedException {
		CorporateAlertsAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAlertApproveLink() throws InterruptedException {
		CorporateAlertsApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAlertModifyLink() throws InterruptedException {
		CorporateAlertsModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAlertDeleteLink() throws InterruptedException {
		CorporateAlertsDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSAlertDeleteConfirmLink() throws InterruptedException {
		CorporateAlertsConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSModeOfOperationViewLink() throws InterruptedException {
		CorporateModeOfOperation.click();
		CorporateModeOfOperationList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSModeOfOperationAddLink() throws InterruptedException {
		CorporateModeOfOperationAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSModeOfOperationApproveLink() throws InterruptedException {
		CorporateModeOfOperationApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSModeOfOperationModifyLink() throws InterruptedException {
		CorporateModeOfOperationModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSModeOfOperationDeleteLink() throws InterruptedException {
		CorporateModeOfOperationDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSModeOfOperationDeleteConfirmLink() throws InterruptedException {
		CorporateModeOfOperationConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSIndustryTypeViewLink() throws InterruptedException {
		CorporateIndustryType.click();
		CorporateIndustryTypeList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSIndustryTypeAddLink() throws InterruptedException {
		CorporateIndustryTypeAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSIndustryTypeApproveLink() throws InterruptedException {
		CorporateIndustryTypeApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSIndustryTypeModifyLink() throws InterruptedException {
		CorporateIndustryTypeModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSIndustryTypeDeleteLink() throws InterruptedException {
		CorporateIndustryTypeDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSIndustryTypeConfirmDeleteLink() throws InterruptedException {
		CorporateIndustryTypeConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSBusinessGroupViewLink() throws InterruptedException {
		CorporateBusinessGroup.click();
		CorporateBusinessGroupList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSBusinessGroupAddLink() throws InterruptedException {
		CorporateBusinessGroupAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSBusinessGroupApproveLink() throws InterruptedException {
		CorporateBusinessGroupApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSBusinessGroupModifyLink() throws InterruptedException {
		CorporateBusinessGroupModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSBusinessGroupDeleteLink() throws InterruptedException {
		CorporateBusinessGroupDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSBusinessGroupDeleteConfirmLink() throws InterruptedException {
		CorporateBusinessGroupConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSDuplicateCheckViewLink() throws InterruptedException {
		CorporateDuplicateCheck.click();
		CorporateDuplicateCheckList.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSDuplicateCheckAddLink() throws InterruptedException {
		CorporateDuplicateCheckAdd.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSDuplicateCheckApproveLink() throws InterruptedException {
		CorporateDuplicateCheckApprove.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSDuplicateCheckModifyLink() throws InterruptedException {
		CorporateDuplicateCheckModify.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSDuplicateCheckDeleteLink() throws InterruptedException {
		CorporateDuplicateCheckDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCorporateCMSDuplicateCheckConfirmDeleteLink() throws InterruptedException {
		CorporateDuplicateCheckConfirmDelete.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataIFSCCodeViewLink() throws InterruptedException {
		staticDataLink.click();
		ifsccodeLink.click();
		ifsccodelistLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataIFSCCodeAddLink() throws InterruptedException {
		ifscCODEAddLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataIFSCCodeApproveLink() throws InterruptedException {
		ifscCODEApproveLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataIFSCCodeModifyLink() throws InterruptedException {
		ifscCODEModifyLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataIFSCCodeDeleteLink() throws InterruptedException {
		ifscCODEDeleteLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataIFSCCodeConfirmDeleteLink() throws InterruptedException {
		ifscCODEConfirmDeleteLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataMaintainNPCICodeLink() throws InterruptedException {
		NPCICodeLink.click();
		NPCICodeMaintainLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataListNPCICodeLink() throws InterruptedException {
		ListNPCICodeLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataDBLoadsLink() throws InterruptedException {
		DBLoadsLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataSubMemberIFSCCodeUploadLink() throws InterruptedException {
		SubMemberIfscCodeLink.click();
		SubMemberIfscCodeUploadLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataSubMemberIFSCCodeViewLink() throws InterruptedException {
		SubMemberIfscCodeListLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataSubMemberIFSCCodeAddLink() throws InterruptedException {
		SubMemberIfscAddLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataSubMemberIFSCCodeApproveLink() throws InterruptedException {
		SubMemberIfscCodeApproveLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataSubMemberIFSCCodeModifyLink() throws InterruptedException {
		SubMemberIfscCodeModifyLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataSubMemberIFSCCodeDeleteLink() throws InterruptedException {
		SubMemberIfscCodeDeleteLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonStaticDataSubMemberIFSCCodeDeleteConfirmLink() throws InterruptedException {
		SubMemberIfscCodeDeleteConfirmLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonParameterMaintenanceLink() throws InterruptedException {
		parameterMaintenanceLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	/*
	 * public void ClickonDistributionSetsListLink() throws InterruptedException {
	 * 
	 * emailLink.click(); distributionSetsLink.click();
	 * Thread.sleep(IntfConstants.SHORT_TIMEOUT); distributionSetsListLink.click();
	 * Thread.sleep(IntfConstants.SHORT_TIMEOUT); }
	 * 
	 */
	public void ClickonDistributionSetViewLink() throws InterruptedException {
		emailLink.click();
		distributionSetsLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		distributionSetsListLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonDistributionSetsAddLink() throws InterruptedException {
		distributionSetsAddLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonDistributionSetsApproveLink() throws InterruptedException {
		distributionSetsApproveLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonDistributionSetsModifyLink() throws InterruptedException {
		distributionSetsModifyLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonDistributionSetsDeleteLink() throws InterruptedException {
		distributionSetsDeleteLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonEmailMessagesViewLink() throws InterruptedException {
		emailMessagesLink.click();
		emailMessagesViewLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonEmailMessagesNewLink() throws InterruptedException {
		emailmessageNewLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonScheduleListLink() throws InterruptedException {
		scheduleLink.click();
		scheduleListLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonScheduleNewLink() throws InterruptedException {
		scheduleNewLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonScheduleModifyLink() throws InterruptedException {
		scheduleModifyLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonScheduleControlLink() throws InterruptedException {
		scheduleControlLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFTPSFTPParametersListLink() throws InterruptedException {
		ftpSFTPParametersLink.click();
		ftpSFTPParametersListLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFTPSFTPParametersAddLink() throws InterruptedException {
		ftpSFTPParametersAddLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFTPSFTPParametersModifyLink() throws InterruptedException {
		ftpSFTPParametersModifyLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFTPSFTPParametersFTPSFTPFileListLink() throws InterruptedException {
		ftpSFTPParametersFTPSFTPFileListLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMaintainFAQLink() throws InterruptedException {

		FAQLink.click();
		MaintainFAQLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonListFAQLink() throws InterruptedException {
		ListFAQLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFreeFormatCodeLink() throws InterruptedException {
		FreeFormatCodeLink.click();
		FreeFormatCodeListLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFreeFormatCodeAddLink() throws InterruptedException {
		FreeFormatCodeAddLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFreeFormatCodeCopyLink() throws InterruptedException {
		FreeFormatCodeCopyLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFreeFormatCodeApproveLink() throws InterruptedException {
		FreeFormatCodeApproveLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFreeFormatCodeModifyLink() throws InterruptedException {
		FreeFormatCodeModifyLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFreeFormatCodeDeleteLink() throws InterruptedException {
		FreeFormatCodeDeleteLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFreeFormatCodeDeleteConfirmLink() throws InterruptedException {
		FreeFormatCodeDeleteConfirmLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerListLink() throws InterruptedException {

		FileManagerLink.click();
		ListLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerApprovePostingLink() throws InterruptedException {
		ApprovePostingLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerCreateACHFileLink() throws InterruptedException {
		CreateACHFileLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerCreateReturnACHLink() throws InterruptedException {
		CreateReturnACHLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerReturnPostingFileLink() throws InterruptedException {
		ReturnPostingFileLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerAcceptLink() throws InterruptedException {
		AcceptLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerpaymentApproveCBDTLink() throws InterruptedException {
		paymentApproveCBDTLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerRecreatePostingLink() throws InterruptedException {
		RecreatePostingLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerCreateReturnPostingLink() throws InterruptedException {
		CreateReturnPostingLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerUploadLink() throws InterruptedException {
		UploadLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerUploadAadharMapperLink() throws InterruptedException {
		UploadAadharMapperLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerCBDTManualTrayListLink() throws InterruptedException {
		CBDTManualTrayLink.click();
		CBDTManualTrayListLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonFileManagerCBDTManualTrayManualLink() throws InterruptedException {
		CBDTManualTrayManualLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonPaymentListLink() throws InterruptedException {
		PaymentLink.click();
		paymentListLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonPaymentApproveReturnLink() throws InterruptedException {
		paymentApproveReturnLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonPaymentVerifyRecieveLink() throws InterruptedException {
		paymentVerifyRecieveLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementFromUtilityLoadCustomerFileLink() throws InterruptedException {
		mandateManagementLink.click();
		mandateManagementFromUtilityLink.click();
		mandateManagementFromUtilityLoadCustomerFileLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementFromUtilityInitialLoadLink() throws InterruptedException {
		mandateManagementFromUtilityInitialLoadLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementFromUtilityMandateImageMappingLink() throws InterruptedException {
		mandateManagementFromUtilityMandateImageMappingLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementListMandatesLink() throws InterruptedException {
		mandateManagementListMandatesLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementCreateNewMandateLink() throws InterruptedException {
		mandateManagementCreateNewMandateLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementAmendMandateLink() throws InterruptedException {
		amendMandateLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementCancelMandateLink() throws InterruptedException {
		mandateManagementCancelMandateLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementModifyMandateLink() throws InterruptedException {
		modifyMandateLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementApproveMandateLink() throws InterruptedException {
		mandateManagementApproveMandateLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementCreateMMSOutFileLink() throws InterruptedException {
		createMMSOutfileMenu.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementAcceptMandatesLink() throws InterruptedException {
		acceptMandateMenu.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementAcceptEsignMandateLink() throws InterruptedException {
		mandateManagementAcceptEsignMandateLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonMandateManagementMandatesRegenerationLink() throws InterruptedException {
		mandateManagementMandatesRegenerationLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonmandateManagementMandateManualLink() throws InterruptedException {
		mandateManagementMandateManualLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonGuideMandateFlowNPCILink() throws InterruptedException {
		GuideLink.click();
		GuideMandateFlowNPCILink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonGuideMandateInFlowLink() throws InterruptedException {
		GuideMandateInFlowLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonGuideMandateOutFlowLink() throws InterruptedException {
		GuideMandateOutFlowLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonServerFolderViewLink() throws InterruptedException {
		ServerFolderViewLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	// Utility
	public void UtilityLinksDashboardOuterTransactions() throws InterruptedException {

		Utility.click();
		Dashboard.click();
		OutwardTransaction.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksDashboardInwardTransactions() throws InterruptedException {

		InwardTransaction.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksDashboardOutwardMandates() throws InterruptedException {

		OutwardMandates.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksDashboardOutwardAPIMandates() throws InterruptedException {

		OutwardAPIMandates.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksDashboardInwardMandates() throws InterruptedException {

		InwardMandates.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksDashboardInwardAPIMandates() throws InterruptedException {

		InwardAPIMandates.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportEODReconciliation() throws InterruptedException {

		Report.click();
		EODReconciliation.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportdUserActivity() throws InterruptedException {

		UserActivity.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportInwardMandate() throws InterruptedException {

		Mandate.click();
		InwardMandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportOutwardMandate() throws InterruptedException {

		OutwardMandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportUtilityInwardPayments() throws InterruptedException {

		UtilityPayments.click();
		UtilityInwardPayments.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportUtilityOutwardPayments() throws InterruptedException {

		UtilityOutwardPayments.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportChargingBookingReport() throws InterruptedException {

		ChargingReport.click();
		ChargingBookingReport.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportChargingBillingInvoiceReport() throws InterruptedException {

		ChargingBillingInvoiceReport.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportProductivityInwardMandate() throws InterruptedException {

		Productivity.click();
		ProductivityMandate.click();
		ProductivityInwardMandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportdProductivityOutwardMandate() throws InterruptedException {

		ProductivityOutwardMandate.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportSummary() throws InterruptedException {

		Summary.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportAadharMapper() throws InterruptedException {

		AadharMapper.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportCBDTReport() throws InterruptedException {

		CBDTReport.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportReturnMemo() throws InterruptedException {

		ReturnMemo.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void UtilityLinksReportCorporateFundingReport() throws InterruptedException {

		CorporateFundingReport.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	// User Page menu
	public void userPageLinks(SoftAssert sa) throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");

		linkUserMenu.click();
		userList.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("User_View", sa);

		driver.switchTo().frame("toc");
		userAdd.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("User_Add", sa);

		driver.switchTo().frame("toc");
		userModify.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("User_Modify/Repair", sa);

		driver.switchTo().frame("toc");
		linkUserApprove.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("User_Approve", sa);

		driver.switchTo().frame("toc");
		userBlockUnblock.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("User_Block/Unblock", sa);

		driver.switchTo().frame("toc");
		userRemove.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("User_Remove", sa);

		driver.switchTo().frame("toc");
		userReportView.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.handlewin2();

	}

	public void groupPageLinks(SoftAssert sa) throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		groupMenu.click();
		linkGroupList.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Group_List", sa);
		driver.switchTo().frame("toc");
		groupAdd.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Group_Add", sa);
		driver.switchTo().frame("toc");
		linkGroupModify.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Group_Modify", sa);
		driver.switchTo().frame("toc");
		linkGroupApprove.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Group_Approve", sa);
		driver.switchTo().frame("toc");
		linkGroupBlock.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Group_Block", sa);
		driver.switchTo().frame("toc");
		linkGroupUnblock.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Group_Unblock", sa);
		driver.switchTo().frame("toc");
		linkGroupRemove.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Group_Remove", sa);
		driver.switchTo().frame("toc");
		linkGroupReport.click();
		linkGroupReportBuild.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		win.verifyPages("Group_Report_Build", sa);
		driver.switchTo().frame("toc");
		linkGroupReportView.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.handlewin2();
	}

	public void profilePageLinks(SoftAssert sa) throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		profileMenu.click();
		linkProfileList.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		win.verifyPages("Profiles_List", sa);
		driver.switchTo().frame("toc");
		profileAdd.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Profiles_Add", sa);
		driver.switchTo().frame("toc");
		linkProfileModify.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Profiles_Modify/Repair", sa);
		driver.switchTo().frame("toc");
		profileApprove.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		win.verifyPages("Profiles_Approve", sa);
		driver.switchTo().frame("toc");
		linkProfileRemove.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Profiles_Remove", sa);
		driver.switchTo().frame("toc");
		linkProfileReport.click();
		linkProfileReportBuild.click();
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		win.verifyPages("Report_Build", sa);
		driver.switchTo().frame("toc");
		linkProfileReportView.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.handlewin2();
	}

	public void enviornmentPageLinks(SoftAssert sa) throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		environmentLink.click();
		environmentRunLink.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Environment_Run", sa);
		driver.switchTo().frame("toc");
		linkShow.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("Environment_Show", sa);
	}

	// Application Support Tools
	public void applicationSupportLinks(SoftAssert sa) throws InterruptedException, ParserConfigurationException {
		Windowhandle win = new Windowhandle(driver);
		driver.switchTo().frame("toc");
		linkApplicationSupport.click();
		linkSpaceDump.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Application_Support_Tools_Space_Dump", sa);

		driver.switchTo().frame("toc");
		linkSpaceRebuild.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Application_Support_Tools_Space_Rebuild", sa);

		driver.switchTo().frame("toc");
		linkSystemInfo.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Application_Support_Tools_System_Info", sa);

		driver.switchTo().frame("toc");
		linkTraceLevelInfo.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Application_Support_Tools_TraceFile_Levels", sa);

		driver.switchTo().frame("toc");
		linkDBExplorer.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Application_Support_Tools_DB_Explorer.", sa);

		driver.switchTo().frame("toc");
		linkLockMgmt.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Application_Support_Tools_Lock_Management", sa);

		driver.switchTo().frame("toc");
		linkLogExplorer.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Application_Support_Tools_Log_Explorer", sa);

		driver.switchTo().frame("toc");
		linkParamConstants.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Application_Support_Tools_Param_Constants", sa);

		driver.switchTo().frame("toc");
		linkBranchUnitAttributes.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Application_Support_Tools_List_Branch_Details", sa);

		driver.switchTo().frame("toc");
		linkUploadMandates.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Application_Support_Tools_Upload_Mandates", sa);

	}

	public void systemPage(SoftAssert sa) throws InterruptedException, ParserConfigurationException {
		administrationMenu.click();
		systemMenu.click();
		logViewMenu.click();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(Constants. PAGE_LOAD_TIMEOUT,
		 * TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT,
		 * TimeUnit.SECONDS);
		 */

		Thread.sleep(IntfConstants.TIMEOUT);
		win.verifyPages("System_Log_View", sa);
		driver.switchTo().frame("toc");
		HouseKeepingMenu.click();
		SecurityParametersMenu.click();
		SecurityParametersViewMenu.click();
		win.verifyPages("SecurityParameters_View", sa);
		driver.switchTo().frame("toc");
		SecurityParametersModifyMenu.click();
		win.verifyPages("SecurityParameters_Modify", sa);
		driver.switchTo().frame("toc");
		SecurityParametersApproveMenu.click();
		win.verifyPages("SecurityParameters_Approve", sa);
	}

	// // Application
	public CalendarPage ClickonApproveCalendarLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		calendarLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		calendarApproveLink.click();
		return new CalendarPage();
	}

	public CalendarPage ClickonViewCalendarLink() throws InterruptedException {
		applicationLink.click();
		maintenanceLink.click();
		calendarLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		calendarViewLink.click();
		return new CalendarPage();
	}

	public void ClickonCalendarViewLink() throws InterruptedException {
		calendarLink.click();
		calendarViewLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCalendarCreateLink() throws InterruptedException {
		calendarCreateLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCalendarModifyLink() throws InterruptedException {
		CALENDARModifyLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonCalendarApproveLink() throws InterruptedException {
		calendarApproveLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	// List Mandate
	public CreateONUSMandate ListMandate() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		mandateManagementListMandatesLink.click();
		win.handlewin();
		return new CreateONUSMandate();
	}
	// Amend Mandates

	public AmendONUSMandate AmendMandate() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		amendMandateLink.click();
		win.handlewin();
		return new AmendONUSMandate();

	}

	public AmendONUSMandate onusapproveAmendMandate() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		mandateManagementApproveMandateLink.click();
		win.handlewin();
		return new AmendONUSMandate();

	}

	public AmendONUSMandate AmendCreateMMS() throws InterruptedException {
		createMMSOutfileMenu.click();
		win.handlewin();
		return new AmendONUSMandate();
	}

	public AmendONUSMandate ListAmendMandate() throws InterruptedException {
		mandateManagementListMandatesLink.click();
		win.handlewin();
		return new AmendONUSMandate();
	}

	public AmendONUSMandate ModifyMandate() throws InterruptedException {
		modifyMandateLink.click();
		win.handlewin();
		return new AmendONUSMandate();
	}

	// Create MMS
	public CreateONUSMandate CreateMMS() throws InterruptedException {
		applicationLink.click();
		mandateManagementLink.click();
		createMMSOutfileMenu.click();
		win.handlewin();
		return new CreateONUSMandate();
	}

	// Session
	public void ClickonSessionPasswordLink() throws InterruptedException, Exception {
		sessionLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		passwordLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonSessionLogoutLink() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logoutLink.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	}

	public void ClickonLogoutBtn() throws InterruptedException {
		logoutBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logoutOKBtn.click();
	}
}
