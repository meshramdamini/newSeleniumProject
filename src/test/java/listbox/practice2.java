package listbox;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(4000);
		
	WebElement Day= driver.findElement(By.xpath("//select[@id=\"day\"]"));
	WebElement month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
	WebElement year= driver.findElement(By.xpath("//select[@id=\"year\"]"));
	
	
	dateOBirth(Day,"23");
	dateOBirth(month,"7");
	dateOBirth(year,"1994");
	}
	
	public static void dateOBirth(WebElement text, String value)
	{
	Select s1 = new Select(text);
	s1.selectByValue(value);
	
	
	 
	}
	
	}


