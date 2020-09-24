package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pom.actitime.ActitimeEditTypeOfWorkPage;
import com.pom.actitime.ActitimeTypeOfWorkPage;
import com.pom.actitime.ActitimeHomePage;
import com.pom.actitime.ActitimeSettingsPage;
import com.generics.actitime.BaseTest;

public class TESTActitimeEditWork extends BaseTest{
	@Test
	public void editTypeOfWork() throws IOException {
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.settings();
		
		ActitimeSettingsPage setting= new ActitimeSettingsPage(driver);
		setting.typeOfWork();
		
		ActitimeTypeOfWorkPage worktype = new ActitimeTypeOfWorkPage(driver);
		worktype.workOfType();
		
		ActitimeEditTypeOfWorkPage editWorkPage = new ActitimeEditTypeOfWorkPage(driver);
		editWorkPage.saveChanges();
	}
}
