package JavaScriotExecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		    
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
			
			
			
			JavascriptExecutor Js = (JavascriptExecutor)driver;
			Js.executeScript("window.scrollBy(0,400)","");
			//Thread.sleep(3000);
			
			driver.findElement(By.name("name")).sendKeys("Damini");
			
			driver.findElement(By.name("email")).sendKeys("daminisbhagat@outlook.com");
			
			driver.findElement(By.name("phone")).sendKeys("9284608602");
			
			driver.findElement(By.name("notice_time")).sendKeys("30");
			
			driver.findElement(By.name("experience")).sendKeys("2");
			
			WebElement file = driver.findElement(By.name("resume"));
	
			file.sendKeys("F:\\MY DATA\\Damini_Profile.pdf");
			
			driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Hello my name is damini i am Working as a Automation test engineer for the last 2 year");
			
		WebElement applybtn= driver.findElement(By.xpath("//button[@class=\"btn form-button-child px-3\"]"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", applybtn);
        
       // driver.close();
        
       
       
       
	
		
	}

}
