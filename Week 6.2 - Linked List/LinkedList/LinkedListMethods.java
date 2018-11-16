package LinkedList;
import java.util.LinkedList;

// Implementation of LinkedList methods (not array based)

public class LinkedListMethods {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(10);
		list.addFirst(5);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);

	}

}
