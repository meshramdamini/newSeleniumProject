package TestNgAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {
	
	//in real time project we don't need all these annotation
	//we use only @Beforeclass @Beforemethod @Afterclass @Aftermethod @Test
	//Precondition annotation--Starts with @before
	/*@BeforeSuit--set up property for Chrom-1st Preferece
	 * @BeforeTest--Eter URL--2d
	 * @BeforeClass--LauchBrowser-3rd
	 * 
	 * @BeforeMethod--login to application
	 * @Test-- google Test
	 * @AfterMethod--logout from application
	 * 
	 * @BeforeMethod--login to application
	 * @Test--demo test
	 * @AfterMethod--logout from application
	 * 
	 * @after class-- close browser
	 * @After Test-- delete all cookies
	 * @Aftersuit
	 */
	 @BeforeClass public void LaunchBrowser()
	 {
		 System.out.println("Before class--LaunchBrowser");
	
	 }
	 @BeforeTest public void URL()
	 {
		 System.out.println("Before test--Enter URL");
	 }
	 @BeforeMethod public void login()
	 {
		 System.out.println("BeforeMethod--login to application");
	 }
	 //Test annotation-- starts with @Test
	 
	 @Test public void GoogletitleTest()
	 {
		 System.out.println("@Test--google Test");
		 
	 }
	 @Test public void demo()
	 {
		 System.out.println("@Test--demoTest");
	 }
	 @Test public void demo2()
	 {
		 System.out.println("Test--demo2Test");
	 }
	 //postcondition --starts with@after
	 @AfterMethod public void logout()
	 {
		 System.out.println("@AfterMethod--logout from application");
	 }
	 @AfterClass public void  closebrowser()
	 {
		 System.out.println("@AfterClass--close browser");
	 }
	 @AfterTest public void deleteallcookies()
	 {
		 System.out.println("@AfterTest--deleteallcookies");
	 }
	 
	 @BeforeSuite public void Setup()
	 {
		 System.out.println("beforeSuit--Set up property for chrom");
	 }

}
