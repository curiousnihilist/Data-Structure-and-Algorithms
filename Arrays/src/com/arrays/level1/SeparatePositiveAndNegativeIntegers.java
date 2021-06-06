package com.arrays.level1;

import java.util.Arrays;

/**
 * Problem : An array contains both positive and negative numbers in random order. 
 *           Rearrange the array elements so that all negative numbers appear before all positive 
 *           numbers.
 *           
 * Example : Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
 *		     Output: -12 -13 -5 -7 -3 -6 11 6 5
 * 
 * @author akash
 *
 */
public class SeparatePositiveAndNegativeIntegers {
	
	private static int[] separate(int[] arr) {
		int l=0,h=arr.length-1;
		
		while(l<h) {
			if(arr[l]>0 && arr[h]<0) {
				int temp = arr[l];
				arr[l]  = arr[h];
				arr[h] = temp;
				l++;
				h--;
			}
			
			if(arr[l]<0) {
				l++;
			}
			
			if(arr[h]>0) {
				h--;
			}
		}
		return arr;
	}
	
	private static int[] separateMainitainingOrder(int[] arr) {
		
		for(int i=0; i<arr.length;i++) {
			while(arr[i]>0) {
				i++;
			}
			int temp = arr[i];
			int j = i;
			while(j>0 && arr[j-1]>0) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		//System.out.println(Arrays.toString(separate(arr)));
		System.out.println(Arrays.toString(separateMainitainingOrder(arr)));
	}

}
