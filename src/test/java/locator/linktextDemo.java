package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextDemo {

	public static void main(String[] args) {
								
	       // String baseUrl = "http://demo.guru99.com/test/link.html";					
	        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver","chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/link.html");
	        //driver.get(baseUrl);					
	        driver.findElement(By.linkText("click here")).click();				
	        System.out.println("title of page is: " + driver.getTitle());		  					
	        //driver.quit();		
		
	}

}
