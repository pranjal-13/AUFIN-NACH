package StepDefinition;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.pages.AcceptMandatePage;
import com.aufin.qa.pages.ApproveMandatePage;
import com.aufin.qa.pages.CreateMMSOutFilePage;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MndtInwardStepDefinition extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	AcceptMandatePage acceptMandatePage;
	ApproveMandatePage approveMandatePage;
	CreateMMSOutFilePage createMMSFilePage;
	Windowhandle win;


	@Given("user is on MPS page")
	public void user_is_on_MPS_page() {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@When("user accept the mandate from accept mandate screen")
	public void user_accept_the_mandate_from_accept_mandate_screen(DataTable credentials) throws InterruptedException {
		
		//Thread.sleep(5000);
		
		//acceptMandatePage=new AcceptMandatePage();
		driver.switchTo().frame("toc");
		acceptMandatePage=homePage.acceptInwardMandate();
		acceptMandatePage=acceptMandatePage.acceptMandate(win,credentials);

	}

	@When("user approve the mandate")
	public void user_approve_the_mandate(DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		approveMandatePage=homePage.approveMandateRecord();
		approveMandatePage=approveMandatePage.approveMandate(win,credentials);

	}

	@Then("user creates file from Create MMS outfile screen")
	public void user_creates_file_from_Create_MMS_outfile_screen() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		createMMSFilePage=homePage.createMMSFileRecord();
		createMMSFilePage=createMMSFilePage.createMMSFile(win);

	}
	
	// Rejecting the mandate
	@Then("user selects {string} {string} and rejects the mandate from accept mandate screen")
	public void user_selects_and_rejects_the_mandate_from_accept_mandate_screen(String UMRN, String RejectResaon) throws InterruptedException {
		driver.switchTo().frame("toc");
		acceptMandatePage=homePage.acceptInwardMandate();
		acceptMandatePage=acceptMandatePage.rejectMandate(win,UMRN,RejectResaon);
	}

	@Then("user approves the reject mandate {string}")
	public void user_approves_the_reject_mandate(String UMRN) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		approveMandatePage=homePage.approveMandateRecord();
		approveMandatePage=approveMandatePage.rejectApproveMandate(win, UMRN);
		
	    
	}
	/*@After
	public void quitBrowser() {

		driver.close();
	}*/
}
