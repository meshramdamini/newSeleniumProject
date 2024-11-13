package DropDown;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemIntoCard {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		int j=0;
		driver.manage().window().maximize();
		String[] Itemsneeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size();i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formatedname = name[0].trim();
			
			List ItemsneededList= Arrays.asList(Itemsneeded);
			
			
			
			if(ItemsneededList.contains(formatedname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==Itemsneeded.length)
				{
					break;
				}
			}
		}
		
	}

}
