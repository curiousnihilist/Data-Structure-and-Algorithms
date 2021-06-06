package com.arrays.duplicates;

import java.util.HashMap;

/**
 * Problem: Given an array of integers, find the first repeating element in it. We need to find 
 *          the element that occurs more than once and whose index of first occurrence is smallest. 
 *          
 * Example: arr[] = {10, 5, 3, 4, 3, 5, 6}
 *          Sol = 5;
 * @author akash
 *
 */
public class FindFirstRepeatingElement {
	
	private static int findSol(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		int sol=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				if(map.get(arr[i])<sol) {
					sol = map.get(arr[i]);
				}
			}else {
				map.put(arr[i], i);
			}
		}
		
		return arr[sol];
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{10, 3, 5, 3, 4, 3, 5, 6};
		
		System.out.println(findSol(arr));
	}

}
