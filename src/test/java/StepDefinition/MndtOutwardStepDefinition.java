package StepDefinition;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.ApproveMandatePage;
import com.aufin.qa.pages.CreateMMSOutFilePage;
import com.aufin.qa.pages.CreateOutMandatePage;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MndtOutwardStepDefinition extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateOutMandatePage createOutwardMndt;
	ApproveMandatePage approveMandatePage;
	CreateMMSOutFilePage createMMSFilePage;

	Windowhandle win;

	@Given("user is on MPS and creates new mandate from create mandate menu")
	public void user_is_on_MPS_and_creates_new_mandate_from_create_mandate_menu() throws InterruptedException {

		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);

	}

	@When("user enters {string} {string} {string} {string} {string} {string} and upload {string} {string}")
	public void user_enters_and_upload(String Name, String Account_Number, String Amount, String Customer_Name,
			String Customer_Code, String IFSC_Code, String Image1, String Image2) throws InterruptedException {

		driver.switchTo().frame("toc");
		createOutwardMndt = homePage.createOutwardMandate();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		createOutwardMndt.createNewOutMandate(win, Name, Account_Number, Amount, Customer_Name, Customer_Code,
				IFSC_Code, Image1, Image2);

	}

	@Then("user clicks on ok and confirm button")
	public void user_clicks_on_ok_and_confirm_button() throws InterruptedException {
		
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		createOutwardMndt.confirmMandate();
		driver.quit();
	}

	@Then("user approves the mandate {string}")
	public void user_approves_the_mandate(String Customer_Code) throws InterruptedException {

		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveMandatePage = homePage.approveMandateRecord();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveMandatePage = approveMandatePage.approveOutwardMandate(win, Customer_Code);
		driver.quit();
	}

	@Then("user creates file from Create MMS file screen menu")
	public void user_creates_file_from_Create_MMS_file_screen_menu() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		createMMSFilePage = homePage.createMMSFileRecord();
		createMMSFilePage = createMMSFilePage.createMMSFile(win);
		driver.quit();
	}
	

//	public void quitBrowser() {
//
//		driver.quit();
//	}

	/*
	 * // Validation Method
	 * 
	 * @When("user enters invalid name {string}") public void
	 * user_enters_invalid_name(String string) {
	 * 
	 * 
	 * }
	 * 
	 * @Then("user enters invalid account_number {string}") public void
	 * user_enters_invalid_account_number(String string) {
	 * 
	 * }
	 * 
	 * @Then("user enters invalid amount {string}") public void
	 * user_enters_invalid_amount(String string) {
	 * 
	 * }
	 * 
	 * @Then("user enters invalid customer_name {string}") public void
	 * user_enters_invalid_customer_name(String string) {
	 * 
	 * }
	 * 
	 * @Then("user enters invalid customer_code {string}") public void
	 * user_enters_invalid_customer_code(String string) {
	 * 
	 * }
	 * 
	 * @Then("user enters invalid ifsc_code {string}") public void
	 * user_enters_invalid_ifsc_code(String string) {
	 * 
	 * }
	 */
}
