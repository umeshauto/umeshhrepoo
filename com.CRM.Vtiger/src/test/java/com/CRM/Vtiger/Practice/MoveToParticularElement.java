package com.CRM.Vtiger.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToParticularElement {
	 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   WebElement ele = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/41uGjvXbeBL._AC_SY200_.jpg']"));
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
	   int eleYloc = ele.getLocation().getY();
	   System.out.println(eleYloc);
	   jse.executeScript("window.scrollBy(0,"+eleYloc+")", ele);
	   
	}
	
}
