package com.aufin.qa.pages;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;

public class EnvironmentPage extends TestBase {
	
	Windowhandle win = new Windowhandle(driver);
	
	@FindBy(id = "in,in/auFin_nach,in/auFin_nach/gps:sodExecutor")
	WebElement sodcheckbox;

	@FindBy(id = "TRin,in/auFin_nach,in/auFin_nach/gps:sodExecutorc2")
	WebElement sodStatus;

	@FindBy(id = "TRin,in/auFin_nach,in/auFin_nach/gps:eodExecutorc2")
	WebElement eodStatus;

	@FindBy(id = "modalDialogContinue")
	WebElement continuebutton;

	@FindBy(xpath = "//*[@id=\"preconditionEnforceAdvice\"]/table/tbody/tr/td[2]/input")
	WebElement manageBtn;

	@FindBy(name = "env.run.continue")
	WebElement returnButton;

	@FindBy(id = "in,in/auFin_nach,in/auFin_nach/gps:eodExecutor")
	WebElement eodcheckbox;

	@FindBy(id = "in,in/auFin_nach,in/auFin_nach/gps")
	WebElement bdcheckbox;

	@FindBy(id = "SET_BUSINESS_DATE_ACTION")
	WebElement setBusinessDateButton;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
	WebElement bdSubmitbutton;

	@FindBy(id = "SWITCH_RESOURCE_ACTION")
	WebElement switchResourceButton;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[2]/td/input[2]")
	WebElement environmentokbutton;

	@FindBy(xpath = "//*[@id='adviceId' and @class='visible']")
	WebElement buttonVisibility;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps:envEventServerc2")
	WebElement envEventServerstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps:envEventServer")
	WebElement envEventServercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps:emailServerc2")
	WebElement emailServerstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps:emailServer")
	WebElement emailServercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NPCI_Upload_Serverc2")
	WebElement NPCI_Upload_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NPCI_Upload_Server")
	WebElement NPCI_Upload_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NPCI_Download_Serverc2")
	WebElement NPCI_Download_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NPCI_Download_Server")
	WebElement NPCI_Download_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:File_Router_Serverc2")
	WebElement File_Router_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:File_Router_Server")
	WebElement File_Router_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:MMS_InFile_Serverc2")
	WebElement MMS_InFile_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:MMS_InFile_Server")
	WebElement MMS_InFile_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:MMS_InProcess_Serverc2")
	WebElement MMS_InProcess_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:MMS_InProcess_Server")
	WebElement MMS_InProcess_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:MMS_OutFileCreate_Serverc2")
	WebElement MMS_OutFileCreate_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:MMS_OutFileCreate_Server")
	WebElement MMS_OutFileCreate_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:EsignMandateVerificationServerc2")
	WebElement EsignMandateVerificationServerstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:EsignMandateVerificationServer")
	WebElement EsignMandateVerificationServercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:API_Mandate_TAT_Check_Serverc2")
	WebElement API_Mandate_TAT_Check_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:API_Mandate_TAT_Check_Server")
	WebElement API_Mandate_TAT_Check_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:API_Mandate_File_Create_Serverc2")
	WebElement API_Mandate_File_Create_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:API_Mandate_File_Create_Server")
	WebElement API_Mandate_File_Create_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:API_Mandate_File_Process_Serverc2")
	WebElement API_Mandate_File_Process_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:API_Mandate_File_Process_Server")
	WebElement API_Mandate_File_Process_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:DBTL_InFile_Serverc2")
	WebElement DBTL_InFile_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:DBTL_InFile_Server")
	WebElement DBTL_InFile_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:DBTL_InProcess_Serverc2")
	WebElement DBTL_InProcess_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:DBTL_InProcess_Server")
	WebElement DBTL_InProcess_Servercheckbox;

	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:DBTL_AccountVerification_Serverc2")
	WebElement DBTL_AccountVerification_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:DBTL_AccountVerification_Server")
	WebElement DBTL_AccountVerification_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:DBTL_OutFileCreate_Serverc2")
	WebElement DBTL_OutFileCreate_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:DBTL_OutFileCreate_Server")
	WebElement DBTL_OutFileCreate_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBDT_InFile_Serverc2")
	WebElement CBDT_InFile_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBDT_InFile_Server")
	WebElement CBDT_InFile_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBDT_InProcess_Serverc2")
	WebElement CBDT_InProcess_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBDT_InProcess_Server")
	WebElement CBDT_InProcess_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBDT_OutFile_Serverc2")
	WebElement CBDT_OutFile_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBDT_OutFile_Server")
	WebElement CBDT_OutFile_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBDT_Posting_Serverc2")
	WebElement CBDT_Posting_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBDT_Posting_Server")
	WebElement CBDT_Posting_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NACH_InFile_Serverc2")
	WebElement NACH_InFile_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NACH_InFile_Server")
	WebElement NACH_InFile_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NACH_InProcess_Serverc2")
	WebElement NACH_InProcess_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NACH_InProcess_Server")
	WebElement NACH_InProcess_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NACH_OutProcess_Serverc2")
	WebElement NACH_OutProcess_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NACH_OutProcess_Server")
	WebElement NACH_OutProcess_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:ReversalAccounting_Serverc2")
	WebElement ReversalAccounting_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:ReversalAccounting_Server")
	WebElement ReversalAccounting_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NACH_OutFileCreate_Serverc2")
	WebElement NACH_OutFileCreate_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:NACH_OutFileCreate_Server")
	WebElement NACH_OutFileCreate_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Corporate_InFile_Serverc2")
	WebElement Corporate_InFile_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Corporate_InFile_Server")
	WebElement Corporate_InFile_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Corporate_InProcess_Serverc2")
	WebElement Corporate_InProcess_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Corporate_InProcess_Server")
	WebElement Corporate_InProcess_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBS_Posting_Server_NACHc2")
	WebElement CBS_Posting_Server_NACHstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBS_Posting_Server_NACH")
	WebElement CBS_Posting_Server_NACHcheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBS_Posting_Server_Inwardc2")
	WebElement CBS_Posting_Server_Inwardstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBS_Posting_Server_Inward")
	WebElement CBS_Posting_Server_Inwardcheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBS_Posting_Server_CORPc2")
	WebElement CBS_Posting_Server_CORPstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:CBS_Posting_Server_CORP")
	WebElement CBS_Posting_Server_CORPcheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Corporate_Funding_Posting_Server_CORPc2")
	WebElement Corporate_Funding_Posting_Server_CORPstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Corporate_Funding_Posting_Server_CORP")
	WebElement Corporate_Funding_Posting_Server_CORPcheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:AadharMapper_InFile_Serverc2")
	WebElement AadharMapper_InFile_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:AadharMapper_InFile_Server")
	WebElement AadharMapper_InFile_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:AadharMapper_InProcess_Serverc2")
	WebElement AadharMapper_InProcess_Serverstatus;

	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:AadharMapper_InProcess_Server")
	WebElement AadharMapper_InProcess_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:AadharMapper_OutFileProcess_Serverc2")
	WebElement AadharMapper_OutFileProcess_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:AadharMapper_OutFileProcess_Server")
	WebElement AadharMapper_OutFileProcess_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Mandate_Alert_Serverc2")
	WebElement Mandate_Alert_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Mandate_Alert_Server")
	WebElement Mandate_Alert_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Transaction_Alert_Serverc2")
	WebElement Transaction_Alert_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Transaction_Alert_Server")
	WebElement Transaction_Alert_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Sms_Alert_Serverc2")
	WebElement Sms_Alert_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:Sms_Alert_Server")
	WebElement Sms_Alert_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:AadharMapper_Alert_Serverc2")
	WebElement AadharMapper_Alert_Serverstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:AadharMapper_Alert_Server")
	WebElement AadharMapper_Alert_Servercheckbox;
	
