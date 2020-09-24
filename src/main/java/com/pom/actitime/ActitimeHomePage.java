package com.pom.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;

public class ActitimeHomePage extends BasePage implements AutoConstant{
	
	@FindBy(xpath="//div[.='Switch to actiPLANS']")
	private WebElement switchToLink;
	
	@FindBy(xpath="//div[.='Time-Track']")
	private WebElement timetrackLink;
	
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportsLink;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement usersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calendersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement integrationLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement helpandsupportLink;
		
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	
	public ActitimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void switchToActiPlans() {
		switchToLink.click();
	}
	public void timetrack() {
		timetrackLink.click();
	}
	public void task() {
		tasksLink.click();
	}
	public void report() {
		reportsLink.click();
	}
	public void user() {
		usersLink.click();
	}
	public void calender() {
		calendersLink.click();
	}
	public void settings() {
		settingsLink.click();
	}
	public void integrations() {
		integrationLink.click();
	}
	public void helpandsupport() {
		helpandsupportLink.click();
	}
	public void logout() {
		logoutButton.click();
	}
}
