package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]")).sendKeys("My mane is damini and i have to clear that interview");
		
		Actions action = new Actions(driver);
		
		//ctr A
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("A");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

		action.keyDown(Keys.CONTROL);
		action.sendKeys("C");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("V");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
	}

}
