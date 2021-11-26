package WebDriverBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) {
		
		//alerts-Java script pop up-Alert API(Accept,Dismiss)
		//FileUpload popup-Browse button(type-file,sednkeys(path))
		//Browser window pop up-Ad pop up(windowhandlerAPI-getWindowHandles())
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		Set<String> handle=driver.getWindowHandles();
		
		Iterator<String> it=handle.iterator();
		
		String parentid=it.next();
		System.out.println("parent window id"+parentid);
		
		String childid=it.next();
		System.out.println("Child window id"+childid);
		
		driver.switchTo().window(childid);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentid);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		

	}

}
