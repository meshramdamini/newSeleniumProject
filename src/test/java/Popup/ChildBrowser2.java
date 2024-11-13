package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Child browser switch to child window
		System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
        
	    WebDriver driver = new ChromeDriver();
	        
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.get("https://skpatro.github.io/demo/links/");
		
	    Thread.sleep(2000);
	  
	    driver.findElement(By.xpath("//input[@name=\"NewWindow\"]")).click();
	    
	    Set<String> dam = driver.getWindowHandles();
	    
	    ArrayList<String> AL = new ArrayList<String>(dam);
	    
	    //String childwindowdam= AL.get(1);
	    //System.out.println(AL.get(1));
	    driver.switchTo().window(AL.get(1));
	    Thread.sleep(4000);
	    
	     driver.close();
	    
	    
	    
	    
	}

}
