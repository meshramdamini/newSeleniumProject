package WebDriverMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closequit {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       
	       //for single window - close & quit / close and quit works same for single window
	      // driver.get("https://www.gmail.com/");
	       //Thread.sleep(4000);
	       //driver.close();
		
	       
	       //single window but multiple tab - close and quit / 
	       driver.get("https://www.gmail.com/");
	       Thread.sleep(4000);
	       driver.findElement(By.linkText("Help")).click();
	       Thread.sleep(4000);
	       driver.close(); // it close the first windown current window
	       driver.quit();   // it close all tab
	       
	       
	       //for multiple window /close&quit
	       //driver.get("");
	      //Thread.sleep(7000);
	      // driver.close(); // close the first tab and quit close all tab
	}

}
