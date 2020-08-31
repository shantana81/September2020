package Practice;

import java.util.HashMap;

public class JavaHashMapPractice {

	public static void main(String[] args) {
		HashMap<String,Integer>FruitName=new HashMap<String,Integer>();
		
		FruitName.put("Apple",2);
		FruitName.put("Orange",4);
		FruitName.put("Grape",10);
		FruitName.put("Banana",12);
		FruitName.get("Apple");
		System.out.println(FruitName.get("Apple"));
		
       for(String i:FruitName.keySet()) {
       System.out.println(i);
       System.out.println(FruitName.get(i));
       }

	}

}
