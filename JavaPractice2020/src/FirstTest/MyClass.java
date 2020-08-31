package FirstTest;

import java.math.*;

public class MyClass {
	int t=10;
	public static void main(String[] args) {
    System.out.println("Hello World");
    
   /*final int mynumber=15;
   
    System.out.println(mynumber);
    
    String name="Warith";
    System.out.println("My name is " +name);
    
    String name1="Shantana";
    String name2="Vina";
    System.out.println("My name is "+name1+ " "+name2);
    
    int a=20;
    int b=10;
    System.out.println (a+b);
    
    int myInt=30;
    double myDouble=myInt;
    System.out.println(myInt);
    System.out.println(myDouble);
    
    int x=5;
    x++;
    System.out.println(x);
    x+=4;
    System.out.println(x);
     
    int y=10;
    y--;
    System.out.println(y);
    y-=4;
    System.out.println(y);
    
    int k=4;
    k &=5;
    System.out.println(k);
    
    double rent=2.4;
    double tax=3.4;
    System.out.println(rent>=tax);
    
    int c=6;
    int d=4;
    System.out.println(c>d && c<d);
    
    String holiday="Eid";
    System.out.println("Eid");
    System.out.println("the lentgh is"+holiday.length());
    
    String color="White";
    System.out.println(color.toUpperCase());
    
    String text="please locate where 'locate' occurs!";
    System.out.println(text.indexOf("locate"));
    
    System.out.println("I love doing\n java");
    System.out.println("My name is \t Ayat");
    
    Math.max(10, 5);
    System.out.println(Math.max(10, 5));
    
    
    int itemprice= 40;
    if (itemprice<60) {
    System.out.println("low price");
    }
    else {
    	System.out.println("high price");
    
    
    	
    }
    
    int time=10;
    if (time>20) {
    System.out.println("false");
    }
    else if (time>5) {
    	System.out.println("true");
    }
    else {
    	System.out.println("equal");
    	
    
    	
    
    	
    }
    int i=2;
	while (i<10) {
		System.out.println(i);
		i++;
		}
		
		for (int p=25;p<30;p++) {
			System.out.println(p);
			
			}
			for (int L=32;L<51;L=L+2) {
				System.out.println(L);
				}*/
				for( int n=4; n<10;n++) {
					if (n==7) {
						continue;
					}
					System.out.println(n);
					
					//String [] fruits= {"Apple","Orange","Banana","Grapes","Cherry"};
					//System.out.println("fruits");
					
					}
				
				String [] fruits= {"Apple","Orange","Banana","Grapes","Cherry"};
				//access value
				System.out.println(fruits[2]);
				//length
				System.out.println(fruits.length);
				for(int i=0;i<fruits.length;i++) {
				System.out.println(fruits[i]);			
				}
				//loop through an array
				for(String flower:fruits) {
					System.out.println(flower);
				}
				
 
 MyClass myobj=new MyClass();
 System.out.println(myobj.t);
 
				
			
				
   

	}

}
