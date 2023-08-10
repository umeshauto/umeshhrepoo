package com.CRM.Vtiger.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.Vtiger.genericUtility.WebdriverUtility;

public class AmazonSamsungAutosugegestion {
	
	public static void main(String[] args) {
		
		WebdriverUtility w=new WebdriverUtility();
		WebDriver driver=new ChromeDriver();
       w.maximize(driver);
       w.implicitWait(driver);
       driver.get("https://www.amazon.in/");
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s 20");
       List<WebElement> ele = driver.findElements(By.xpath("//div[@class='left-pane-results-container']"));
      
      for (WebElement wb:ele) {	  
    	  if(wb.getText().equalsIgnoreCase("samsung s 20")) {
    		  wb.click(); 
    		  break;
    	  }
		
	}

	}			
	

}
