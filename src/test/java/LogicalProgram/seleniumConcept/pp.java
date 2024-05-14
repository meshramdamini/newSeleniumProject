package LogicalProgram.seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");

       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.google.com/");
       
    WebElement name =  driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
       String text = name.getText();
       System.out.println(text);
	}

}
