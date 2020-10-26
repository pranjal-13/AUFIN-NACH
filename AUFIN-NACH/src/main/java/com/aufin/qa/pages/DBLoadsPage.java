package com.aufin.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aufin.qa.base.TestBase;
import com.aufin.qa.util.Windowhandle;

import io.cucumber.datatable.DataTable;

public class DBLoadsPage extends TestBase{

	@FindBy(name="loadType")
	WebElement selectLoadtype;
	
	@FindBy(name="forceUpdate")
	WebElement forceUpdate;
	
	@FindBy(name="fileName")
	WebElement fileName;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[6]/td/input[1]")
	WebElement OKBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[6]/td/input[2]")
	WebElement confirmBtn;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn; 
	
	public DBLoadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public DBLoadsPage addIFSCList(Windowhandle win,DataTable credentials) throws InterruptedException {
		win.handlewin();
		List<List<String>> data=credentials.asLists();
		Select sl=new Select(selectLoadtype);
		sl.selectByVisibleText(data.get(0).get(0));
		Select sl1=new Select(forceUpdate);
		sl1.selectByVisibleText(data.get(0).get(1));
		fileName.sendKeys(data.get(0).get(2));
		OKBtn.click();
		confirmBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new DBLoadsPage();
	}
	
}
