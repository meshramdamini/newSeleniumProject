package groups;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.asserts.SoftAssert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Softassersion {
	    WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Damini\\Damini_Data\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
			//WebDriver driver= new ChromeDriver();
			 driver= new ChromeDriver(); 
	    }

	    @AfterMethod
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @Test
	    public void testGoogleSearchWithSoftAssertions() {
	        SoftAssert softAssert = new SoftAssert();
	        driver.get("https://www.google.com");

	        // Soft assert for title
	        softAssert.assertTrue(driver.getTitle().contains("Google"), "Title does not contain 'Google'");

	        // Search for a term
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("Selenium WebDriver");
	        searchBox.submit();

	        // Soft assert for first result
	        WebElement firstResult = driver.findElement(By.cssSelector("h3"));
	        softAssert.assertTrue(firstResult.getText().contains("Selenium"), "First result does not contain 'Selenium'");

	        // This is where you finalize the soft assertions and trigger the test failure if any assertion failed
	        softAssert.assertAll(); // Without this, soft assertions won't actually fail the test
	    }
	}



