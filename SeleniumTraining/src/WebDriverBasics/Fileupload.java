package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Rajesh\\OneDrive\\Pictures\\30-NOV-2019.pdf");
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Rajesh\\Downloads\\MBAM-2.5-Deployment-Guide.pdf");

	}

}
