package StepDefinition;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.xmlFileReader;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdministrationStepDefinition extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	Windowhandle win;
	SoftAssert sa=new SoftAssert();
	xmlFileReader x=new xmlFileReader();

	@Given("User is in GPS")
	public void user_is_in_GPS() throws InterruptedException, ParserConfigurationException {
		Initialization();
		win = new Windowhandle(driver);
		LoginPage loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		win.handlewin1();
		x.fileReader();
	}

	@Given("User clicks on System menu and its submenu")
	public void user_clicks_on_System_menu_and_it_s_submenu() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		System.out.println("Switched");
		homePage.systemPage(sa);
		System.out.println("compelted");
	}

	@Given("User clicks on user menu and its submenu")
	public void user_clicks_on_user_menu_and_it_s_submenu() throws InterruptedException, ParserConfigurationException {
		homePage.userPageLinks(sa);
	}

	@Given("User clicks on Group menu and its submenu")
	public void user_clicks_on_Group_menu_and_it_s_submenu() throws InterruptedException, ParserConfigurationException  {
		homePage.groupPageLinks(sa);
	}

	@Then("User clicks on Profile menu and its submenu")
	public void user_clicks_on_Profile_menu_and_it_s_submenu() throws InterruptedException, ParserConfigurationException {
		homePage.profilePageLinks(sa);
	}
	
	@Then("Logout User")
	public void logout_User() throws InterruptedException{
		driver.switchTo().frame("content");
	    homePage.ClickonLogoutBtn();
	    sa.assertAll();
	}

}
