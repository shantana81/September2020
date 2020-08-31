package FirstTest;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		ArrayList<String> place= new ArrayList <String>();
		place.add("Manhattan");
		place.add("City Island");
		place.add("Dhaka");
		place.add("Austin");
		System.out.println(place);
System.out.println(place.get(2));
place.set(2, "San Fransisco");
System.out.println(place.get(2));
place.remove(3);
for (int i = 0; i < place.size(); i++) {
	 System.out.println(place.get(i));
}
	}

}
