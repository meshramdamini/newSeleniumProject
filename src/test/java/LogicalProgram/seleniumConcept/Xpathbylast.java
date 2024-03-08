package LogicalProgram.seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbylast {

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://demo.automationtesting.in/Register.html");
        
        Thread.sleep(3000);
        //we use last when multiple element is present and we want to select last element that time we use last()
        driver.findElement(By.xpath("(//input[@type=\"text\"])[last()]")).sendKeys("dami@123");
		
      //input[@type="text"][last()]           
	}

}
