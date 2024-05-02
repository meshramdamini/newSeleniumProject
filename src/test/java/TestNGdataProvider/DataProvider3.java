package TestNGdataProvider;

import java.io.FileInputStream;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider3 
{
	WebDriver driver;

	@BeforeMethod
	public void SetUp() 
	{
		System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@Test(dataProvider = "SearchDataProvider")
	public void SearchKeyword(String Keyword)
	{
		WebElement element =	driver.findElement(By.name("q"));
		element.sendKeys(Keyword);
		element.sendKeys(Keys.ENTER);

	}





	@DataProvider(name = "SearchDataProvider")
	public Object[][] SearchdataProviderMethod()
	{
		String Filename= "F:\\excel files\\testng.xlsx";
		Object[][] serchdata= getexceldata(Filename, "Sheet1");
		//Object[][] serchdata=new Object[2][1];
		return serchdata;

	}

	public String [][] getexceldata(String Filename, String Sheetname)
	{

		String [][] data = null;
		try {
			FileInputStream file = new FileInputStream(Filename);

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet	exceSheet =	workbook.getSheet(Sheetname);

			int   ttlrows = exceSheet.getLastRowNum()+1;
			int ttlcell= exceSheet.getRow(0).getLastCellNum();

			data= new String[ttlrows-1][ttlcell];
			for (int currentrow=1 ;currentrow<ttlrows; currentrow++)
			{

				for(int currentCell =0 ; currentCell<ttlcell;currentCell++)
				 {
					System.out.println();

					data[currentrow-1][currentCell]=exceSheet.getRow(currentrow).getCell(currentCell).toString();
				}
			}

			workbook.close();
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;
	}

	@AfterMethod
	public void Teardown()
	{
		driver.quit(); 
	}

}	   







