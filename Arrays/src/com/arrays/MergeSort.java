package com.arrays;

import java.util.Arrays;

public class MergeSort {
	
	private static void mergeSort(int[] arr, int start, int end) {
		if(start==end) {
			return;
		}
		int mid = (start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
	}
	
	private static void merge(int[] arr, int low, int mid, int high) {
		int n1 = mid-low+1;
		int n2 = high-mid;
		
		// 2 new left and right array
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		int i=0,j=0;
		for(;i<n1;i++) {
			left[i]=arr[low+i];
		}
		for(;j<n2;j++) {
			right[j]=arr[mid+1+j];
		}
		
		i=0;j=0;
		int k=low;
		
		for(;i<n1 && j<n2;k++) {
			if(left[i]<=right[i]) {
				arr[k]=left[i++];
			}else {
				arr[k]=right[j++];
			}
		}
		while(i<n1) {
			arr[k++] = left[i++];
		}
		while(j<n2) {
			arr[k++] = right[j++];
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {9,8,7,6,5,4,3,2};
		
		mergeSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}

}
