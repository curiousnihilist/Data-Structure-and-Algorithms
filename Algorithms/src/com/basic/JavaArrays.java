package com.basic;

import java.util.Arrays;

public class JavaArrays {
	
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int arr2[] = new int[] {1,2,3,4,5};
		int arr3[] = new int[5];
		int arr[] = {2,3,4,5};
		System.out.println(arr);
		int muldimarr[][] = new int[10][10];
		
		int multdimarr1[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(multdimarr1[1][1]);
		System.out.println(Arrays.toString(arr2));
		
		for(int i=0; i<arr2.length; i++) {
			arr3[i]=arr2[i];
		}
		
		int arr4[] = arr2.clone();
		
		System.out.println(arr2 == arr3);
		System.out.println(arr2.equals(arr3));
		System.out.println(arr2 == arr4);
		System.out.println(arr2.equals(arr4));
		
	}

}