	@FindBy(id="TRin,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:ESIGNMMSInFileServerc2")
	WebElement ESIGNMMSInFileServerstatus;
	
	@FindBy(id="in,in/auFin_nach,in/auFin_nach/gps,in/auFin_nach/gps:ESIGNMMSInFileServer")
	WebElement ESIGNMMSInFileServercheckbox;

	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;

	public EnvironmentPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickonEnvironmentokbutton(Windowhandle win) throws InterruptedException {
		win.handlewin();
		environmentokbutton.click();
	}

	public void businessDate() throws InterruptedException {
		String Status = sodStatus.getText();
		String StatusEod = eodStatus.getText();
		if (Status.equals("Not Performed") && StatusEod.equals("Not Performed")) {
			bdcheckbox.click();
			setBusinessDateButton.click();
			bdSubmitbutton.click();
			performSOD();
		} else if (Status.equals("Performed") && StatusEod.equals("Not Performed")) {
			System.out.println("SOD is already performed");
		} else if (Status.equals("Performed") && StatusEod.equals("Performed")) {
			System.out.println("SOD is already performed");
			System.out.println("EOD is already performed");
			bdcheckbox.click();
			setBusinessDateButton.click();
			bdSubmitbutton.click();
			performSOD();
		}

	}

	public void returnBtnStatus() throws InterruptedException {
		boolean waitForReturnBtn = true;
		while (waitForReturnBtn) {
			if (null != buttonVisibility) {
				returnButton.click();
				waitForReturnBtn = false;
			} else {
				System.out.println(new Date() + " start time");
				Thread.sleep(IntfConstants.TIMEOUT);
				System.out.println(new Date() + " start time");
			}
		}
	}

	public void performSOD() throws InterruptedException {
		sodcheckbox.click();
		switchResourceButton.click();
		continuebutton.click();
		returnBtnStatus();
	}

	public void checkenvEventServer() throws InterruptedException {
		String statusenvEventServer = envEventServerstatus.getText();
		if (statusenvEventServer.equals("Inactive")) {
			envEventServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkenvEventServer1();
		} else {
			System.out.println("envEventServer is already running");
		}
	}

