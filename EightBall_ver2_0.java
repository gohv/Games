
import java.util.Random;
import javax.swing.JOptionPane;

public class EightBall_ver2_0 {

	public static void main(String[] args) {

		// Start of Input
		String welcome;

		JOptionPane.showMessageDialog(null, "Welcome to the 8Ball Game");

		welcome = initial();

		if (welcome == null) {
			JOptionPane.showMessageDialog(null, "Bye!");
			System.exit(0);

		}
		if (welcome.contains("?")) {

			// Answers
			String Answer = ("Yes, in due time.");
			String Answer1 = ("Definitely not.");
			String Answer2 = ("Outlook so so. ");
			String Answer3 = ("Are you kidding? ");
			String Answer4 = ("I have my doubts. ");
			String Answer5 = ("Probably. ");
			String Answer6 = ("Go for it! ");
			String Answer7 = ("Forget about it. ");
			String Answer8 = ("Who knows? ");
			String Answer9 = ("Better not tell you now. ");
			String Answer10 = ("Cannot predict now. ");
			String Answer11 = ("Signs point to yes. ");

			int RandomGenerator = new Random().nextInt(12) + 1;

			if (RandomGenerator == 1) {
				JOptionPane.showMessageDialog(null, Answer);
			} else if (RandomGenerator == 2) {
				JOptionPane.showMessageDialog(null, Answer1);
			} else if (RandomGenerator == 3) {
				JOptionPane.showMessageDialog(null, Answer2);
			} else if (RandomGenerator == 4) {
				JOptionPane.showMessageDialog(null, Answer3);
			} else if (RandomGenerator == 5) {
				JOptionPane.showMessageDialog(null, Answer4);
			} else if (RandomGenerator == 6) {
				JOptionPane.showMessageDialog(null, Answer5);
			} else if (RandomGenerator == 7) {
				JOptionPane.showMessageDialog(null, Answer6);
			} else if (RandomGenerator == 8) {
				JOptionPane.showMessageDialog(null, Answer7);
			} else if (RandomGenerator == 9) {
				JOptionPane.showMessageDialog(null, Answer8);
			} else if (RandomGenerator == 10) {
				JOptionPane.showMessageDialog(null, Answer9);
			} else if (RandomGenerator == 11) {
				JOptionPane.showMessageDialog(null, Answer10);
			} else if (RandomGenerator == 12) {
				JOptionPane.showMessageDialog(null, Answer11);
			}
			JOptionPane.showMessageDialog(null, "Thank you!");

		} else {
			JOptionPane.showMessageDialog(null, "Please enter a valid question!");
			welcome = initial();
		}
	}

	private static String initial() {
		return JOptionPane.showInputDialog("Please ask the 8Ball anything(Only yes or no questions PLEASE) : ");
	}
}
