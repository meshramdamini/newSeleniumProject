package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(4000);
		
		WebElement day =driver.findElement(By.id("day"));
  WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]")); 
  WebElement year=driver.findElement(By.xpath("//select[@ id=\"year\"]"));
  
  DateOfbirth(day,"22");
  DateOfbirth(month,"7");
  DateOfbirth(year,"1994");
 
	}

	public static void DateOfbirth(WebElement text , String value) 
	{
		Select s = new Select(text);
		s.selectByValue(value);
		
	}
	
}
