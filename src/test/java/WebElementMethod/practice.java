package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException 
	{
		//checkbox
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
	WebElement element=driver.findElement(By.xpath("(//input[@id=\"sex\"])[2]"));
	
	if (!element.isSelected()) 
	{
		element.click(); 
	}
	}
	
	}
	


