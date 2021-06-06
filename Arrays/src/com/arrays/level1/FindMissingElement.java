package com.arrays.level1;

/**
 * Problem : Given array with elements 1 to n, only one element is missing. FInd that element
 * 
 * Example : arr = [3,5,6,2,4,7]
 * 			 solution = 1           since one is missing
 * 
 * Approach
 * 1. Subtract the sum of array element by the total sum of n integers i.e n(n+1)/2
 * 	  limitation: Integer overflow if n is large
 * 
 * 2. (XOR of array elements) XOR (XOR of elements from 1 to n), Since A XOR A = 0;
 *  
 * @author akash
 *
 */
public class FindMissingElement {
	
	private static int usingSum(int[] arr, int n) {
		int total = 0;
		int sum = (n*(n+1))/2;
		
		for(int i=0; i<arr.length; i++) {
			total+=arr[i];
		}
		return sum-total;
	}
	
	private static int usingXOR(int[] arr, int n) {
		int xor_array = arr[0];
		int xor_num = 1;
		
		for(int i=1; i<arr.length;i++) {
			xor_array^=arr[i];
		}
		
		for(int i=2; i<=n;i++) {
			xor_num^=i;
		}
		
		return xor_array^xor_num;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,5,6,2,4,7};
		
		System.out.println(usingSum(arr,7));
		System.out.println(usingXOR(arr,7));
		
	}

}
