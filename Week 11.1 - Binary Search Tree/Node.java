// Node of a binary search tree
public class Node {
	
	private int data;
	private Node left;
	private Node right;	
	
	// Constructor 1: Creates a node with the given element
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	// Returns the element of the node
	public int getData(){
		return data;
	}
		
	// Returns the left node of the node
	public Node getLeft(){
		return left;
	}
	
	// Returns the right node of the node
	public Node getRight(){
		return right;
	}
		
	// Sets the element of the node
	public void setData(int newData){
		data = newData;
	}
	
	// Sets the left node of the node
	public void setLeft(Node newLeft){
		left = newLeft;
	}

	// Sets the right node of the node
	public void setRight(Node newRight){
		right = newRight;
	}

}
