package udemy;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterTable 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("rice");
		
	List<WebElement> viggies=driver.findElements(By.xpath("//tr/td[1]"));
	
  List<WebElement> FilterdList =viggies.stream().filter(viggie-> viggie.getText().contains("rice")).collect(Collectors.toList());
		
  Assert.assertEquals(viggies.size(), FilterdList.size());
	}

}
