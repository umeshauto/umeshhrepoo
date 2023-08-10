package com.CRM.Vtiger.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.CRM.Vtiger.genericUtility.WebdriverUtility;

public class FlipkartcheckAddToCart {
	
public static void main(String[] args) {
	
	WebdriverUtility wbutl=new WebdriverUtility();
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    
	 WebElement mobiles = driver.findElement(By.xpath("//div[@class='InyRMC _3Il5oO']/descendant::div[@class='CXW8mj']/img[contains(@src,'https://rukminim2.flixcart.com/flap/128/128/image/22fddf3c7da4c4f4.png?q=100')]"));
    WebElement realmeEle = driver.findElement(By.xpath("(//div[@class='_3879cV'])[position()=3]"));
	wbutl.scrollThePageToElement(driver, realmeEle);
	realmeEle.click();
	driver.findElement(By.xpath("//div[.='realme C55 (Rainforest, 128 GB)']")).click();
	driver.findElement(By.xpath("//label[.='Compare']")).click();
	WebElement compareEle = driver.findElement(By.xpath("//a[@href=\"/Handset/compare?ids=MOBGNBYJPF2DEADS&otracker=compare_product_1\"]"));
	Actions act=new Actions(driver);
	act.moveToElement(compareEle).click().perform();
	
	
	
	
}

}
