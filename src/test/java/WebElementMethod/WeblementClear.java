package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeblementClear {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");



			//driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
			WebElement element=driver.findElement(By.xpath("//input[@name=\"username\"]"));
			element.sendKeys("Admin");
			//element.click();
			element.clear();


			//driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
			
	
	}

}
