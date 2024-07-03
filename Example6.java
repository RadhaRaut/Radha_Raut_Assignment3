package com.assignment;
/*
 * Write a Java program to calculate sum of odd numbers from an given array. the array is     
 * 'int[ ] values = {24, 36, 47, 27, 13, 9, 5};'.
 */
public class Example6 {

	public static void main(String[] args) {
		 int[] values = {24, 36, 47, 27, 13, 9, 5};
	        int sum = 0;
	        
	        for (int value : values) {
	            if (value % 2 != 0) {
	                sum += value;
	            }
	        }
	        
	        System.out.println("Sum of odd numbers: " + sum);
	    }
	}


