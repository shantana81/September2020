package Practice;

public class JavaTryAndCatch {

	public static void main(String[] args) {
		try {
		int[] price= {2,4,8,9,10};
		System.out.println(price[5]);
		}
		catch (Exception e) {
			System.out.println("the line 8 is an error");
		}
	}

}
