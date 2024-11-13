package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mauseOverAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	WebElement element =  driver.findElement(By.xpath("//a[@ id=\"nav-link-accountList\"]"));
	
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	
	driver.findElement(By.xpath("//a/span[text()='Create a Wish List']")).click();
		

	}

}
