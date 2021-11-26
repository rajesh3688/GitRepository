package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorconcept {

	public static void main(String[] args) { 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror");
		
		driver.findElement(By.id("firstname")).sendKeys("raj");
		
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("pen");
		
		driver.findElement(By.cssSelector("#Email")).sendKeys("dsh@dgf.com");
		
		driver.findElement(By.name("password")).sendKeys("shfhge");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.partialLinkText("create an")).click();
		
		
		
		
	}	

}		
	

