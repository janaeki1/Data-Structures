/* Different methods are used to alter an array.
 * Both the original and new array are printed using "Arrays.copyof()" */
import java.util.Arrays;

public class Arrays_copyOf {

	public static void main(String[] args) {
		
		int[] array = {8,0,4,7,3};
		System.out.println("insertBeginning method\nOriginal Array: " + Arrays.toString(array));
		int[] newArray1 = Arrays.copyOf(array, array.length);
		insertBeginning(newArray1,20);
		toString(newArray1);
		System.out.println("insertEnd method\nOriginal Array: " + Arrays.toString(array));
		int[] newArray2 = Arrays.copyOf(array, array.length);
		insertEnd(newArray2,20);
		toString(newArray2);
		System.out.println("insertIndex method\nOriginal Array: " + Arrays.toString(array));
		int[] newArray3 = Arrays.copyOf(array, array.length+1); // Increases the size of the new array
		insertIndex(newArray3,2,20);
		toString(newArray3);
		System.out.println("reverseArray method\nOriginal Array: " + Arrays.toString(array));
		int[] newArray4 = Arrays.copyOf(array, array.length);
		reverseArray(newArray4);
		toString(newArray4);
		
	}
	
	/* Inserts a value at the beginning of an array and moves the remaining values 
	   to the right. */
	public static void insertBeginning(int[] array, int v) {
		for(int i = array.length-1; i > 0; i--) {
			array[i] = array[i-1]; //sets value equal to the value of the index to the left 
		}
		array[0] = v; //sets value of first element to given value
	}
	/* Inserts a value at the end of an array and moves the remaining values 
	   to the left. */
	public static void insertEnd(int[] array, int v) {
		for(int i = 0; i < array.length-1; i++) {
			array[i] = array[i+1]; //sets value equal to the value of the index to the right
		}
		array[array.length-1] = v; //sets value of last element to given value
	}
	
	// Inserts a value at a specified index and prints that index number
	public static void insertIndex(int[] array, int p, int v) {
		for(int i = 0; i < array.length; i++) {
			if (i == p) { //checks if index equals given index
				for(int j = array.length-1; j > p; j--) {
					array[j] = array[j-1]; //sets value equal to the value of the index to the left
				}
				array[p] = v; //sets value of given index to given value
			}
		}
		System.out.println("Position: " + p); //prints index
	}
	
	// Reverses the order of an array
	public static void reverseArray(int[] array){
		for (int i = 0; i < array.length/2; i++) { //keeps the middle index positioned
			// swaps the ends of the array
			int temp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temp;
			
		}
	}
	
	//Prints the new array
	public static void toString(int [] array) {
		System.out.println("New Array: " + Arrays.toString(array));
		System.out.println();
	}

}
