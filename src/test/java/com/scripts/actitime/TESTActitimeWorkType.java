package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pom.actitime.AcitimeCreateWorkTypePage;
import com.pom.actitime.ActitimeHomePage;
import com.pom.actitime.ActitimeSettingsPage;
import com.pom.actitime.ActitimeTypeOfWorkPage;

public class TESTActitimeWorkType extends BaseTest{
	 @Test 
	 public void createWork() throws IOException {
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.settings();
			
		ActitimeSettingsPage setting= new ActitimeSettingsPage(driver);
		setting.typeOfWork();
			
		ActitimeTypeOfWorkPage workPage = new ActitimeTypeOfWorkPage(driver);
		workPage.createWorkMethod();
			
		AcitimeCreateWorkTypePage creatework = new AcitimeCreateWorkTypePage(driver);
		creatework.createWork();
	 }
}
