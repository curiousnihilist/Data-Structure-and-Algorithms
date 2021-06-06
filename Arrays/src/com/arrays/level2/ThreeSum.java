package com.arrays.level2;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem : Given an array nums of n integers, are there elements a, b, c in nums such that 
 *           a + b + c = k? Find all unique triplets in the array which give the sum equals to 
 *           given number.
 *           
 * Example: nums = [-1, 0, 1, 2, -1, -4]
 *          Answer = [ [-1, 0, 1], [-1, -1, 2] ]
 * @author akash
 *
 */
public class ThreeSum {
	
	// time: O(n3) space O(1)
	private static void bruteForce(int[] arr, int sum) {
		Arrays.sort(arr);                                     // Take care for duplicates
		for(int i=0; i<arr.length; i++) {
			if(i!=0 && arr[i] == arr[i-1]) continue;	      // Take care for duplicates
			for(int j=i+1; j<arr.length; j++) {
				if(j!=i+1 && arr[j] == arr[j-1]) continue;    // Take care for duplicates
				for(int k=j+1; k<arr.length; k++) {
					if(k!=j+1 && arr[k] == arr[k-1]) continue;// Take care for duplicates
					if(arr[i]+arr[j]+arr[k] == sum) {
						System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
					}
				}
			}
		}
	}
	
	private static void getSolution(int[] arr, int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) {
			if(i!=0 && arr[i]==arr[i-1]) continue;
			map.put(arr[i], 1);
			for(int j=i+1; j<arr.length;j++) {
				if(j!=i+1 && arr[j]==arr[j-1]) continue;
				int elToFind = sum - arr[j] - arr[i];
				if(map.containsKey(elToFind) && (elToFind)!=arr[i]) {
					System.out.println(arr[i]+", "+arr[j]+", "+elToFind);
				}
			}
		}
	}
	
	private static void twoPointer(int[] arr, int sum) {
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(i!=0 && arr[i]==arr[i-1]) i++;
			int j=i+1;
			int k=arr.length-1;
			while(j<k) {
				if(j!=i+1 && arr[j]==arr[j-1]) j++;
				if(k>=j && arr[k]==arr[k-1]) k--;
				if(arr[i]+arr[j]+arr[k]<sum) {
					j++;
				}else if(arr[i]+arr[j]+arr[k]>sum) {
					k--;
				}else {
					System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
					j++;
					k--;
				}
			}
		}
	}
	 
	 public static void main(String[] args) {
		 int[] arr= new int[] { 7,7,5,0,4,3,8,1,3,2,3,7};
		 int[] arr1 = new int[] {1,0,1,2,-1,-4,-2,-3,3,0,4};
		 //getSolution(arr1,0);
		 //bruteForce(arr, 24);
		 
		 twoPointer(arr1, 0);
	}

}
