package com.scripts.actitime;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pom.actitime.ActitimeHomePage;
import com.pom.actitime.ActitimeTaskPage;

public class TESTActitimeDeleteCustomer extends BaseTest{

		@Test
		public void deleteCustomer() throws InterruptedException {
			ActitimeHomePage home = new ActitimeHomePage(driver);
			home.task();
			
			ActitimeTaskPage task = new ActitimeTaskPage(driver);
			task.deleteCust();
		}
}
