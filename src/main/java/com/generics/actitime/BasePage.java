package com.generics.actitime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
public WebDriver driver;
	
	public void selectbyvisibletext(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectbyvalue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void selectbyindex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void movetoelement(WebDriver driver,WebElement element) {
		Actions act = new Actions(this.driver);
		act.moveToElement(element).perform();
	}
	public void fetchTitle() {
		System.out.println(driver.getTitle());
	}
	public void robotEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void visibilityofelement(WebDriver driver) {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		 */
	}
	public void alertaccept(WebDriver driver) {
		this.driver=driver;
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
}
