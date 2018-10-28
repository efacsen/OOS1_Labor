
public class Lab2_Aufg3b {

	public static void main(String[] args) {

		int[] numberList = { 12321, 55555, 45554, 11611, 12345, 98765, 12322 };

		System.out.println("Checking out the number for Palindrome check ...");
		for (int counter = 0; counter < numberList.length; counter++) {
			int number = numberList[counter];
			int isChecking = isPalindrome(number);
			if (isChecking == number) {
				System.out.println(number + " is Palindrome!");
				System.out.println("Checking next number ...");
			} else {
				System.out.println(number + " is not Palindrome!");
				System.out.println("Checking next number ...");
			}
		}
		System.out.println("Closing Palindrome checks ... ");
		System.exit(0);
	}

	public static int isPalindrome(int a) {

		// String submittedNumber = JOptionPane.showInputDialog("Input your number for
		// Palindrome check: ");
		int num = a;
		int reversedInt = 0;
		int remainder;

		while (num != 0) {
			remainder = num % 10;
			reversedInt = reversedInt * 10 + remainder;
			num = num / 10;
		}

		return reversedInt;
	}

}
