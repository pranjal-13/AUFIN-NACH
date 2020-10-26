package StepDefinition;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.ProfilePage;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateProfileStepDefinition extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ProfilePage profilePage;
	Windowhandle win;
	
	@Given("when user is logged in GPS")
	public void when_user_is_logged_in_GPS() throws InterruptedException {
	    Initialization();
	    win = new Windowhandle(driver);
	    loginPage=new LoginPage();
	    homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    Thread.sleep(IntfConstants.TIMEOUT);
	}

	@Given("User goes to Administration and clicks to Profile and then clicks on Add menu")
	public void user_goes_to_Administration_and_clicks_to_Profile_and_then_clicks_on_Add_menu() throws InterruptedException {
	    
		driver.switchTo().frame("toc");
		profilePage=homePage.createProfile();
	}
	
	@Then("User enters profile name for maker {string} and clicks on Checkbox and clicks Ok button")
	public void user_enters_profile_name_for_maker_and_clicks_on_Checkbox_and_clicks_Ok_button(String profileName) {
		
		profilePage.addProfileMaker(profileName);
	}
	
	
/*
	@Then("User enters profile name for checker {string} and clicks on CheckAll checkbox and clicks on Ok button")
	public void user_enters_profile_name_and_clicks_on_CheckAll_checkbox_and_clicks_on_Ok_button(String profileName) {
		
	    profilePage.addProfileChecker(profileName);
	}
*/
	@Then("User goes to Administration and Clicks on Profile and goes to Approve menu and approve the record")
	public void user_goes_to_Administration_and_Clicks_on_Profile_and_goes_to_Approve_menu_and_approve_the_record() throws InterruptedException {
	    Initialization();
	    win = new Windowhandle(driver);	  
	    loginPage=new LoginPage();
	    homePage=loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
	    Thread.sleep(IntfConstants.TIMEOUT);
	    driver.switchTo().frame("toc");
	    profilePage=homePage.approveProfileMenu();
	    
	    
	    profilePage=profilePage.approveProfile();
	    
	}
}
