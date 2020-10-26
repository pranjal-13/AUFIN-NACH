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

public class UtilityStepDefintion extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	Windowhandle win;
	SoftAssert sa = new SoftAssert();
	xmlFileReader x = new xmlFileReader();
	
	@Given("Login to the GPS application")
	public void login_to_the_GPS_application() throws InterruptedException, ParserConfigurationException {
		Initialization();
		win = new Windowhandle(driver);
		loginPage = new LoginPage();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("MPS NACH", title);
		homePage = loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		Thread.sleep(IntfConstants.TIMEOUT);
		win.handlewin1();
		x.fileReader();
		
	}

	@Then("Check Utility>>Dashboard>>Outward Transactions")
	public void check_Utility_Dashboard_Outward_Transactions() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksDashboardOuterTransactions();
		win.verifyPages("Dashboard_Outward_Transactions", sa);	  
	}

	@Then("Check Utility>>Dashboard>>Inward Transactions")
	public void check_Utility_Dashboard_Inward_Transactions() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksDashboardInwardTransactions();
		win.verifyPages("Dashboard_Inward_Transactions", sa);	  
	}

	@Then("Check Utility>>Dashboard>>Outward Mandates")
	public void check_Utility_Dashboard_Outward_Mandates() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksDashboardOutwardMandates();
		win.verifyPages("Dashboard_Outward_Mandates", sa);	 
	}

	@Then("Check Utility>>Dashboard>>Outward API Mandates")
	public void check_Utility_Dashboard_Outward_API_Mandates() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksDashboardOutwardAPIMandates();
		win.verifyPages("Dashboard_Outward_API_Mandates", sa);	  
	}

	@Then("Check Utility>>Dashboard>>Inward Mandates")
	public void check_Utility_Dashboard_Inward_Mandates() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksDashboardInwardMandates();
		win.verifyPages("Dashboard_Inward_Mandates", sa);	  
	}

	@Then("Check Utility>>Dashboard>>Inward API Mandates")
	public void check_Utility_Dashboard_Inward_API_Mandates() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksDashboardInwardAPIMandates();
		win.verifyPages("Dashboard_Inward_API_Mandates", sa);	  
	}

	@Then("Check Report>>Report>>EOD Reconciliation")
	public void check_Report_Report_EOD_Reconciliation() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportEODReconciliation();
		win.verifyPages("Report_EOD_Reconciliation", sa);	 
	}

	@Then("Check Report>>Report>>User Activity")
	public void check_Report_Report_User_Activity() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportdUserActivity();
		win.verifyPages("Report_User_Activity", sa);	 
	}

	@Then("Check Report>>Report>>Mandate>>Inward Mandate")
	public void check_Report_Report_Mandate_Inward_Mandate() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportInwardMandate();
		win.verifyPages("Report_Mandate_Inward_Mandate", sa);	 
	}

	@Then("Check Report>>Report>>Mandate>>Outward Mandate")
	public void check_Report_Report_Mandate_Outward_Mandate() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportOutwardMandate();
		win.verifyPages("Report_Mandate_Outward_Mandate", sa);	 
	}

	@Then("Check Report>>Report>>Payments>>Inward")
	public void check_Report_Report_Payments_Inward() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportUtilityInwardPayments();
		win.verifyPages("Report_Payments_Inward", sa);	 
	}

	@Then("Check Report>>Report>>Payments>>Outward")
	public void check_Report_Report_Payments_Outward() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportUtilityOutwardPayments();
		win.verifyPages("Report_Payments_Outward", sa);	 
	}

	@Then("Check Report>>Report>>Charging Report>>Booking Report")
	public void check_Report_Report_Charging_Report_Booking_Report() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportChargingBookingReport();
		win.verifyPages("Report_ChargingReport_Booking_Report", sa);	 
	}

	@Then("Check Report>>Report>>Charging Report>>Billing Invoice")
	public void check_Report_Report_Charging_Report_Billing_Invoice() throws InterruptedException, ParserConfigurationException 
	{
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportChargingBillingInvoiceReport();
		win.verifyPages("Report_ChargingReport_Billing_Invoice", sa);
	}

	@Then("Check Report>>Report>>Productivity>>Mandate>>Inward Mandate")
	public void check_Report_Report_Productivity_Mandate_Inward_Mandate() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportProductivityInwardMandate();
		win.verifyPages("Report_Productivity_Mandate_InwardMandate", sa);

	}
	@Then("Check Report>>Report>>Productivity>>Mandate>>Outward Mandate")
	public void check_Report_Report_Productivity_Mandate_Outward_Mandate() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportdProductivityOutwardMandate();
		win.verifyPages("Report_Productivity_Mandate_OutwardMandate", sa);
	}

	@Then("Check Report>>Report>>Summary")
	public void check_Report_Report_Summary() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportSummary();
		win.verifyPages("Report_Summary", sa);
		
	}

	@Then("Check Report>>Report>>Aadhar Mapper")
	public void check_Report_Report_Aadhar_Mapper() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportAadharMapper();
		win.verifyPages("Report_Aadhar_Mapper", sa);
	}

	@Then("Check Report>>Report>>CBDT Report-CBDT Report")
	public void check_Report_Report_CBDT_Report_CBDT_Report() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportCBDTReport();
		win.verifyPages("CBDT_Report_CBDT_Report", sa);
	}

	@Then("Check Report>>Report>>Return Memo")
	public void check_Report_Report_Return_Memo() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportReturnMemo();
		win.verifyPages("Report_Return_Memo", sa);
	}

	@Then("Check Report>>Report>>Corporate Funding Report")
	public void check_Report_Report_Corporate_Funding_Report() throws InterruptedException, ParserConfigurationException {
		driver.switchTo().frame("toc");
		homePage.UtilityLinksReportCorporateFundingReport();
		win.verifyPages("Report_Corporate_Funding_Report", sa);	}
/*
	@Then("logout")
	public void logout() throws InterruptedException {
		driver.switchTo().frame("content");
		homePage.ClickonLogoutBtn();
		sa.assertAll();
	}

*/
	

}
