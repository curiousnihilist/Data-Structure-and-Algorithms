package com.arrays.level1;

import java.util.Arrays;

/**
 * Problem: Given an array with all distinct elements, find the largest three elements. 
 *          Expected time complexity is O(n) and extra space is O(1). 
 *          
 * Example: arr = [ 10, 4, 3, 50, 23, 90];
 *          Sol 90,50,23
 *          
 * @author akash
 *
 */
public class FindThreeDistinctLargestElements {
	
	private static int[] getSolution(int[] arr) {
		int max = Integer.MIN_VALUE+2;
		int smax = Integer.MIN_VALUE+1;
		int tmax = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				tmax = smax;
				smax = max;
				max = arr[i];
			}
			
			if(arr[i]<max && arr[i]>smax) {
				tmax = smax;
				smax = arr[i];
			}
			
			if(arr[i]<smax && arr[i]>tmax) {
				tmax = arr[i];
			}
		}
		
		return new int[] {max,smax,tmax};
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {10, 4, 3, 50, 23, 90};
		
		System.out.println(Arrays.toString(getSolution(arr)));
	}

}
