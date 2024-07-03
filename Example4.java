package com.assignment;

import java.util.HashSet;
import java.util.Set;

/*
 * Write a Java program to find duplicate values in an array values, the array
 *  is 'int values[ ] = {23, 45, 23, 56, 88, 99, 55, 34, 45, 67, 11, 88, 99, 11, 34}'
 */
public class Example4 {

	public static void main(String[] args) {
		
		int[]arr= {23, 45, 23, 56, 88, 99, 55, 34, 45, 67, 11, 88, 99, 11, 34};
		 Set<Integer> seen = new HashSet<>();
		 Set <Integer>duplicate= new HashSet<>();
		 
		 for(int arrays: arr) {
			 if(!seen.add(arrays)) {
				 duplicate.add(arrays);
			 }
			 
			 
		 }
		 System.out.println("duplicate values: "+ duplicate);
		 
		

	}

}
