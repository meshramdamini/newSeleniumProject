package LogicalProgram.seleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	    Thread.sleep(4000);
	    
	  
	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	    
	    Thread.sleep(5000); 

driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]")).click();
Thread.sleep(5000); 
JavascriptExecutor Js = (JavascriptExecutor)driver;
Js.executeScript("window.scrollBy(0,1000)","");
Thread.sleep(3000);
WebElement checkbox= driver.findElement(By.xpath("(//span[@class=\"oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input\"]/i)[1]"));

if (!checkbox.isSelected()) {
    checkbox.click();
}

WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

// Verify if the checkbox is selected
if (checkbox1.isSelected()) {
    System.out.println("Checkbox is selected.");
} else {
    System.out.println("Checkbox is not selected.");
}
	 
	
	
	}

}
