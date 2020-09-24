package com.scripts.actitime;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pom.actitime.ActitimeHomePage;
import com.pom.actitime.ActitimeSettingsPage;
import com.pom.actitime.ActitimeTypeOfWorkPage;

public class TESTActitimeDeleteWorkType extends BaseTest{
	@Test
 	public void deleteTypeOfWork() throws InterruptedException {
	 	ActitimeHomePage home = new ActitimeHomePage(driver);
		home.settings();
		
		ActitimeSettingsPage setting= new ActitimeSettingsPage(driver);
		setting.typeOfWork();
		
		ActitimeTypeOfWorkPage workPage = new ActitimeTypeOfWorkPage(driver);
		workPage.deleteWorkMethod();
	}
}
