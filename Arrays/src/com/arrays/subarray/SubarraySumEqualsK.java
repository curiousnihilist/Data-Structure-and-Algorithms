package com.arrays.subarray;

import java.util.HashMap;

/**
 * Problem : Given an array of integers nums and an integer k, return the total number of continuous
 *           subarrays whose sum equals to k. 
 * 
 * Example: A[] = { 3, 4, -7, 1, 3, 3, 1, -4 }			Sum = 7
 *          Solution: 4
 *          Explanation : { 3, 4 },{ 3, 4, -7, 1, 3, 3 },{ 1, 3, 3 },{ 3, 3, 1 }
 *          
 * Approach: Traverse through array and save sum of all integer until index i (inclusive) in hashmap.
 *           Now when we traverse map, for every sum y at key i ( index i), we search if we have a 
 *           value sum equal to (y-k). If we have have such such sum, then we have a subarray equal to
 *           k
 * Actual Solution : https://leetcode.com/problems/subarray-sum-equals-k/solution/
 * @author akash
 *
 */
public class SubarraySumEqualsK {
	
	private static int getSolution(int[] arr, int k) {
		int sum=0;
		int result=0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			map.put(i, sum);
			if(map.containsValue(sum-k)){
				result++;
			}
			if(sum == k) {
				result++;
			}
			
		}
		return result;
	}
	
	//Imp -> hasmap contains (sum[till i], frequency of sum[till i}
	private static int getActualSolution(int[] nums, int k) {
		int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,4,7,2,-3,1,4,2};
		
		System.out.println(getSolution(arr, 7));
		
	}

}
