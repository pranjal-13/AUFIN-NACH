package StepDefinition;

import org.junit.Assert;
import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.AmendMandatePage;
import com.aufin.qa.pages.CreateMMSOutFilePage;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.ModifyMandatePage;
import com.aufin.qa.util.Windowhandle;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmendMandateOutwardStepDefinition extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	AmendMandatePage amendMandatePage;
	CreateMMSOutFilePage createMMSoutfilePage;
	ModifyMandatePage modifyMandatePage;
	Windowhandle win;

	@Given("User login into system")
	public void user_login_into_system() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("MPS NACH", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	@Then("User goes to Mandate Management and open Amend Mandate menu")
	public void user_goes_to_Mandate_Management_and_open_Amend_Mandate_menu(DataTable credentials)
			throws InterruptedException {
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonamendOutwardmandateLink();
		amendMandatePage = amendMandatePage.revealMandate(win, credentials);
	}

	@Then("User perform amend action")
	public void user_perform_amend_action(DataTable credentials) throws InterruptedException {
		amendMandatePage = amendMandatePage.amendMandate(credentials);
	}

	@Then("User approves the mandate")
	public void user_approves_the_mandate(DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonapproveamendmandateLink();
		amendMandatePage = amendMandatePage.approveamendMandate(win, credentials);
	}

	@Then("User modify the details and send the mandate to NPCI")
	public void user_modify_the_details_and_send_the_mandate_to_NPCI(DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		modifyMandatePage = homePage.clickonmodifyamendmandateLink();
		modifyMandatePage=modifyMandatePage.modifyamendMandate(win, credentials);
		
	}
	
	@Then("User goes to Create MMS file")
	public void user_goes_to_Create_MMS_file() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		createMMSoutfilePage = homePage.createMMSFileRecord();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		createMMSoutfilePage = createMMSoutfilePage.createMMSFile(win);
	}

	@Then("User rejects the amend mandate")
	public void user_rejects_the_amend_mandate(DataTable credentials) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonapproveamendmandateLink();
		amendMandatePage = amendMandatePage.rejectamendMandate(win, credentials);
	}
	
	@Then("User send the mandate to modify queue from Approve screen")
	public void user_send_the_mandate_to_modify_queue_from_Approve_screen(DataTable credentials)
			throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonapproveamendmandateLink();
		amendMandatePage = amendMandatePage.modifybuttonamendMandate(win, credentials);
	}
	
	@Then("User goes to Mandate Management and open Amend Mandate option with proper {string}")
	public void user_goes_to_Mandate_Management_and_open_Amend_Mandate_option_with_proper(String UMRN) throws InterruptedException {
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonamendOutwardmandateLink();
		amendMandatePage = amendMandatePage.revealMandate1(win, UMRN);
	}
	
	@Then("check {string} field for amount field validation")
	public void check_field_for_amount_field_validation(String Amount) throws InterruptedException {
		amendMandatePage=amendMandatePage.amountfield(Amount);
	}

	@Then("check {string} field for Start date field validation with proper {string}")
	public void check_field_for_Start_date_field_validation_with_proper(String StartDate, String UMRN) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonamendOutwardmandateLink();
		amendMandatePage = amendMandatePage.revealMandate1(win, UMRN);
		amendMandatePage=amendMandatePage.startdatefield(StartDate);	
	}

	@Then("check {string} field for End date field validation with proper {string}")
	public void check_field_for_End_date_field_validation_with_proper(String EndDate, String UMRN) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonamendOutwardmandateLink();
		amendMandatePage = amendMandatePage.revealMandate1(win, UMRN);
		amendMandatePage=amendMandatePage.enddatefield(EndDate);
	}

	@Then("check {string} field for Landline No. validation with proper {string}")
	public void check_field_for_Landline_No_validation_with_proper(String LandlineNo, String UMRN) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonamendOutwardmandateLink();
		amendMandatePage = amendMandatePage.revealMandate1(win, UMRN);
		amendMandatePage=amendMandatePage.landlinenofield(LandlineNo);
	}

	@Then("check {string} field for Mobile No. field validation with proper {string}")
	public void check_field_for_Mobile_No_field_validation_with_proper(String MobileNo, String UMRN) throws InterruptedException { 
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	driver.switchTo().frame("toc");
	amendMandatePage = homePage.clickonamendOutwardmandateLink();
	amendMandatePage = amendMandatePage.revealMandate1(win, UMRN);
	amendMandatePage=amendMandatePage.mobilenofield(MobileNo);
	}

	@Then("check {string} field for Email Id field validation with proper {string}")
	public void check_field_for_Email_Id_field_validation_with_proper(String EmailID, String UMRN) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonamendOutwardmandateLink();
		amendMandatePage = amendMandatePage.revealMandate1(win, UMRN);
		amendMandatePage=amendMandatePage.emailidfield(EmailID);
	}
	}
