package com.akash.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static int[] sort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			int initialI = i;
			int gem = arr[i];
			int j = i-1;
			while(j>=0 && gem<arr[j]) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j--;
				i--;
			}
			i = initialI;
			System.out.println(Arrays.toString(arr));
			System.out.println("--------");
		}
		return arr;
	}
	
	public static int[] optimizedSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			int v = arr[i];
			int j = i;
			
			while(j>=1 && arr[j-1] > v) {
				arr[j] = arr[j-1];
				j--;
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("Index getting replaced: "+j);
			arr[j] = v;
			System.out.println(Arrays.toString(arr));
			System.out.println("------");
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {8,4,9,5,2,11,3};
		
		//sort(arr);
		optimizedSort(arr);	
	}

}
