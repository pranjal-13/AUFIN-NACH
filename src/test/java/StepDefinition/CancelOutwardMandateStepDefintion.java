package StepDefinition;

import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.CancelOutwardMandate;
import com.aufin.qa.pages.CreateMMSOutFilePage;
import com.aufin.qa.pages.CreateONUSMandate;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.xmlFileReader;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CancelOutwardMandateStepDefintion extends TestBase

{

	LoginPage loginPage;
	HomePage homePage;
	CancelOutwardMandate cancelOutwardMandate;
	Windowhandle win;
	SoftAssert sa = new SoftAssert();
	xmlFileReader x = new xmlFileReader();
	CreateMMSOutFilePage createMMSoutfilePage;
	CreateONUSMandate createONUSMandate;
	@Given("User is going to login in GPS")
	public void user_is_going_to_login_in_GPS() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	@And("User goes to application and Mandate Management and clicks on Cancel Mandate menu")
	public void user_goes_to_application_and_Mandate_Management_and_clicks_on_Cancel_Mandate_menu()
			throws InterruptedException

	{
		driver.switchTo().frame("toc");
		cancelOutwardMandate = homePage.cancelmandate();

	}

	@Then("User searchs on the basis of {string} and cancels that mandate and logs out")
	public void User_searchs_on_the_basis_of_and_cancels_that_mandate_and_logs_out(String UMRN) {

		cancelOutwardMandate.CancelMandate(UMRN);
		driver.quit();
	}

	@Then("User goes to Application and Mandate Management and clicks to Approve Mandate screen")
	public void user_goes_to_Application_and_Mandate_Management_and_clicks_to_Approve_Mandate_screen()
			throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		cancelOutwardMandate = homePage.approvecancelmandate();
	}

	@Then("User searchs on the basis of {string} and approve the mandate")
	public void user_searchs_on_the_basis_of_and_approve_the_mandate(String UMRN) throws InterruptedException {

		cancelOutwardMandate = cancelOutwardMandate.CancelMandateApprove(UMRN);
		driver.quit();
	}

	@Then("user generates the file from Create MMS file screen menu")
	public void user_generates_the_file_from_Create_MMS_file_screen_menu() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		createMMSoutfilePage=homePage.createMMSFileRecord();
		//cancelOutwardMandate = cancelOutwardMandate.CreateMMSFile();
		
		createMMSoutfilePage = createMMSoutfilePage.createMMSFile(win);
		driver.quit();
	}

	@Then("user will validate the mandate in list mandate screen")
	public void user_will_validate_the_mandate_in_list_mandate_screen() throws InterruptedException {

		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		cancelOutwardMandate=homePage.listCancelOutwardMandate();
		cancelOutwardMandate = cancelOutwardMandate.ViewingMandate();
		driver.quit();
	}

}
