package StepDefinition;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.GroupPage;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateGroupStepDefinition extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	GroupPage groupPage;
	Windowhandle win;
	
	@Given("User is logged in GPS")
	public void user_is_logged_in_GPS() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		win.handlewin1();
	}

	@When("User goes to Administration and clicks on Group and then clicks on Add menu")
	public void user_goes_to_Administration_and_clicks_on_Group_and_then_clicks_on_Add_menu()
			throws InterruptedException {
		driver.switchTo().frame("toc");
		groupPage = homePage.createGroup();

	}

	@Then("User enters {string} and {string} and selects {string} enters the {string}")
	public void user_enters_and_and_selects_enters_the_and_clicks_on(String Name, String SortPriority,String Priority,
			String Details) {
		
		groupPage.addGroup(Name, SortPriority,Priority, Details);
	}

	@Then("User goes to Administration and goes to Approve screen to approve the record")
	public void user_goes_to_Administration_and_goes_to_Approve_screen_to_approve_the_record() throws InterruptedException {
		Initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		win.handlewin1();
		driver.switchTo().frame("toc");
		groupPage=homePage.approveGroupMenu();
		groupPage=groupPage.approveGroup();
	}
	
	
}
