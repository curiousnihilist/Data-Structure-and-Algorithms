package com.arrays.subarray;

/**
 * Problem : Write an efficient program to find the sum of contiguous subarray within a 
 *           one-dimensional array of numbers that has the largest sum. Also print their starting 
 *           and ending index
 *           
 * Example: arr = [-2,-3,4,-1,-2,1,5,-3]
 *          sol = max sum = 7,   index=[2,6]
 *          
 * @author akash
 *
 */

public class MaximumSumSubarray {
	
	private static void getSolution(int[] arr) {
		int currSum = 0;
		int maxSum = 0;
		int startIndex = 0;
		int lastIndex = 0;
		int k =0 ;
		
		for(int i=0; i<arr.length; i++) {
			currSum+=arr[i];
			if(currSum <= arr[i]) {
				currSum = arr[i];
				k = i;
				
			}
			if(currSum>maxSum) {
				maxSum=currSum;
				startIndex = k;
				lastIndex=i;
			}
		}
		
		System.out.println("Max Sum: "+maxSum);
		System.out.println("Starting Index: "+startIndex);
		System.out.println("Last Index: "+lastIndex);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{-2,-3,4,-1,-2,1,5,-3};
		
		getSolution(arr);
	}

}
