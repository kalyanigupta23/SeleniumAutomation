package com.pom.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;

public class ActitimeEditTypeOfWorkPage extends BasePage implements AutoConstant{
	
	@FindBy(xpath="//input[@value='Delete This Type of Work']")
	private WebElement deleteThisTypeofWorkButton;
	
	@FindBy(name="name")
	private WebElement nameTextField;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusDropdown;
	
	@FindBy(xpath="//input[contains(@type,'radio')][1]")
	private WebElement categoryRadioButton;
	
	@FindBy(id="billingRate_input")
	private WebElement billingrateTextField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement saveChangesButton;
	
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement cancelButton;
	
	public ActitimeEditTypeOfWorkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void deleteWorkButtomMethod() {
		deleteThisTypeofWorkButton.click();
	}
	
	public void saveChanges() throws IOException {
		nameTextField.clear();
		nameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, work_sheet, 1, 4));
		selectbyvisibletext(statusDropdown, "archived");
		categoryRadioButton.click();
		billingrateTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, work_sheet, 1, 3));
		saveChangesButton.click();
	}
	
	public void cancel() {
		cancelButton.click();
	}
}
