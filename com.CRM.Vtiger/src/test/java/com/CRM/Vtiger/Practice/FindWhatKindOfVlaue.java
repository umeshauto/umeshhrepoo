package com.CRM.Vtiger.Practice;

import java.util.Scanner;

public class FindWhatKindOfVlaue {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a value: ");
	        String input = scanner.nextLine();

	        char character = input.charAt(0);

	        if (Character.isLetter(character)) {
	            System.out.println("Character");
	        } else if (Character.isDigit(character)) {
	            System.out.println("Number");
	        } else {
	            System.out.println("Special Character");
	        }

	        scanner.close();
	}

}
