package udemy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkPresentinPage 
{

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    //give me the links present in a page
	    
	 System.out.println(driver.findElements(By.tagName("a")).size());
	    
	 
	 //count of footer section
	    
	   WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	    
	   System.out.println(footerdriver.findElements(By.tagName("a")).size());
	   
	   
	  //3 count link of lrft footer
	   
	   WebElement countdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	   
	   
	    System.out.println(countdriver.findElements(By.tagName("a")).size());
	   
	    //clicking on each link 
	    
	    for(int i=1; i<countdriver.findElements(By.tagName("a")).size();i++)
	    {
	    	String clickonlinkString=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	countdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkString);
	    	Thread.sleep(5000L);
	    }
	    
	    Set<String> abc= driver.getWindowHandles();
	    Iterator<String> it = abc.iterator();
	    
	    while (it.hasNext())
	    {
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
			
		}
	}

}
