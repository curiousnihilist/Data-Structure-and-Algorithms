package com.arrays.level2;

/**
 * Problem : Print a given matrix in spiral form
 * 
 * Solution: https://www.youtube.com/watch?v=siKFOI8PNKM
 * 
 * @author akash
 *
 */
public class MatrixSpiralForm {
	
	private static void getSolution(int[][] arr, int row, int col) {
		int T=0,B=row-1;
		int L=0,R=col-1;
		
		int dir=0; 		//left-to-right;
		
		while(T<=B && L<=R) {
			if(dir==0) {
				for(int i=L; i<=R;i++) {
					System.out.print(arr[T][i]+" ");
				}
				T++;
				dir=1;
			}else if(dir==1) {			//top-to-bottom
				for(int i=T; i<=B; i++) {
					System.out.print(arr[i][R]+" ");
				}
				R--;
				dir=2;
			}else if(dir==2) {			//right-to-left
				for(int i=R; i>=L; i--) {
					System.out.print(arr[B][i]+" ");
				}
				B--;
				dir=3;
			}else if(dir==3) {			//bottom-to-top
				for(int i=B; i>=T; i--) {
					System.out.print(arr[i][L]+" ");
				}
				L++;
				dir=0;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		getSolution(arr, 4, 4);
	}

}
