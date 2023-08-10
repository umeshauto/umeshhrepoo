package com.CRM.Vtiger.Practice;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider3into3 {
	
	@DataProvider(name="di")
	public Object [][] data(){
		Object[][] data=new Object[3][3];
		data[0][0]="samsung";
		data[0][1]=10000;
		data[0][2]="3.5star";
		data[1][0]="Nokia";
		data[1][1]=20000;
		data[1][2]="2.5star";
		data[2][0]="iphone";
		data[2][1]=60000;
		data[2][2]="5star";
		return data;
	}
	
	@Test(dataProvider = "di")
	public void getdata(String phone,int price,String rating) {
		
		System.out.println(phone+"----->"+price+"("+rating+")");
		
	}
	
	
}
