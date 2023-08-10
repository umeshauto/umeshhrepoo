package com.CRM.Vtiger.Practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOfAmazonPrint {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		List<WebElement>Links = driver.findElements(By.xpath("//a"));
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Links");
		Row row = sheet.createRow(0);
		int cellNum = 0;
		for (WebElement link : Links) {
		    Cell cell = row.createCell(cellNum++);
		    cell.setCellValue(link.getAttribute("href"));
		    try (FileOutputStream outputStream = new FileOutputStream("./src/test/java/output2.xlsx")) {
		        workbook.write(outputStream);
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		   
		}
	}

}
