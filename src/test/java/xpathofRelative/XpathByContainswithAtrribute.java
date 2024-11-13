package xpathofRelative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainswithAtrribute {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        
        Thread.sleep(3000);
        
        //xpath by contains by using attribute
        driver.findElement(By.xpath("//input[contains(@ id,'email')]")).sendKeys("damin@123");
		
      
	}

}
