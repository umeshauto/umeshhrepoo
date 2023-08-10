package com.CRM.Vtiger.Practice;

import org.testng.annotations.DataProvider;

public class DataProvider3into5 {
	
	@DataProvider(name="di")
	public Object [][] data(){
		Object[][] data=new Object[3][5];
		data[0][0]="samsung";
		data[0][1]=10000;
		data[0][2]="3.5star";
		data[0][3]="blue";
		data[0][4]="6GB";
		data[1][0]="Nokia";
		data[1][1]=20000;
		data[1][2]="2.5star";
		data[1][3]="Black";
		data[1][4]="4GB";
		data[2][0]="iphone";
		data[2][1]=60000;
		data[2][2]="5star";
		data[2][3]="White";
		data[2][4]="128GB";
		return data;
	}

}
