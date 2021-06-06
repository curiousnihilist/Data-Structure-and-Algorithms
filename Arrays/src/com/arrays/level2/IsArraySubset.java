package com.arrays.level2;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem: Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a subset of 
 *          arr1[] or not. Both the arrays are not in sorted order. It may be assumed that elements 
 *          in both array are distinct.
 *          
 * Example:
 * Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
 * Output: arr2[] is a subset of arr1[]
 * 
 * @author akash
 *
 */
public class IsArraySubset {
	
	//brute force		Time:O(m*n)
	private static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
		int count=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr2[i] == arr1[j]) {
					count++;
				}
			}
		}
		return count==n;
	}
	
	//sort arr1 for binary search   Sorting time = O(mlogm) searching time = O(nlogm)
	// Time : O(mlogm + nlogm)
	private static boolean isSubsetUsingBinary(int[] arr1, int[] arr2, int m, int n) {
		int count = 0;
		
		Arrays.sort(arr1);
		
		for(int i=0; i<n; i++) {
			int low=0, high=m-1;
			while(low<=high) {
				int mid = low + (high-low)/2;
				
				if(arr2[i] == arr1[mid]) {
					count++;
					break;
				}else if( arr2[i]>arr1[mid]) {
					low=mid+1;
				}else {
					high=mid-1;
				}
			}
		}
		return count==n;
	}
	
	
	// Sort both arrays in nlogn time and do merging process for check
	//Time: O(nlogn+ mlogm)  ?? check
	//Advantage: check for duplicate
	private static boolean isSubsetUsingMerge(int[] arr1, int[] arr2, int m, int n) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int i=0,j=0;
		
		while(i<m && j<n) {
			if(arr1[i] < arr2[j]) {
				i++;
			}else if(arr1[i] == arr2[j]) {
				i++;
				j++;
			}else {
				return false;
			}
		}
		return j==n;
	}
	
	//Extra space O(m)		Time complexity: O(m+n)
	private static boolean isSubsetUsingHashing(int[] arr1, int[] arr2, int m, int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<m; i++) {
			map.put(arr1[i], 1);
		}
		
		for(int i=0; i<n; i++) {
			if(map.containsKey(arr2[i])) {
				continue;
			}
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] {11, 1, 13, 21, 3, 7};
		int[] arr2 = new int[] {11, 3, 7, 1};
		
		//System.out.println(isSubset(arr1, arr2,6 , 4));
		//System.out.println(isSubsetUsingBinary(arr1, arr2,6 , 4));
		//System.out.println(isSubsetUsingMerge(arr1, arr2,6 , 5));
		System.out.println(isSubsetUsingHashing(arr1, arr2,6 , 4));
	}
}
