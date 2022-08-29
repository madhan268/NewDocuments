package org.array;

public class Array {
	
	public static void main(String[] args) {
		
		int a[] = new int [5];
		a[0] = 1;
		a[2] = 70;
		a[4] = 90;
		a[2] = 30;
		a[3] = 190;
		System.out.println(a[2]);
		System.out.println(a[3]);
//		number of value in array
		
		int le = a.length;
		
		System.out.println(le);
		
		System.out.println("iterate");
		
		for (int i =2; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		for (int b : a) {
			System.out.print(b);
			
			
			
		}
	}

}
