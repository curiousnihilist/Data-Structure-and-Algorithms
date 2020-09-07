package com.problems;

import java.util.Stack;

public class MinElementOfStack {
	
	public static int reverse(int x) {
        if(x%10 == 0){
            while(x%10 == 0)
                x/=10;
        }
        int reversed = 0;
        while(x%10!=0){
            int rem = x%10;
            reversed = reversed*10 + rem;
            x = x/10;
        }
        return reversed;    
      
	}
	
	
	public static void main(String[] args) {
		System.out.println(reverse(-123));
		
		
	}

}
