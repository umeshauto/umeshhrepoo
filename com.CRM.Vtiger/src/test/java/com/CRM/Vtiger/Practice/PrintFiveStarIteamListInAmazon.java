package com.CRM.Vtiger.Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFiveStarIteamListInAmazon {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> a = driver.findElements(By.xpath("//span[contains(.,'5.0 out of 5 stars')]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::h2"));
		
		//List<WebElement> allIteams = driver.findElements(By.xpath("//div[contains(@class,'s-main-slot s-result-list')]/div//span[contains(@class,'a-size-medium a-color')]"));
	    	
		/**for (int i = 0; i <a.size(); i++) {
			
			String nameOfEachIteam = a.get(i).getText();
			System.out.println(nameOfEachIteam);
		}**/
		
		 for(WebElement w:a) {
			 System.out.println(w.getText());
		 }
	
	}

}
