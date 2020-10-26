package StepDefinition;

import org.junit.Assert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.EnvironmentPage;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.util.Windowhandle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ServersStepDefinition extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	EnvironmentPage environmentPage;
	Windowhandle win;
	
	@Given("User login")
	public void login_with_username_and_password() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("MPS NACH", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
	}
	
	@Then("User goes to Environment and Open Run menu")
	public void user_goes_to_Environment_and_Open_Run_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton(win);
	}

	@Then("Check NPCI_Upload_Server")
	public void check_NPCI_Upload_Server() throws InterruptedException {
		environmentPage.checkNPCI_Upload_Server();
	}

	@Then("Check NPCI_Download_Server")
	public void check_NPCI_Download_Server() throws InterruptedException {
		environmentPage.checkNPCI_Download_Server();
	}

	@Then("Check File_Router_Server")
	public void check_File_Router_Server() throws InterruptedException {
	    environmentPage.checkFile_Router_Server();
	}

	@Then("Check MMS_InFile_Server")
	public void check_MMS_InFile_Server() throws InterruptedException {
		environmentPage.checkMMS_InFile_Server();
	}

	@Then("Check MMS_InProcess_Server")
	public void check_MMS_InProcess_Server() throws InterruptedException {
		environmentPage.checkMMS_InProcess_Server();
	}

	@Then("Check MMS_OutFileCreate_Server")
	public void check_MMS_OutFileCreate_Server() throws InterruptedException {
		environmentPage.checkMMS_OutFileCreate_Server();
	}

	@Then("Check EsignMandateVerificationServer")
	public void check_EsignMandateVerificationServer() throws InterruptedException {
		environmentPage.checkEsignMandateVerificationServer();
	}

	@Then("Check API_Mandate_TAT_Check_Server")
	public void check_API_Mandate_TAT_Check_Server() throws InterruptedException {
		environmentPage.checkAPI_Mandate_TAT_Check_Server();
	}

	@Then("Check API_Mandate_File_Create_Server")
	public void check_API_Mandate_File_Create_Server() throws InterruptedException {
		environmentPage.CheckAPI_Mandate_File_Create_Server();
	}

	@Then("Check API_Mandate_File_Process_Server")
	public void check_API_Mandate_File_Process_Server() throws InterruptedException {
		environmentPage.checkAPI_Mandate_File_Process_Server();
	}

	@Then("Check DBTL_InFile_Server")
	public void check_DBTL_InFile_Server() throws InterruptedException {
		environmentPage.checkDBTL_InFile_Server();
	}

	@Then("Check DBTL_InProcess_Server")
	public void check_DBTL_InProcess_Server() throws InterruptedException {
		environmentPage.checkDBTL_InProcess_Server();
	}

	@Then("Check DBTL_AccountVerification_Server")
	public void check_DBTL_AccountVerification_Server() throws InterruptedException {
		environmentPage.checkDBTL_AccountVerification_Server();
	}

	@Then("Check DBTL_OutFileCreate_Server")
	public void check_DBTL_OutFileCreate_Server() throws InterruptedException {
		environmentPage.checkDBTL_OutFileCreate_Server();
	}

	@Then("Check CBDT_InFile_Server")
	public void check_CBDT_InFile_Server() throws InterruptedException {
		environmentPage.checkCBDT_InFile_Server();
	}

	@Then("Check CBDT_InProcess_Server")
	public void check_CBDT_InProcess_Server() throws InterruptedException {
		environmentPage.checkCBDT_InProcess_Server();
	}

	@Then("Check CBDT_OutFile_Server")
	public void check_CBDT_OutFile_Server() throws InterruptedException {
		environmentPage.checkCBDT_OutFile_Server();
	}

	@Then("Check CBDT_Posting_Server")
	public void check_CBDT_Posting_Server() throws InterruptedException {
		environmentPage.checkCBDT_Posting_Server();
	}

	@Then("Check NACH_InFile_Server")
	public void check_NACH_InFile_Server() throws InterruptedException {
		environmentPage.checkNACH_InFile_Server();
	}

	@Then("Check NACH_InProcess_Server")
	public void check_NACH_InProcess_Server() throws InterruptedException {
		environmentPage.checkNACH_InProcess_Server();
	}

	@Then("Check NACH_OutProcess_Server")
	public void check_NACH_OutProcess_Server() throws InterruptedException {
		environmentPage.checkNACH_OutProcess_Server();
	}

	@Then("Check ReversalAccounting_Server")
	public void check_ReversalAccounting_Server() throws InterruptedException {
		environmentPage.checkReversalAccounting_Server();
	}

	@Then("Check NACH_OutFileCreate_Server")
	public void check_NACH_OutFileCreate_Server() throws InterruptedException {
		environmentPage.checkNACH_OutFileCreate_Server();
	}

	@Then("Check Corporate_InFile_Server")
	public void check_Corporate_InFile_Server() throws InterruptedException {
		environmentPage.checkCorporate_InFile_Server();
	}

	@Then("Check Corporate_InProcess_Server")
	public void check_Corporate_InProcess_Server() throws InterruptedException {
		environmentPage.checkCorporate_InProcess_Server();
	}

	@Then("Check CBS_Posting_Server_NACH")
	public void check_CBS_Posting_Server_NACH() throws InterruptedException {
		environmentPage.checkCBS_Posting_Server_NACH();
	}

	@Then("Check CBS_Posting_Server_Inward")
	public void check_CBS_Posting_Server_Inward() throws InterruptedException {
		environmentPage.checkCBS_Posting_Server_Inward();
	}

	@Then("Check CBS_Posting_Server_CORP")
	public void check_CBS_Posting_Server_CORP() throws InterruptedException {
		environmentPage.checkCBS_Posting_Server_CORP();
	}

	@Then("Check Corporate_Funding_Posting_Server_CORP")
	public void check_Corporate_Funding_Posting_Server_CORP() throws InterruptedException {
		environmentPage.checkCorporate_Funding_Posting_Server_CORP();
	}

	@Then("Check AadharMapper_InFile_Server")
	public void check_AadharMapper_InFile_Server() throws InterruptedException {
		environmentPage.checkAadharMapper_InFile_Server();
	}

	@Then("Check AadharMapper_InProcess_Server")
	public void check_AadharMapper_InProcess_Server() throws InterruptedException {
		environmentPage.checkAadharMapper_InProcess_Server();
	}

	@Then("Check AadharMapper_OutFileProcess_Server")
	public void check_AadharMapper_OutFileProcess_Server() throws InterruptedException {
		environmentPage.checkAadharMapper_OutFileProcess_Server();
	}

	@Then("Check Mandate_Alert_Server")
	public void check_Mandate_Alert_Server() throws InterruptedException {
		environmentPage.checkMandate_Alert_Server();
	}

	@Then("Check Transaction_Alert_Server")
	public void check_Transaction_Alert_Server() throws InterruptedException {
		environmentPage.checkTransaction_Alert_Server();
	}

	@Then("Check Sms_Alert_Server")
	public void check_Sms_Alert_Server() throws InterruptedException {
		environmentPage.checkSms_Alert_Server();
	}

	@Then("Check AadharMapper_Alert_Server")
	public void check_AadharMapper_Alert_Server() throws InterruptedException {
		environmentPage.checkAadharMapper_Alert_Server();
	}

	@Then("Check ESIGNMMSInFileServer")
	public void check_ESIGNMMSInFileServer() throws InterruptedException {
		environmentPage.checkESIGNMMSInFileServer();
		environmentPage.LogOut();
	}
	
}
