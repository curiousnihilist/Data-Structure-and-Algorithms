package com.akash.prob.search;

/**
 * Problem Statement1 : Find number of times an ascending ordered array is rotated
 * 					   is left rotated (clockwise)
 * 
 * example :	arr: [1,2,3,4,5,6,7,8,9] 			
 * 				rotatedArray (3 times) : [4,5,6,7,8,9,1,2,3]
 * 				Solution : 3
 * -------------------------------------------------------------------------
 * Problem Statement2 : Find number of times an ascending ordered array is rotated
 * 					   is right rotated (anti-clockwise)
 * 
 * example :	arr: [1,2,3,4,5,6,7,8,9] 			
 * 				rotatedArray (3 times) : [7,8,9,1,2,3,4,5,6]
 * 				Solution : 3
 *
 */
public class Problem2 {
	
	public static int findSolution1(int[] arr) {
		int low=0, high = arr.length-1, mid=0;
		
		while(low<=high) {
			mid = low + (high-low)/2;
			
			if(arr[mid-1]>arr[mid]) {
				return arr.length-mid;
			}else {
				if(arr[low] > arr[high]) {
					if(arr[mid] >= arr[low]) {
						low = mid+1;
					}else {
						high = mid-1;
					}
				}else {
					return low;
				}
			}
		}
		
		return -1;
	}
	
	public static int findSolution2(int[] arr) {
		int low=0, high = arr.length-1, mid=0;
		
		while(low<=high) {
			mid = low + (high-low)/2;
			
			if(mid==low || arr[mid-1]>arr[mid]) {
				return mid;
			}else {
				if(arr[low] > arr[high]) {
					if(arr[mid] >= arr[low]) {
						low = mid+1;
					}else {
						high = mid-1;
					}
				}else {
					return arr.length-low;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] leftRotated = new int[] {4,5,6,7,8,9,1};
		int[] rightRotated = new int[] {10,6,7,8,9};
		
		System.out.println(findSolution1(leftRotated));	//2
		System.out.println(findSolution2(rightRotated));//4
	}

}
