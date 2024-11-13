package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
       driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");                                   
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(4000);
		WebElement day =driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month =driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year =driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		Thread.sleep(3000);
		DOB(day,"13");
		DOB(month,"5");
		DOB(year,"2020");
		//String DOB = "13/5/2020";
		//String date[]=DOB.split("/");
		//dropdown(day,date[0]);
		//dropdown(month,date[1]);
		//dropdown(year,date[2]);

	}

	public static void DOB(WebElement text, String value) 
	{
		Select select1= new Select(text);
		select1.selectByValue(value);
                              
		

	}

}
