package DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatingCount {

	public static void main(String[] args) throws InterruptedException 
	{   
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// open flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//To click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//To identify search field and enter in the field redmi Note 9 pro
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi Note 9 pro");
		Thread.sleep(2000);
		
		//To identify search button and click on that button
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class=\"_2kHMtA\"]//a")).click();
		//To identify mobile parent convert 1 matching and then jump to the child review convert 1 matching
		WebElement rating = driver.findElement(By.xpath("//span[@class=\"_2_R_DZ\"][1]//span//span[1]"));
		Thread.sleep(2000);
		//To get review count from redmi Note 9 pro mobile
		String text = rating.getText();
		System.out.println(text);
		}
		
		

	}


