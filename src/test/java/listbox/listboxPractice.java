package listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(1000);
	  WebElement day= driver.findElement(By.xpath("//select[@id=\"day\"]"));
	  Thread.sleep(1000);
	  
	 // WebElement year= driver.findElement(By.xpath(""));
	  Select s1 = new Select(day);
	  s1.selectByValue("3");
	  
	  WebElement month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
	  Select s2 = new Select(month);
	  s2.selectByValue("7");
	  Thread.sleep(1000);
	  
	  WebElement year= driver.findElement(By.xpath("//select[@id=\"year\"]"));
	  
	  Select s3 = new Select(year);
	  s3.selectByValue("2023");
	  
	  
	  
		
		
		
	}

}
