package udemy;


import java.util.List;

import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSting {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
	List<WebElement> ElementList=driver.findElements(By.xpath("//tr/td[1]"));

List<String> originaList =ElementList.stream().map(s-> s.getText()).collect(Collectors.toList());

List<String>  sortedList = originaList.stream().sorted().collect(Collectors.toList());

Assert.assertTrue(originaList.equals(sortedList));

List<String> price;

do
{
	
  List<WebElement> ElementList1=driver.findElements(By.xpath("//tr/td[1]"));
 price=ElementList1.stream().filter(s-> s.getText().contains("Rice")).map(s-> getpricevegies(s)).collect(Collectors.toList());

  price.forEach(a->System.out.println(a));
  
  
  if(price.size()<1)
  {
	  driver.findElement(By.cssSelector("[aria-label=\"Next\"]")).click();
  }

	
}while(price.size()<1);
	
	
	

	}

	private static  String  getpricevegies(WebElement s) 
	{
	 String pricevalue =s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
