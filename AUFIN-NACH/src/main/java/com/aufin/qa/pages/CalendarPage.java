package com.aufin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.constants.IntfConstants;
import com.aufin.qa.util.Windowhandle;

public class CalendarPage extends TestBase{
	
	@FindBy(name="year")
	WebElement enterYear;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[6]/td/input[2]")
	WebElement okBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[7]/td/input[2]")
	WebElement okButton;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/p/input[2]")
	WebElement okbtn;
	
	@FindBy(name="org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;
	
	@FindBy(name="collapse")
	WebElement calendarCollapsecheckbox;
	
	@FindBy(xpath="//center//input[2]")
	WebElement calendarOKBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[8]/td/input[2]")
	WebElement calendarOK1Btn;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement clickonCalendar;
	
	@FindBy(name="approve")
	WebElement approveBtn;
	
	@FindBy(name="reject")
	WebElement rejectBtn;
	
	@FindBy(xpath="//p[@class='errormessages']")
	WebElement errormessages;
	
	@FindBy(xpath="//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflowBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[6]/td/input[1]")
	WebElement resetBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[8]/td/input[1]")
	WebElement ResetBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/table/tbody/tr[7]/td/input[1]")
	WebElement resetbtn;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[4]")
	WebElement confirmYeartext;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn; 
	
	public CalendarPage() {
		PageFactory.initElements(driver, this);
	}
	
	public CalendarPage createCalendar(Windowhandle win,String Year) throws InterruptedException {
		win.handlewin();
		enterYear.sendKeys(Year);
		resetBtn.click();
		System.out.println("Reset button is clicked");
		String a=enterYear.getText();
		if(a.isEmpty()) {
			System.out.println("Reset button functionaliy is working fine");
		}
		else {
			System.out.println("Reset button functionality is not working ");
		}
		enterYear.sendKeys(Year);
		okBtn.click();
		cancelBtn.click();
		String b=errormessages.getText();
		String c="Operation Create new calendar was cancelled.";
		if(b.equals(c))
		{
			System.out.println("Cancel Button is working fine");
		}
		else {
			System.out.println("Cancel button is not working");
		}
		restartWorkflowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		enterYear.sendKeys(Year);
		okBtn.click();
		okButton.click();
		cancelBtn.click();
		if(b.equals(c))
		{
			System.out.println("Cancel Button from Calendar details screen is working fine");
		}
		else {
			System.out.println("Cancel button from Calendar details screen is not working");
		}
		restartWorkflowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		enterYear.sendKeys(Year);
		okBtn.click();
		okButton.click();
		okbtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}
	
	public CalendarPage createCalendar1(Windowhandle win, String Year) throws InterruptedException {
		win.handlewin();
		enterYear.sendKeys(Year);
		okBtn.click();
		String a=errormessages.getText();
		String b="Invalid Year.";
		if(a.equals(b)) {
			System.out.println("Proper error messages is displayed for Invalid Year");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage(); 
	}
	
	public CalendarPage createCalendar2(Windowhandle win, String Year) throws InterruptedException {
		win.handlewin();
		enterYear.sendKeys(Year);
		okBtn.click();
		String a=errormessages.getText();
		String b="Calendar already exists";
		if(a.equals(b)) {
			System.out.println("Proper error messages is displayed for Already existing Year");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage(); 
	}
	
	public CalendarPage approveCalendar(Windowhandle win,String Year) throws InterruptedException {
		win.handlewin();
		enterYear.sendKeys(Year);
		calendarCollapsecheckbox.click();
		resetbtn.click();
		System.out.println("Reset button is clicked");
		String a=enterYear.getText();
		if(a.isEmpty()) {	 
			System.out.println("Reset button functionaliy is working fine");
		}
		else {
			System.out.println("Reset button functionality is not working ");
		}
		enterYear.sendKeys(Year);
		calendarCollapsecheckbox.click();
		calendarOKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		clickonCalendar.click();
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}
	
	public CalendarPage rejectCalendar(Windowhandle win,String Year) throws InterruptedException {
		win.handlewin();
		enterYear.sendKeys(Year);
		calendarCollapsecheckbox.click();
		resetbtn.click();
		System.out.println("Reset button is clicked");
		String a=enterYear.getText();
		if(a.isEmpty()) {	 
			System.out.println("Reset button functionaliy is working fine");
		}
		else {
			System.out.println("Reset button functionality is not working ");
		}
		enterYear.sendKeys(Year);
		calendarCollapsecheckbox.click();
		calendarOKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		clickonCalendar.click();
		rejectBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}
	
	public CalendarPage viewCalendar(Windowhandle win,String Year) throws InterruptedException {
		win.handlewin();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		enterYear.sendKeys(Year);
		calendarCollapsecheckbox.click();
		ResetBtn.click();
		System.out.println("Reset button is clicked");
		String a=enterYear.getText();
		if(a.isEmpty()) {	 
			System.out.println("Reset button functionaliy is working fine");
		}
		else {
			System.out.println("Reset button functionality is not working ");
		}
		enterYear.sendKeys(Year);
		calendarCollapsecheckbox.click();
		calendarOK1Btn.click();
		String b=confirmYeartext.getText();
		String c=Year;
		if(b.equals(c)) {
			System.out.println("Calendar for year " +Year+ " gets successfully added");
		}
		else{
			System.out.println("Calendar is not added for " +Year+ " year");
		}
		clickonCalendar.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage viewCalendar1(Windowhandle win,String Year) throws InterruptedException {
		win.handlewin();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		enterYear.sendKeys(Year);
		calendarCollapsecheckbox.click();
		ResetBtn.click();
		System.out.println("Reset button is clicked");
		String a=enterYear.getText();
		if(a.isEmpty()) {	 
			System.out.println("Reset button functionaliy is working fine");
		}
		else {
			System.out.println("Reset button functionality is not working ");
		}
		enterYear.sendKeys(Year);
		calendarCollapsecheckbox.click();
		calendarOK1Btn.click();
		String b=errormessages.getText();
		String c="No items available for List operation given the search criteria";
		if(b.equals(c)) {
			System.out.println("Calendar for year " +Year+ " validation is properly displayed");
		}
		else{
			System.out.println("Calendar is not added for " +Year+ " validation is not proper");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}
	
	
}
