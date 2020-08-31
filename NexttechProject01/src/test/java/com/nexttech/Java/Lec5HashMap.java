package com.nexttech.Java;

import java.util.HashMap;

public class Lec5HashMap {

	public static void main(String[] args) {
		// Hash Map to store Paired Values
		
		HashMap<String,String>CapitalOfCountry=new HashMap<String,String>();
		CapitalOfCountry.put("Bangladesh","Dhaka");
		CapitalOfCountry.put("Australia", "Canberra");
		CapitalOfCountry.put("Japan","Tokyo");
		CapitalOfCountry.put("China","Beijing");
		System.out.println(CapitalOfCountry);
		
		//to Access Value
		CapitalOfCountry.get("Bangladesh");
		System.out.println(CapitalOfCountry.get("Bangladesh"));
		//store 3 paired values which contain numbers and alpha values
		
		HashMap<Integer,Double>Numbers=new HashMap<Integer,Double>();
		Numbers.put(1, 1.1);
		Numbers.put(2,2.2);
		Numbers.put(3,3.3);
		//to Access Value
		Numbers.get(2);
		System.out.println(Numbers.get(2));
		
		for(String i:CapitalOfCountry.keySet () )   {
			System.out.println(i);
			
			for(Integer p:Numbers.keySet() ) {
				System.out.println(p);
				for(String o:CapitalOfCountry.values () ) {
					System.out.println(o);
					
				}
				
			}
		}
		
		
		
		

	}

}
