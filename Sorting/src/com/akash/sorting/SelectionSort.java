package com.akash.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] sort(int[] arr) {
		for(int i=0; i<arr.length-1;i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("swapping "+arr[i]+" and "+arr[min]);
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println(Arrays.toString(arr));
			System.out.println("----------");
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,4,6,5,2,11,3};
		
		System.out.println(Arrays.toString(sort(arr)));
	}

}
