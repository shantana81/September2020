package com.nexttech.Java;

public class Lec3ForLoop {

	public static void main(String[] args) {
		// for loop print out all the value from 0 to 9
		
		for (int i= 2; i <= 10; i++) {
			System.out.println(i);
			
			for ( int j= 3; j < 10; j++) {
				System.out.println(j);
				//print all the odd number up to 25
				
				for ( int k=1; k<=25; k=k+2) {
					System.out.println(k);
				}
				
			}
		}
		
		

	}

}
