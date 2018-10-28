
import javax.swing.*;

public class Lab2_Aufg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JOptionPane.showMessageDialog(null, "Seitenlaenge");
		String seitenLaenge = JOptionPane.showInputDialog("Input your disired Seitenlaenge:");

		double quadrat = Integer.parseInt(seitenLaenge);

		for (int column = 1; column <= quadrat; column++) {
			for (int row = 1; row <= quadrat; row++) {
				if (row == 1 || row == quadrat || column == 1 || column == quadrat) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();

		}
		System.exit(0);
	}

}
