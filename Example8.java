package com.assignment;

/*
 * Write a Java program to calculate sum of square of numbers divisible by 3 from an given array. 
 * the array is 'int[ ] values = {4, 6, 7, 2, 12, 9, 15};'.
 */
public class Example8 {

	public static void main(String[] args) {

		int[] arr = { 4, 6, 7, 2, 12, 9, 15 };
		int sum = 0;

		for (int value : arr) {
			if (value % 3 == 0) {
				sum += value * value;
			}
		}

		System.out.println("Sum of squares of numbers divisible by 3: " + sum);

	}

}
