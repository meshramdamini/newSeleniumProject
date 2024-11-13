package MultipleLiks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLink {

	public static void main(String[] args) throws InterruptedException 
	{
		//To get link size present in the facebook page
        System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		
		//wait for 3 sec
		Thread.sleep(3000);
		//enter url facebook- open fb
		driver.get("https://www.facebook.com/");
		//wait for 3 sec
		Thread.sleep(3000);
		//get link size
		List<WebElement> Alllink = driver.findElements(By.xpath("//a"));
		int Size = Alllink.size();
		System.out.println("Total no of links in facebook page="+ Size);
		}
		
	
}


