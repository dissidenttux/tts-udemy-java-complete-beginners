/*
 * 7. StringsWorkingWitText.java
 */


public class StringsWorkingWithText {
	public static void main(String[] args) {
		// Strings are declared similarly to variables, but "String" is actually a default Java class
		// Classes are "types", referring to a type of something. Like "cats" are a type of animal, not a particular cat
		// The String "variable", "text", REFERS TO, rather than holds the value "Hello" as a text object
		int myInt = 7;
		String text	= "Hello";
		
		String blank = " ";
		
		String name = "Bob";
		// concatinating the value of Strings together
		String greeting = text + blank + name;
		
		// printing result of the line above
		System.out.println(greeting);
		// you can also print String values directly
		System.out.println("Hello," + " " + "Bob.");
		// combining the two print concepts in action
		System.out.println("My integer is: " + myInt);
		
		double myDouble = 7.8;
		System.out.println("My number is: " + myDouble + ".");
		
	}
}

