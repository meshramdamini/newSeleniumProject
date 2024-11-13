package JavaScriotExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBackground {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement name =driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		WebElement login =driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		
		WebElement  password =driver.findElement(By.id("pass"));
		
		Thread.sleep(3000);
		
		Highlight(name,driver);
		Highlight(login,driver);
		Highlight(password,driver);
		
	}
	//change background color blue to green
	public static void Highlight(WebElement element,WebDriver text)
	   {
		   JavascriptExecutor Js =(JavascriptExecutor)text;
		   Js.executeScript("arguments[0].style.background='green'",element);
		}
	

	}


