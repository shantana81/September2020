package FirstTest;

import java.util.HashMap;

public class JavaHashmap {
	public static void main (String[]args) {
		HashMap<String,String>Capitalstate=new HashMap<String,String>();
		
		Capitalstate.put("Texas","Austin");
		Capitalstate.put("NewYork","Albany");
		Capitalstate.put("NewJersy","Trenton");
		Capitalstate.put("California","Sacramento");
		System.out.println(Capitalstate);
	Capitalstate.get("Texas");
	System.out.println(Capitalstate.get("Texas"));
	for (String i:Capitalstate.keySet()) {
	System.out.println(i);	
	}
	}
}
