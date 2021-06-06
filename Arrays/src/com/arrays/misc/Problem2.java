package com.arrays.misc;

public class Problem2 {
	
	private static void findCommon(int[] a, int[] b, int[] c) {
		int n1 = a.length;
		int n2 = b.length;
		int n3 = c.length;
		
		int x=0,y=0,z=0;
		
		if(n1==0 || n2==0 || n3==0) {
			System.out.println("Nothing is common");
			return;
		}
		
		while(x<n1 && y<n2 && z<n3) {
			if(a[x]==b[y] && c[z]==b[y]) {
				System.out.println(a[x]);
				x++;y++;z++;
			}
			
			if(x<n1 && y<n2 && z<n3 && a[x]<b[y] && a[x]<c[z]) {
				x++;
			}
			
			if(x<n1 && y<n2 && z<n3 && b[y]<a[x] && b[y]<c[z]) {
				y++;
			}
			
			if(x<n1 && y<n2 && z<n3 && c[z]<a[x] && b[y]>c[z]) {
				z++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {};
		int[] b = new int[] {6, 7, 20, 80, 100};
		int[] c = new int[] {3, 4, 15, 20, 30, 70, 80, 120};
		
		findCommon(a, b, c);
	}

}
