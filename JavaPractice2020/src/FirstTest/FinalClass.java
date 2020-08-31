package FirstTest;

public class FinalClass {

	public static void main (String []args) {
		PrimaryClass myobj=new PrimaryClass ();
		PrimaryClass.Innerclass myobj1=myobj.new Innerclass();
		System.out.println(myobj.Car);
		System.out.println(myobj1.Hotel);

	}

}
