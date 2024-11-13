package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetion2 {

	public static void main(String[] args) throws InterruptedException 
	{   
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
		    
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
	//open google page
		//open google page
		driver.get("https://www.google.com/");
		//wait for 2sec
		Thread.sleep(2000);
		//Search redmi on search filed on google
		driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys("redmi");
		//wait for 2sec
		Thread.sleep(6000);
		//identify autosugetion xpath by use absolute/relative xpath
		List<WebElement> AllOptions = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//li"));
		System.out.println(AllOptions.size());
		//To print Autosugation select option
		for(WebElement option: AllOptions)
		{
		String actText = option.getText();
		System.out.println(actText);
		
		if(actText.equals("redmi note 9 pro"))
		{
		  option.click();
		  break;
		}
		
		}
		

	}     
		
		

}


