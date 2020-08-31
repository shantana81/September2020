package com.nexttech.Java;

public class Lec3IfElseStatement {

	public static void main(String[] args) {
		// if statement
		
		if(99>69) {
			System.out.println("99 is greater than 69");
			
		}	
	    //11;59 morning, 15pm noon, 20 afternoon, 22 evening, 23:59 night
		int grade=90;
		
		if(grade>80) {
			System.out.println("grade A");
		}
		else
		{		
			System.out.println("grade B");
		
		}
		
		int grade1=20;
		if (grade1>100) {
			System.out.println("Grade F");
			
			}
		else if( grade1>80) {
			System.out.println("Grade A");
		}
		else {
			System.out.println("absence");
		}
		
		int Score=59;
		char grade2;
		
		if (Score>=90) {
			grade2='A';
			
		} else if (Score>=80) {
			grade2='B';
			
		} else if (Score>70) {
			grade2='C';
			
		} else if ( Score>60) {
			grade2='D';
			
			System.out.println ("Grade= +grade2");
		}
		
		
			
		}
		
	}


