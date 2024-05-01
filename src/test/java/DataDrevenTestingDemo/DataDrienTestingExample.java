package DataDrevenTestingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrienTestingExample {

	public static void main(String[] args)  {
		
		XSSFWorkbook excelbook= null;
		XSSFSheet excelSheet;
		//XSSFRow row;
		//XSSFCell cell;
		
		File excelFile = new File ("F:\\excel files\\xyz.xlsx");
		FileInputStream fileinp = null;
		try 
		{
			fileinp = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
		try {
			excelbook = new XSSFWorkbook(fileinp);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		excelSheet = excelbook.getSheetAt(0); 
		
	int ttrows=excelSheet.getLastRowNum()+1;
	
	int ttlCell =excelSheet.getRow(0).getLastCellNum();
	
	for (int Currentrow =1 ;Currentrow<ttrows;Currentrow++)
	{
		
System.setProperty("webdriver.chrome.driver","F:\\SOFTWARE_SETUP\\chromedriver_win32\\ChromeDriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        driver.findElement(By.id("user-name")).sendKeys(excelSheet.getRow(Currentrow).getCell(0).toString());

        driver.findElement(By.id("password")).sendKeys(excelSheet.getRow(Currentrow).getCell(1).toString());

        driver.findElement(By.id("login-button")).click();

        
        
        try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //		for(int currentCell =0 ; currentCell<ttlCell;currentCell++)
//		{
//			//excelSheet.getRow(Currentrow).getCell(currentCell).toString();
//			System.out.print(excelSheet.getRow(Currentrow).getCell(currentCell).toString());
//		     System.out.print("/t");
//		
//		}
//		
//		System.out.println();
        driver.quit();
//		
	}
	try {
		excelbook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}

}
