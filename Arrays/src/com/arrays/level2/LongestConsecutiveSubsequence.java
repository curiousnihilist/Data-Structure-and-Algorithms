package com.arrays.level2;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Problem : Given an array of integers, find the length of the longest sub-sequence such that
 *           elements in the subsequence are consecutive integers, the consecutive numbers can 
 *           be in any order. 
 *           
 * Example : Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
			 Output: 4
			Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements
 * @author akash
 *
 */
public class LongestConsecutiveSubsequence {
	
	private static int getSolution(int[] arr) {
		
		Set<Integer> set = IntStream.of(arr).boxed().collect(Collectors.toSet());
		int maxLen=1;
		
		for(int el:arr) {
			
			if(!set.contains(el-1)) {
				int len=1;
				while(set.contains(el+len)) {
					len++;
				}
				maxLen = Math.max(len, maxLen);
			}
		}
		
		return maxLen;
	}

}
