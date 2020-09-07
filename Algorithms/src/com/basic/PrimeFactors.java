package com.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> result = new ArrayList<Integer>();
		int num=-1;
		while(num!=0) {
			System.out.print("Enter any number: ");
			num = sc.nextInt();
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					int ctr=0;
					for(int j=2; j<i; j++) {
						if(i%j==0) {
							ctr++;
							break;
						}
					}
					if(ctr==0)
						result.add(i);
				}
			}
			System.out.println(result);
			result.clear();
		}
		
		
		
		
	}

}
