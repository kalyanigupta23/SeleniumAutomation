package com.pom.actitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.generics.actitime.AutoConstant;
import com.generics.actitime.BasePage;

public class ActitimeTypeOfWorkPage extends BasePage implements AutoConstant{
	public WebDriver driver;
	
	@FindBy(id="ext-gen7")
	private WebElement createTypeOfWorkButton;
	
	@FindBy(xpath="//input[@value='Show Types of Work']")
	private WebElement showTypeWorkButton;
	
	@FindBy(xpath="//input[contains(@type,'radio')][1]")
	private WebElement statusRadioButton;
	
	@FindBy(xpath="//input[contains(@type,'radio')][4]")
	private WebElement categoryRadioButton;
	
	@FindBy(xpath="//a[.='Test NG Session']/../..//td[7]")
	private WebElement deleteLink;
	
	@FindBy(xpath="//a[contains(text(),'TestNg')]")
	private WebElement workTypeLink;
	
	public ActitimeTypeOfWorkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver, 20);
	}	
	public void createWorkMethod() {
		createTypeOfWorkButton.click();
	}	
	public void deleteWorkMethod() throws InterruptedException {
		deleteLink.click();
		alertaccept(driver);
	}
	public void workOfType() {
		workTypeLink.click();
	}
}
