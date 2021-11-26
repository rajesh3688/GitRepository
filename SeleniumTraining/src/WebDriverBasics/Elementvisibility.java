package WebDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementvisibility {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://register.freecrm.com/register/");
		
		//isDisplayed-applicable for all web elements
		boolean b=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(b);
		
		//isEnabled-button 
		boolean b1=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
        System.out.println(b1);
        
        //isSelected-applicable for checkbox,radiobutton and drop down
        boolean b2=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println(b2);
        
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        
        boolean b3=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println(b3);
	}

}
