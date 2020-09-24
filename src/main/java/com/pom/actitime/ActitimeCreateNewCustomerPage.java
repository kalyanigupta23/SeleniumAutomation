package com.pom.actitime;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;
public class ActitimeCreateNewCustomerPage extends BasePage implements AutoConstant{
			
			public WebDriver driver;
			
			@FindBy(xpath="//span[.='DETAILS']")
			private WebElement detailsLink;
			@FindBy(xpath="//span[contains(text(),'ASSIGNED USERS')]")
			private WebElement assignedUserLink;
			@FindBy(xpath="//span[contains(text(),'MANAGERS')]")
			private WebElement managersLink;
			
			@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
			private WebElement enterCustNameTextField;
			
			@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
			private WebElement descriptionTextArea;
			
			@FindBy(xpath="//div[contains(text(),'Select Customer')]")
			private WebElement selectCustmerDropdown;
			
			@FindBy(xpath="//div[contains(text(),'Max ABC')]")
			private WebElement listDD;
			
			@FindBy(id="customerLightBoxCloseButton")
			private WebElement closeButton;
			
			@FindBy(xpath="//div[.='Create Customer']")
			private WebElement createCustomerButton;
			
			@FindBy(xpath="//div[.='Cancel']")
			private WebElement cancelButton;
			
			@FindBy(xpath="//div[.='Assign']")
			private WebElement assignButton;
			
			@FindBy(id="ext-gen108")
			private WebElement assignCloseButton;
			
			@FindBy(xpath="//span[.='reset filter']")
			private WebElement restFilterLink;
			
			@FindBy(xpath="//div[.='Add Managers']")
			private WebElement addManagersButton;
					
			public ActitimeCreateNewCustomerPage(WebDriver driver) { 
			  this.driver = driver;
			  PageFactory.initElements(driver, this); 
			}
			 
			public void customerDetails() throws IOException {
				enterCustNameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, cust_sheet, 1, 0));
				descriptionTextArea.sendKeys(ExcelLibrary.getcellvalue(excel_path, cust_sheet, 1, 1));		 
				createCustomerButton.click();
			}
			// To Handle Alert popup, showed when Click on ' Cancel'button
			public void alertPopupOk() {
				Alert alt = driver.switchTo().alert();
				alt.accept();
			}
			public void restFilter() {
				restFilterLink.click();
			}
			public void assignedUsers() {
				assignedUserLink.click();
				assignButton.click();
				//add code for assigning the Users by department
			}
			public void managers() {
				managersLink.click();
				addManagersButton.click();
				//add code for adding managers by department
			}
			public void close() {
				closeButton.click();
			}
}
