package WebDriverBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBasics {
	
	@BeforeSuite
	public void getTest()
	{
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void getTest1()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void getTest2()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void Test()
	{
		System.out.println("Before Method");
	}	
		
	@org.testng.annotations.Test(priority=2)
	public void Test1()
	{
		System.out.println("Test Method");
	}
	
	@org.testng.annotations.Test(priority=1)
	public void Test3()
	{
		System.out.println("Test2 Method");
	}
	
	@AfterMethod
	public void Test2()
	{
		System.out.println("After Method");
	}
	
	@AfterTest()
	public void GetTest3()
	{
		System.out.println("After Test");
	}
	
	@AfterClass()
	public void GetTest4()
	{
		System.out.println("After Class");
	}
	
}
		
