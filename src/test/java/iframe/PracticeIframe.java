package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeIframe {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@data-toggle=\"tab\" and contains (text(), 'Iframe with in an Iframe')]")).click();
		
		
		WebElement OuterFrame = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		
		driver.switchTo().frame(OuterFrame);
		//int size=driver.findElements(By.tagName("iframe")).size();
		//System.out.println(size);
	
		String dam =driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]")).getText();
		System.out.println(dam);
		driver.switchTo().frame(0);
		//driver.switchTo().parentFrame();
		
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("damini");
        
        driver.switchTo().parentFrame();
        //driver.switchTo().parentFrame();
       
	}

}
