package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E 
{
   public static void main(String[] args) throws InterruptedException 
   {
		
	   
	   System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
        
		//driver.findElement(By.id("divpaxinfo")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		int i=1;
		
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
				
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
       WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(StaticDropdown);
		
		dropdown.selectByVisibleText("USD");
		
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		
	}

}

