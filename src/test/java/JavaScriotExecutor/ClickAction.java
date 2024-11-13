package JavaScriotExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAction {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Dam12");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("6556");
		
		WebElement Click = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		
		JavascriptExecutor Js =(JavascriptExecutor)driver;
	    Js.executeScript("arguments[0].click()",Click);
	

	}

}
