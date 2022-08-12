package org.array;

public class Array1 {
	public static void main(String[]args) {
		
		int a[] []  = new int [3][3];
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		

		a[1][0] = 120;
		a[1][1] = 103;
		a[1][2] = 102;
		
	
		
		for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 3; j++) {

			
		
			System.out.println(a[i][j]);	
		
			
		}
		
		}
	}
		
	

}
