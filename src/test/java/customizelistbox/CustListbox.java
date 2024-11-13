package customizelistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustListbox {

	public static void main(String[] args) throws InterruptedException 
	{   
		
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//To open facebook
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//To click on create new account
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		//step1
		//identify listbox and store in reference variable
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//step2
		//create object of Actions class which accept webdriver argument
		Actions act = new Actions(driver);
		//step3
		//To click on identifing element
		//act.moveToElement(month).click().perform();
		act.click(month).perform();
		Thread.sleep(3000);
		//step4
		//1. To move one option upword
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();
		//2. To move two option downword
		// act.sendKeys(Keys.ARROW_DOWN).perform();
		//
		// Thread.sleep(3000);
		//
		// act.sendKeys(Keys.ARROW_DOWN).perform();
		//
		// Thread.sleep(3000);
		//
		// act.sendKeys(Keys.ENTER).perform();
		}
		
		

	}


