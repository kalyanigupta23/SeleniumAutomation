package com.scripts.actitime;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pom.actitime.ActitimeHomePage;
import com.pom.actitime.ActitimeTaskPage;

public class TESTActitimeEditCustomer extends BaseTest{
	@Test
	public void deleteCustomer() throws InterruptedException, IOException, AWTException {
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.task();
		
		ActitimeTaskPage task = new ActitimeTaskPage(driver);
		task.editCust();
	}
}

