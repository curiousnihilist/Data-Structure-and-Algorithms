package com.arrays.duplicates;

/**
 * Problem: Given array of size n, it contains elements in range 0 to n-1. Find the duplicate
 *          numbers in time complexity of O(n) and space complexity of O(1).
 *          
 * Example : arr : [2,3,4,3,5,2,4] n=7
 * 			 Solution : 2,3,4
 *          
 *          
 * Approach:
 * 
 * 1. Nested loop checking for each element . Time comp: O(n*n)	Space comp:O(1)
 * 
 * 2. Sort the array and then traverse array checking for similar adjacent elements
 * 	  Time comp: O(nlogn + n)	Space comp:O(1)
 *  
 * 3. Use hashmap to store frequency Time comp: O(n)	Space comp:O(n)
 * 
 * 
 * @author akash
 *
 */
public class FindDuplicates {
	
	// Best Approach
	private static void findDuplicate(int[] arr, int n) {
		
		//traverse array
		for(int i=0; i<n; i++) {
			// find the actual no. present at arr[i]
			int indexToUpdate = arr[i]%n;
			
			//update the frequency
			arr[indexToUpdate]+=n;
		}

		for(int i=0;i<n;i++) {
			if(arr[i]>=2*n) {
				System.out.print(i+", ");
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,6,3,6,1};
		
		findDuplicate(arr, arr.length);
	}

}
