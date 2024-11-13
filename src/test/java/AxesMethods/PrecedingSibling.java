package AxesMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrecedingSibling {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https:www.hyrtutorials.com/p/add-padding-to-containers.html");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//label[text()='Last Name']/preceding-sibling::input")).sendKeys("Damini");
		

	}

}
