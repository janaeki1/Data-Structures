package LinkedList;
// Tests the created LinkedList
public class MyLinkedList_Test {

public static void main(String[] args) {
	
	// Initializes the linked list
	MyLinkedList myList = new MyLinkedList(null, 0);
	myList.addEnd(1);
	myList.addEnd(2);
	myList.addEnd(3);
	myList.addEnd(4);
	myList.addEnd(5);
	System.out.println(myList.toString());		
		
	// Adds a new node at the head of the list
	System.out.println("Add a new node with data as 0 at the head the list ");
	myList.addHead(0);
	System.out.println(myList.toString() + " \n");
	
	// Adds a new node at the end of the list
	System.out.println("Add a new node with data as 6 at the end the list ");
	myList.addEnd(6);
	System.out.println(myList.toString() + " \n");
	
	// Adds a new node after a specified index
	System.out.println("Add a new node with data as 35 after index 4 ");
	myList.add(35, 4);
	System.out.println(myList.toString() + " \n");
	
	// Deletes the node at index 2
	System.out.println("Delete a node at index 2");
	myList.delete(2);
	System.out.println(myList.toString() + " \n");
	
	// Prints the node at index 4
	System.out.println("Print the node at index 4");
	System.out.println(myList.getElement(4));
	
	}

}
