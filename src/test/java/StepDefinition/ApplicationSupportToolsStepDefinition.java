package StepDefinition;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.xmlFileReader;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationSupportToolsStepDefinition extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	SoftAssert sa=new SoftAssert();
	xmlFileReader x=new xmlFileReader();
	
	@When("user log in GPS")
	public void user_log_in_GPS() throws InterruptedException, ParserConfigurationException {
	    Initialization();
	    loginPage=new LoginPage();
	    homePage=loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
	    Thread.sleep(IntfConstants.TIMEOUT);
		Windowhandle win = new Windowhandle(driver);
		win.handlewin1();
		x.fileReader();
	}

	@When("User Clicks on ApplicationSupportTools menu and its submenu")
	public void user_Clicks_on_ApplicationSupportTools_menu_and_its_submenu() throws InterruptedException, ParserConfigurationException {
	   homePage.applicationSupportLinks(sa);
	}
	
	@Then("User will logout")
	public void user_will_logout() throws InterruptedException{
		driver.switchTo().frame("content");
		homePage.ClickonLogoutBtn();
		sa.assertAll();
	}
}
