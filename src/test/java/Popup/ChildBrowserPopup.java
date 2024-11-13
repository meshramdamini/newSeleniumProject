package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

		public static void main(String[] args) throws InterruptedException
		{
		//To open chrome browser
	    System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
	        
	    WebDriver driver = new ChromeDriver();
	        
	    driver.manage().window().maximize();
			
		//To wait for 2sec
		Thread.sleep(2000);
		//To enter url
		driver.get("https://skpatro.github.io/demo/links/");
		//To wait for 2sec
		Thread.sleep(2000);
		//To click on new tab
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		//To wait for 2sec            
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles(); //["mainpage","childwindow"]
		ArrayList<String> al = new ArrayList<String>(ids); //["mainpage","childwindow"]
		
		//switch selenium focus main page to that new tab or child browser
		driver.switchTo().window(al.get(1));
		Thread.sleep(5000);
		//To click on Training from child window
		driver.findElement(By.xpath("(//span[text ()=\"Selenium\"])[1]")).click();
		}
		

	}


