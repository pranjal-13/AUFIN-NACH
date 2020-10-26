package StepDefinition;

import org.testng.Assert;
import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.pages.AccountingPage;
import com.aufin.qa.pages.BusinessGroupPage;
import com.aufin.qa.pages.CalendarPage;
import com.aufin.qa.pages.CustomerPage;
import com.aufin.qa.pages.DBLoadsPage;
import com.aufin.qa.pages.HomePage;
import com.aufin.qa.pages.IFSCCODEList;
import com.aufin.qa.pages.IndustryTypePage;
import com.aufin.qa.pages.LoginPage;
import com.aufin.qa.util.Windowhandle;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MaintenanceStepDefinition extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	CalendarPage calendarPage;
	IndustryTypePage industryTypePage;
	AccountingPage accountingPage;
	BusinessGroupPage businessGroupPage;
	CustomerPage customerPage;
	DBLoadsPage dbLoadsPage;
	IFSCCODEList ifsccodeList;
	Windowhandle win;
	
	@Given("User login in the application")
	public void user_login_in_the_application() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("MPS NACH", title);
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
	}
	
	@Then("User goes to Maintenance and open Calendar menu to add Calendar for {string}")
	public void user_goes_to_Maintenance_and_open_Calendar_menu_to_add_Calendar_for(String Year) throws InterruptedException {
		driver.switchTo().frame("toc");
		calendarPage = homePage.clickonCreateCalendarLink();
		calendarPage = calendarPage.createCalendar(win, Year);
	}

	@Then("User open Calendar menu to add Calendar for {string}")
	public void user_open_Calendar_menu_to_add_Calendar_for(String Year) throws InterruptedException {
		driver.switchTo().frame("toc");
		calendarPage = homePage.clickonCreateCalendarLink();
		calendarPage=calendarPage.createCalendar1(win, Year);
	}
	
	@Then("User add Calendar for {string}")
	public void user_add_Calendar_for(String Year) throws InterruptedException {
		driver.switchTo().frame("toc");
		calendarPage = homePage.clickonCreateCalendarLink();
		calendarPage=calendarPage.createCalendar2(win, Year);
	}
	
	@Then("User Approves Calendar for {string}")
	public void user_Approves_Calendar_for(String Year) throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT); 
		driver.switchTo().frame("toc");
		calendarPage=homePage.clickonApproveCalendarLink();
		calendarPage=calendarPage.approveCalendar(win,Year);
	}

	@Then("User Reject Calendar for {string}")
	public void user_Reject_Calendar_for(String Year) throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT); 
		driver.switchTo().frame("toc");
		calendarPage=homePage.clickonApproveCalendarLink();
		calendarPage=calendarPage.rejectCalendar(win, Year);
	}
	
	@Then("User View the Calendar for {string}")
	public void user_View_the_Calendar_for(String Year) throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		calendarPage=homePage.clickonViewCalendarLink();
		calendarPage=calendarPage.viewCalendar(win,Year);
	}
	
	@Then("User Views the Calendar for {string}")
	public void user_Views_the_Calendar_for(String Year) throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		calendarPage=homePage.clickonViewCalendarLink();
		calendarPage=calendarPage.viewCalendar1(win, Year);
	}
	
	@Then("User goes to Corporate CMS and open Industry type menu to add Industry type with {string} and {string}")
	public void user_goes_to_Corporate_CMS_and_open_Industry_type_menu_to_add_Industry_type_with_and(String IndustryTypecode, String IndustryTypedesc) throws InterruptedException {
		driver.switchTo().frame("toc");
		industryTypePage=homePage.clickonAddIndustryTypeLink();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		industryTypePage=industryTypePage.addIndustrytype(win, IndustryTypecode, IndustryTypedesc);
	}
	
	@Then("Checker will approve the same for {string}")
	public void checker_will_approve_the_same_for(String IndustryTypecode) throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		industryTypePage=homePage.clickonApproveIndustryTypeLink();
		industryTypePage=industryTypePage.approveIndustryType(win,IndustryTypecode);
	}
	
	@Then("Maker will view the list")
	public void maker_will_view_the_list() throws InterruptedException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("MPS NACH", title);
		homePage = loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		industryTypePage=homePage.clickonListIndustryTypeLink();
		industryTypePage=industryTypePage.listIndustryType(win);	
	}
		
	@Then("User goes to Corporate CMS and open Business Group menu to add Business group with {string} and {string}")
	public void user_goes_to_Corporate_CMS_and_open_Business_Group_menu_to_add_Business_group_with_and(String Groupname, String GroupDesc) throws InterruptedException {
		driver.switchTo().frame("toc");
		businessGroupPage=homePage.clickonaddBusinessgroupLink();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		businessGroupPage=businessGroupPage.addBusinessGroup(win,Groupname,GroupDesc);
	}
	
	@Then("User add Business group with {string} and {string}")
	public void user_add_Business_group_with_and(String Groupname, String GroupDesc) throws InterruptedException {
		driver.switchTo().frame("toc");
		businessGroupPage=homePage.clickonaddBusinessgroupLink();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		businessGroupPage=businessGroupPage.addBusinessGroup1(win, Groupname, GroupDesc);
	}
	
	
	@Then("checker will approve for {string}")
	public void checker_will_approve_for(String Groupname) throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		businessGroupPage=homePage.clickonapproveBusinessgroupLink();
		businessGroupPage=businessGroupPage.approveBusinessGroup(win, Groupname);
	}
	
	@Then("User will view List")
	public void user_will_view_List() throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		businessGroupPage=homePage.clickonlistBusinessgroupLink();
		businessGroupPage=businessGroupPage.listBusinessGroup(win);
	}
	
	@Then("User goes to Corporate CMS and open Accounting menu to add Accounting using {string},{string},{string},{string},{string},{string}")
	public void user_goes_to_Corporate_CMS_and_open_Accounting_menu_to_add_Accounting_using(String Accountingcode, String AccountingDesc, String CreditAccNo, String DebitAccNo, String ChargeAccNo, String IsAutoDebitCharge) throws InterruptedException {
	   driver.switchTo().frame("toc");
	   accountingPage=homePage.clickonaddAccountingLink();
	   accountingPage=accountingPage.addAccounting(win, Accountingcode, AccountingDesc, CreditAccNo, DebitAccNo, ChargeAccNo, IsAutoDebitCharge);
	}
	
	@Then("Checker should approve the same with {string}")
	public void checker_should_approve_the_same_with(String Accountingcode) throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		accountingPage=homePage.clickonapproveAccountingLink();
		accountingPage=accountingPage.approveAccounting(win, Accountingcode);
	}
	
	@Then("User should view the List")
	public void user_should_view_the_List() throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		accountingPage=homePage.clickonlistAccountingLink();
		accountingPage=accountingPage.listAccounting(win);
	}
	
	@Then("User goes to Corporate CMS and open Customer menu to add Customer")
	public void user_goes_to_Corporate_CMS_and_open_Customer_menu_to_add_Customer(DataTable credentials) throws InterruptedException {
	    driver.switchTo().frame("toc");
	    customerPage=homePage.clickonaddCustomerLink();
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    customerPage=customerPage.addCustomer(win,credentials);
	}
	
	@Then("Checker will approve the Customer")
	public void checker_will_approve_the_Customer() throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		customerPage=homePage.clickonapproveCustomerLink();
		customerPage=customerPage.approveCustomer(win);
	}

	@Then("User views the Customer")
	public void user_views_the_Customer() throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		customerPage=homePage.clickonlistCustomerLink();
		customerPage=customerPage.listCustomer(win);
	}
	
	@Then("User goes to Static Data and open DB Loads menu to add IFSC codes")
	public void user_goes_to_Static_Data_and_open_DB_Loads_menu_to_add_IFSC_codes() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    dbLoadsPage=homePage.clickonStaticDataDBLoadsLink();
	}

	@Then("User uploads IFSC list")
	public void user_uploads_IFSC_list(DataTable credentials) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		dbLoadsPage=dbLoadsPage.addIFSCList(win,credentials);
		
	}

	@Then("User views IFSC List")
	public void user_views_IFSC_List() throws InterruptedException {
		Initialization();
		win=new Windowhandle(driver);
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(IntfConstants.TIMEOUT);
		driver.switchTo().frame("toc");
		ifsccodeList=homePage.clickonlistIFSCCodeLink();
		ifsccodeList=ifsccodeList.listIFSCCODEcode(win);
	}
	
	}
