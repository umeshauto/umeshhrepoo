package com.CRM.Vtiger.contactsTest;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.Vtiger.genericUtility.BaseClass;
import com.CRM.Vtiger.genericUtility.ExcelUtility;
import com.CRM.Vtiger.genericUtility.FileUtility;
import com.CRM.Vtiger.genericUtility.JavaUtility;
import com.CRM.Vtiger.genericUtility.WebdriverUtility;

import objectRespository.ContactInfoPage;
import objectRespository.ContactPage;
import objectRespository.CreateNewContactPage;
import objectRespository.HomePage;
import objectRespository.LoginPage;

@Listeners(com.CRM.Vtiger.genericUtility.ListenerImplimentation.class)
public class VerifyContactLastNameTest extends BaseClass {
	
	@Test(groups = "smoke")
	public  void contactTest( ) throws Throwable {
		
		/**Random ran=new Random();
	    int random1 = ran.nextInt(1000);
		JavaUtility jutl=new JavaUtility();
		int rn = jutl.getRandom();
		FileUtility futl=new FileUtility();
		String URL=futl.getDataFromProperty("url");		
		String UN = futl.getDataFromProperty("username");
		String PW = futl.getDataFromProperty("password");
		ExcelUtility eutil=new ExcelUtility();
		String ActualLastName = eutil.getDataFromExcel("Sheet2", 0, 0)+rn;
		WebdriverUtility wdutl=new WebdriverUtility();
        WebDriver driver=new ChromeDriver();
        wdutl.maximize(driver);
		wdutl.implicitWait(driver);
		driver.get(URL);
		LoginPage lp=new LoginPage(driver);
		lp.login(UN, PW);**/
		
		String ActualLastName = eutil.getDataFromExcel("sheet2", 0, 0)+jutil.getRandom();
		HomePage hp=new HomePage(driver);
		hp.contactclick();
		
		ContactPage cont=new ContactPage(driver);
		cont.clickContactLookUp();
		
		CreateNewContactPage crcn=new CreateNewContactPage(driver);
		crcn.createContact(ActualLastName);
		
		ContactInfoPage conif=new ContactInfoPage(driver);
		String ExpectedLastName = conif.getCreatedconatc();
		
		Assert.assertTrue( ExpectedLastName.contains(ActualLastName));
		System.out.println("Pass"); 
		
	}

}
