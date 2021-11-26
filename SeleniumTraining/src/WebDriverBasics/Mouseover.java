package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);		
		
		a.moveToElement(driver.findElement(By.id("Login"))).build().perform();
		
		Thread.sleep(4000);
		
		//driver.findElement(By.linkText("Travel Agent Login")).click();

		driver.findElement(By.linkText("SpiceClub Members")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Member Login")).click();
	}

}
