package StepDefinition;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.AmendMandatePage;
import com.aufin.qa.pages.CreateMMSOutFilePage;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.xmlFileReader;
import com.aufin.qa.util.Windowhandle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmendMandateInwardStepDefinition extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	AmendMandatePage amendMandatePage;
	CreateMMSOutFilePage createMMSoutfilePage;
	Windowhandle win;
	xmlFileReader x = new xmlFileReader();
	SoftAssert sa = new SoftAssert();
	
	@Given("Login into the system")
	public void login_into_the_system() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("MPS NACH", title);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	@Then("User goes to Mandate Management and open Accept Mandate menu with proper {string}")
	public void user_goes_to_Mandate_Management_and_open_Accept_Mandate_menu_with_proper(String UMRN) throws InterruptedException {
		driver.switchTo().frame("toc");
		amendMandatePage=homePage.clickonacceptInwardmandateLink();
		amendMandatePage = amendMandatePage.revealMandate1(win, UMRN);
	}
	
	@Then("user check all the fields for validation")
	public void user_check_all_the_fields_for_validation() throws ParserConfigurationException {
		x.fileReader();
		amendMandatePage=amendMandatePage.verifynamefield("Name", sa);
		amendMandatePage=amendMandatePage.verifyaccountnumberfield("Account_Number",sa);
		amendMandatePage=amendMandatePage.verifyamountfield("Amount", sa);
		amendMandatePage=amendMandatePage.verifyfixedfield("Fixed", sa);
		amendMandatePage=amendMandatePage.verifystartdatefield("Start_date_from", sa);
		amendMandatePage=amendMandatePage.verifymobilenofield("Mobile", sa);
		amendMandatePage=amendMandatePage.verifycustomernamefield("Customer_name", sa);
		amendMandatePage=amendMandatePage.verifyconsumerreffield("Consumer_reference", sa);
		amendMandatePage=amendMandatePage.verifycategoryfield("Category", sa);
		amendMandatePage=amendMandatePage.verifycreatedatefield("Create_Date", sa);
		amendMandatePage=amendMandatePage.verifyutilitycodefield("Utility_Code", sa);
		amendMandatePage=amendMandatePage.verifylastupdatedonfield("Last_Updated_on", sa);
		amendMandatePage=amendMandatePage.verifydestinationbankfield("Destination_Bank", sa);
		amendMandatePage=amendMandatePage.verifysponserbankfield("Sponser_Bank", sa);
		amendMandatePage=amendMandatePage.verifydestinationbanknamefield("Destination_Bank_Name", sa);	
		sa.assertAll();
	}
	
	@Then("User accept the mandate")
	public void user_accept_the_mandate() throws InterruptedException {
		amendMandatePage=amendMandatePage.acceptmandate();
	}
	
	@Then("User goes to approve the mandate with proper {string}")
	public void user_goes_to_approve_the_mandate_with_proper(String UMRN) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonapproveamendmandateLink();
		amendMandatePage=amendMandatePage.approveamendMandate1(win, UMRN);
	}
	
	@Then("User goes to Mandate Management and open Create MMS File menu")
	public void user_goes_to_Mandate_Management_and_open_Create_MMS_File_menu() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		createMMSoutfilePage = homePage.createMMSFileRecord();
		createMMSoutfilePage = createMMSoutfilePage.createMMSFile(win);
	}
	
	@Then("User goes to reject the mandate with proper {string}")
	public void user_goes_to_reject_the_mandate_with_proper(String UMRN) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonapproveamendmandateLink();
		amendMandatePage=amendMandatePage.rejectmandate(win, UMRN);
	}
	
	@Then("User will send the mandate to modify queue from Approve screen using proper {string}")
	public void user_will_send_the_mandate_to_modify_queue_from_Approve_screen_using_proper(String UMRN) throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		amendMandatePage = homePage.clickonapproveamendmandateLink();
		amendMandatePage=amendMandatePage.modifymandatequeue(win, UMRN);
	}
}
