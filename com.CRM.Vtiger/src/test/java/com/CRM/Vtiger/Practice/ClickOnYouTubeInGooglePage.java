package com.CRM.Vtiger.Practice;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.CRM.Vtiger.genericUtility.WebdriverUtility;

public class ClickOnYouTubeInGooglePage {
	
	public static void main(String[] args) throws Throwable {
		
		WebdriverUtility wdutl=new WebdriverUtility();
		WebDriver driver=new ChromeDriver();
		wdutl.maximize(driver);
		wdutl.implicitWait(driver);
	    driver.get("https://www.google.com/");
	    WebElement icon = driver.findElement(By.xpath("//a[@href=\"https://www.google.co.in/intl/en/about/products\"]"));
	   Actions act=new Actions(driver);
	   act.moveToElement(icon).click().perform();
	   driver.switchTo().frame(1);
	   Thread.sleep(1000);
	   
	    driver.findElement(By.xpath("//span[.='YouTube']")).click();
	    
		
	}

}
