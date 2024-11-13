package listbox;

import java.util.concurrent.TimeUnit;

//import org.apache.poi.hslf.record.InteractiveInfoAtom.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		 WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		
		
		link.click();
		
		driver.navigate().back();
		
		try {
			 link.click();
		     }
			 
	    catch (StaleElementReferenceException e)
		{
	    	link=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
	    	
	    	link.click();
			
		}
		driver.quit();

	}

}
