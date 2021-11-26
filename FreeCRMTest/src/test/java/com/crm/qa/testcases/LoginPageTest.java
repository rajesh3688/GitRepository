package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Loginpage;

public class LoginPageTest extends TestBase{
	
	public LoginPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	
	@Test
	public void loginpageTitleTest()
	{
		Loginpage login=new Loginpage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
