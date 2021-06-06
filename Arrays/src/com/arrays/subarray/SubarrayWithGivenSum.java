package com.arrays.subarray;

/**
 * Problem : Given an unsorted array of nonnegative integers, find a continuous subarray which adds 
 *           to a given number
 *  
 * Example:
 * Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
   Ouptut: Sum found between indexes 1 and 4
           Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7
 * @author akash
 *
 */
public class SubarrayWithGivenSum {
	
	private static void subarrayWithGivenSum(int[] arr, int sum) {
		int currSum=arr[0];
		int fIndex=0;
		
		for(int i=1; i<arr.length; i++) {
			currSum+=arr[i];
			while(fIndex<i && currSum>sum) {
				currSum-=arr[fIndex];
				fIndex++;
			}
			if(currSum==sum) {
				System.out.println("firstIndex: "+fIndex);
				System.out.println("lastIndex: "+i);
				return;
			}
		}
		System.out.println("No such subarray exists");
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1, 4};
		
		subarrayWithGivenSum(arr,0);
		
	}

}
