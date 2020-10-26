package StepDefinition;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.CancelOutwardMandate;
import com.aufin.qa.pages.CreateONUSMandate;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.UserPage;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OnusCreateMandateStepDefination extends TestBase {

	LoginPage loginPage;
	HomePage homepage;
	UserPage userpage;
	CreateONUSMandate createONUSMandate;
	CancelOutwardMandate cancelOutwardMandate;
	Windowhandle win;

	@Given("user logged in MPS and creates new mandate from create mandate menu")
	public void user_is_on_MPS_and_creates_new_mandate_from_create_mandate_menu() throws InterruptedException {

		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		createONUSMandate = homepage.CreateMandate();
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	@When("user enters {string} {string} {string} {string} {string} {string} and upload {string} {string} and clicks on ok button")
	public void user_enters_and_upload_and_clicks_on_ok_button(String Name, String Account_Number, String Amount,
			String Customer_Name, String Customer_Code, String IFSC_Code, String Image1, String Image2)
			throws InterruptedException {

		createONUSMandate = createONUSMandate.EnterDetails(Name, Account_Number, Amount, Customer_Name, Customer_Code,
				IFSC_Code, Image1, Image2);
		Thread.sleep(IntfConstants.TIMEOUT);
		createONUSMandate = createONUSMandate.CreateMandate();
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	@Then("User goes to Approve Mandate screen")
	public void user_goes_to_Approve_Mandate_screen() throws InterruptedException {

		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		cancelOutwardMandate = homepage.approvecancelmandate();

	}

	@Then("user approves the mandate using {string}")
	public void user_approves_the_mandate(String UMRN) throws InterruptedException {

		cancelOutwardMandate = cancelOutwardMandate.CancelMandateApprove(UMRN);

		// createONUSMandate=createONUSMandate.ApproveMandate(Customer_Code);
		Thread.sleep(IntfConstants.TIMEOUT);

	}

	@Then("user goes to create file from Create MMS file screen menu")
	public void user_creates_file_from_Create_MMS_file_screen_menu() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		createONUSMandate = homepage.CreateMMS();
		createONUSMandate = createONUSMandate.CreateMMSFile();
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	@Then("user validates the mandate in list mandate screen")
	public void user_validates_the_mandate_in_list_mandate_screen() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		createONUSMandate = homepage.ListMandate();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		createONUSMandate = createONUSMandate.ViewingMandate();
		driver.quit();
	}

}
