package ActionClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemywindowHandleParentToChild3 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	    driver.findElement(By.cssSelector("a[class=\"blinkingText\"]")).click();
	    
	 Set<String>windows =driver.getWindowHandles();
	// Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

 		    Iterator<String>it = windows.iterator();

 		    String parentId = it.next();
	 
		    String childId = it.next();
	 
	 driver.switchTo().window(childId);
	 
	System.out.println(driver.findElement(By.cssSelector("p[class=\"im-para red\"]")).getText());
	    
	driver.findElement(By.cssSelector("p[class=\"im-para red\"]"));
	
	String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	
		    driver.switchTo().window(parentId);

		    driver.findElement(By.id("username")).sendKeys(emailId);
	
         


	}

}
