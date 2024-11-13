package PageObjectModel_With_DDF;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException  
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//to fetch data from excel
		
		String Path ="F:\\excel files\\9 julymorning.xlsx";
		//Thread.sleep(3000);
		FileInputStream file = new FileInputStream(Path);
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//creat object of class
		
		Orange_HRM_Page1 OHP= new Orange_HRM_Page1(driver);
		
		//fetch username from excel sheet
		
		String UserID = Sh.getRow(1).getCell(0).getStringCellValue();
		
		OHP.userID1(UserID);
		
		//2 fetch password from excel sheet
		
		String Pass = Sh.getRow(1).getCell(1).getStringCellValue();
		
		OHP.Pass(Pass);
		OHP.Login();
		
		Orange_HRM_Page2 OHP2= new Orange_HRM_Page2(driver);
		
		String Name= Sh.getRow(1).getCell(2).getStringCellValue();
		
		OHP2.name(Name);
		OHP2.Time();
		//driver.quit();
		
		
		
		
	

	}

}
