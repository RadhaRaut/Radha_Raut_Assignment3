package com.assignment;
/*
 * Write a Java program to calculate sum of even numbers from an given array. the array is 'int[ ] values = {4, 6, 7, 2, 13, 9, 5};'.
 */
public class Example5 {

	public static void main(String[] args) {
		
		int[]arr= {4, 6, 7, 2, 13, 9, 5};
		int sum = 0;
		
		for(int value : arr) {
			if(value %2 ==0) {
				sum += value;
			}
			
			
		}
		System.out.println("sum of even no.: "+ sum);
	}

}
