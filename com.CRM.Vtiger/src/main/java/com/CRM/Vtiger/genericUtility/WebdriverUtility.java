package com.CRM.Vtiger.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
		
	}
	
	public void quit(WebDriver driver) {
		driver.quit();
	}
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IpathConstantPaths.implicitwait));
	}
	
	public void visiblityOfElementLocatedWait(WebDriver driver,By locator) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(IpathConstantPaths.explicitwait));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public void presenceOfElementLocatedWait(WebDriver driver,By locator) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(IpathConstantPaths.explicitwait));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void textToBePresentInElementLocatedWait(WebDriver driver,By locator,String text) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(IpathConstantPaths.explicitwait));
          wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));     
	}
	
	public void elementToBeClickableByElementWait(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(IpathConstantPaths.explicitwait));
        wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void elementToBeClickableByLocatorWait(WebDriver driver,By locator ) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(IpathConstantPaths.explicitwait));
         wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void alertIspresentWait(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(IpathConstantPaths.explicitwait));
        wait.until(ExpectedConditions.alertIsPresent());
	} 
	
	public void titleContainsWait(WebDriver driver,String title) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(IpathConstantPaths.explicitwait));
         wait.until(ExpectedConditions.titleContains(title));
	}
	
	
	
	public void selectDropdown(WebElement element,int index) {
		Select se=new Select(element);
		se.selectByIndex(index);
	}
	
	public void selectDropdown(WebElement element,String Value) {
		Select se=new Select(element);
		se.selectByValue(Value);
	}
	
	public void selectDropdown(String visibleText,WebElement element) {
		Select se=new Select(element);
		se.selectByVisibleText(visibleText);
	}
	
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void rightClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
        act.doubleClick(element).perform();
	}
	/**
	 * This method will help us to scroll the page
	 * @param driver
	 * @param element
	 */
	public void scrollThePageToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		int y = element.getLocation().getY();
		je.executeScript("window.scrollBy(0,"+y+")", element);	
	}
	/**
	 * By using this method  we can handle frame
	 */
	public void frame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	public void frame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);	
	}
	
	public void frame(WebDriver driver,String nameorid) {
		driver.switchTo().frame(nameorid);
	}
	/**
	 * This method will help us to return back to parent frame
	 * @param driver
	 */
	public void parentFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
		}
	/**
	 * By using this method we can handle the alert popup
	 */
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();	
	}
	
	public void dissmissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();	
	}
	
	public String getTextFromAlert(WebDriver driver) {
		return driver.switchTo().alert().getText();	
	}
	/**
	 * This method is used to take the screeshot   
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws Throwable
	 */
	public String screenshot(WebDriver driver,String screenshotName) throws Throwable {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		LocalDate local = LocalDate.now();
		String dt = local.toString().replace("-", "_").replace(";", "-");
		File dest = new File("./Screenshot//"+screenshotName+dt+".png");
		FileUtils.copyFile(src, dest);
		return dest.getAbsolutePath();	//Extent report
	}
	
	
	  
	

}
