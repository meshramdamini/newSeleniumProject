package MultipleLiks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLiks1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		// how many links are present on the web page
		
	     List<WebElement>Links=driver.findElements(By.tagName("a"));
	     Thread.sleep(3000);
	    System.out.println("Number of links present on the web page:"+Links.size());
	    
	    //print all the links
	    
	    for(WebElement link:Links) 
	    {
	    	System.out.println(link.getText());
	    	System.out.println(link.getAttribute("href"));
	    	
	    }
	     
	     
	     
	     
		
		
		

	}

}
