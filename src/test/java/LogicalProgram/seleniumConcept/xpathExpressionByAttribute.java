package LogicalProgram.seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathExpressionByAttribute
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("damin@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("damin123");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@id=\"u_0_5_ET\"]")).click();
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		//Thread.sleep(40000); //*[@id="u_0_5_YF"]

		//driver.close();


	}

}
