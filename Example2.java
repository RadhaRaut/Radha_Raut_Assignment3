package com.assignment;
/*
 * Write a Java program to calculate the average value of array elements. the array is 'int array[ ] = {55, 66, 44, 22, 55, 77}'
 */
public class Example2 {

	public static void main(String[] args) {
		
		int[]values =  {55, 66, 44, 22, 55, 77};
		int sum = 0;
        for (int value : values) {
            sum += value;
        }
        
        double average = (double) sum/ values.length;
		System.out.println("average :"+ average);
	}

}
