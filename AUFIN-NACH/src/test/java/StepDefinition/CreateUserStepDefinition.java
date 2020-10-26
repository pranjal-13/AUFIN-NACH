package StepDefinition;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.UserPage;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateUserStepDefinition extends TestBase {

	LoginPage loginPage;
	HomePage homepage;
	UserPage userpage;
	Windowhandle win;

	@Given("User is login on GPS")
	public void user_is_login_on_GPS() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);

	}

	@Given("User goes to administration and users and clicks on Add menu")
	public void user_goes_to_administration_and_users_and_clicks_on_Add_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		userpage = homepage.CreateUser();
	}

	@Then("User enter {string} and {string} and selects {string} and {string} and {string} clicks on Ok button")
	public void user_enter_and_and_selects_and_and_clicks_on_Ok_button(String UserName, String FullName, String Profile,
			String Password, String Verifypassword) {

		userpage = userpage.addUser(UserName, FullName, Profile, Password, Verifypassword);
		driver.quit();
	}

	@Then("User goes to Administration and clicks to Approve screen")
	public void user_goes_to_Administration_and_clicks_to_Approve_screen() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.LONG_TIMEOUT);
		driver.switchTo().frame("toc");
		userpage = homepage.approveMenu();
	}

	@Then("User clicks approves the record and gets log out")
	public void user_clicks_approves_the_record_and_gets_log_out() {
		userpage = userpage.approveUser();
		//driver.quit();
	}

	/*@Then("User updates the password")
	public void user_updates_the_password() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username2"), prop.getProperty("password2"));
		Thread.sleep(IntfConstants.TIMEOUT);

		userpage = new UserPage();
		userpage = userpage.PswdChange();

	}*/

	/*@Given("User tries to login with new user")
	public void user_tries_to_login_with_new_user() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username3"), prop.getProperty("password3"));
		Thread.sleep(IntfConstants.TIMEOUT);

	}
*/
}
