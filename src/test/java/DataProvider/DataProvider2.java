package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider2 
{
	WebDriver driver; 
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	}
	
	@Test
	public void LoginTest()throws InterruptedException
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement Username = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		Thread.sleep(3000);
		Username.clear();
		Thread.sleep(3000);
		Username.sendKeys("");
		
		
		WebElement Password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Thread.sleep(3000);
		Password.clear();
		Thread.sleep(3000);
		Password.sendKeys("Pass");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String exp_Title="Dashboard/nopCommerce administration";
		
		String act_Title =driver.getTitle();
		
		if(exp_Title.equals("valid"))
		{
			if(exp_Title.equals(act_Title))
			{
				driver.findElement(By.linkText("logout")).click();
				Assert.assertTrue(true);
			}
			else 
			{
				Assert.assertTrue(false);
			
		    }
		
		
	 }
		

   }
  
	/*
	 * @AfterMethod public void Teardown() { driver.quit();
	 * 
	 * }
	 */
}
