package locator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CssSlectorAttribute {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");		
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 _6luy\"]")).sendKeys("sw@123");
		
		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("Damini@123"); 

	}

}
