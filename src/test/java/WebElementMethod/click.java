package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");		
		Thread.sleep(2000);
		
        WebElement element =driver.findElement(By.xpath("//input[@id=\"email\"] "));
        element.sendKeys("Damini@123");
        
        WebElement ele= driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        ele.sendKeys("Dam123");
        
        Thread.sleep(2000);
        WebElement El = driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
        El.click();
        
	}

}
