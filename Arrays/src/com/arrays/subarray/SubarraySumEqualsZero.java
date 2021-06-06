package com.arrays.subarray;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem : Given an array of positive and negative numbers, find if there is a 
 *           subarray (of size at-least one) with 0 sum. Also give the to and from index of
 *           subarray. Consider only one zero sum subarray exists
 *           
 * Example: arr = [4, 2, -3, 1, 6]
 * 			Sol = [1,3]
 * 
 *          arr = [2,3,-1,4,0,2]
 *          sol = [0,0]
 * 
 * @author akash
 *
 */

public class SubarraySumEqualsZero {
	
	private static int[] getSolution(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				return new int[] {i,i};
			}
			sum+=arr[i];
			if(sum==0) {
				return new int[] {0,i};
			}
			if(map.containsKey(sum)) {
				return new int[] {map.get(sum)+1, i};
			}
			map.put(sum, i);
		}
		
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[]{4, 2, -3, 1, 6};
		int[] arr2 = new int[]{4, 2, 0, 1, 6};
		int[] arr3 = new int[]{-3, 2, 3, 1, 6};
		int[] arr4 = new int[]{2,2,-1,-3,4};
		
		System.out.println(Arrays.toString(getSolution(arr1)));
		System.out.println(Arrays.toString(getSolution(arr2)));
		System.out.println(Arrays.toString(getSolution(arr3)));
		System.out.println(Arrays.toString(getSolution(arr4)));
	}

}
