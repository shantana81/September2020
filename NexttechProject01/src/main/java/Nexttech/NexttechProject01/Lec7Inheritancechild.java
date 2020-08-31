package Nexttech.NexttechProject01;

public class Lec7Inheritancechild extends Lec7inheritance {
	
	public void LoginFB(String Email,double PW) {}

	public static void main(String[] args) {
		
		Lec7Inheritancechild inherit=new Lec7Inheritancechild();
		inherit.method1();
		System.out.println(inherit.Drugs);
		System.out.println("I have " + inherit.a + " " + inherit.fruits + "s.");
		//method overloading and method overriding are the concept of polymorphism
		//method over loading means same method name but different parameters.
		//method overriding means same method / duplicated method 
	}
	
		
		// TODO Auto-generated method stub
	//method over loading
	public void method1(int a ,int b) {

	}
}
