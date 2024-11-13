package AxesMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ansestor2 {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
        WebDriver driver = new ChromeDriver();
            
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
      String Text2=driver.findElement(By.xpath("//a[contains(text(),'Bharat Petroleum')]/ancestor-or-self::tr")).getText();
      System.out.println(Text2);
        
	}

}
