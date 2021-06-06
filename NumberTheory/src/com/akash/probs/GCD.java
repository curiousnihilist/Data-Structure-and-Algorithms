package com.akash.probs;

public class GCD {
	
	private static int gcd(int a, int b) {
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		if( a==1 && b ==1) {
			return 1;
		}
		
		if(a>=b) {
			return gcd(a-b,b);
		}
		return gcd(a,b-a);
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(19,4));
	}

}
