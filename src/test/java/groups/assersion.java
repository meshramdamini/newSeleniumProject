package groups;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class assersion {
	    WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver-win32-130\\chromedriver.exe");
			driver= new ChromeDriver(); 
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

	        // Assert that search results contain expected text
	        WebElement firstResult = driver.findElement(By.cssSelector("h3"));
	        Assert.assertTrue(firstResult.getText().contains("Selenium"), "First result does not contain 'Selenium'");
	    }
	}



