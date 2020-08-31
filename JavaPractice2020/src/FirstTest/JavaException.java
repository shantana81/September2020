package FirstTest;

public class JavaException {

	public static void main(String[] args) {
try {
	int[] ourages= {9,14,39,43};
	System.out.println(ourages[43]);
}
catch (Exception e) {
	System.out.println("you didnt enter Baba's age ");
}
finally{
	System.out.println("The try catch is finished");
}
	}

}
