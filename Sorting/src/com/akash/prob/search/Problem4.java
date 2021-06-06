package com.akash.prob.search;

/*
 * Problem Statement:
 * 
 * Search a target in a sorted array which is rotated once. User doesn't know from which 
 * point the array is rotated.
 * 
 * Ex: arr = [9,11,12,14,30,3,5,7]  Array is rotated till index 2
 * 	   target: 11
 * 	   expected result: 1
 */
public class Problem4 {

	public static int searchForRotatedArray(int[] arr, int key, int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid = (low+high)/2;
		
		if(arr[mid] == key) {
			return mid;
		}
		// Check if mid is in right sequence or left sequence
		if(arr[low]<arr[mid]) {			//left sequence
			if(key<arr[mid] && key>=arr[low]) {
				return searchForRotatedArray(arr, key, low, mid-1);
			}
			return searchForRotatedArray(arr, key, mid+1, high);
		}else {							//right sequence
			if(key>arr[mid] && key<=arr[high]) {
				return searchForRotatedArray(arr, key, mid+1, high);
			}
			return searchForRotatedArray(arr, key, low, mid-1);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {8,9,10,11,33,2,3,6};
		int[] rotatedArr = new int[] {12,4,5,6,7,8,9,10,11,};
		
		for(int i=0; i<rotatedArr.length;i++) {
			System.out.println(searchForRotatedArray(rotatedArr, rotatedArr[i], 0, rotatedArr.length-1));
		}
		
		System.out.println(searchForRotatedArray(rotatedArr, 8, 0, rotatedArr.length-1));
		
	}
}
