package StepDefinition;

import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.CancelONUSMandate;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.xmlFileReader;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OnusCancelMandateStepDefination extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CancelONUSMandate  cancelONUSMandate;
	Windowhandle win;
	SoftAssert sa=new SoftAssert();
	xmlFileReader x=new xmlFileReader();
	

@Given("User is going to get login in GPS")
public void user_is_going_to_get_login_in_GPS() throws InterruptedException {
	Initialization();
    win = new Windowhandle(driver);
    loginPage=new LoginPage();
    homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    Thread.sleep(IntfConstants.TIMEOUT); 
}

@Given("User goes to the application menu and Mandate Management and clicks on Cancel Mandate menu")
public void user_goes_to_the_application_menu_and_Mandate_Management_and_clicks_on_Cancel_Mandate_menu() throws InterruptedException {
	

	driver.switchTo().frame("toc");
	cancelONUSMandate=homePage.onuscancelmandate();
 
}

@Then("User searchs on the basis of {string} and cancels that ONUS mandate and logs out")
public void user_searchs_on_the_basis_of_and_cancels_that_ONUS_mandate_and_logs_out(String UMRN) {
  
	cancelONUSMandate.CancelMandate(UMRN);

}

@Then("User goes to Application menu and Mandate Management and clicks to Approve Mandate screen")
public void user_goes_to_Application_menu_and_Mandate_Management_and_clicks_to_Approve_Mandate_screen() throws InterruptedException {
 
	  Initialization();
	    win = new Windowhandle(driver);	  
	    loginPage=new LoginPage();
	    homePage=loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
	    Thread.sleep(IntfConstants.TIMEOUT);
	    driver.switchTo().frame("toc");
	    cancelONUSMandate=homePage.onusapprovecancelmandate();
	
}

@Then("User searchs on the basis of {string} and approve that ONUS mandate")
public void user_searchs_on_the_basis_of_and_approve_that_ONUS_mandate(String UMRN) {
	cancelONUSMandate=cancelONUSMandate.CancelonusMandateApprove(UMRN);
 
}

}
