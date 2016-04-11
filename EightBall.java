import java.util.Scanner;
import static java.lang.System.out;
import java.util.Random;
import javax.swing.JOptionPane;
public class EightBall {

	public static void main(String[] args) {

		// Start of Input
		out.println("WELCOME TO THE 8BALL GAME");
		Scanner keyboard = new Scanner(System.in);
		out.print("Please ask the 8Ball anything(Only yes or no questions PLEASE) : ");
		String question = keyboard.next();

		out.println(" ");
		out.println("Your answer is:");
		out.println(" ");
		out.println("******");
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
			out.println(Answer);
		}
		if (RandomGenerator == 2) {
			out.println(Answer1);
		}
		if (RandomGenerator == 3) {
			out.println(Answer2);
		}
		if (RandomGenerator == 4) {
			out.println(Answer3);
		}
		if (RandomGenerator == 5) {
			out.println(Answer4);
		}
		if (RandomGenerator == 6) {
			out.println(Answer5);
		}
		if (RandomGenerator == 7) {
			out.println(Answer6);
		}
		if (RandomGenerator == 8) {
			out.println(Answer7);
		}
		if (RandomGenerator == 9) {
			out.println(Answer8);
		}
		if (RandomGenerator == 10) {
			out.println(Answer9);
		}
		if (RandomGenerator == 11) {
			out.println(Answer10);
		}
		if (RandomGenerator == 12) {
			out.println(Answer11);
		}
		out.print("******");
		keyboard.close();
	}
}