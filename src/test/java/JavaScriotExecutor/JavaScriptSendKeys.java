package JavaScriotExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendKeys {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement Username =driver.findElement(By.xpath("//input[@id=\"email\"]"));
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		 WebElement Click = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		
		JavascriptExecutor Js =(JavascriptExecutor)driver;
		  //FirstWay
        Js.executeScript("arguments[0].value='JavaTest';",Username);
        Js.executeScript("arguments[0].value='4566';",Password);
        Js.executeScript("arguments[0].click()",Click);
        
        //secondway
        
       // Js.executeScript("document.getElementById('email').value='Java';");
       // Js.executeScript("document.getElementById('pass').value='12333';");
       // Js.executeScript("arguments[0].click()",Click);
	}

}
