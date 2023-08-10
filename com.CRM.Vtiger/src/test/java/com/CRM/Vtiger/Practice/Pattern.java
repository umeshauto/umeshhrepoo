package com.CRM.Vtiger.Practice;

public class Pattern {
	
public static void main(String[] args) {
	 String str = "India";
     int length = str.length();

     // Print the pattern
     for (int i = 0; i < length; i++) {
         for (int j = 0; j <= i; j++) {
             System.out.print(str.charAt(j));
         }
         System.out.println();
     }
}

}
