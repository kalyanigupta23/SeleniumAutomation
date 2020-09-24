package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pom.actitime.ActitimeHomePage;
import com.pom.actitime.ActitimeLeaveTypePage;
import com.pom.actitime.ActitimeSettingsPage;

public class TESTActitimeEditLeave extends BaseTest{

	@Test
	public void editLeave() throws IOException {
	
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.settings();
		
		ActitimeSettingsPage setting= new ActitimeSettingsPage(driver);
		setting.leaveTypes();
		
		ActitimeLeaveTypePage leavepage = new ActitimeLeaveTypePage(driver);
		leavepage.editleavetypeMethod();
		leavepage.apply();
	}
}
