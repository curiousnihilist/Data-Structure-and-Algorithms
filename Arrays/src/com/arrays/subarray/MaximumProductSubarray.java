package com.arrays.subarray;

/**
 * Problem Statement: Given an array that contains both positive and negative integers, 
 *                    find the product of the maximum product subarray. 
 *                    Expected Time complexity is O(n) and only O(1) extra space can be used.
 *                    
 * Example : Input: arr[] = {-1, -3, -10, 0, 60}
 *           Output:   60  // The subarray is {60}
 * @author akash
 *
 */
public class MaximumProductSubarray {
	
	private static int getMax(int a, int b, int c) {
		return a >= Math.max(b, c) ? a : b >= Math.max(a,c) ? b : c;
	}
	
	private static int getMin(int a, int b, int c) {
		return a <= Math.min(b, c) ? a : b <= Math.min(a,c) ? b : c;
	}

	private static int getSolution(int[] arr) {
		int currMax = 1;
		int currMin = 1;
		int result = arr[0];
		
		if(arr.length==1) {
			return arr[0];
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				currMin=1;
				currMax=1;
				continue;
			}
			int tempMin = currMin * arr[i];
			int tempMax = currMax * arr[i];
			
			currMax = getMax(tempMin,tempMax,arr[i]);
			currMin = getMin(tempMin,tempMax,arr[i]);
			result = Math.max(result, currMax);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {-1, -3, -10, 0, 60};
		
		System.out.println(getSolution(arr));
	}
}
