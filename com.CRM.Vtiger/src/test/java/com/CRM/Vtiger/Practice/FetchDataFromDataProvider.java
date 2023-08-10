package com.CRM.Vtiger.Practice;

import org.testng.annotations.Test;

public class FetchDataFromDataProvider{
	
	   @Test(dataProviderClass = DataProvider3into5.class,dataProvider = "di")
	   public void getData(String phone,int price,String rating,String colour,String RAM) {
		   
		   System.out.println(phone+"--->"+price+"("+rating+")"+colour+"--->"+RAM);
		   
	   }

}
