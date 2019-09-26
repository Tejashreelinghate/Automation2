package CS;

public class COOR {

	public static void main(String[] args) 
	{
		int Jyear = 1;
		int performance = 7;
		int beheviour = 9;

		if (Jyear >= 1) {
			if (performance >= 4 || beheviour >= 4) {
				System.out.println("SALARY INCREMENT");
			} else {
				System.out.println("try again");
			}
		} else
			System.out.println("you are not elegible");

	}

}
