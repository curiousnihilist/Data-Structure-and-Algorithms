package com.algo.recursion;

public class Print1toN {

	static void print(int n) {
		if(n==1)
			System.out.println(1);
		else {
			// System.out.println(n); //prints n to 1
			print(n-1);
			System.out.println(n); //prints 1 to n
		}
		
	}
	
	public static void main(String[] args) {
		print(8);
	}
}
