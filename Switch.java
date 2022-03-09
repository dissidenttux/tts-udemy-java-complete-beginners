/* 13. Switch */
import java.util.Scanner;


public class Switch {
	public static void main(String[] args) {
		/* "switch" allows you to take different actions depending on the value of a variable. It's like "if", but is
		 * more efficient under some circumstances
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		String text = input.nextLine();
		
		switch(text) {
			// if the user types "start"...
			case "start":
				// ...execute this code
				System.out.println("Machine started!");
				// "break" from this case after the code in the case is executed
				break;
			case "stop":
				System.out.println("Machine stopped");
				break;
				
				/* an optional statement, "default" is used in cases where it's handy to have something when the user
				 * doesn't choose any of the options laid out in the cases. In this case, we're telling the user that
				 * their command isn't recognized in the program (implying they should type a one that is)
				*/
			default:
				System.out.println("Command not recognized");
		}
	}
}
