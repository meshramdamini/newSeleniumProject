package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowsertoMain {

	public static void main(String[] args) throws InterruptedException 
	{
		//Child window switch to main page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(3000);
		//click on new tab
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>(ids );
		
		//driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(5000);
		//switch selenium focus from child window to main page
		driver.switchTo().window(al.get(0));
		//click on new window
		//driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		}
		

	}


