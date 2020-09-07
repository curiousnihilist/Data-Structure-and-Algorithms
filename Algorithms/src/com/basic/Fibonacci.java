package com.basic;

import java.util.Scanner;

public class Fibonacci {
	
	private static int a=0;
	private static int b=1;
	
	//print fibonacci series
	public static void fibonacci(int num) {
		if(num>0) {
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
			fibonacci(num-1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first n terms of fibonacci: ");
		int num = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		fibonacci(num-2);
		
	}

}
