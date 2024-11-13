package listbox;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
         Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(4000);
		
		WebElement day =driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year =driver.findElement(By.xpath("//select[@id=\"year\"]"));
	
	
	DOB(day,"23");
	DOB(month,"7");
	DOB(year,"1994");
	}
	public static void DOB(WebElement text,String value)
	{
		Select s1 = new Select(text);
		s1.selectByValue(value);
		
		
	}
	
	}


