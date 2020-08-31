package com.nexttech.Java;

public class Lec5JavaException {

	public static void main(String[] args) {
		try {
		
		double [] price= {2.4,4.4,5.8,6.6,7};
		System.out.println(price[3]);

		}
   catch(Exception e) {
	   System.out.println("something is wrong");
	   
   }
		
	}
}
