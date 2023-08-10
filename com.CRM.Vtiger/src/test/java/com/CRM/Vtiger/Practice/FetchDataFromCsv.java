package com.CRM.Vtiger.Practice;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class FetchDataFromCsv {

	
	public static void main(String[] args) {
		String cell[]; //global declartion  
		try {
			//To read the data from csv file
			FileReader fr=new FileReader("./src/test/resources/datacsv.csv");
			CSVReader reader=new CSVReader(fr);
			
			//navigate to each cell
			        //Initialization of empty array i.e cell
			while ((cell=reader.readNext())!=null) {
				String keyword = cell[0];
				System.out.println(keyword);
				
				//to print the data got from csv file to enter in textfiled
				//driver.findElements().sendkeys(keyword);  	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
     
	}
}
