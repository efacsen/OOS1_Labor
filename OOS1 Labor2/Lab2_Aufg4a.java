import javax.swing.JOptionPane;

public class Lab2_Aufg4a {

	public static void main(String[] args) {

		double decimal = 0;
		double exponent = 0;

		String submittedBinary = JOptionPane.showInputDialog("Input your binary number: ");
		int binary = Integer.parseInt(submittedBinary);
		
		for ( ; binary > 0 ; exponent++) {
			decimal = decimal + ((binary % 10) * Math.pow(2, exponent));
			binary = binary / 10;
		}
		int decimalInt = (int) decimal;
		JOptionPane.showMessageDialog(null, "Your decimal is " + decimalInt);
		System.exit(0);
	}

}
