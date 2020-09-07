package com.basic;

import java.util.Arrays;

public class RotationOfArray {
	
	public static void rotate(int[] arr, int num) {
		
		for(int i=0; i<num; i++) {
			int k = arr.length-i;
			for(int j=0; j<arr.length-1; j++) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void rotateUsingReversal(int arr[], int d) {
		reverseArray(arr, 0, d);
		reverseArray(arr, d, arr.length);
		reverseArray(arr, 0, arr.length);
		
	}
	
	public static void reverseArray(int arr[], int start, int end) {
		for(int i=start, j=end-1; i-start<end/2; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;	
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		//rotate(new int[] {1,2,3,4,5,6,7},4); // time complexity = O(n*d)
		rotateUsingReversal(new int[] {1,2,3,4,5,6,7},2);
		
	}

}
