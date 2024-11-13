package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://techpub-connect-demo.netlify.app/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class=\"nav-link\"]")).click();
		
		WebElement ele = driver.findElement(By.id("(//a[@class=\"nav-link dropdown-toggle\"])[1]"));
		
		Actions Act = new Actions(driver);
		Act.moveToElement(ele).build().perform();
		
		
		WebElement ele1 = driver.findElement(By.id("id=\"navbarDropdownMenuLink\""));
		Act.moveToElement(ele1).build().perform();
		
		driver.findElement(By.xpath("//i[@class=\"far fa-bars\"]")).click();
		
		
		
		
	}

}
