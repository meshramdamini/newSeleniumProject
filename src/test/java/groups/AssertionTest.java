package groups;

//public class AssertionTest {
//
//}
//
//package groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionTest {  // Renamed class to follow Java naming conventions
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		 driver= new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS); // Added implicit wait
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        
        // Assert that the title contains "Google"
        Assert.assertTrue(driver.getTitle().contains("Google"), "Title does not contain 'Google'");

        // Search for a term
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        
        // Wait for results to be present
        WebElement firstResult = driver.findElement(By.cssSelector("h3"));
        
        // Assert that search results contain expected text
        Assert.assertTrue(firstResult.getText().contains("Selenium"), "First result does not contain 'Selenium'");
    }
}

