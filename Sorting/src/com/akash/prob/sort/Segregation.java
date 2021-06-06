package com.akash.prob.sort;

import java.util.Arrays;

public class Segregation {
	
	// without maintainig relative order of non-zero elements
	public static int[] seg(int arr[]) {
		int i=0,j=arr.length-1;
		
		for(;i<=j;i++) {
			if(arr[i] !=0) {
				continue;
			}
			while(arr[j] == 0) {
				j--;
			}
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			j--;
		}
		return arr;
	}
	
	// maintaining relative order of non zero elements
	public static int[] segM(int[] arr) {
		int i=0,j=0;
		
		while(j<arr.length && i<arr.length) {
			while(arr[i]!=0) {
				i++;
				j++;
			}
			while(arr[j]==0) {
				j++;
			}
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j++;
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,0,0,5,0,6,0,0,13,2};
		
		System.out.println(Arrays.toString(segM(arr)));
	}

}
