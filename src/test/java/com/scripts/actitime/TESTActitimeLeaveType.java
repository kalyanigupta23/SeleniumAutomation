package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pom.actitime.ActitimeHomePage;
import com.pom.actitime.ActitimeLeaveTypePage;
import com.pom.actitime.ActitimeSettingsPage;
import com.generics.actitime.BaseTest;
import com.pom.actitime.ActitimeCreateLeaveTypePage;

public class TESTActitimeLeaveType extends BaseTest{

		@Test
		public void createLeaveType() throws IOException {
		
			ActitimeHomePage home = new ActitimeHomePage(driver);
			home.settings();
			
			ActitimeSettingsPage setting= new ActitimeSettingsPage(driver);
			setting.leaveTypes();
			
			ActitimeLeaveTypePage leavepage = new ActitimeLeaveTypePage(driver);
			leavepage.createLeaveMethod();
			
			ActitimeCreateLeaveTypePage leavetype = new ActitimeCreateLeaveTypePage(driver);
			leavetype.createLeaveType();
		}
}
