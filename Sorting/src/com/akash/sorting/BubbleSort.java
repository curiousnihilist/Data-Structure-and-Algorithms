package com.akash.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static int[] improvedSort(int[] arr) {
		
		for(int j=0; j<arr.length-1;j++) {
			for(int i=0; i<arr.length-(j+1);i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("----------");
		}
		return arr;
	}
	
	public static int[] sort(int[] arr) {
		for(int j=0; j<arr.length-1;j++) {
			for(int i=0; i<arr.length-1;i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("----------");
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		
		System.out.println(Arrays.toString(improvedSort(arr)));
		//System.out.println(Arrays.toString(sort(arr)));
	}
}
