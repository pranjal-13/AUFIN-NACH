package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aufin.qa.base.TestBase;

public class ProfilePage extends TestBase{

	// Add page Xpath
		@FindBy(xpath   = "//*[@id='pageBody']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input")
		WebElement txtName;

		@FindBy(xpath = "//*[@id='checkAllBtn']")
		WebElement btnChkAll;

		// Enviornment Menus Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[41]/td[8]/input")
		WebElement chkBoxEnvRun;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[42]/td[8]/input")
		WebElement chkBoxEnvShow;

		// Distribution Set Menus xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[47]/td[8]/input")
		WebElement chkBoxDistbSetList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[48]/td[8]/input")
		WebElement chkBoxDistSetAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[50]/td[8]/input")
		WebElement chkBoxDistSetModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[51]/td[8]/input")
		WebElement chkBoxDistSetDelete;

		// Schedule Menus Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[55]/td[8]/input")
		WebElement chkBoxSchdlList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[56]/td[8]/input")
		WebElement chkBoxSchdNew;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[57]/td[8]/input")
		WebElement chkBoxSchdModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[58]/td[8]/input")
		WebElement chkBoxSchdControl;

		// Calendar Menus Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[64]/td[8]/input")
		WebElement chkBoxCalView;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[65]/td[8]/input")
		WebElement chkBoxCalCreate;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[66]/td[8]/input")
		WebElement chkBoxCalModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[68]/td[8]/input")
		WebElement chkBoxCalDelete;

		// Parameter Maintenance Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[69]/td[8]/input")
		WebElement chkBoxParaMaint;

		// Payment Menus Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[156]/td[8]/input")
		WebElement chkBoxPaymtList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[157]/td[8]/input")
		WebElement chkBoxPaymtEnter;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[158]/td[8]/input")
		WebElement chkBoxPaymtRepair;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[159]/td[8]/input")
		WebElement chkBoxPaymtDuplicate;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[160]/td[8]/input")
		WebElement chkBoxPaymtQualify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[161]/td[8]/input")
		WebElement chkBoxPaymtProcessfuture;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[162]/td[8]/input")
		WebElement chkBoxPaymtException;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[164]/td[8]/input")
		WebElement chkBoxPaymtVerify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[165]/td[8]/input")
		WebElement chkBoxPaymtReturn;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[166]/td[8]/input")
		WebElement chkBoxPaymtRelease;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[167]/td[8]/input")
		WebElement chkBoxPaymtBoUser;

		// File Manager Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[186]/td[8]/input")
		WebElement chkBoxFileMgrTranUpload;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[187]/td[8]/input")
		WebElement chkBoxFileMgrChqOutwardUpload;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[188]/td[8]/input")
		WebElement chkBoxFileMgrChqInwUpload;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[190]/td[8]/input")
		WebElement chkBoxFileMgrList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[191]/td[8]/input")
		WebElement chkBoxFileMgrRtnACH;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[192]/td[8]/input")
		WebElement chkBoxFileMgrRtnChqFile;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[193]/td[8]/input")
		WebElement chkBoxFileMgrZPOResponseBulk;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[194]/td[8]/input")
		WebElement chkBoxFileMgrServerFolderView;

		// Mandate Management
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[197]/td[8]/input")
		WebElement chkBoxMndtLoadCustomrFile;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[198]/td[8]/input")
		WebElement chkBoxMndtInitialLoad;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[199]/td[8]/input")
		WebElement chkBoxMndtImgMapping;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[200]/td[8]/input")
		WebElement chkBoxMndtList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[201]/td[8]/input")
		WebElement chkBoxMndtCreate;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[203]/td[8]/input")
		WebElement chkBoxMndtModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[204]/td[8]/input")
		WebElement chkBoxMndtAmend;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[205]/td[8]/input")
		WebElement chkBoxMndtCancel;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[206]/td[8]/input")
		WebElement chkBoxMndtAccept;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[207]/td[8]/input")
		WebElement chkBoxMndtAcceptEsign;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[208]/td[8]/input")
		WebElement chkBoxMndtReject;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[209]/td[8]/input")
		WebElement chkBoxMndtCreateMMSOutFile;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[210]/td[8]/input")
		WebElement chkBoxMndtRegeneration;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[211]/td[8]/input")
		WebElement chkBoxMndtRecreateMMSOutfile;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[213]/td[8]/input")
		WebElement chkBoxMndtInwardReport;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[214]/td[8]/input")
		WebElement chkBoxMndtOutwardReport;

