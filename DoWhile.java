/* 12. DoWhile */
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		/* Here, we're forcing the user to enter the number "5" in order for something to happen */
		
		// Scanner object for input
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Enter a number: ");
		// user's integer entry is stored in "value"
		int value = scan.nextInt();
		
		while (value != 5) {
			System.out.println("Enter a number: ");
			// calling back the Scanner object we called earlier
			value = scan.nextInt();
		}'
		
		System.out.println("Got 5!");
		*/		
		
		/* The problem with this is that lines 12-14 and 17-19 are repetitions of each other. We can solve this with
		 * a DO-WHILE LOOP
		*/
		
		int value = 0; // because "value" won't work in while (scope problem), we have to declare it here first
		do { //the code under "do" WILL execute when the machine touches it regardless of the condition in the while later
			System.out.println("Enter a number: ");
			value = scan.nextInt();
		} while(value !=5); /* (condition). Basically, the "while" here is gatekeeping the user/computer from going down
		the rest of the lines of code until the condition is satisfied */
		
		System.out.println("Got 5!");
		
		
	}
}
