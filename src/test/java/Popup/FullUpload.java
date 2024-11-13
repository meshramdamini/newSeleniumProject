package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullUpload {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("F:\\excel files//9 julymorning.xlsx");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
		
		
		
		
		

	}

}
