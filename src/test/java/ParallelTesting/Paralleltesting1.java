package ParallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@SuppressWarnings("deprecation")
public class Paralleltesting1
{   
	WebDriver driver;
	@Test
	public void module1()
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
		driver=new ChromeDriver();
       driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String Text = driver.getCurrentUrl();
		System.out.println(Text);
		driver.quit();
		
	}
	@Test
	public void module2()
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
		driver=new ChromeDriver();
       driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String Text = driver.getCurrentUrl();
		System.out.println(Text);
		driver.quit();
	}
	@Test
	public void module3()
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
		driver=new ChromeDriver();
       driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String Text = driver.getCurrentUrl();
	    System.out.println(Text);
		driver.quit();
	}

}
