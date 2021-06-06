package com.arrays.duplicates;

import java.util.HashMap;

/**
 * Problem : Find the first non-repeating element in a given array of integers.
 * 
 * Example : arr = [9, 4, 9, 6, 7, 4 ]
 *           Sol = 6
 *           
 * @author akash
 *
 */
public class FindFirstNonRepeatingElement {
	
	private static int getSolution(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(map.get(arr[i]) == 1) {
				return arr[i];
			}
		}
		return Integer.MIN_VALUE;		
	}

	public static void main(String[] args) {
		int[] arr = new int[] {2,5,9, 4, 9, 6, 7, 4,2 };
		
		System.out.println(getSolution(arr));
		
	}
}
