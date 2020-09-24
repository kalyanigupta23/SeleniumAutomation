package com.pom.actitime;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;

import com.generics.actitime.ExcelLibrary;

public class ActitimeTaskPage extends BasePage implements AutoConstant{
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustLink;
	
	@FindBy(xpath="//div[.='+ New Project']")
	private WebElement newProjectLink;
	
	@FindBy(xpath="//div[.='+ New Tasks']")
	private WebElement newTaskLink;
	
	@FindBy(xpath="//div[.='Import Tasks from CSV']")
	private WebElement importLink;
	
	//these are the webelements for editing the customer Name 
		@FindBy(xpath="(//input[@type='text'])[5]")
		private WebElement startTypeNameTextField;
		
		@FindBy(xpath="//span[@class='highlightToken']")
		private WebElement custNameLink;
		
		@FindBy(xpath="(//div[@class='editButton'])[17]")
		private WebElement editbutton;
		
		@FindBy(xpath="(//div[@class='nameLabel'])[1]")
		private WebElement customerNameTextfield;
		
		@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
		private WebElement chaneNameTextfield;
	
	
	//these are WebElements for a specific Customer.
	@FindBy(xpath="//div[.='Max G']")
	private WebElement custNameButton;
	
	@FindBy(xpath="(//div[.='Max G']/../..//div[@class='editButton'])[1]")
	private WebElement custEditButton;
	
	@FindBy(xpath="//div[@class='nameLabel'][.='Max G']/../../..//div[@class='actionButton']")
	private WebElement actionsButton;
	
	@FindBy(xpath="//div[@class='deleteButton'][@style='display: inline-block;']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deletePermanentlyButton;
	
	public ActitimeTaskPage(WebDriver driver) { 
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	} 
	public void addNew() {
		addNewButton.click();
		newCustLink.click();
	}
	public void deleteCust() throws InterruptedException {
		movetoelement(driver, custNameButton);
		Thread.sleep(2000); 
		custEditButton.click();
		actionsButton.click();
		deleteButton.click();
		deletePermanentlyButton.click();
	}
	public void editCust() throws IOException, AWTException, InterruptedException {
		startTypeNameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, cust_sheet, 1, 0));
		robotEnter();
		custNameLink.click();
		editbutton.click();		
		movetoelement(driver, customerNameTextfield);
		Thread.sleep(2000);
		customerNameTextfield.click();		
		chaneNameTextfield.clear();
		chaneNameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, cust_sheet, 1, 2));
		chaneNameTextfield.click();
	}
}
