package WebDriverBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandPopups {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert al=driver.switchTo().alert();
		
		String s=al.getText();
		
		if(s.equals("Please enter a valid user name")) {
			System.out.println("Correct text message");
		}else
		{
			System.out.println("Incorrect text message");
		}
		
		al.accept();
		
		//al.dismiss();	
		
		

	}

}
