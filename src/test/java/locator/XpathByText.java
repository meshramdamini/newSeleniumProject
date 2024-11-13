package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

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
		
		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click(); // Log in (text)
		
		//xpath by text
		
		//syntax= //tagname[text()="text value"]
		
		//driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();

		

	}

}
