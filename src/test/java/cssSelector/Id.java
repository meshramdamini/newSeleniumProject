package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("Dm@123");

	}

		

	

}
