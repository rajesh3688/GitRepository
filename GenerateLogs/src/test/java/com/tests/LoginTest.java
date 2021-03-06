package com.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest {
	
	//logs-capturing info/activities at the time of execution
	//types of logs
	//1.info
	//2.fatal
	//3.warn
	//4.debug
	
	//hw to generate logs-using apache log 4j api
	//hw it works-reads log 4j configuration from log 4j properties file
	
	//where to create-inside resources folder

	public WebDriver driver;
	
	Logger log=Logger.getLogger(LoginTest.class);
	
	
	
	@BeforeMethod
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	driver = new ChromeDriver();
	log.info("*********launch chrome browser************");
	log.warn("warning message");
	log.fatal("fatal message");
	log.debug("debug the code");
	log.error("error message");
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://classic.freecrm.com/login.cfm");
	
	}
	
	@Test(priority=1)
	public void freecrmtitletest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "CRMPRO Log In Screen");
	}
	
	@Test(priority=2)
		public void crmlogo() {
			boolean b=driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
			Assert.assertTrue(b);
		}
	
	
	
	


	@AfterMethod
	public void teardown() {
	 driver.quit();
}

}