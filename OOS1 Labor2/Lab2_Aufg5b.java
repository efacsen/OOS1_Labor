
public class Lab2_Aufg5b {

	public static void main(String[] args) {
		long fak = 1;
		// Faculty, with long can hold 2^63 -1 (9,223,372,036,854,775,808), and this
		// program can gives a
		// correct answer until 20!, after that it gives us wrong answer.

		for (int counter = 1; counter <= 30; counter++) {
			fak = fak * counter;
			System.out.println(counter + "! is " + fak);
		}
		System.exit(0);

	}

}
