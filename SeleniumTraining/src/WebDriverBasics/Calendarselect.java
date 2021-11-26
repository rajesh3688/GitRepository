package WebDriverBasics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendarselect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
        driver.get("https://classic.freecrm.com/index.html");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Calendar')]")).click();
		
		String date="32-October-2018";
		String datearr[]=date.split("-");
		
		String day=datearr[0];
		String month=datearr[1];
		String year=datearr[2];
		
		Select s=new Select(driver.findElement(By.name("slctMonth")));
		s.selectByVisibleText(month);
		
		Select s1=new Select(driver.findElement(By.name("slctYear")));
		s1.selectByVisibleText(year);
		
		String before_xpath="//div[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String after_xpath="]/td[";
		
		String dayval=null;
		boolean flag=false;
		for (int i=2;i<=6;i++) {
			for (int j=1;j<=7;j++) {
				try {
				dayval=driver.findElement(By.xpath(before_xpath+i+after_xpath+j+"]")).getText();
				}catch(NoSuchElementException e) {
					System.out.println("please enter correct value");
				}
				System.out.println(dayval);
				if(dayval.equals(day)) {
					driver.findElement(By.xpath(before_xpath+i+after_xpath+j+"]")).click();
					flag=true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
		

	}

}
