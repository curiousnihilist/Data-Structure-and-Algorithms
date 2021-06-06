package com.arrays.level2;

/**
 * Problem: The cost of a stock on each day is given in an array, find the max profit that you can 
 *          make by buying and selling in those days. For example, if the given array is 
 *          {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, 
 *          selling on day 3. Again buy on day 4 and sell on day 6. If the given array of prices is 
 *          sorted in decreasing order, then profit cannot be earned at all.
 *          
 * Example:
 * 
 * Stock Prices: {1, 5, 2, 3, 7, 6, 4, 5}
   Total profit earned is 10
   
   Stock Prices: {10, 8, 6, 5, 4, 2}
   Total profit earned is 0
 * @author akash
 *
 */
public class StockProfitMaximize {
	
	private static int profitMaximize(int[] arr) {
		int profit=0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[i-1]) {
				profit+=arr[i]-arr[i-1];
			}
		}
		return profit;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1, 5, 2, 3, 7, 6, 4, 5};
		
		System.out.println(profitMaximize(arr));
	}

}
