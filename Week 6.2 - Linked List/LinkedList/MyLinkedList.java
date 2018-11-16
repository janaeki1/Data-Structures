package LinkedList;
// An empty linked list of integer values
public class MyLinkedList {
	
	// References the head node
	private Node head;
	private int listCount;
	
	// Linked list constructor
	public MyLinkedList(Node head, int listCount){
		/* Because this is an empty linked list, 
		 * the reference to the head node is set to the new node with no data */
		head = null;
		listCount = 0;
	}
	
	// Adds the specified element to the end of the list
	public void addEnd(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		// Starts at the head node and crawls to the end of the list
		Node temp = head;
		while(temp.getNext() != null){
			temp = temp.getNext();
		}
		
		// Sets the last node's "next" reference to the new node
		temp.setNext(newNode);
		listCount++; // Increments the count for number of elements
	}
	
	// Adds the specified element to the head of the list
	public void addHead(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else{
			newNode.setNext(head);
			head = newNode;
		}
		listCount++; // Increments the count for number of elements
	}
	// Inserts the specified element AFTER the specified position in the list.
	public void add(int data, int index){
		// Index cannot be less than "1"
		if(index<=0 || index >= listCount){
			return;
		// If you would like to insert element at the head, use this: "if(index == 0)"
		}
		Node newNode = new Node(data);
		
		/* Starts at the head node and crawls to the specified index or 
		 * the last element in the list, whichever comes first */
		Node temp = head;
		for(int i = 0; i < index && temp.getNext() != null; i++)
		{
			temp= temp.getNext();
		}
		// Sets the new node's next-node reference to this node's next-node reference
		newNode.setNext(temp.getNext());
		// Sets this node's next-node reference to the new node
		temp.setNext(newNode);
		listCount++; // Increments the count for number of elements
	}
	
	// Returns the element at the specified position from the list
	public int getElement(int index){
		// Checks to see if specified index is in the list
		if(index < 0 || index >= listCount){
			System.out.println("The index is out of bounds of the list");
		}
		
		// Searches for element at the specified index
		Node current = head;
		for(int i = 0; i < index; i++){
			current = current.getNext();
		}
		return current.getData(); // Returns the element
	}
	
	// Returns the number of elements in the list
	public int size(){
		return listCount;
	}

	// Removes the element at the specified position in the list
	public boolean delete(int index){
		// Checks to see if specified index is out of range
		if(index < 0 || index > size()) // Using created "size()" method
			return false;
		
		// Locate the node at "index-1"
		Node current = head;
		for(int i = 0; i < index-1; i++){
			if(current.getNext() == null)
				return false;
			
			current = current.getNext();
		}
		// Removes the node at the index and sets a new next-node reference
		current.setNext(current.getNext().getNext());
		listCount--; // Decrements the count for number of elements
		return true;
	}
	
	// Returns the list of a node as a string
	public String toString(){
		Node current = head;
		String list = "";
		while(current != null){
			list += "[" + current.getData() + "]";
			current = current.getNext();
		}
		return list;
	}

}
