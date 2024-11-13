package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox7 {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://theautomationzone.blogspot.com/search/label/selenium%20practice%20page");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='selenium practice page']")).click();
		Thread.sleep(2000); 
		
		
		//select multiple options in list box
		
		driver.findElement(By.xpath("//select[@id=\"cars\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"volvo\" and contains(text(),'Volvo')]")).click();
		driver.findElement(By.xpath("//option[@value=\"saab\" and contains(text(),'Saab')]")).click();
		driver.findElement(By.xpath("//option[@value=\"opel\" and contains(text(),'Opel')]")).click();
		driver.findElement(By.xpath("//option[@value=\"audi\" and contains(text(),'Audi')]")).click();
		Thread.sleep(2000);
	}

}
