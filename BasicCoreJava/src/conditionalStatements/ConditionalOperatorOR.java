package conditionalStatements;

public class ConditionalOperatorOR {

	public static void main(String[] args) {

		int pcm = 60;
		int jre = 20;
		int cet = 40;

		if (pcm >= 60) {
			if (jre >= 30 || cet >= 60) {
				System.out.println("you are elegible");
			} else {
				System.out.println("you are not elegible");
			}
		} else
			System.out.println("you are not elegible");

	}

}
