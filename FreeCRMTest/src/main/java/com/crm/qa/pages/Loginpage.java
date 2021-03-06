package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase{

	//PageFactory
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public Homepage login(String un,String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		
		return new Homepage();
	}

}
