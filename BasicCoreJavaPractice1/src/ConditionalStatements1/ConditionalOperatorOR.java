package ConditionalStatements1;

public class ConditionalOperatorOR {

	public static void main(String[] args) 
	{
		int age = 3;
		int writen = 40;
		int oral = 40;

		if (age >= 3) {
			if (writen >= 40 || oral >= 50) {
				System.out.println("WELL COME TO NURSERY");
			} else {
				System.out.println("NOT ELIGIBLE");
			}
		} else
			System.out.println( "RETRY");

	}

}
