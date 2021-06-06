package com.arrays.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Problem Statement : Find all unique pairs of elements in array whose sum is equal to given 
 * 					   sum. Return indices of those pairs
 * 
 * Example : arr = [3,5,2,4,1,5,4,6]		sum=8
 * 			 result = pairs are (3,5),(3,5),(2,6),(4,4)
 * 					  indices are [0,1],[0,5],[2,7],[3,6]
 * 
 * 
 * @author akash
 *
 */
public class TwoSum {
	
	private static List<List<Integer>> getSumBruteForce(int[] arr, int sum){
		List<List<Integer>> sol = new ArrayList();
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == sum) {
					List<Integer> el = new ArrayList<Integer>();
					el.add(i);
					el.add(j);
					sol.add(el);
				}
			}
		}
		
		return sol;
	}
	
	//Limitations : 1. You can count only no. of pairs if there are more
	//                 than one pair, not their indices
	private static int getSumHashMap(int[] arr, int sum){
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		int count=0;
		int countDup=0;
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(sum-arr[i])) {
				if(2*arr[i] == sum) {			// checks for uniqueness when arr[i] =sum/2
					countDup++;
				}else {
					count+=map.get(sum-arr[i]);
				}
			}
		}
		
		return (count/2)+(countDup*(countDup-1)/2);
	}

	
	public static void main(String[] args) {
		int[] arr = new int[] {3,5,4,4,1,5,4,6};
		
		System.out.println(getSumBruteForce(arr,8));
		System.out.println(getSumHashMap(arr, 8));
	}
}