		// Monitors Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[223]/td[8]/input")
		WebElement chkBoxMoneyTransferMonitors;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[224]/td[8]/input")
		WebElement chkBoxPaymentTypeMonitor;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[225]/td[8]/input")
		WebElement chkBoxSummaryPositionMonitor;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[227]/td[8]/input")
		WebElement chkBoxStatusDisplaySet;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[228]/td[8]/input")
		WebElement chkBoxPaymentTypeDisplaySet;

		// Account Management Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[231]/td[8]/input")
		WebElement chkBoxCustomerList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[233]/td[8]/input")
		WebElement chkBoxCustomerModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[235]/td[8]/input")
		WebElement chkBoxAccountList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[237]/td[8]/input")
		WebElement chkBoxAccountModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[238]/td[8]/input")
		WebElement chkBoxAccountChangeBalance;

		// Swift Code Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[240]/td[8]/input")
		WebElement chkBoxSwiftList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[241]/td[8]/input")
		WebElement chkBoxSwiftAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[243]/td[8]/input")
		WebElement chkBoxSwiftModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[244]/td[8]/input")
		WebElement chkBoxSwiftDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[245]/td[8]/input")
		WebElement chkBoxSwiftCnfmDelete;

		// IFSC List Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[247]/td[8]/input")
		WebElement chkBoxIFSClist;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[248]/td[8]/input")
		WebElement chkBoxIFSCAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[250]/td[8]/input")
		WebElement chkBoxIFSCModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[251]/td[8]/input")
		WebElement chkBoxIFSCDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[252]/td[8]/input")
		WebElement chkBoxIFSCCnfmDelete;

		// Db loads xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[253]/td[8]/input")
		WebElement chkBoxDbLoad;

		// Dealer Code
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[255]/td[8]/input")
		WebElement chkBoxDealerList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[256]/td[8]/input")
		WebElement chkBoxDealerAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[258]/td[8]/input")
		WebElement chkBoxDealerModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[259]/td[8]/input")
		WebElement chkBoxDealerDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[260]/td[8]/input")
		WebElement chkBoxDealerCnfDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[261]/td[8]/input")
		WebElement chkBoxDealerUpload;

		// NBIN Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[263]/td[8]/input")
		WebElement chkBoxNBINList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[264]/td[8]/input")
		WebElement chkBoxNBINAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[266]/td[8]/input")
		WebElement chkBoxNBINModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[267]/td[8]/input")
		WebElement chkBoxNBINDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[268]/td[8]/input")
		WebElement chkBoxNBIBCnfmDelete;

		// DashBoard Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[270]/td[8]/input")
		WebElement chkBoxSummaryDashboard;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[271]/td[8]/input")
		WebElement chkFileDashBoard;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[272]/td[8]/input")
		WebElement chkN04BatchDashboard;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[273]/td[8]/input")
		WebElement chkOutwardMandate;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[274]/td[8]/input")
		WebElement chkInwardMandate;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[275]/td[8]/input")
		WebElement chkInwardTransaction;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[276]/td[8]/input")
		WebElement chkIMPSDashbrd;

		// Report Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[278]/td[8]/input")
		WebElement chkBoxTransactionReport;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[279]/td[8]/input")
		WebElement chkBoxFIRC;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[280]/td[8]/input")
		WebElement chkBoxFormA3;

		// Charges
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[283]/td[8]/input")
		WebElement chkBoxChargeList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[284]/td[8]/input")
		WebElement chkBoxChargeAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[285]/td[8]/input")
		WebElement chkBoxChargeModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[286]/td[8]/input")
		WebElement chkBoxChargeDelete;

		// Customer Charges Menus Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[289]/td[8]/input")
		WebElement chkBoxCustChargeList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[290]/td[8]/input")
		WebElement chkBoxCustChargeMaintain;

		// Prompts Menus Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[293]/td[8]/input")
		WebElement chkBoxPromptList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[294]/td[8]/input")
		WebElement chkBoxPromptAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[295]/td[8]/input")
		WebElement chkBoxPromptModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[296]/td[8]/input")
		WebElement chkBoxPromptDelete;

