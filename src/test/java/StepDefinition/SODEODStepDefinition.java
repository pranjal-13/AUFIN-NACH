package StepDefinition;

import org.junit.Assert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.EnvironmentPage;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.util.Windowhandle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SODEODStepDefinition extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	EnvironmentPage environmentPage;
	Windowhandle win;
	
	@Given("User login with valid data")
	public void login_with_username_and_password() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("MPS NACH", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	@Then("User goes to EnvironmentRun menu and Set Business date and performs SOD")
	public void user_goes_to_EnvironmentRun_menu_and_Set_Business_date_and_performs_SOD() throws InterruptedException {
		driver.switchTo().frame("toc");
		environmentPage=homePage.clickonEnvironmentRunLink();
		environmentPage.clickonEnvironmentokbutton(win);
		environmentPage.businessDate();
		environmentPage.LogOut();
	}

}
