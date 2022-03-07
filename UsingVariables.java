/*
 * 6. UsingVariables.java
 */


public class UsingVariables { //class names are Pascal case
	
	public static void main (String[] args) {
		/* varaibles are like boxes in which we can put things in
		 * this is an integer variable
		 * variable names in Java are camel case by convention
		 * */
		//int myNumber; // declaring a variable
		
		////integers hold integral numbers, negative or positive
		//myNumber = 88; // initialized a varible
		
		
		//number variables
		// declaring variable =(&)= intializing variable
		int myNumber = 88; //32-bit value
		short myShort = 847; //16-bit value
		long myLong = 9747;
		
		// floating point numbers variables
		// (double is used more often)
		double myDouble = 7.3243; // "double" or extra point precision variable
		float myFloat = 324.3f; // float
		
		// other variables
		// char allows to map singular characters in single quotes, 16-bit Unicode
		char myChar = 'y';
		// boolean logic - true || false
		boolean myBoolean = false;
		// byte holds 8-bit number data (-127 to 127), useful for precise arrays(?)
		byte myByte = 127;
		
		//print variable to output (screen)
		System.out.println(myNumber); //print variable to output (screen)
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);
		
	}
}

