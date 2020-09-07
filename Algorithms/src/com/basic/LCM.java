package com.basic;

public class LCM {
	
	public static int getLCM(int a, int b) {
		int small,big;
		if(a<b) { small=a; big=b;}
		else {small=b; big=a;}
		
		if(big % small == 0) return big;
		int prod = 1;
		for(int i=2; i<small; i++) {
			if((big % i == 0) && (small % i == 0))
				prod = prod*i;
			
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		
	}

}