		// Categories
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[299]/td[8]/input")
		WebElement chkBoxCategoryList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[300]/td[8]/input")
		WebElement chkBoxCategoryAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[301]/td[8]/input")
		WebElement chkBoxCategoryModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[302]/td[8]/input")
		WebElement chkBoxCategoryDelete;

		// CutOffs
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[312]/td[8]/input")
		WebElement chkBoxCutOfflist;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[313]/td[8]/input")
		WebElement chkBoxCutOffAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[314]/td[8]/input")
		WebElement chkBoxModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[315]/td[8]/input")
		WebElement chkBoxDelete;

		// Free Format Template Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[333]/td[8]/input")
		WebElement chkBoxFreeFmtList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[334]/td[8]/input")
		WebElement chkBoxFreeFmtAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[335]/td[8]/input")
		WebElement chkBoxFreeFmtCopy;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[337]/td[8]/input")
		WebElement chkBoxFreeFmtModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[338]/td[8]/input")
		WebElement chkBoxFreeFmtDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[339]/td[8]/input")
		WebElement chkBoxFreeFmtcnfmDelete;

		// Generic File Writer Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[341]/td[8]/input")
		WebElement chkBoxGenericList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[342]/td[8]/input")
		WebElement chkBoxGenericAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[343]/td[8]/input")
		WebElement chkBoxGenericCopy;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[345]/td[8]/input")
		WebElement chkBoxGenericModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[346]/td[8]/input")
		WebElement chkBoxGenericDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[347]/td[8]/input")
		WebElement chkBoxGenericCnfmDelete;

		// Search Criteria Template Transaction Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[350]/td[8]/input")
		WebElement chkBoxSearchCriteriaList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[351]/td[8]/input")
		WebElement chkBoxSearchCriteriaAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[353]/td[8]/input")
		WebElement chkBoxSearchCriteriaModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[354]/td[8]/input")
		WebElement chkBoxSearchCriteriaDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[355]/td[8]/input")
		WebElement chkBoxSearchCriteriaCnfmDelete;

		// Search Criteria Template Mandate Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[357]/td[8]/input")
		WebElement chkBoxSearchMndtList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[358]/td[8]/input")
		WebElement chkBoxSearchMndtAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[360]/td[8]/input")
		WebElement chkBoxSearchMndtModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[361]/td[8]/input")
		WebElement chkBoxSearchMndtDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[362]/td[8]/input")
		WebElement chkBoxSearchMndtCnfmDelete;

		// Report Template Transaction Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[365]/td[8]/input")
		WebElement chkBoxReportList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[366]/td[8]/input")
		WebElement chkBoxReportAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[368]/td[8]/input")
		WebElement chkBoxReportModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[369]/td[8]/input")
		WebElement chkBoxReportDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[370]/td[8]/input")
		WebElement chkBoxReportCnfmDelete;

		// Report Template Mandate Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[372]/td[8]/input")
		WebElement chkBoxReportMndtList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[373]/td[8]/input")
		WebElement chkBoxReportMndtAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[375]/td[8]/input")
		WebElement chkBoxReportMndtModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[376]/td[8]/input")
		WebElement chkBoxReportMndtDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[377]/td[8]/input")
		WebElement chkBoxReportMndtCnfmDelete;

		// Advice Template Menu Xpath
		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[379]/td[8]/input")
		WebElement chkBoxAdviceList;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[380]/td[8]/input")
		WebElement chkBoxAdviceAdd;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[382]/td[8]/input")
		WebElement chkBoxAdviceModify;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[383]/td[8]/input")
		WebElement chkBoxAdviceDelete;

		@FindBy(xpath = "//*[@id=\"cacib-gps-menu\"]/table/tbody/tr[384]/td[8]/input")
		WebElement chkBoxAdviceCnfmDelete;

		@FindBy(xpath = "//*[@id='pageBody']/table/tbody/tr/td/table/tbody/tr[3]/td/input[3]")
		WebElement btnOk;

		@FindBy(xpath = "//*[@id=\"pageBody\"]/form/p/input[2]")
		WebElement btnConfirmOk;

