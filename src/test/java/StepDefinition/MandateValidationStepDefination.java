package StepDefinition;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.CancelONUSMandate;
import com.aufin.qa.pages.CreateONUSMandate;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.pages.xmlFileReader2;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MandateValidationStepDefination extends TestBase {
	

	LoginPage loginPage;
	HomePage homePage;
	Windowhandle win;
	CreateONUSMandate createONUSMandate;
	CancelONUSMandate cancelONUSMandate;
	SoftAssert sa = new SoftAssert();
	xmlFileReader2 x = new xmlFileReader2();
	
@Given("MPS is already logged in")
public void MPS_is_already_logged_in() throws InterruptedException, ParserConfigurationException 
{
	Initialization();
	win = new Windowhandle(driver);
	loginPage = new LoginPage();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("MPS NACH", title);
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(IntfConstants.TIMEOUT);
	win.handlewin1(); 
	driver.switchTo().frame("toc");
	createONUSMandate=homePage.ListMandate();
    Thread.sleep(IntfConstants.TIMEOUT);
    createONUSMandate= new CreateONUSMandate();
    createONUSMandate = createONUSMandate.ViewingMandate();
    
    Thread.sleep(IntfConstants.TIMEOUT);
 
    
}

@Then("User views the mandate")
public void user_views_the_mandate() throws ParserConfigurationException, InterruptedException {

	x.fileReader();
    createONUSMandate= new CreateONUSMandate();
	createONUSMandate.verifynamefield(createONUSMandate, "Name", sa);
	createONUSMandate=createONUSMandate.verifyaccountnumberfield("Account_Number",sa);
	createONUSMandate=createONUSMandate.verifyamountfield("Amount", sa);
	createONUSMandate=createONUSMandate.verifyfixedfield("Fixed", sa);
	createONUSMandate=createONUSMandate.verifystartdatefield("Start_date_from", sa);
	createONUSMandate=createONUSMandate.verifycustomernamefield("Customer_name", sa);
	createONUSMandate=createONUSMandate.verifyconsumerreffield("Consumer_reference", sa);
	createONUSMandate=createONUSMandate.verifycategoryfield("Category", sa);
	createONUSMandate=createONUSMandate.verifycreatedatefield("Create_Date", sa);
	createONUSMandate=createONUSMandate.verifyutilitycodefield("Utility_Code", sa);
	createONUSMandate=createONUSMandate.verifylastupdatedonfield("Last_Updated_on", sa);
	createONUSMandate=createONUSMandate.verifydestinationbankfield("Destination_Bank", sa);
	createONUSMandate=createONUSMandate.verifysponserbankfield("Sponser_Bank", sa);
	createONUSMandate=createONUSMandate.verifydestinationbanknamefield("Destination_Bank_Name", sa);	
	sa.assertAll();
  
}



@Then("User logs out from the system")
public void user_logs_out_from_the_system() throws InterruptedException {
   
	driver.switchTo().frame("content");
	homePage.ClickonLogoutBtn();   
}



}
