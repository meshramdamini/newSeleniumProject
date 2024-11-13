package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeIframe2 {

	public static void main(String[] args) throws InterruptedException
	{
	
		
         System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
         
         WebDriver driver = new ChromeDriver();
         
         driver.manage().window().maximize();
         
         Thread.sleep(2000);
         
         driver.get("https://demo.automationtesting.in/Frames.html");
 		  Thread.sleep(3000);
 		  
 		  driver.findElement(By.xpath("//a[@data-toggle=\"tab\" and contains (text(),'Iframe with in an Iframe')]")).click();
 		 
 		  
 		  WebElement outerframe =driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
 		  
 		  driver.switchTo().frame(outerframe);
 		  
 		  
 		  WebElement innerfram =driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
 		  
 		 driver.switchTo().frame(innerfram);
 		 
 		 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
 	
 		Thread.sleep(3000);

 		 driver.switchTo().defaultContent();
 		 
 		WebElement outerframe1 =driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
 		outerframe1.click();
	}
	

}
