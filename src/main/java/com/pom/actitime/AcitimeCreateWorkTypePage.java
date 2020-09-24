package com.pom.actitime;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;


public class AcitimeCreateWorkTypePage extends BasePage implements AutoConstant{
	public WebDriver driver;
	@FindBy(name="name")
	private WebElement nameTextField;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusDropdown;
	
	@FindBy(xpath="//input[contains(@type,'radio')][1]")
	private WebElement categoryRadioButton;
	
	@FindBy(id="billingRate_input")
	private WebElement billingrateTextField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createButton;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement cancelButton;
	
	public AcitimeCreateWorkTypePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createWork() throws IOException {
		nameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, work_sheet, 1, 0));
		selectbyvisibletext(statusDropdown, "archived");
		categoryRadioButton.click();
		billingrateTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, work_sheet, 1, 3));
		createButton.click();
	}	
	public void cancelWork() throws InterruptedException {
		cancelButton.click();
	}
	public void alertPopupOk() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
}
