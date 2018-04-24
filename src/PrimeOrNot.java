import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("What is your number?");
		int num = Integer.parseInt(number);
		if (num % num == 0 && num % 2 == 1) {
			for (int i = 2; i < num; i++) {
				if (num % i != 0) {
					JOptionPane.showMessageDialog(null, "Your number, " + num + " is Prime!");
					break;
				}
			}
		} else if (num == 2) {
			JOptionPane.showMessageDialog(null, "Your number, " + num + " is Prime!");
		}

		else {
			JOptionPane.showMessageDialog(null, "Your number is composite.");
		}

	}
}
