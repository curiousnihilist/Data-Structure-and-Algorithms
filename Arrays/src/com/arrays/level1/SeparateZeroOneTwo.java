package com.arrays.level1;import java.util.Arrays;

/**
 * Problem Statement: Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array. 
 *                    The functions should put all 0s first, then all 1s and all 2s in last.
 *                    
 * Example : arr = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
 *           sol = [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
 *           
 *           
 * Approach:
 * 
 * 1. We can count the number of 1'2, 0'2 and 2's and again traverse the array putting them in the
 *    array. This will require 2 traversal and 3 more variables.
 *    
 * 2. (Efficient approach) : We will take 3 variables namely low, mid and high.
 *                           low and mid will start from index 0.
 *                           high will start form index n-1
 *                           Logic:
 *     						 1. if arr[mid]=2 swap(arr[mid],arr[high]), high--
 *     						 2. if arr[mid]=0 swap(arr[low],arr[mid]), mid++, low++
 *     						 3. if arr[mid]=1 no swap mid++
 *                           Time complexity: O(n)
 *                           Space complexity: O(1)
 *                          
 * @author akash
 *
 */
public class SeparateZeroOneTwo {
	
	public static int[] sort(int[] arr) {
		int low=0,mid=0,high=arr.length-1;
		
		while(mid<=high) {
			
			if(arr[mid]==2) {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
			
			if(arr[mid]==0) {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				mid++;
				low++;
			}
			
			if(arr[mid]==1) {
				mid++;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		System.out.println(Arrays.toString(sort(arr)));
	}

}
