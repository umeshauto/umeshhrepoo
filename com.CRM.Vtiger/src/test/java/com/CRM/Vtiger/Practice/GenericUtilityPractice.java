package com.CRM.Vtiger.Practice;

import com.CRM.Vtiger.genericUtility.ExcelUtility;
import com.CRM.Vtiger.genericUtility.FileUtility;
import com.CRM.Vtiger.genericUtility.JavaUtility;

public class GenericUtilityPractice {
	
	public static void main(String[] args) throws Throwable {
		
		FileUtility futil = new FileUtility();
	  String  URL=futil.getDataFromProperty("url");
	  System.out.println(URL);
	  
	  String bn = futil.getDataFromProperty("browser");
	  System.out.println(bn); 
	  
	  String user = futil.getDataFromProperty("username");
	  System.out.println(user);
	  
	  ExcelUtility eutil=new ExcelUtility();
	 String orgName = eutil.getDataFromExcel("Sheet1", 0, 0);
	 System.out.println(orgName);
	 
	 JavaUtility jutl=new JavaUtility();
	 String dat = jutl.CurrentDate();
	 System.out.println(dat);
	 
	 String sysDat = jutl.systemDate();
	 System.out.println(sysDat);
	 
	  
	}
}
