import java.math.BigInteger;

public class Lab2_Aufg5c {

	public static void main(String[] args) {
		BigInteger fak = BigInteger.ONE;
		// or BigInteger fak = BigInteger.valueOf(1);
		for (int counter = 1; counter <= 30; counter++) {

			fak = fak.multiply(BigInteger.valueOf(counter));
			System.out.println(counter + "! is " + fak);
		}
		System.exit(0);

	}

}
