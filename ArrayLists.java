/* 53. ArrayList: Arrays the Easy Way */
import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(); // have to use refernce types with ArrayList
		
		// Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// Retrieving
		System.out.println(numbers.get(0));
		
		System.out.println("\nIteration #1");
		// Indexed for loop iteration
		for (int i=0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// Removing stuff from an index (careful!)
		numbers.remove(numbers.size() -1);
		
		// This is VERY slow
		numbers.remove(0);
		
		// Another way to iterate through lists
		System.out.println("\nIteration #2");
		//for(TypeOfThingInMyList IntegerValue: NameOfMyList)
		for(Integer value: numbers) {
			System.out.println(value);
		}
		
		// List interface...
		List<String> values = new ArrayList<String>();
		
	}
}