	public void checkenvEventServer1() {
		String statusenvEventServer = envEventServerstatus.getText();
		if (statusenvEventServer.equals("Active")) {
			System.out.println("envEventServer is started");
		} else {
			System.out.println("envEventServer is failed to start");
		}
	}

	public void checkemailServer() throws InterruptedException {
		String statusemailServer = emailServerstatus.getText();
		if (statusemailServer.equals("Inactive")) {
			emailServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkemailServer1();
		} else {
			System.out.println("emailServer is already running");
		}
	}

	public void checkemailServer1() {
		String statusemailServer = emailServerstatus.getText();
		if (statusemailServer.equals("Active")) {
			System.out.println("emailServer is started");
		} else {
			System.out.println("emailServer is failed to start");
		}
	}

	public void checkNPCI_Upload_Server() throws InterruptedException {
		String statusNPCI_Upload_Server = NPCI_Upload_Serverstatus.getText();
		if (statusNPCI_Upload_Server.equals("Inactive")) {
			NPCI_Upload_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkNPCI_Upload_Server1();
		} else {
			System.out.println("NPCI_Upload_Server is already running");
		}
	}

	public void checkNPCI_Upload_Server1() {
		String statusNPCI_Upload_Server = NPCI_Upload_Serverstatus.getText();
		if (statusNPCI_Upload_Server.equals("Active")) {
			System.out.println("NPCI_Upload_Server is started");
		} else {
			System.out.println("NPCI_Upload_Server is failed to start");
		}
	}

	public void checkNPCI_Download_Server() throws InterruptedException {
		String statusNPCI_Download_Server = NPCI_Download_Serverstatus.getText();
		if (statusNPCI_Download_Server.equals("Inactive")) {
			NPCI_Download_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkNPCI_Download_Server1();
		} else {
			System.out.println("NPCI_Download_Server is already running");
		}
	}

	public void checkNPCI_Download_Server1() {
		String statusNPCI_Download_Server = NPCI_Download_Serverstatus.getText();
		if (statusNPCI_Download_Server.equals("Active")) {
			System.out.println("NPCI_Download_Server is started");
		} else {
			System.out.println("NPCI_Download_Server is failed to start");
		}
	}

	public void checkFile_Router_Server() throws InterruptedException {
		String statusFile_Router_Server = File_Router_Serverstatus.getText();
		if (statusFile_Router_Server.equals("Inactive")) {
			File_Router_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkFile_Router_Server1();
		} else {
			System.out.println("File_Router_Server is already running");
		}
	}

	public void checkFile_Router_Server1() {
		String statusFile_Router_Server = File_Router_Serverstatus.getText();
		if (statusFile_Router_Server.equals("Active")) {
			System.out.println("File_Router_Server is started");
		} else {
			System.out.println("File_Router_Server is failed to start");
		}
	}

	public void checkMMS_InFile_Server() throws InterruptedException {
		String statusMMS_InFile_Server = MMS_InFile_Serverstatus.getText();
		if (statusMMS_InFile_Server.equals("Inactive")) {
			MMS_InFile_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkMMS_InFile_Server1();
		} else {
			System.out.println("MMS_InFile_Server is already running");
		}
	}

	public void checkMMS_InFile_Server1() {
		String statusMMS_InFile_Server = MMS_InFile_Serverstatus.getText();
		if (statusMMS_InFile_Server.equals("Active")) {
			System.out.println("MMS_InFile_Server is started");
		} else {
			System.out.println("MMS_InFile_Server is failed to start");
		}
	}

	public void checkMMS_InProcess_Server() throws InterruptedException {
		String statusMMS_InProcess_Server = MMS_InProcess_Serverstatus.getText();
		if (statusMMS_InProcess_Server.equals("Inactive")) {
			MMS_InProcess_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkMMS_InProcess_Server1();
		} else {
			System.out.println("MMS_InProcess_Server is already running");
		}
	}

	public void checkMMS_InProcess_Server1() {
		String statusCheckMMS_InProcess_Server = MMS_InProcess_Serverstatus.getText();
		if (statusCheckMMS_InProcess_Server.equals("Active")) {
			System.out.println("CheckMMS_InProcess_Server is started");
		} else {
			System.out.println("CheckMMS_InProcess_Server is failed to start");
		}
	}

	public void checkMMS_OutFileCreate_Server() throws InterruptedException {
		String statusMMS_OutFileCreate_Server = MMS_OutFileCreate_Serverstatus.getText();
		if (statusMMS_OutFileCreate_Server.equals("Inactive")) {
			MMS_OutFileCreate_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkMMS_OutFileCreate_Server1();
		} else {
			System.out.println("MMS_OutFileCreate_Server is already running");
		}
	}

	public void checkMMS_OutFileCreate_Server1() {
		String statusMMS_OutFileCreate_Server = MMS_OutFileCreate_Serverstatus.getText();
		if (statusMMS_OutFileCreate_Server.equals("Active")) {
			System.out.println("MMS_OutFileCreate_Server is started");
		} else {
			System.out.println("MMS_OutFileCreate_Server is failed to start");
		}
	}

