/* 14. Arrays */

public class Arrays {
	public static void main(String[] args) {
		
		int value = 7;
		// arrays are a type of reference variable that can hold more than one value
		int[] values;
		values = new int[3];
		
		// arrays are 0 indexed, meaning the first value are indexed at zero
		System.out.println(values[0]);
		
		// setting values
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		// getting values
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		// iterating through an array
		for(int i=0; i<values.length; i++) { // "values.length" refers to the length of the array, values
			System.out.println(values[i]);
		}
		
		int[] numbers = {5, 6, 7};
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
