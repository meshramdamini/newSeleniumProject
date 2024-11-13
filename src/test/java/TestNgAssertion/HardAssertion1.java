package TestNgAssertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HardAssertion1 
{   
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
		driver=new ChromeDriver();
       driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test(enabled = false)
	public void Username()throws InterruptedException
	{
		WebElement Username= driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement Password= driver.findElement(By.xpath("//input[@name=\"password\"]"));
	
	/*AssertTrue
	Assert.assertTrue(Username.isDisplayed());
	Username.sedkeys("Admin");
	Thread.sleep(3000);
	
	Assert.assertTrue(Password.isDisplayed());
	password.sedkeys("admin123");
	Thread.sleep(3000);*/
	
	//AssertFalse
	Assert.assertFalse(Username.isDisplayed());
	Username.sendKeys("Admin");
	Thread.sleep(3000);
	
	Assert.assertFalse(Password.isDisplayed());
	Password.sendKeys("admin123");
}
	
	//Assertequal
	@Test
	public void orangeHRM()throws InterruptedException
	{
		Thread.sleep(3000);
		boolean text=driver.findElement(By.xpath("//input[@name=\"username\"]")).isDisplayed();
		Assert.assertTrue(text);
		Assert.assertEquals(text,false);
	
	}
	@AfterMethod
	public void Teardown()throws InterruptedException
	{
		Thread.sleep(3000);
		
	}
}