	public void checkEsignMandateVerificationServer() throws InterruptedException {
		String statusEsignMandateVerificationServer = EsignMandateVerificationServerstatus.getText();
		if (statusEsignMandateVerificationServer.equals("Inactive")) {
			EsignMandateVerificationServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkEsignMandateVerificationServer1();
		} else {
			System.out.println("EsignMandateVerificationServer is already running");
		}
	}

	public void checkEsignMandateVerificationServer1() {
		String statusEsignMandateVerificationServer = EsignMandateVerificationServerstatus.getText();
		if (statusEsignMandateVerificationServer.equals("Active")) {
			System.out.println("EsignMandateVerificationServer is started");
		} else {
			System.out.println("EsignMandateVerificationServer is failed to start");
		}
	}

	public void checkAPI_Mandate_TAT_Check_Server() throws InterruptedException {
		String statusAPI_Mandate_TAT_Check_Server = API_Mandate_TAT_Check_Serverstatus.getText();
		if (statusAPI_Mandate_TAT_Check_Server.equals("Inactive")) {
			API_Mandate_TAT_Check_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAPI_Mandate_TAT_Check_Server1();
		} else {
			System.out.println("API_Mandate_TAT_Check_Server is already running");
		}
	}

	public void checkAPI_Mandate_TAT_Check_Server1() {
		String statusAPI_Mandate_TAT_Check_Server = API_Mandate_TAT_Check_Serverstatus.getText();
		if (statusAPI_Mandate_TAT_Check_Server.equals("Active")) {
			System.out.println("API_Mandate_TAT_Check_Server is started");
		} else {
			System.out.println("API_Mandate_TAT_Check_Server is failed to start");
		}
	}

	public void CheckAPI_Mandate_File_Create_Server() throws InterruptedException {
		String statusAPI_Mandate_File_Create_Server = API_Mandate_File_Create_Serverstatus.getText();
		if (statusAPI_Mandate_File_Create_Server.equals("Inactive")) {
			API_Mandate_File_Create_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAPI_Mandate_File_Create_Server1();
		} else {
			System.out.println("API_Mandate_File_Create_Server is already running");
		}
	}

	public void checkAPI_Mandate_File_Create_Server1() {
		String statusAPI_Mandate_File_Create_Server = API_Mandate_File_Create_Serverstatus.getText();
		if (statusAPI_Mandate_File_Create_Server.equals("Active")) {
			System.out.println("API_Mandate_File_Create_Server is started");
		} else {
			System.out.println("API_Mandate_File_Create_Server is failed to start");
		}
	}

	public void checkAPI_Mandate_File_Process_Server() throws InterruptedException {
		String statusAPI_Mandate_File_Process_Server = API_Mandate_File_Process_Serverstatus.getText();
		if (statusAPI_Mandate_File_Process_Server.equals("Inactive")) {
			API_Mandate_File_Process_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAPI_Mandate_File_Process_Server1();
		} else {
			System.out.println("API_Mandate_File_Process_Server is already running");
		}
	}

	public void checkAPI_Mandate_File_Process_Server1() {
		String statusAPI_Mandate_File_Process_Server = API_Mandate_File_Process_Serverstatus.getText();
		if (statusAPI_Mandate_File_Process_Server.equals("Active")) {
			System.out.println("API_Mandate_File_Process_Server is started");
		} else {
			System.out.println("API_Mandate_File_Process_Server is failed to start");
		}
	}

	public void checkDBTL_InFile_Server() throws InterruptedException {
		String statusDBTL_InFile_Server = DBTL_InFile_Serverstatus.getText();
		if (statusDBTL_InFile_Server.equals("Inactive")) {
			DBTL_InFile_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkDBTL_InFile_Server1();
		} else {
			System.out.println("DBTL_InFile_Server is already running");
		}
	}

	public void checkDBTL_InFile_Server1() {
		String statusDBTL_InFile_Server = DBTL_InFile_Serverstatus.getText();
		if (statusDBTL_InFile_Server.equals("Active")) {
			System.out.println("DBTL_InFile_Server is started");
		} else {
			System.out.println("DBTL_InFile_Server is failed to start");
		}
	}

	public void checkDBTL_InProcess_Server() throws InterruptedException {
		String statusDBTL_InProcess_Server = DBTL_InProcess_Serverstatus.getText();
		if (statusDBTL_InProcess_Server.equals("Inactive")) {
			DBTL_InProcess_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkDBTL_InProcess_Server1();
		} else {
			System.out.println("DBTL_InProcess_Server is already running");
		}
	}

	public void checkDBTL_InProcess_Server1() {
		String statusDBTL_InProcess_Server = DBTL_InProcess_Serverstatus.getText();
		if (statusDBTL_InProcess_Server.equals("Active")) {
			System.out.println("DBTL_InProcess_Server is started");
		} else {
			System.out.println("DBTL_InProcess_Server is failed to start");
		}
	}

