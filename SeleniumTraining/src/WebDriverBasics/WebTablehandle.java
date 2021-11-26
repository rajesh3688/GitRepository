package WebDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablehandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/login.cfm");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        
		//using for loop
		/*String before_xpath="//form[@id='vContactsForm']/table/tbody/tr[";
		String afetr_xpath="]/td[2]/a";
		
		for(int i=6;i<=8;i++) {
			String text=driver.findElement(By.xpath(before_xpath+i+afetr_xpath)).getText();
			System.out.println(text);
			if(text.equals("Akshay Kumar")) {
				driver.findElement(By.xpath("//form[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
			}
			
		}*/
		
		//using customized xpath
		
		driver.findElement(By.xpath("//a[contains(text(),'Ameet kundan')]/parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
		
	}

}
