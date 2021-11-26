package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://half.ebay.com");
		
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("java");
		
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("raj");
		
		//tag-input
		//id=test_123
		//id=test_1345;
		
		//id=3544_test_t;
		//id=34233_test_t;
		
		//driver.findElement(By.xpath("//input[contains(text(),'test_')]")).sendKeys("sdf");

		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("sdf");
		
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("sdf");
		
		//linktext using xpath
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	}

}
