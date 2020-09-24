package com.generics.actitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.pom.actitime.ActitimeHomePage;
import com.pom.actitime.ActitimeLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant{
public WebDriver driver;
	
	//@BeforeTest
	@BeforeClass
	public void openBrowser(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	//@BeforeClass
	@BeforeMethod
	public void loginActitime() throws IOException {
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();
	}
	
	//@AfterClass
	@AfterMethod
	  public void quitBrowser() { 
		ActitimeHomePage home = new
	  ActitimeHomePage(driver); home.logout(); }
	 	
	//@AfterTest
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
}
