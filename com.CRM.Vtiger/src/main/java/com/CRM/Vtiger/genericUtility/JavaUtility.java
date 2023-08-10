package com.CRM.Vtiger.genericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

	 public int getRandom() {
		 Random ran=new Random();
		 int random = ran.nextInt(1000);
		 return random;  
	 }
	 
	 /**
	  * This method will fetch the current date
	  * @return
	  */
	 
	 public String CurrentDate() {
		 Date d=new Date();
		String dat = d.toString();
		return dat;
		 
		 }
	 
	 /**
	  * This method will fetch modified current date
	  * @return
	  */
	 
	 public String systemDate() {
		 Date d =new Date();
		String dt[]= d.toString().split(" ");
		
	     String	month=dt[1];
	     String day=dt[0];
	     String date=dt[2];
	     String year=dt[5];
	     String currentDate=day+" "+month+" "+date+" "+year;
	     return currentDate;
	 }
			 
}
