package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		

	}

}