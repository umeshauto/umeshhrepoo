package com.CRM.Vtiger.Practice;

import java.util.Arrays;

public class ZeroMoveToEnd {
	
	   public static void main(String[] args) {
	        int[] a = {1, 0, 6, 5, 0, 9, 2, 0, 15};
	        int[] b = moveZerosToEnd(a);
	        System.out.println("Input Array: " + Arrays.toString(a));
	        System.out.println("Output Array: " + Arrays.toString(b));
	    }

	    public static int[] moveZerosToEnd(int[] arr) {
	        int n = arr.length;
	        int[] result = new int[n];
	        int nonZeroIndex = 0;

	       
	        for (int i = 0; i < n; i++) {
	            if (arr[i] != 0) {
	                result[nonZeroIndex] = arr[i];
	                nonZeroIndex++;
	            }
	        }

	          
	        while (nonZeroIndex < n) {
	            result[nonZeroIndex] = 0;
	            nonZeroIndex++;
	        }

	        return result;
	    }
	}
	


