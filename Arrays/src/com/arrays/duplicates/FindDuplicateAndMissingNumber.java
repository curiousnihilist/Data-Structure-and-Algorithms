package com.arrays.duplicates;

/**
 * Problem: Given an unsorted array of size n. Array elements are in the range from 1 to n. 
 *          One number from set {1, 2, …n} is missing and one number occurs twice in the array. 
 *          Find these two numbers.
 *          
 * Example:
 * Input: arr[] = {3, 1, 3}
   Output: Missing = 2, Repeating = 3
 * @author akash
 *
 */
public class FindDuplicateAndMissingNumber {
	
	//Time O(n)   Space: O(1)
	private static void getNumbers(int[] arr) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			int el = arr[i]%n==0 ? n : arr[i]%n;
			arr[el-1] += n;
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i]<n) {
				System.out.println("Missing No.: "+(i+1));
			}
			if(arr[i]>2*n) {
				System.out.println("Repeating No.: "+(i+1));
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{4, 3, 6, 2, 1, 1};
		
		getNumbers(arr);
	}

}
