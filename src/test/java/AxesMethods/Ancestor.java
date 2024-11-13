package AxesMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ancestor {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https:www.hyrtutorials.com/p/add-padding-to-containers.html");
      
       driver.findElement(By.xpath("//div[@class='buttons']/ancestor::div")).click();
       

	}

}
