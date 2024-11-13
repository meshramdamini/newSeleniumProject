package xpathofRelative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookTitle {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        
        String ExpectedResult= "Facebook – log in or sign up";
        
        String Title= driver.getTitle();//Facebook – log in or sign up
        
        System.out.println(Title);
   
        if(Title.equals(ExpectedResult))
        {
        	System.out.println("correct title");
        }
        else
        {
        	System.out.println("incorrect tilte");
        }
        
        //driver.quit();
        
	

	}

}
