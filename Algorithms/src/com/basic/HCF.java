package com.basic;

public class HCF {
	
	public static int getHCF(int a, int b) {
		int small = a<b ? a : b;
		int result=-1;
		for(int i=2; i<=small; i++) {
			if(a%i==0 && b%i==0)
				result = i;
		}
		if(result==-1)
			return 1;
		else
			return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getHCF(12, 24));
	}

}
