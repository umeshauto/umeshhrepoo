package com.CRM.Vtiger.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
    
	public String getDataFromProperty(String data) throws Throwable  {
		/**
		 * This method will help us to fetch the data from property  file
		 * 
		 */
		  FileInputStream fis = new FileInputStream(IpathConstantPaths.propertyfilepath);
		  Properties p=new Properties();
		  p.load(fis);
		  String value = p.getProperty(data);
		  return value;

		  
	}
}
