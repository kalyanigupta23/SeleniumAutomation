package com.pom.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;

public class ActitimeSettingsPage extends BasePage implements AutoConstant{
	@FindBy(xpath="//div[.='Turn Features On / Off']")
	private WebElement onandoffLink;
	
	@FindBy(xpath="//div[contains(text(),'General Settings')]")
	private WebElement generalSettingsLink;
	
	@FindBy(xpath="//a[.='Workflow Settings']")
	private WebElement workflowSettingsLink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeOfWorkLink;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leaveTypeLink;
	
	@FindBy(xpath="//a[.='Notifications']")
	private WebElement notificationsLink;
	
	@FindBy(xpath="//a[.='Logo Settings']")
	private WebElement logoSettingsLink;
	
	@FindBy(xpath="//div[.='Licenses']")
	private WebElement licensesLink;
	
	public ActitimeSettingsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void turnFeatures() {
		onandoffLink.click();
	}
	public void generalSettings() {
		generalSettingsLink.click();
	}
	public void workflowSetting() {
		workflowSettingsLink.click();
	}
	public void typeOfWork() {
		typeOfWorkLink.click();
	}
	public void leaveTypes() {
		leaveTypeLink.click();
	}
	public void notifications() {
		notificationsLink.click();
	}
	public void logoSettings() {
		logoSettingsLink.click();
	}
	public void licenses() {
		licensesLink.click();
	}
}
