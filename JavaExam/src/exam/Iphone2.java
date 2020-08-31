package exam;

public class Iphone2 extends IPhone1{

	public void camera() {
		int price=770;
	System.out.println( "the camera was introduce in iphone2 the price was increase to "+price)	;
	}
	
char gender;
public Iphone2 () {
	
}
public Iphone2(char malefemale) {
	gender=malefemale;
}
public void Iphone2info() {
	System.out.println("The iPhone 2 was released in 2001, and came out with the all-new camera feature.");
	super.regularClassInfo();
}
public void Iphone2info(char mf) {
	
}
}
