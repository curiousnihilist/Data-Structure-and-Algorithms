package com.stack;

/**
 * The span(i) of a stock price o a certain day i is the maximu noumber of consecutive days (including current day)
 * the prices of the stock has been less than or equal to the price on day i
 * link : https://www.youtube.com/watch?v=g1USSZVWDsY&t=1880s 40:35
 * 
 * The solution is using stack implementation. Let's say if we have h(i) of a day(i) can be computed as closest day preceding i
 * when the price of stock is higher than the day i. If that day doesn't exists then h(i) = -1. 
 * Therefore, span(i) = i - h(i)
 * @author akash
 *
 */
public class SpanOfSale {
	
	public static int[] calculateSpan(int[] stockPrices, int day) {
		Stack myStack = new FixedArrayStack(100);
		return new int[20];
	}
	
	

}
