package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		
        driver.get("https://skpatro.github.io/demo/links/");
        
       // driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
        Thread.sleep(3000);
        Set <String> ids = driver.getWindowHandles();
     
        ArrayList<String> Al= new ArrayList<String>(ids);
        Thread.sleep(3000);
     
       driver.switchTo().window(Al.get(0));
	}

}
