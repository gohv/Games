import java.util.Scanner;
import static java.lang.System.out;
public class Authenticator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		out.print("username: ");
		String username = keyboard.next();		
		if (username.equals ("gohv"))
		{
			out.print("Password:");
			String Password = keyboard.next();
			if (Password.equals("applet"))
			{	out.println("Welcome Master!");
		}
		else {
			out.println("Dont Try to break in!!!");
		}}
		else {
			out.println("I dont know who you are, but I am gonna find you!");
		}
		
		
		}
	}


