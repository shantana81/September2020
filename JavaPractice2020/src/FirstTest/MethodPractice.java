package FirstTest;

public class MethodPractice {
	static void practicemethod() {
		System.out.println("I love Ayat and Warith and Baba");
	}
static void myname(String fname, int age) {
	System.out.println("My name is "+fname+" I am "+age+" years old.");
	
}
static int mymethod(int x) {
	return 5 +x;

}

static void checkage(int age) {
	if (age<18) {
		System.out.println("Access denied");
	}else {
		System.out.println("Access granted");
	}
		
		
		
}
	public static void main(String[] args) {
	practicemethod();
myname("Ayat", 9);
System.out.println(mymethod(17));
checkage(18);
	}

private String name;
public String getName() {
	return name;
}
	public void setName(String newName) {
		this.name=newName;
	}

	
	
	String Flower= "Rose";
	public void fragrance() {
		System.out.println("Flower");
	}
}

	

