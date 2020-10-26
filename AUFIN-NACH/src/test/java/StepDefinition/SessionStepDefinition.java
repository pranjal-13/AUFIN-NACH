package StepDefinition;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.xmlFileReader;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SessionStepDefinition extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	SoftAssert sa=new SoftAssert();
	Windowhandle win ;
	xmlFileReader x=new xmlFileReader();
	
	@Given("User logged into the application")
	public void user_logged_into_the_application() throws InterruptedException, ParserConfigurationException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage=new LoginPage(); 
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("MPS NACH", title);
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		win.handlewin1();
		x.fileReader();
	}

	@Then("Check Session>>Password menu")
	public void check_Session_Password_menu() throws Exception {
		driver.switchTo().frame("toc");
		homePage.ClickonSessionPasswordLink();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Session_Password",sa);
	}

	@Then("Check Session>>Logout menu")
	public void check_Session_Logout_menu() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.ClickonSessionLogoutLink();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		win.verifyPages("Session_Logout",sa);
	}

		
	
}
