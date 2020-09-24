package com.pom.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTimeTrackPage {
	@FindBy(xpath="//a[.='Enter Time-Track']")
	private WebElement enterTT;
	
	@FindBy(xpath="//a[.='View Time-Track']")
	private WebElement viewTT;
	
	@FindBy(xpath="//a[.='Lock Time-Track']")
	private WebElement lockTT;
	
	@FindBy(xpath="//a[.='Approve Time-Track']")
	private WebElement approveTT;
	
	public ActitimeTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	public void enterTimeTrack() {
		enterTT.click();
	}
	public void viewTimeTrack() {
		viewTT.click();
	}
	public void lockTimeTrack() {
		lockTT.click();
	}
	public void approveTimeTrack() {
		approveTT.click();
	}
}
