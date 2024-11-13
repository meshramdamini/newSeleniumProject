package udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		
	    driver.get("https://the-internet.herokuapp.com/");
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)", "");
	    
	    driver.findElement(By.cssSelector("a[href=\"/windows\"]")).click();
	    
	    driver.findElement(By.cssSelector("a[href=\"/windows/new\"]")).click();
	    
	   System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	    
	   Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
	   Iterator<String>it = windows.iterator();
	   String parentId = it.next();
	   String childId = it.next();
	   driver.switchTo().window(parentId);
	   
	   System.out.println(driver.findElement(By.xpath("//div[@id=\"content\"]/div/h3")).getText());

	    
	    
	}

}
