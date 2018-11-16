package LinkedList;
// Node of a singly linked list
public class Node {
	
	private int data;
	private Node next;
	
	// Constructor 1: Creates a node with the given element and the next node
	public Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
	
	// Constructor 2: Creates a node with the given element
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
	// Returns the element of this node
	public int getData(){
		return data;
	}
	
	// Returns the next node of this node
	public Node getNext(){
		return next;
	}
	
	// Sets the element of this node
	public void setData(int newData){
		data = newData;
	}
	
	// Sets the next node of this node
	public void setNext(Node newNext){
		next = newNext;
	}

}
