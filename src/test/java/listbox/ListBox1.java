package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		                                             
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("damini");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Meshram");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("rahul@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"18\"and contains(text(),'18')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"6\"and contains(text(),'Jun')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[@value=\"2022\"and contains(text(),'2022')]")).click();
		Thread.sleep(3000);
		
		
	}

}
