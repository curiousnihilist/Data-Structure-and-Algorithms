package com.arrays.level2;

/**
 * Problem : Given a sorted array and a number x, find a pair in array whose sum is closest to x.
 * 
 * Example:
 * Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
   Output: 22 and 30

   Input: arr[] = {1, 3, 4, 7, 10}, x = 15
   Output: 4 and 10
   
 * @author akash
 *
 */
public class PairInArrayCLosestToSum {
	
	private static void getClosestPair(int[] arr, int sum) {
		int i=0, j=arr.length-1;
		
		int resL=0,resR=0;
		
		int diff = Integer.MAX_VALUE;
		
		while(i<j) {
			if(Math.abs(arr[i]+arr[j]-sum)<diff) {
				resL = i;
				resR = j;
				diff = Math.abs(arr[i]+arr[j]-sum);
			}
			
			if(arr[i]+arr[j]>sum) {
				j--;
			}else {
				i++;
			}		
		}
		
		System.out.println("Index are: "+resL+" "+resR);
	}
	
	public static void main(String[] args) {
		int[] arr =  new int[]{10, 22, 28, 29, 30, 40}; 
		getClosestPair(arr, 54);
	}

}
