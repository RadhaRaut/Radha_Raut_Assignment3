package com.assignment;

/*
 * Write a Java program to sum values of an given array. the array is 'int[ ] values = {34, 56, 78, 20, 78, 90, 74};'.
 */
public class Exaample1 {

	public static void main(String[] args) {

		int[] values = { 34, 56, 78, 20, 78, 90, 74 };
		int sum = 0;

		for (int value : values) {
			sum += value;
		}
		System.out.println(sum);
	}

}
