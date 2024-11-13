package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name=\"NewTab\"]")).click();
        Thread.sleep(7000);
        
   Set<String> ids =  driver.getWindowHandles();
   ArrayList <String> AL= new ArrayList<String>(ids);
   
   Thread.sleep(7000);
   
   driver.switchTo().window(AL.get(0));
   
	}

}
