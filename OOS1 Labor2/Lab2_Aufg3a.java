import javax.swing.JOptionPane;

public class Lab2_Aufg3a {

	public static void main(String[] args) {

		String submittedNumber = JOptionPane.showInputDialog("Input your number for Palindrome check: ");
		int num = Integer.parseInt(submittedNumber);
		int reversedInt = 0;
		int remainder;
		int originalInt;

		originalInt = num;

		while (num != 0) {
			remainder = num % 10;
			reversedInt = reversedInt * 10 + remainder;
			num = num / 10;
		}

		if (originalInt == reversedInt) {
			JOptionPane.showMessageDialog(null, originalInt + " is a Palindrome.");
			System.out.println(originalInt + " is Palindrom!");
		} else {
			JOptionPane.showMessageDialog(null, originalInt + " is not a Palindrome.");
			System.out.println(originalInt + " is not Palindom!");
		}
		System.exit(0); // We can use another number outside 0, is to mark some error f happening, 0 is for being fine, or quitting without error
	}

}
