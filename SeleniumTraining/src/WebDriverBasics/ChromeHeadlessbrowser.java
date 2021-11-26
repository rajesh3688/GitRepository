package WebDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessbrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions ch=new ChromeOptions();
		//ch.addArguments("window-size=1400,800");
		ch.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
        driver.get("https://classic.freecrm.com/index.html");
		
		System.out.println(driver.getTitle());

	}

}