	public void checkDBTL_AccountVerification_Server() throws InterruptedException {
		String statusDBTL_AccountVerification_Server = DBTL_AccountVerification_Serverstatus.getText();
		if (statusDBTL_AccountVerification_Server.equals("Inactive")) {
			DBTL_AccountVerification_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkDBTL_AccountVerification_Server1();
		} else {
			System.out.println("DBTL_AccountVerification_Server is already running");
		}
	}

	public void checkDBTL_AccountVerification_Server1() {
		String statusDBTL_AccountVerification_Server = DBTL_AccountVerification_Serverstatus.getText();
		if (statusDBTL_AccountVerification_Server.equals("Active")) {
			System.out.println("DBTL_AccountVerification_Server is started");
		} else {
			System.out.println("DBTL_AccountVerification_Server is failed to start");
		}
	}

	public void checkDBTL_OutFileCreate_Server() throws InterruptedException {
		String statusDBTL_OutFileCreate_Server = DBTL_OutFileCreate_Serverstatus.getText();
		if (statusDBTL_OutFileCreate_Server.equals("Inactive")) {
			DBTL_OutFileCreate_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkDBTL_OutFileCreate_Server1();
		} else {
			System.out.println("DBTL_OutFileCreate_Server is already running");
		}
	}

	public void checkDBTL_OutFileCreate_Server1() {
		String statusDBTL_OutFileCreate_Server = DBTL_OutFileCreate_Serverstatus.getText();
		if (statusDBTL_OutFileCreate_Server.equals("Active")) {
			System.out.println("DBTL_OutFileCreate_Server is started");
		} else {
			System.out.println("DBTL_OutFileCreate_Server is failed to start");
		}
	}

	public void checkCBDT_InFile_Server() throws InterruptedException {
		String statusCBDT_InFile_Server = CBDT_InFile_Serverstatus.getText();
		if (statusCBDT_InFile_Server.equals("Inactive")) {
			CBDT_InFile_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCBDT_InFile_Server1();
		} else {
			System.out.println("CBDT_InFile_Server is already running");
		}
	}

	public void checkCBDT_InFile_Server1() {
		String statusCBDT_InFile_Server = CBDT_InFile_Serverstatus.getText();
		if (statusCBDT_InFile_Server.equals("Active")) {
			System.out.println("CBDT_InFile_Server is started");
		} else {
			System.out.println("CBDT_InFile_Server is failed to start");
		}
	}

	public void checkCBDT_InProcess_Server() throws InterruptedException {
		String statusCBDT_InProcess_Server = CBDT_InProcess_Serverstatus.getText();
		if (statusCBDT_InProcess_Server.equals("Inactive")) {
			CBDT_InProcess_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCBDT_InProcess_Server1();
		} else {
			System.out.println("CBDT_InProcess_Server is already running");
		}
	}

	public void checkCBDT_InProcess_Server1() {
		String statusCBDT_InProcess_Server = CBDT_InProcess_Serverstatus.getText();
		if (statusCBDT_InProcess_Server.equals("Active")) {
			System.out.println("CBDT_InProcess_Server is started");
		} else {
			System.out.println("CBDT_InProcess_Server is failed to start");
		}
	}

	public void checkCBDT_OutFile_Server() throws InterruptedException {
		String statusCBDT_OutFile_Server = CBDT_OutFile_Serverstatus.getText();
		if (statusCBDT_OutFile_Server.equals("Inactive")) {
			CBDT_OutFile_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCBDT_OutFile_Server1();
		} else {
			System.out.println("CBDT_OutFile_Server is already running");
		}
	}

	public void checkCBDT_OutFile_Server1() {
		String statusCBDT_OutFile_Server = CBDT_OutFile_Serverstatus.getText();
		if (statusCBDT_OutFile_Server.equals("Active")) {
			System.out.println("CBDT_OutFile_Server is started");
		} else {
			System.out.println("CBDT_OutFile_Server is failed to start");
		}
	}

	public void checkCBDT_Posting_Server() throws InterruptedException {
		String statusCBDT_Posting_Server = CBDT_Posting_Serverstatus.getText();
		if (statusCBDT_Posting_Server.equals("Inactive")) {
			CBDT_Posting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCBDT_Posting_Server1();
		} else {
			System.out.println("CBDT_Posting_Server is already running");
		}
	}

	public void checkCBDT_Posting_Server1() {
		String statusCBDT_Posting_Server = CBDT_Posting_Serverstatus.getText();
		if (statusCBDT_Posting_Server.equals("Active")) {
			System.out.println("CBDT_Posting_Server is started");
		} else {
			System.out.println("CBDT_Posting_Server is failed to start");
		}
	}

	public void checkNACH_InFile_Server() throws InterruptedException {
		String statusNACH_InFile_Server = NACH_InFile_Serverstatus.getText();
		if (statusNACH_InFile_Server.equals("Inactive")) {
			NACH_InFile_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkNACH_InFile_Server1();
		} else {
			System.out.println("NACH_InFile_Server is already running");
		}
	}

