/*
 * 11. Getting user input
 */

//importing Scanner class
import java.util.Scanner;

public class GettingUserInput {
	public static void main(String[] args) {
		/* Simple print user input program */
		//// Creating a new Scanner object, and passing the Standard Input Stream object
		//Scanner input = new Scanner(System.in); //input is an arbitrary variable (object) name
		
		//// Printing user prompt
		//System.out.println("Enter a line of text: ");
		
		//// Getting user input
		//String line = input.nextLine();
		
		//// Printing back user input
		//System.out.println("You entered: " + line);
		
		
		///* Simple print user input program: integer edition -
		 //* This program isn't very robust, if the user inputs something that isn't an integer, it will throw an
		 //* Exception, which will be covered later
		 //*/
		
		//// Creating a new Scanner object, and passing the Standard Input Stream object
		//Scanner input = new Scanner(System.in); //input is an arbitrary variable (object) name
		
		//// Printing user prompt
		//System.out.println("Enter a line of text: ");
		
		//// Getting user (integer only) input
		//int value = input.nextInt();
		
		//// Printing back user input
		//System.out.println("You entered: " + value);
		
		
		/* Simple print user input program: float edition -
		 * This program isn't very robust, if the user inputs something that isn't an integer, it will throw an
		 * Exception, which will be covered later
		 */
		
		// Creating a new Scanner object, and passing the Standard Input Stream object
		Scanner input = new Scanner(System.in); //input is an arbitrary variable (object) name
		
		// Printing user prompt
		System.out.println("Enter a floating point value: ");
		
		// Getting user (integer only) input
		double value = input.nextDouble();
		
		// Printing back user input
		System.out.println("You entered: " + value);
	}
}

