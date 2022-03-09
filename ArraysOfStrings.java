/* 15. Arrays of Strings */

public class ArraysOfStrings {
	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		//putting in values
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		// for loop w/o a loop index
		// iterate through a String array of fruit: the name of the array I want to iterate through
		for(String fruit: fruit) {
			System.out.println(fruit);
		}
		
		/* basic level of String arrays attained */
		
		int value = 0; // int is a primitive type, lowercase letter
		
		String text = null; /* String is a reference type, a class, capital letter. A reference is an address to a place
		in memory. The value "null" is the default value of reference type, and it's basically an address to nowhere */
		
		String[] texts = new String[2]; // allocating the reference memory for two Strings
		System.out.println(texts[0]); // will get null
		
		// allocating memory for a String
		texts[0] = "one";
	}
}
