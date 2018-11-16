import java.util.ArrayList;

//Implementation of ArrayList methods

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(82);
		list.add(2);
		list.add(4);
		list.add(47);
		list.add(5);
		System.out.println("ArrayList: " + list);
		list.add(2,24);
		list.set(3,25);
		System.out.println("ArrayList after inserting \"24\" and \"25\": " + list);
		System.out.println("Element at position 4: " + list.get(4));
		System.out.println("Element to be removed: " + list.remove(7));
		System.out.println("ArrayList: " + list);
		System.out.println("Is there \"5\" in the list? " + list.contains(5));
		System.out.println("Are there elements of \"list 2\" in \"list\"? " + list.contains(list2));
		System.out.println("The position of the first occurence of \"2\": " + list.indexOf(2));
		System.out.println("The position of the last occurence of \"2\": " + list.lastIndexOf(2));
		System.out.println("Is \"list 2\" empty? " + list2.isEmpty());
		System.out.println("How many elements are in the list? " + list.size());
		System.out.println("A \"shallow\" copy of the list: " + list.clone());
		System.out.println("Is \"list 1\" and \"list 2\" equal? " + list.equals(list2));

	}

}
