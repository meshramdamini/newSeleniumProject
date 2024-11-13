package TestingParamterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1
{
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	@Parameters({"URL"})
	public void Setup(String URL)
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(URL);
	}
	@Test
	@Parameters({"username","password"})
	public void LoginTest(String username,String password)throws InterruptedException
	{
	
		
		WebElement User1=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		Thread.sleep(2000);
		User1.sendKeys(username);
		
		WebElement User2=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Thread.sleep(2000);
		User2.sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);

	}
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}
	

}
