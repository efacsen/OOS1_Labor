import java.util.Arrays;
import java.util.Random;

public class Lab2_Aufg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[] = new int[20];
		Random random = new Random();

		System.out.println("Reading through number ...");
		for (int counter = 0; counter < number.length; counter++) {

			int randomNumber = random.nextInt(500) + 1;
			number[counter] = randomNumber;
			// random.nextInt(500) will return an integer between 0 (inclusively) and 500
			// (exclusively) (in other words [0-499]
			// we add +1, so 500 is the maximum and 1 is the minimum
		}
		System.out.println(Arrays.toString(number));
		// To printout array, using Arrays.toString(arrayName)
		System.out.println("Looking for biggest number ...");

		// To get a biggest number in Array
		int max = number[0];

		for (int counter = 1; counter < number.length; counter++) {
			if (number[counter] > max) {
				max = number[counter];
			}
		}
		System.out.println("Biggest number is: " + max);
		System.exit(0);
	}

}
