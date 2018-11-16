/* A reference-based implementation of a binary search tree
 * (USE "binaryTree.java" FROM LAB 10 INSTEAD)
 */


public class MyBinarySearchTree {
	
	Node root;
	
	public MyBinarySearchTree(){
		this.root = null;
	}
	
	public boolean find(int data){
		Node current = root;
		
		while(current != null){
			if(current.getData() == data){
				return true;
			}
			else if(current.getData() > data){
				current = current.getLeft();
			}
			else{
				current = current.getRight();
			}
		}
		return false;
	}
	
	public boolean delete(int data){
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		
		while(current.getData() != data){
			parent = current;
			
			if(current.getData() > data){
				isLeftChild = true;
				current = current.getLeft();
			}
			else{
				isLeftChild = false;
				current = current.getRight();
			}
			if(current == null){
				return false;
			}
		}
		
		//Case 1: if node to be deleted has no children
		if(current.getLeft() == null && current.getRight() == null){
			if(current == root){
				root = null;
			}
			if(isLeftChild == true){
				parent.setLeft(null);
			}
			else{
				parent.setRight(null);
			}
		}
		//Case 2 : if node to be deleted has only one child
		else if(current.getRight() == null){
			if(current == root){
				root = current.getLeft();
			}
			else if(isLeftChild){
				parent.setLeft(current.getLeft());
			}
			else{
				parent.setRight(current.getLeft());
			}
		}
		else if(current.getLeft() == null){
			if(current == root){
				root = current.getRight();
			}
			else if(isLeftChild){
				parent.setLeft(current.getRight());
			}
			else{
				parent.setRight(current.getRight());
			}
		}
		else if(current.getLeft() != null && current.getRight() != null){
			
			//now we have found the minimum element in the right sub tree
			Node successor = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeftChild){
				parent.setLeft(successor);
			}else{
				parent.setRight(successor);;
			}			
			successor.setLeft(current.getLeft());
		}		
		return true;		
	}
	
	public Node getSuccessor(Node deleleNode){
		Node successsor = null;
		Node successsorParent = null;
		Node current = deleleNode.getRight();
		
		while(current != null){
			successsorParent = successsor;
			successsor = current;
			current = current.getLeft();
		}
		
		//check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
		if(successsor != deleleNode.getRight()){
			successsorParent.setLeft(successsor.getRight());;
			successsor.setRight(deleleNode.getRight());;
		}
		return successsor;
	}
	
	public void insert(int data){
		Node newNode = new Node(data);
		if(root==null){
			root = newNode;
			return;
		}
		
		Node current = root;
		Node parent = null;
		
		while(true){
			parent = current;
			if(data < current.getData()){				
				current = current.getLeft();
				if(current == null){
					parent.setLeft(newNode);
					return;
				}
			}
			else{
				current = current.getRight();
				if(current == null){
					parent.setRight(newNode);
					return;
				}
			}
		}
	}
	public void display(Node root){
		if(root!=null){
			display(root.getLeft());
			System.out.print(" " + root.getData());
			display(root.getRight());
		}
	}
}
