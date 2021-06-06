package com.arrays.misc;

/**
 * Problem:https://www.geeksforgeeks.org/check-if-a-key-is-present-in-every-segment-of-size-k-in-an-array/
 * 
 * @author akash
 *
 */

public class Problem1 {
	
	private static boolean isPresent(int[] arr, int size, int key) {
		int i=0;
		for(;i<arr.length; i=i+size) {
			boolean present = false;
			for(int j=0; j<size; j++) {
				if(i+j<arr.length && arr[i+j]==key) {
					present = true;
					break;
				}
			}
			if(!present) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int[] arr = new int[] {3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
		
		System.out.println(isPresent(arr, 4, 3));
	}
}
