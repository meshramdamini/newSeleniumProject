package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/ ");
		
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("damini@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12345");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

		Thread.sleep(2000);
		//xpath by contains
		//syntax  tagname[contains(text(),"text value")]
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		

	}

}
