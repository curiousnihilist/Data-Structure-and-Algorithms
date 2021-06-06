package com.arrays.level1;

import java.util.Arrays;

/**
 * Problem Statement: Given an array of random numbers, Push all the zero’s of a given array to the end of the array. 
 *                    For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should 
 *                    be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements 
 *                    should be same. Expected time complexity is O(n) and extra space is O(1).
 *                    
 * Example: arr: [1, 2, 0, 4, 3, 0, 5, 0]
 *          sol: [1, 2, 4, 3, 5, 0, 0]
 *          
 * Solution : Time complexity: O(n)
 *            Space complexity: O(1)
 * @author akash
 *
 */
public class SeparateZeroAndPositiveInteger {
	
	public static int[] seg(int[] arr) {
		int i=0,j=0;
		
		while(i<arr.length && j<arr.length) {
			while(arr[i]!=0) {
				i++;
				j++;
			}
			while(arr[j]==0) {
				j++;
			}
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j++;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,0,0,5,0,6,0,0,13,2};
			
		System.out.println(Arrays.toString(seg(arr)));
	
	}
	
	

}
