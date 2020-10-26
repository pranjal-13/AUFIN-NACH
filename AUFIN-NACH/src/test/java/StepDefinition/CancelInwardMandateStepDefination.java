package StepDefinition;


import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.CancelInwardMandate;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.xmlFileReader;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CancelInwardMandateStepDefination extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	CancelInwardMandate CancelInwardMandate; 
	Windowhandle win;
	SoftAssert sa = new SoftAssert();
	xmlFileReader x = new xmlFileReader();
	

@Given("User is going to login in the GPS")
public void user_is_going_to_login_in_the_GPS() throws InterruptedException {
	 Initialization();
	    win = new Windowhandle(driver);
	    loginPage=new LoginPage();
	    homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    Thread.sleep(IntfConstants.TIMEOUT);}

@Given("User goes to GPS application and select Mandate Management and clicks on Accept Mandate menu")
public void user_goes_to_GPS_application_and_select_Mandate_Management_and_clicks_on_Accept_Mandate_menu() throws InterruptedException {
	
	driver.switchTo().frame("toc");
	CancelInwardMandate=homePage.INWcancelmandate();
}

@Then("User searchs on the basis of {string} and accepts the mandate and logs out")
public void user_searchs_on_the_basis_of_and_accepts_the_mandate_and_logs_out(String UMRN) {
	
	
	CancelInwardMandate.InwardCancelMandate(UMRN);
	
}

@Then("User goes to Application and select Mandate Management and clicks to Approve Mandate screen")
public void user_goes_to_Application_and_select_Mandate_Management_and_clicks_to_Approve_Mandate_screen() throws InterruptedException {
	 Initialization();
	    win = new Windowhandle(driver);	  
	    loginPage=new LoginPage();
	    homePage=loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
	    Thread.sleep(IntfConstants.TIMEOUT);
	    driver.switchTo().frame("toc");
	    CancelInwardMandate=homePage.approveINWcancelmandate();

}

@Then("User searchs on the basis of {string} and approve the cancelled mandate")
public void user_searchs_on_the_basis_of_and_approve_the_cancelled_mandate(String UMRN) {
  
	
	CancelInwardMandate=CancelInwardMandate.InwardCancelMandateApprove(UMRN);
}




}
