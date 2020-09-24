package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pom.actitime.ActitimeCreateNewCustomerPage;
import com.pom.actitime.ActitimeHomePage;
import com.pom.actitime.ActitimeTaskPage;
import com.generics.actitime.BaseTest;

public class TESTActitimeCreateCutomer extends BaseTest{
	@Test
	public void createCustomer() throws InterruptedException, IOException {
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.task();
		
		ActitimeTaskPage task = new ActitimeTaskPage(driver);
		task.addNew();
		
		ActitimeCreateNewCustomerPage customer = new ActitimeCreateNewCustomerPage(driver);
		customer.customerDetails();
	}
}
