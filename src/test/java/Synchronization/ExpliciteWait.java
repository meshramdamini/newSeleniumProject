package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait
{

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement Src=driver.findElement(By.xpath("//input [@ id=\"src\"]"));
		
		WebElement dest=driver.findElement(By.xpath("//input [@ id=\"dest\"]")); 
		
		new WebDriverWait(driver,Duration.ofSeconds(20)).
		until(ExpectedConditions.elementToBeClickable(Src)).sendKeys("pune");
		
		new WebDriverWait(driver,Duration.ofSeconds(20)).
		until(ExpectedConditions.elementToBeClickable(dest)).sendKeys("Mumbai");
		
		//Redbuswait(driver,Src,"Pune");
		//Redbuswait(driver,dest,"Mumbai");
	}
		
	
	public static void Redbuswait(WebDriver driver,WebElement element, String Value)
			{
		     new WebDriverWait(driver,Duration.ofSeconds(20)).
		     until(ExpectedConditions.elementToBeClickable(element)).sendKeys(Value);
		
			}
}



