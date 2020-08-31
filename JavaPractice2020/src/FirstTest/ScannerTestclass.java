package FirstTest;

import java.util.Scanner;

public class ScannerTestclass {

	public static void main(String[] args) {
	Scanner myobj=new Scanner(System.in);
	System.out.println("Sign off your name");
	
	String yourname=myobj.nextLine();
	System.out.println("yourname is "+yourname);

	}

}
