package com.pom.actitime;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;

public class ActitimeLeaveTypePage extends BasePage implements AutoConstant{
	//public WebDriver driver;
	
	@FindBy(id="ext-comp-1002")
	private WebElement createLeaveTypeButton;
	
	@FindBy(xpath="//span[.='MatLeave']")
	private WebElement leaveTypeLink;
	
	@FindBy(id="inputDiv")
	private WebElement leaveTypeTextField;
	
	@FindBy(xpath="(//div[@class='applyButton'])[2]")
	private WebElement applyButton;
	
	@FindBy(xpath="(//div[@class='cancelButton'])[3]")
	private WebElement cancelButton;
	
	@FindBy(xpath="//span[.='Maternity']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement deleteLink;
	
	public ActitimeLeaveTypePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver, 20);
	}
	
	public void createLeaveMethod() {
		createLeaveTypeButton.click();
	}	
	public void deleteLeaveMethod() {
		deleteLink.click();
		alertaccept(driver);
	}
	public void editleavetypeMethod() throws IOException {
		leaveTypeLink.click();
		leaveTypeTextField.clear();
		leaveTypeTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, leave_sheet, 1, 2));
	}
	public void apply() {
		applyButton.click();
	}
	public void cancel() {
		cancelButton.click();
	}
}
