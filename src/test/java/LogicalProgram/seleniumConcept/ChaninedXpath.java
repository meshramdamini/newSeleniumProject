package LogicalProgram.seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChaninedXpath {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://demo.automationtesting.in/Register.html");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div//input[@placeholder=\"First Name\"]")).sendKeys("Damini");
        
      //div[@class="col-md-4 col-xs-4 col-sm-4"]//input[@placeholder="Last Name"]

      // this app.java    

	}

}
