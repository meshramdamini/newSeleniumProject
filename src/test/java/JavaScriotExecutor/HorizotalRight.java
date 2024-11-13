package JavaScriotExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizotalRight {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.album.alexflueras.ro/");
		
		Thread.sleep(4000);
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		
		Js.executeScript("window.scrollBy(7000,0)","");
		
		Thread.sleep(5000);
		 driver.quit();		
		

	}

}
