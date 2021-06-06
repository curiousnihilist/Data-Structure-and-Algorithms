package com.arrays.level1;

import java.util.Arrays;

/**
 * Reverse array recursively
 * 
 * @author akash
 *
 */
public class ReverseArrayRecursively {
	
	private static int[] reverse(int[] arr, int start, int end) {
		if(start>end) {
			return arr;
		}
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
		return reverse(arr,start+1,end-1);
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println(Arrays.toString(reverse(arr,0,arr.length-1)));
	}
}
