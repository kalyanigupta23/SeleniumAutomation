package com.pom.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;

public class ActitimeLoginPage extends BasePage implements AutoConstant{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloginClick;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'password?')]")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[.='actiTIMEInc.']")
	private WebElement acttimeLink;
	
	public ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void loginMethod() throws IOException {
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		keepmeloginClick.click();
		loginButton.click();
	}
	
	public void forgorPassword() {
		forgotPasswordLink.click();
	}
	
	public void actiTimeInc() {
		acttimeLink.click();
	}
}
