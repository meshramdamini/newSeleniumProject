package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Damini");
		
		driver.findElement(By.name("email")).sendKeys("Bhagat");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Damini@123");
		
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement element =driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select Dropdown = new Select(element);
		
		Dropdown.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("23/7/1994");
		
		driver.findElement(By.cssSelector("input[class=\"btn btn-success\"]")).click();
		
		

	}

}
