package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		
		Thread.sleep(3000);
		
		WebElement Input1 =driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
		//WebElement Input2 = driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
		
		Input1.sendKeys("This is my first java program");
		
		Actions Act = new Actions(driver);
		
		// CNTR+A
		
		Act.keyDown(Keys.CONTROL);
		Act.sendKeys("A");
		Act.keyUp(Keys.CONTROL);
		Act.build().perform();
		
		//CTRL+C
		Act.keyDown(Keys.CONTROL);
		Act.sendKeys("C");
		Act.keyUp(Keys.CONTROL);
		Act.build().perform();
		
		//Tab
		
		Act.keyDown(Keys.TAB);
		Act.build().perform();
		
		//CTRL+V
		
		Act.keyDown(Keys.CONTROL);
		Act.sendKeys("V");
		Act.keyUp(Keys.CONTROL);
		Act.build().perform();
	}

}