	public void checkNACH_InFile_Server1() {
		String statusNACH_InFile_Server = NACH_InFile_Serverstatus.getText();
		if (statusNACH_InFile_Server.equals("Active")) {
			System.out.println("NACH_InFile_Server is started");
		} else {
			System.out.println("NACH_InFile_Server is failed to start");
		}
	}

	public void checkNACH_InProcess_Server() throws InterruptedException {
		String statusNACH_InProcess_Server = NACH_InProcess_Serverstatus.getText();
		if (statusNACH_InProcess_Server.equals("Inactive")) {
			NACH_InProcess_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkNACH_InProcess_Server1();
		} else {
			System.out.println("NACH_InProcess_Server is already running");
		}
	}

	public void checkNACH_InProcess_Server1() {
		String statusNACH_InProcess_Server = NACH_InProcess_Serverstatus.getText();
		if (statusNACH_InProcess_Server.equals("Active")) {
			System.out.println("NACH_InProcess_Server is started");
		} else {
			System.out.println("NACH_InProcess_Server is failed to start");
		}
	}

	public void checkNACH_OutProcess_Server() throws InterruptedException {
		String statusNACH_OutProcess_Server = NACH_OutProcess_Serverstatus.getText();
		if (statusNACH_OutProcess_Server.equals("Inactive")) {
			NACH_OutProcess_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkNACH_OutProcess_Server1();
		} else {
			System.out.println("NACH_OutProcess_Server is already running");
		}
	}

	public void checkNACH_OutProcess_Server1() {
		String statusNACH_OutProcess_Server = NACH_OutProcess_Serverstatus.getText();
		if (statusNACH_OutProcess_Server.equals("Active")) {
			System.out.println("NACH_OutProcess_Server is started");
		} else {
			System.out.println("NACH_OutProcess_Server is failed to start");
		}
	}

	public void checkReversalAccounting_Server() throws InterruptedException {
		String statusReversalAccounting_Server = ReversalAccounting_Serverstatus.getText();
		if (statusReversalAccounting_Server.equals("Inactive")) {
			ReversalAccounting_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkReversalAccounting_Server1();
		} else {
			System.out.println("ReversalAccounting_Server is already running");
		}
	}

	public void checkReversalAccounting_Server1() {
		String statusReversalAccounting_Server = ReversalAccounting_Serverstatus.getText();
		if (statusReversalAccounting_Server.equals("Active")) {
			System.out.println("ReversalAccounting_Server is started");
		} else {
			System.out.println("ReversalAccounting_Server is failed to start");
		}
	}

	public void checkNACH_OutFileCreate_Server() throws InterruptedException {
		String statusNACH_OutFileCreate_Server = NACH_OutFileCreate_Serverstatus.getText();
		if (statusNACH_OutFileCreate_Server.equals("Inactive")) {
			NACH_OutFileCreate_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkNACH_OutFileCreate_Server1();
		} else {
			System.out.println("NACH_OutFileCreate_Server is already running");
		}
	}

	public void checkNACH_OutFileCreate_Server1() {
		String statusNACH_OutFileCreate_Server = NACH_OutFileCreate_Serverstatus.getText();
		if (statusNACH_OutFileCreate_Server.equals("Active")) {
			System.out.println("NACH_OutFileCreate_Server is started");
		} else {
			System.out.println("NACH_OutFileCreate_Server is failed to start");
		}
	}

	public void checkCorporate_InFile_Server() throws InterruptedException {
		String statusCorporate_InFile_Server = Corporate_InFile_Serverstatus.getText();
		if (statusCorporate_InFile_Server.equals("Inactive")) {
			Corporate_InFile_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCorporate_InFile_Server1();
		} else {
			System.out.println("Corporate_InFile_Server is already running");
		}
	}

	public void checkCorporate_InFile_Server1() {
		String statusCorporate_InFile_Server = Corporate_InFile_Serverstatus.getText();
		if (statusCorporate_InFile_Server.equals("Active")) {
			System.out.println("Corporate_InFile_Server is started");
		} else {
			System.out.println("Corporate_InFile_Server is failed to start");
		}
	}

	public void checkCorporate_InProcess_Server() throws InterruptedException {
		String statusCorporate_InProcess_Server = Corporate_InProcess_Serverstatus.getText();
		if (statusCorporate_InProcess_Server.equals("Inactive")) {
			Corporate_InProcess_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCorporate_InProcess_Server1();
		} else {
			System.out.println("Corporate_InProcess_Server is already running");
		}
	}

	public void checkCorporate_InProcess_Server1() {
		String statusCorporate_InProcess_Server = Corporate_InProcess_Serverstatus.getText();
		if (statusCorporate_InProcess_Server.equals("Active")) {
			System.out.println("Corporate_InProcess_Server is started");
		} else {
			System.out.println("Corporate_InProcess_Server is failed to start");
		}
	}

