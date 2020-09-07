package com.problems;

import java.util.Arrays;

import com.queue.LinkedQueue;
import com.queue.Queue;

public class SlidingWindowMaximum {
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
		Queue lq = new LinkedQueue();
		int max = Integer.MIN_VALUE;
		int[] solution = new int[nums.length-k+1];
		
		for(int i=0; i<k; i++) {
			lq.enQueue(nums[i]);
			if(nums[i]>max)
				max = nums[i];
		}
		solution[0] = max;
		int a =1;
		for(int i=k; i<nums.length; i++) {
			lq.print();
			lq.deQueue();
			lq.enQueue(nums[i]);
			if(nums[i]>max)
				max = nums[i];
			solution[a] = max;
			a++;
		}
		
		return solution;
		
		
    }
	
	public static void main(String[] args) {
		int[] abc = new int[] {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		System.out.println(Arrays.toString(maxSlidingWindow(abc,4)));
	}

}
