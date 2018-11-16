// An Example of a Generic Method

public class GenericMethod {

	// Prints a generic array
	public static <E> void printArray(E[] inputArray){
		// Displays array elements
		for(E element : inputArray){
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		// Creates arrays of Integer, Double, and Character
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = {'H','E','L','L','O'};
		
		System.out.println("intArray contains:");
		printArray(intArray); // passes an Integer array
		System.out.println("doubleArray contains:");
		printArray(doubleArray); // passes an Double array
		System.out.println("charArray contains:");
		printArray(charArray); // passes an Character array

	}

}