	public void checkCBS_Posting_Server_NACH() throws InterruptedException {
		String statusCBS_Posting_Server_NACH = CBS_Posting_Server_NACHstatus.getText();
		if (statusCBS_Posting_Server_NACH.equals("Inactive")) {
			CBS_Posting_Server_NACHcheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCBS_Posting_Server_NACH1();
		} else {
			System.out.println("CBS_Posting_Server_NACH is already running");
		}
	}

	public void checkCBS_Posting_Server_NACH1() {
		String statusCBS_Posting_Server_NACH = CBS_Posting_Server_NACHstatus.getText();
		if (statusCBS_Posting_Server_NACH.equals("Active")) {
			System.out.println("CBS_Posting_Server_NACH is started");
		} else {
			System.out.println("CBS_Posting_Server_NACH is failed to start");
		}
	}

	public void checkCBS_Posting_Server_Inward() throws InterruptedException {
		String statusCBS_Posting_Server_Inward = CBS_Posting_Server_Inwardstatus.getText();
		if (statusCBS_Posting_Server_Inward.equals("Inactive")) {
			CBS_Posting_Server_Inwardcheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCBS_Posting_Server_Inward1();
		} else {
			System.out.println("CBS_Posting_Server_Inward is already running");
		}
	}

	public void checkCBS_Posting_Server_Inward1() {
		String statusCBS_Posting_Server_Inward = CBS_Posting_Server_Inwardstatus.getText();
		if (statusCBS_Posting_Server_Inward.equals("Active")) {
			System.out.println("CBS_Posting_Server_Inward is started");
		} else {
			System.out.println("CBS_Posting_Server_Inward is failed to start");
		}
	}

	public void checkCBS_Posting_Server_CORP() throws InterruptedException {
		String statusCBS_Posting_Server_CORP = CBS_Posting_Server_CORPstatus.getText();
		if (statusCBS_Posting_Server_CORP.equals("Inactive")) {
			CBS_Posting_Server_CORPcheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCBS_Posting_Server_CORP1();
		} else {
			System.out.println("CBS_Posting_Server_CORP is already running");
		}
	}

	public void checkCBS_Posting_Server_CORP1() {
		String statusCBS_Posting_Server_CORP = CBS_Posting_Server_CORPstatus.getText();
		if (statusCBS_Posting_Server_CORP.equals("Active")) {
			System.out.println("CBS_Posting_Server_CORP is started");
		} else {
			System.out.println("CBS_Posting_Server_CORP is failed to start");
		}
	}

	public void checkCorporate_Funding_Posting_Server_CORP() throws InterruptedException {
		String statusCorporate_Funding_Posting_Server_CORP = Corporate_Funding_Posting_Server_CORPstatus.getText();
		if (statusCorporate_Funding_Posting_Server_CORP.equals("Inactive")) {
			Corporate_Funding_Posting_Server_CORPcheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkCorporate_Funding_Posting_Server_CORP1();
		} else {
			System.out.println("Corporate_Funding_Posting_Server_CORP is already running");
		}
	}

	public void checkCorporate_Funding_Posting_Server_CORP1() {
		String statusCorporate_Funding_Posting_Server_CORP = Corporate_Funding_Posting_Server_CORPstatus.getText();
		if (statusCorporate_Funding_Posting_Server_CORP.equals("Active")) {
			System.out.println("Corporate_Funding_Posting_Server_CORP is started");
		} else {
			System.out.println("Corporate_Funding_Posting_Server_CORP is failed to start");
		}
	}

	public void checkAadharMapper_InFile_Server() throws InterruptedException {
		String statusAadharMapper_InFile_Server = AadharMapper_InFile_Serverstatus.getText();
		if (statusAadharMapper_InFile_Server.equals("Inactive")) {
			AadharMapper_InFile_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAadharMapper_InFile_Server1();
		} else {
			System.out.println("AadharMapper_InFile_Server is already running");
		}
	}

	public void checkAadharMapper_InFile_Server1() {
		String statusAadharMapper_InFile_Server = AadharMapper_InFile_Serverstatus.getText();
		if (statusAadharMapper_InFile_Server.equals("Active")) {
			System.out.println("AadharMapper_InFile_Server is started");
		} else {
			System.out.println("AadharMapper_InFile_Server is failed to start");
		}
	}

	public void checkAadharMapper_InProcess_Server() throws InterruptedException {
		String statusAadharMapper_InProcess_Server = AadharMapper_InProcess_Serverstatus.getText();
		if (statusAadharMapper_InProcess_Server.equals("Inactive")) {
			AadharMapper_InProcess_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAadharMapper_InProcess_Server1();
		} else {
			System.out.println("AadharMapper_InProcess_Server is already running");
		}
	}

	public void checkAadharMapper_InProcess_Server1() {
		String statusAadharMapper_InProcess_Server = AadharMapper_InProcess_Serverstatus.getText();
		if (statusAadharMapper_InProcess_Server.equals("Active")) {
			System.out.println("AadharMapper_InProcess_Server is started");
		} else {
			System.out.println("AadharMapper_InProcess_Server is failed to start");
		}
	}

