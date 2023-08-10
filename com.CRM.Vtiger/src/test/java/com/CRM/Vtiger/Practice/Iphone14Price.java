package com.CRM.Vtiger.Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone14Price {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> listOfAllIphone = driver.findElements(By.xpath("//span[contains(.,'Apple iPhone 14')]/descendant::span[@class='a-price-whole']"));
	       ArrayList allPrice=new ArrayList<>();
		for (WebElement price:listOfAllIphone) {
			
			System.out.println(price.getText());
		}
		
		
	}

}
