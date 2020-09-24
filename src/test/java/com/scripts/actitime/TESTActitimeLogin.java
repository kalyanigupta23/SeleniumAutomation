package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pom.actitime.ActitimeLoginPage;

public class TESTActitimeLogin extends BaseTest{
	
	@Test
	public void loginActitime() throws IOException {
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();
	}
}
