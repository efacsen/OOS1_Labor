public class Lab2_Aufg5a {

	public static void main(String[] args) {

		int fak = 1;
		// Faculty, with int can just hold 2^31 -1 (2,147,483,647), and this program can
		// give a
		// correct answer until 12!, afterr that it gives us wrong answer. Start with
		// 17! the answer is going to minus

		for (int counter = 1; counter <= 30; counter++) {
			fak = fak * counter;
			System.out.println(counter + "! is " + fak);
		}
		System.exit(0);
	}

}
