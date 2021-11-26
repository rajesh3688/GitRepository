package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//htmluntidriver is not available in selenium3.x version
		//to use this- we have to download htmlunitdriver jar file
		
		//Advantages
		//Testing happening behind the scenes -no browser launched
		//very fast execution of test cases
		//not suitable for Actions class-mousemovement,doubleclick,drag and drop
		//Ghostdriver-Headless browser
		    //HtmlUnitDriver - Java
		    //PhantomJs- Java script
		
		WebDriver driver=new HtmlUnitDriver();
		
		driver.get("https://classic.freecrm.com/login.cfm");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		

	}

}
