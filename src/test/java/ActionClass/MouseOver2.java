package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://mrbool.com/");
		Thread.sleep(3000);  
		
		WebElement Con =driver.findElement(By.xpath("//a[@class=\"menulink\"]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(Con).build().perform();
		WebElement zbc=driver.findElement(By.xpath("//a[contains(text(),'Art')]"));
		String Text =zbc.getText();
		System.out.println(Text);
		
	

	}

}
