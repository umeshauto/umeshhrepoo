package com.CRM.Vtiger.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import objectRespository.HomePage;
import objectRespository.LoginPage;

public class BaseClass {
	
	//public ExcelUtility eutil=new ExcelUtility();
	public ExcelUtility eutil=new ExcelUtility();
	public FileUtility futil=new FileUtility();
	public JavaUtility jutil=new JavaUtility();
	public WebdriverUtility wutil=new WebdriverUtility();
	public static WebDriver sdriver;
	public WebDriver driver;
	
	@BeforeSuite(groups = {"smoke","regression"})
	public void bsconfig() {
		System.out.println("data base conn");
	}
   
	//@Parameters("browser") //{cross browsr testing 
	//@BeforeTest  //(cross browser testing)
	@BeforeClass(groups = {"smoke","regression"})
	public void  bcconfig() throws Throwable {
        //String BROWSER = System.getProperty("browser");  // read browser valvue from commandline 
		String BROWSER = futil.getDataFromProperty("browser"); //read browser value from Property file
		String URL=futil.getDataFromProperty("url");
		
		//run time polymorphisam
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println(BROWSER+"launched");
		}
		else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			System.out.println(BROWSER+"launched");
		}
		
		else {
			System.out.println("invalid browser");
		}
		
		sdriver=driver;
		wutil.maximize(driver);
		wutil.implicitWait(driver);
		driver.get(URL);
	}
	
	@BeforeMethod(groups = {"smoke","regression"})
	public void bmConfig() throws Throwable{
		String UN=futil.getDataFromProperty("username");
		String PW = futil.getDataFromProperty("password");
	LoginPage lp=new LoginPage(driver);
	lp.login(UN, PW);
	System.out.println("log into the app");	
	}
	
	@AfterMethod(groups = {"smoke","regression"})
	public void amConfig() {
		HomePage hp=new HomePage(driver);
		hp.logout(driver);
		System.out.println("close the browser");
	}
	
	//@AfterTest    //(cross browser testing)
    @AfterClass(groups = {"smoke","regression"})
	public void acConfig() {
		driver.quit();
		System.out.println("close the browser");
	}
	
	@AfterSuite(groups = {"smoke","regression"})
	public void asConfig() {
		System.out.println("close ");
	}
}
