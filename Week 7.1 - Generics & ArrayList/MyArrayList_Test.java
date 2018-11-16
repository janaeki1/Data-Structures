// Tests the created ArrayList
public class MyArrayList_Test {

	public static void main(String[] args) {
		
		// Initializes an instance of MyArrayList
		MyArrayList list = new MyArrayList(20); // sets the CAPACITY to 20 arrays
		
		// Adds new elements
		list.add(new Integer(5));
		list.add(new Integer(1));
		list.add(new Integer(23));
		list.add(new Integer(14));
		
		// Displays the elements in the list
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// Adds a new value
		list.add(new Integer(29));
		
		System.out.println("Element at position 4: " + list.get(4));
		System.out.println("Number of elements in list: " + list.size());
		System.out.println("Element to be removed at position 2: " + list.remove(2));
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
	}

}
