package com.assignment;
/*
 * Write a Java program to find the maximum and minimum value from a given an array.
 *  array is 'int array[ ] = {45, 67, 98, 63, 59, 24, 48}' .
 */

public class Example3 {

	public static void main(String[] args) {
		int []array ={45, 67, 98, 63, 59, 24, 48};
		int max = array[0];
		int min = array[0];
		
		for(int value : array) {
			
			if(value> max) {
				max= value;
			}
			if(value < min) {
				min= value;
			}
		}
		System.out.println("maximum :"+ max);
		System.out.println("minimum :"+ min);
		
	}

}
