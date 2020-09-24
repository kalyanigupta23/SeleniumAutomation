package com.scripts.actitime;

import org.testng.annotations.Test;

import com.pom.actitime.ActitimeHomePage;
import com.pom.actitime.ActitimeLeaveTypePage;
import com.pom.actitime.ActitimeSettingsPage;
import com.generics.actitime.BaseTest;

public class TESTActitimeDeleteLeaveType extends BaseTest{
	
	@Test
	public void deleteTypeOfLeave() {
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.settings();
		
		ActitimeSettingsPage setting= new ActitimeSettingsPage(driver);
		setting.leaveTypes();
		
		ActitimeLeaveTypePage leaveType = new ActitimeLeaveTypePage(driver);
		leaveType.deleteLeaveMethod();
	}
}
