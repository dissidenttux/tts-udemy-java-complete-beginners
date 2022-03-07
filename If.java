/* 10. ForLoops */
public class If {
    public static void main (String[] args) {
		
		/* conditional symbols:
		 * reminder that "=" is an assignment operator and not a comparison operator
		 * "==" is a test for equality, and derivative symbols offer more or less self-explanatory results, i.e.,
		 * "!=" is for not-equal
		  */
		// boolean cond = 5 != 2;
		
		/* if statement -
		 * if (condition is satisfied), then {
		 *		(execute this code)
		 * }
		 */
		 
		// if (5 != 5) {
			// System.out.println("Yes, it's true!");
		// }
		
		
		/* if-else
		 * if (condition is satisfied)((, then)) {
		 *		execute this code
		 * } else ((that is, otherwise)) {
		 * 		execute this code
		 * }
		 */
		 
		// int myInt = 20;
		// if(myInt < 10) {
			// System.out.println("Yes, it's true!");
		// } else {
			// System.out.println("No, it's false!");
		// }
		
		
		/* else-if
		 * if (condition is satisfied), then {
		 *		execute this code
		 * } else if (this condition is satisfied instead) {
		 * 		execute this code INSTEAD
		 * }
		 */
		 
		// int myInt = 5;
		// if(myInt < 10) {
			// System.out.println("Yes, it's true!");
		// } else (myInt > 20) {
			// System.out.println("No, it's false!");
		// }
		
		
		 /* else-if
		 * if (condition is satisfied), then {
		 *		execute this code
		 * } else if (this condition is satisfied instead) {
		 * 		execute this code INSTEAD
		 * } else, if none of the above are true {
		 * 		execute this code INSTEAD third-party.deb bro
		 * }
		 */
		 
		// int myInt = 15;
		// if (myInt < 10) {
			// System.out.println("Yes, it's true!");
		// } else if (myInt > 20 ) {
			// System.out.println("No, it's false!");
		// } else {
			// System.out.println("None of the above.");
		// }
		
		
		// loop counter
		int loop = 0;
		
		/* while loop w/ if -
		 * the "true" is pushed in as an argument for the if conditional. As soon as the if statment on line 83 rings
		 * "true", it breaks with the "break" keyword and stops executing */
		while (true) {
			System.out.println("Looping: " + loop);
			
			if (loop == 5) {
				/* break, BTW, IMMEDIATELY stops the rest of the code ("breaks out") in the loop. In the last iteration,
				loop will not increment and "Running" will not print afterwards */
				break;
			}
			loop++; //increment by 1 (each loop)
			System.out.println("Running");
		}
		
    }
} 
