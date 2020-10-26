package StepDefinition;

import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.AmendONUSMandate;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.xmlFileReader;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OnusAmendMandateStepDefination extends TestBase{


	LoginPage loginPage;
	HomePage homePage;
	AmendONUSMandate  amendONUSMandate;
	Windowhandle win;
	SoftAssert sa=new SoftAssert();
	xmlFileReader x=new xmlFileReader();
	
	@Given("User logged into MPS system")
	public void user_login_into_system() throws InterruptedException {
	   
		Initialization();
	    win = new Windowhandle(driver);
	    loginPage=new LoginPage();
	    homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    Thread.sleep(IntfConstants.TIMEOUT); 
	}


		@Then("User goes to Mandate Management and open Amend Mandate menu with {string}")
		public void user_goes_to_Mandate_Management_and_open_Amend_Mandate_menu_with(String Customer_Code) throws InterruptedException {
			driver.switchTo().frame("toc");
			amendONUSMandate=homePage.AmendMandate();
		}


		@Then("User perform amend action on {string} {string} {string} {string} {string} and upload {string} {string}")
		public void user_perform_amend_action_on_and_upload( String Account_Number, String Amount, String Customer_Name, String Customer_Code, String IFSC_Code, String Image1, String Image2) {
			amendONUSMandate=amendONUSMandate.AmendDetails(Account_Number, Amount, Customer_Name, Customer_Code, IFSC_Code, Image1, Image2);
			
		}

	@Then("User approves the mandate with {string}")
	public void user_approves_the_mandate_with(String Customer_Code) throws InterruptedException {
	   
		Initialization();
	    win = new Windowhandle(driver);
	    loginPage=new LoginPage();
	    homePage=loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
	    Thread.sleep(IntfConstants.TIMEOUT); 
	    driver.switchTo().frame("toc");
	    amendONUSMandate=homePage.onusapproveAmendMandate();
	    Thread.sleep(IntfConstants.TIMEOUT); 
	    amendONUSMandate=amendONUSMandate.ApproveAmendedMandate(Customer_Code);
	    Thread.sleep(IntfConstants.TIMEOUT); 
	    
	    
		
	}
	

@Then("user creates the file from Create MMS file screen menu")
public void user_creates_the_file_from_Create_MMS_file_screen_menu() throws InterruptedException {
	driver.switchTo().frame("toc");
	amendONUSMandate=homePage.AmendCreateMMS();
	Thread.sleep(IntfConstants.TIMEOUT); 
	amendONUSMandate=amendONUSMandate.CreateMMSFile();
	Thread.sleep(IntfConstants.TIMEOUT); 
	
}

@Then("user validates the mandate in  mandate screen")
public void user_validates_the_mandate_in_mandate_screen() throws InterruptedException {
	driver.switchTo().frame("toc");
	amendONUSMandate=homePage.ListAmendMandate();
	Thread.sleep(IntfConstants.TIMEOUT); 
	amendONUSMandate=amendONUSMandate.ViewingMandate();
	Thread.sleep(IntfConstants.TIMEOUT); 
	win.handlewin();
}


	
	@Then("User rejects the mandate")
	public void user_rejects_the_mandate() throws InterruptedException {
		driver.switchTo().frame("toc");
	    amendONUSMandate=homePage.onusapproveAmendMandate();
	    Thread.sleep(IntfConstants.TIMEOUT); 
		amendONUSMandate=amendONUSMandate.RejectingAmendedMandate();
		win.handlewin();
	  
	}

	@Then("User send the mandate to modify queue from Approve screen with {string}")
	public void user_send_the_mandate_to_modify_queue_from_Approve_screen_with(String Customer_Code) throws InterruptedException {
		Initialization();
	    win = new Windowhandle(driver);
	    loginPage=new LoginPage();
	    homePage=loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
	    Thread.sleep(IntfConstants.TIMEOUT); 
	    driver.switchTo().frame("toc");
	    amendONUSMandate=homePage.onusapproveAmendMandate();
	    Thread.sleep(IntfConstants.TIMEOUT); 
	    amendONUSMandate=amendONUSMandate.ModifyingAmendedMandate(Customer_Code);
	    Thread.sleep(IntfConstants.TIMEOUT); 
		       
	}

@Then("User modify the details with {string} {string} {string} {string} {string} {string} and upload {string} {string}   and send the mandate to NPCI")
public void user_modify_the_details_with_and_upload_and_send_the_mandate_to_NPCI(String Name, String Account_Number, String Amount, String Customer_Name, String Customer_Code, String IFSC_Code, String Image1, String Image2) throws InterruptedException {
	amendONUSMandate=homePage.ModifyMandate();
	Thread.sleep(IntfConstants.TIMEOUT); 
	
	amendONUSMandate=amendONUSMandate.ModifyingMandate(Name, Account_Number, Amount, Customer_Name, Customer_Code, IFSC_Code, Image1, Image2);
}



}
