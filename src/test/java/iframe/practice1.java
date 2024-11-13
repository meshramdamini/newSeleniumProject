package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class practice1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000); 
		

		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		Thread.sleep(2000); 
		driver.switchTo().defaultContent();
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();

	}

}