		// logoutbtn
		@FindBy(xpath = "//*[@id=\"logoutButtonId\"]")
		WebElement btnLogout;

		// External logout btn
		@FindBy(name = "logoutBtn1")
		WebElement extBtnLogout;

		// Approve Page Xpath
		@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
		WebElement approveProfile;
		
		@FindBy(xpath = "//*[@id='pageBody']/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
		WebElement okaybuttonProfile;

		@FindBy(name = "approve")
		WebElement confirmApprove;

		public ProfilePage() {
			PageFactory.initElements(driver, this);

		}
		

		public void addProfileMaker(String profileName) {
			txtName.sendKeys(profileName);
	/*		chkBoxEnvRun.click();
			chkBoxEnvShow.click();
			chkBoxDistbSetList.click();
			chkBoxDistSetAdd.click();
			chkBoxDistSetModify.click();
			chkBoxDistSetDelete.click();
			chkBoxSchdlList.click();
			chkBoxSchdNew.click();
			chkBoxSchdModify.click();
			chkBoxSchdControl.click();
			// Calendar Menus Xpath
			chkBoxCalView.click();
			chkBoxCalCreate.click();
			chkBoxCalModify.click();
			chkBoxCalDelete.click();
			chkBoxParaMaint.click();

			// Payment
			chkBoxPaymtList.click();
			chkBoxPaymtEnter.click();
			chkBoxPaymtRepair.click();
			chkBoxPaymtDuplicate.click();
			chkBoxPaymtQualify.click();
			chkBoxPaymtProcessfuture.click();
			chkBoxPaymtException.click();
			chkBoxPaymtVerify.click();
			chkBoxPaymtReturn.click();
			chkBoxPaymtRelease.click();
			chkBoxPaymtBoUser.click();

			// File Manager
			chkBoxFileMgrTranUpload.click();

			chkBoxFileMgrChqOutwardUpload.click();

			chkBoxFileMgrChqInwUpload.click();

			chkBoxFileMgrList.click();

			chkBoxFileMgrRtnACH.click();

			chkBoxFileMgrRtnChqFile.click();

			chkBoxFileMgrZPOResponseBulk.click();

			chkBoxFileMgrServerFolderView.click();

			// Mandate
			chkBoxMndtLoadCustomrFile.click();

			chkBoxMndtInitialLoad.click();

			chkBoxMndtImgMapping.click();

			chkBoxMndtList.click();

			chkBoxMndtCreate.click();

			chkBoxMndtModify.click();

			chkBoxMndtAmend.click();

			chkBoxMndtCancel.click();

			chkBoxMndtAccept.click();

			chkBoxMndtAcceptEsign.click();

			chkBoxMndtReject.click();
			chkBoxMndtCreateMMSOutFile.click();

			chkBoxMndtRegeneration.click();

			chkBoxMndtRecreateMMSOutfile.click();

			chkBoxMndtInwardReport.click();
			chkBoxMndtOutwardReport.click();

			// Monitors Menu Xpath
			chkBoxMoneyTransferMonitors.click();

			chkBoxPaymentTypeMonitor.click();

			chkBoxSummaryPositionMonitor.click();

			chkBoxStatusDisplaySet.click();

			chkBoxPaymentTypeDisplaySet.click();

			// Account Management Xpath
			chkBoxCustomerList.click();

			chkBoxCustomerModify.click();

			chkBoxAccountList.click();

			chkBoxAccountModify.click();

			chkBoxAccountChangeBalance.click();

			// Swift Code Menu Xpath
			chkBoxSwiftList.click();

			chkBoxSwiftAdd.click();

			chkBoxSwiftModify.click();

			chkBoxSwiftDelete.click();

			chkBoxSwiftCnfmDelete.click();

			// IFSC List Menu Xpath
			chkBoxIFSClist.click();

			chkBoxIFSCAdd.click();

			chkBoxIFSCModify.click();

			chkBoxIFSCDelete.click();

			chkBoxIFSCCnfmDelete.click();

			// Db loads xpath
			chkBoxDbLoad.click();

			// Dealer Code
			chkBoxDealerList.click();

			chkBoxDealerAdd.click();
			chkBoxDealerModify.click();

			chkBoxDealerDelete.click();

			chkBoxDealerCnfDelete.click();

			chkBoxDealerUpload.click();

			// NBIN Menu Xpath
			chkBoxNBINList.click();

			chkBoxNBINAdd.click();

			chkBoxNBINModify.click();

			chkBoxNBINDelete.click();

			chkBoxNBIBCnfmDelete.click();

			// DashBoard Menu Xpath
			chkBoxSummaryDashboard.click();

			chkFileDashBoard.click();

			chkN04BatchDashboard.click();

			chkOutwardMandate.click();

			chkInwardMandate.click();

			chkInwardTransaction.click();

			chkIMPSDashbrd.click();

			// Report Menu Xpath
			chkBoxTransactionReport.click();

			chkBoxFIRC.click();

			chkBoxFormA3.click();

			// Charges
			chkBoxChargeList.click();

			chkBoxChargeAdd.click();

			chkBoxChargeModify.click();

			chkBoxChargeDelete.click();

			// Customer Charges Menus Xpath
			chkBoxCustChargeList.click();

			chkBoxCustChargeMaintain.click();

			// Prompts Menus Xpath
			chkBoxPromptList.click();

			chkBoxPromptAdd.click();

			chkBoxPromptModify.click();

			chkBoxPromptDelete.click();

			// Categories
			chkBoxCategoryList.click();

			chkBoxCategoryAdd.click();

			chkBoxCategoryModify.click();

			chkBoxCategoryDelete.click();

			// CutOffs
			chkBoxCutOfflist.click();

			chkBoxCutOffAdd.click();

			chkBoxModify.click();

			chkBoxDelete.click();

			// Free Format Template Menu Xpath
			chkBoxFreeFmtList.click();

			chkBoxFreeFmtAdd.click();

			chkBoxFreeFmtCopy.click();

			chkBoxFreeFmtModify.click();

			chkBoxFreeFmtDelete.click();

			chkBoxFreeFmtcnfmDelete.click();

			// Generic File Writer Menu Xpath
			chkBoxGenericList.click();

			chkBoxGenericAdd.click();

			chkBoxGenericCopy.click();

			chkBoxGenericModify.click();

			chkBoxGenericDelete.click();

			chkBoxGenericCnfmDelete.click();

			// Search Criteria Template Transaction Menu Xpath
			chkBoxSearchCriteriaList.click();

			chkBoxSearchCriteriaAdd.click();

			chkBoxSearchCriteriaModify.click();

			chkBoxSearchCriteriaDelete.click();

			chkBoxSearchCriteriaCnfmDelete.click();

			// Search Criteria Template Mandate Menu Xpath
			chkBoxSearchMndtList.click();

			chkBoxSearchMndtAdd.click();

			chkBoxSearchMndtModify.click();

			chkBoxSearchMndtDelete.click();

			chkBoxSearchMndtCnfmDelete.click();

			// Report Template Transaction Menu Xpath
			chkBoxReportList.click();

			chkBoxReportAdd.click();

			chkBoxReportModify.click();

			chkBoxReportDelete.click();

			chkBoxReportCnfmDelete.click();

			// Report Template Mandate Menu Xpath
			chkBoxReportMndtList.click();

			chkBoxReportMndtAdd.click();

			chkBoxReportMndtModify.click();

			chkBoxReportMndtDelete.click();

			chkBoxReportMndtCnfmDelete.click();

			// Advice Template Menu Xpath
			chkBoxAdviceList.click();

			chkBoxAdviceAdd.click();

			chkBoxAdviceModify.click();

			chkBoxAdviceDelete.click();

			chkBoxAdviceCnfmDelete.click();
*/			
			btnChkAll.click();
			btnOk.click();
			btnConfirmOk.click();
			btnLogout.click();
			extBtnLogout.click();

		}
/*
		public void addProfileChecker(String profileName) {
			txtName.sendKeys(profileName);
			btnChkAll.click();
			btnOk.click();
			btnConfirmOk.click();
			btnLogout.click();
			extBtnLogout.click();
		}
*/
		public ProfilePage approveProfile() {
			okaybuttonProfile.click();
			approveProfile.click();
			confirmApprove.click();
			btnLogout.click();
			extBtnLogout.click();

			return new ProfilePage();

		}
	}
