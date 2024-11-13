package LogicalProgram.seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsWithText {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        
        Thread.sleep(3000);
        // XpathBy contains with text
        driver.findElement(By.xpath("//a[contains(text(),\"Forgotten password?\")]")).click();
      

	}

}
