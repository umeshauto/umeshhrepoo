package com.CRM.Vtiger.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AmazonSellStart {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		
		driver.findElement(By.xpath("//a[.='Sell']")).click();
		WebElement startSellingButtton = driver.findElement(By.xpath("//h2[.='Sell on Amazon']/ancestor::div[contains(@class,'background-color-whi')]//a[.='Start Selling']"));
		startSellingButtton.click();
		
	}
	
}
