package WebDriverBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readpropfile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream("D:\\eclipse-workspace\\SeleniumTraining\\src\\WebDriverBasics\\config.properties");
		
		p.load(fis);
		
		System.out.println(p.getProperty("name"));
		
		String bname=p.getProperty("browser");
		
		String url=p.getProperty("url");
		
		if(bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(bname.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\Firefoxdriver.exe");
			driver=new ChromeDriver();
		}
		
		
		driver.get(url);
		
		String register=p.getProperty("register_xpath");
		
		driver.findElement(By.xpath(register)).click();
		
		driver.findElement(By.xpath(p.getProperty("Businessaccount_xpath"))).click();
		
		driver.findElement(By.id(p.getProperty("Businessname_id"))).sendKeys(p.getProperty("Businessname"));;

	}

}