	public void checkAadharMapper_OutFileProcess_Server() throws InterruptedException {
		String statusAadharMapper_OutFileProcess_Server = AadharMapper_OutFileProcess_Serverstatus.getText();
		if (statusAadharMapper_OutFileProcess_Server.equals("Inactive")) {
			AadharMapper_OutFileProcess_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAadharMapper_OutFileProcess_Server1();
		} else {
			System.out.println("AadharMapper_OutFileProcess_Server is already running");
		}
	}

	public void checkAadharMapper_OutFileProcess_Server1() {
		String statusAadharMapper_OutFileProcess_Server = AadharMapper_OutFileProcess_Serverstatus.getText();
		if (statusAadharMapper_OutFileProcess_Server.equals("Active")) {
			System.out.println("AadharMapper_OutFileProcess_Server is started");
		} else {
			System.out.println("AadharMapper_OutFileProcess_Server is failed to start");
		}
	}

	public void checkMandate_Alert_Server() throws InterruptedException {
		String statusMandate_Alert_Server = Mandate_Alert_Serverstatus.getText();
		if (statusMandate_Alert_Server.equals("Inactive")) {
			Mandate_Alert_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkMandate_Alert_Server1();
		} else {
			System.out.println("Mandate_Alert_Server is already running");
		}
	}

	public void checkMandate_Alert_Server1() {
		String statusMandate_Alert_Server = Mandate_Alert_Serverstatus.getText();
		if (statusMandate_Alert_Server.equals("Active")) {
			System.out.println("Mandate_Alert_Server is started");
		} else {
			System.out.println("Mandate_Alert_Server is failed to start");
		}
	}

	public void checkTransaction_Alert_Server() throws InterruptedException {
		String statusTransaction_Alert_Server = Transaction_Alert_Serverstatus.getText();
		if (statusTransaction_Alert_Server.equals("Inactive")) {
			Transaction_Alert_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkTransaction_Alert_Server1();
		} else {
			System.out.println("Transaction_Alert_Server is already running");
		}
	}

	public void checkTransaction_Alert_Server1() {
		String statusTransaction_Alert_Server = Transaction_Alert_Serverstatus.getText();
		if (statusTransaction_Alert_Server.equals("Active")) {
			System.out.println("Transaction_Alert_Server is started");
		} else {
			System.out.println("Transaction_Alert_Server is failed to start");
		}
	}

	public void checkSms_Alert_Server() throws InterruptedException {
		String statusSms_Alert_Server= Sms_Alert_Serverstatus.getText();
		if (statusSms_Alert_Server.equals("Inactive")) {
			Sms_Alert_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkSms_Alert_Server1();
		} else {
			System.out.println("Sms_Alert_Server is already running");
		}
	}

	public void checkSms_Alert_Server1() {
		String statusSms_Alert_Server = Sms_Alert_Serverstatus.getText();
		if (statusSms_Alert_Server.equals("Active")) {
			System.out.println("Sms_Alert_Server is started");
		} else {
			System.out.println("Sms_Alert_Server is failed to start");
		}
	}

	public void checkAadharMapper_Alert_Server() throws InterruptedException {
		String statusAadharMapper_Alert_Server = AadharMapper_Alert_Serverstatus.getText();
		if (statusAadharMapper_Alert_Server.equals("Inactive")) {
			AadharMapper_Alert_Servercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkAadharMapper_Alert_Server1();
		} else {
			System.out.println("AadharMapper_Alert_Server is already running");
		}
	}

	public void checkAadharMapper_Alert_Server1() {
		String statusAadharMapper_Alert_Server = AadharMapper_Alert_Serverstatus.getText();
		if (statusAadharMapper_Alert_Server.equals("Active")) {
			System.out.println("AadharMapper_Alert_Server is started");
		} else {
			System.out.println("AadharMapper_Alert_Server is failed to start");
		}
	}

	public void checkESIGNMMSInFileServer() throws InterruptedException {
		String statusESIGNMMSInFileServer = ESIGNMMSInFileServerstatus.getText();
		if (statusESIGNMMSInFileServer.equals("Inactive")) {
			ESIGNMMSInFileServercheckbox.click();
			switchResourceButton.click();
			returnBtnStatus();
			checkESIGNMMSInFileServer1();
		} else {
			System.out.println("ESIGNMMSInFileServer is already running");
		}
	}

	public void checkESIGNMMSInFileServer1() {
		String statusESIGNMMSInFileServer = ESIGNMMSInFileServerstatus.getText();
		if (statusESIGNMMSInFileServer.equals("Active")) {
			System.out.println("ESIGNMMSInFileServer is started");
		} else {
			System.out.println("ESIGNMMSInFileServer is failed to start");
		}
	}

	public void LogOut() {
		logOutBtn.click();
		logoutBtn.click();

	}
}
