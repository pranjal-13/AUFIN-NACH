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

public class EnvironmentStepDefinition extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	Windowhandle win;
	SoftAssert sa=new SoftAssert();
	xmlFileReader x=new xmlFileReader();
	
	@Given("User is in the GPS")
	public void user_is_in_the_GPS() throws InterruptedException, ParserConfigurationException {
		Initialization();
		win = new Windowhandle(driver);
		LoginPage loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		win.handlewin1();
		x.fileReader();
	}

	@Then("User clicks on Enviornment and its submenu")
	public void user_clicks_on_Enviornment_and_its_submenu() throws InterruptedException, ParserConfigurationException {
		homePage.enviornmentPageLinks(sa);
	}
	
	@Then("User Logged out")
	public void user_Logged_out() throws InterruptedException {
		driver.switchTo().frame("content");
	    homePage.ClickonLogoutBtn();

	}
	
	
}
