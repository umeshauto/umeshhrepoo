package com.CRM.Vtiger.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	
	/**
	 * This method will update the data from excel sheet
	 * @param Sheet
	 * @param row
	 * @param cell
	 * @param data
	 * @throws Throwable
	 */
	
	public void updateDataIntoExcel(String Sheet,int row,int cell,String data) throws Throwable {
		
		FileInputStream fis= new FileInputStream(IpathConstantPaths.excelfilepath);
		Workbook wb = WorkbookFactory.create(fis);
	     wb.getSheet(Sheet).getRow(row).getCell(cell).setCellValue(data);
	     
	     FileOutputStream fos=new FileOutputStream(IpathConstantPaths.excelfilepath);
	     wb.write(fos);
	     wb.close();	
	}
	
	/**
	 * This method will help to fetch the data from excel sheet
	 * @param Sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	
	public String getDataFromExcel(String Sheet,int row,int cell) throws Throwable {
		FileInputStream fis =new FileInputStream(IpathConstantPaths.excelfilepath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cel = wb.getSheet(Sheet).getRow(row).getCell(cell);
		DataFormatter df=new DataFormatter();
		String value = df.formatCellValue(cel);
		return value;
				
	}
	
	@DataProvider
	public Object[][] getmultiple() throws Throwable{
		FileInputStream fs =new FileInputStream(IpathConstantPaths.excelfilepath);
		Workbook wb = WorkbookFactory.create(fs);
		Sheet sh = wb.getSheet("multiple");
		int lastrow = sh.getLastRowNum()+1;
		int lastcell = sh.getRow(0).getLastCellNum();
		Object[][] data=new Object[lastrow][lastcell];
		for(int i=0;i<lastrow;i++) {
			 for (int j = 0; j <lastcell ; j++) {
				 data[i][j]=sh.getRow(i).getCell(j).getStringCellValue(); 
			 }
				
			}
		return data;
		}			
	}