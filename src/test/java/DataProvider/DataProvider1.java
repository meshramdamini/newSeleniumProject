package DataProvider;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1  
{
	WebDriver driver; 
	@SuppressWarnings("deprecation")
	@Test (dataProvider = "LoginData")
	public void LoginTest(String Username, String Password)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//p[class=\"oxd-userdropdown-name\"]")).isDisplayed());
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	@DataProvider(name ="LoginData")
	public Object[][] logindata()
	{
		Object data[][]	= new Object[4][2];
		
		// Correct userame& correct password
		
		data[0][0]="Admin";
		data[0][1]= "admin123";
		
		//incorrect username& correct pass
		
		data[1][0]="Admin123";
		data[1][1]="Admin123";
		
		//incorrect username& correct pass
		data[2][0]="Admin";
		data[2][1]= "admin123";
		
		//incorrect pass&username
		
		data[3][0]="Admin23";
		data[3][1]="admin134";
		
		return data;
				
				
	
	}

}
