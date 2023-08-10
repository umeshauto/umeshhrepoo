package com.CRM.Vtiger.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebCamTest {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("use-Fake-device-For-Media-Stream");
		options.addArguments("use-Fake-Ui-For-Media-Stream");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://webcamtests.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement TestMyCamButton = driver.findElement(By.xpath("//button[@id='webcam-launcher']"));
		String TextOfButton= TestMyCamButton.getText();
		wait.until(ExpectedConditions.elementToBeClickable(TestMyCamButton));
		Actions actions=new Actions(driver);
		actions.click(TestMyCamButton).build().perform();
		
		//doubt ask not working
		//since popup is notification popup os we have to use ChromeOptions class
		
		
	
   }
}
