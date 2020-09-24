package com.pom.actitime;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;


public class ActitimeCreateLeaveTypePage extends BasePage implements AutoConstant{
	public WebDriver driver;
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement leaveNameTextField;
	
	@FindBy(id="leaveTypeLightBox_rateCoefficient")
	private WebElement hourRateTextField;
	
	@FindBy(id="processLeaveTimeCheckbox_createPopup")
	private WebElement processCheckbox;
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement createLeaveButton;
	
	@FindBy(id="leaveTypeLightBox_cancelBtn")
	private WebElement cancelButton;
	
	public ActitimeCreateLeaveTypePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createLeaveType() throws IOException {
		leaveNameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, leave_sheet, 1, 0));
		hourRateTextField.clear();
		hourRateTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, leave_sheet, 1, 1));
		processCheckbox.click();
		createLeaveButton.click();
	}
	
	public void cancelLeave() {
		cancelButton.click();
	}
	
	public void alertPopupOk() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
}
