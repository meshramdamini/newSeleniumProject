package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
        
	    WebDriver driver = new ChromeDriver();
	        
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.get("https://the-internet.herokuapp.com/windows");
	    
	    driver.findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
	    
	    
	    Set<String> var = driver.getWindowHandles(); //["mainpage","childwindow"]
	    
	    ArrayList<String> AL = new ArrayList<String>(var);
	    
	    driver.switchTo().window(AL.get(1));
	    String abc= driver.findElement(By.xpath("//h3[contains (text(), 'New Window')]")).getText();
	    System.out.println(abc);
	     
	    driver.switchTo().window(AL.get(0));
	    String bcd=driver.findElement(By.xpath("//h3[contains (text(), 'Opening a new window')]")).getText();
	    System.out.println(bcd);

	}

}
