package com.arrays.level2;

import java.util.Arrays;

/**
 * Problem: Given an unsorted array of integers, sort the array into a wave like array. An array 
 *          ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
 *
 * Example: 
 * Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
   Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR
                 {20, 5, 10, 2, 80, 6, 100, 3} OR
                 any other array that is in wave form
 * 
 * 
 * @author akash
 *
 */
public class WaveArray {
	
	//Time: O(nlogn) Space: O(1)
	private static int[] waveArrayUsingSort(int[] arr) {
		Arrays.sort(arr);
		
		for(int i=1; i<arr.length-1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		
		return arr;
	}
	
	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	// my solution Time: O(n)  Space: O(1)
	private static int[] waveArray(int[] arr) {
		// Order first three element in       arr[0]>arr[1]<arr[2]
		if(!(arr[0]>arr[1] && arr[1]<arr[2])) {
			if(arr[2]<arr[0]) {
				swap(arr,1,2);
			}else {
				swap(arr,1,0);
			}
		}
		for(int i=2; i<arr.length-1; i++) {
			if(i%2==0) {			// big
				if(arr[i]>=arr[i+1]) continue;
			}else {				    //small
				if(arr[i]<=arr[i+1]) continue;
			}
			swap(arr,i,i+1);
		}
		return arr;
	}
	
	private static int[] waveArrayEfficient(int[] arr) {
		for(int i=0; i<arr.length; i+=2) {
			if(i>0 && arr[i-1]>arr[i]) {
				swap(arr, i-1, i);
			}
			
			if(i<arr.length-1 && arr[i]<arr[i+1]) {
				swap(arr,i,i+1);
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {10, 90, 49, 2, 1, 5, 23};
		
		System.out.println(Arrays.toString(waveArrayEfficient(arr)));
		
	}

}
