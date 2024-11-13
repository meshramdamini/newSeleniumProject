package Synchronization;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait 
{
	  @SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	  {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
			
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		
		driver.findElement(By.id("w3loginbtn")).click(); 
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"modalusername\"]")).sendKeys("D123");
		

	}

}
