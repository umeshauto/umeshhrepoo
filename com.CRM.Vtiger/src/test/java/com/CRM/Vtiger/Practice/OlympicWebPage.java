package com.CRM.Vtiger.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OlympicWebPage {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
	    //driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
	   jse.executeScript("window.scrollBy(0,600)");
	//	WebElement listDropdown = driver.findElement(By.xpath("//span[.='Tokyo 2020']/parent::div[contains(@class,'styles__Content-sc-1yhswdi-3 kxaXsZ')]"));

		//Actions action=new Actions(driver);
		//action.moveToElement(listDropdown).click().build().perform();
		
	  List<WebElement>allcountry=driver.findElements(By.xpath("(//span[@data-cy='country-name'])[Position()<5]"));
	  System.out.println(allcountry);
	  List<WebElement> ALlGoldMedal = driver.findElements(By.xpath("(//div[@title='Gold'])[Position()<5])"));
      System.out.println(ALlGoldMedal);
      List<WebElement> Sliver = driver.findElements(By.xpath("(//div[@title='Sliver'])[Position()<5])"));
      System.out.println(Sliver);
      List<WebElement> Bronze = driver.findElements(By.xpath("(//div[@title='Bronze'])[Position()<5])"));
      System.out.println(Bronze);
      List<WebElement> total = driver.findElements(By.xpath("(//div[@title=''])[Position()<5])"));
      System.out.println(total);
      
      
      
      
      
      
      
      
      
      
      
      
		//driver.findElement(By.xpath("//p[.='Beijing 2022']")).click();
		
		
		/**List<WebElement> allCountryNames = driver.findElements(By.xpath("//div[contains(@class,'styles__ListWrapper-sc')]"));
		
		for (int i = 0; i < allCountryNames.size(); i++) {
			
			String countryName = allCountryNames.get(i).getText();
			System.out.println(countryName);
		}
		
	}**/
	
	}
}
