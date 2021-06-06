package com.akash.sorting;

import java.util.Arrays;

public class MergeSort {
	
	private static void mergeSort(int[] arr, int low, int high) {
		int mid = 0;
		if(low == high) {
			return;
		}
		mid = (low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	
	public static void merge(int[] arr, int low, int mid, int high) {
		// form two arrays i.e. left and right with (m-l+1) and (h-m) length
		int[] left = new int[mid-low+1];
		int[] right = new int[high-mid];
		
		//divide original into left and right array
		int i=0,j=0,k=0; // for original array
		for(;i<left.length;i++) {
			left[i] = arr[low+i];
		}
		for(;j<right.length;j++) {
			right[j] = arr[mid+1+j];
		}
		
		i=0;
		j=0;
		k=low;		//index for original array for substitution
		
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arr[k++]=left[i++];
			}else {
				arr[k++]=right[j++];
			}
		}
		System.out.println(Arrays.toString(left));		
		System.out.println(Arrays.toString(right));		
		while(i<left.length) {
			arr[k++]=left[i++];
		}
		while(j<right.length) {
			arr[k++]=right[j++];
		}
		
		System.out.println(Arrays.toString(arr));		
	}
	
	public static void main(String[] args) {
		int[] arr = {8,4,7,3,9,5};
		mergeSort(arr, 0, arr.length-1);
	}

}
