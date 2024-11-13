package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamplewithoutDDf {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//implicit Wait is used to tell web driver to wait for a certain amount of time before it throws a "no such element Exception".
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//username
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		Thread.sleep(3000);
		
		//password
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		Thread.sleep(3000);
		
		//click login button
		driver.findElement(By.xpath("//button[@type =\"submit\"]")).click();
		Thread.sleep(3000);
		
		String ExpectedUsername ="ajay Chaudary";
		
		String ActualUsername = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		if(ExpectedUsername.equals(ActualUsername))
		{
			System.out.println("Correct username");
		}
		else
		{
			System.out.println("Incorrect username");
		}
		
		driver.quit();		
		
		
		}
}
