// Tests the created Binary Search Tree
public class MyBST_Test {
	
	public static void main(String arg[]){

		MyBinarySearchTree b = new MyBinarySearchTree();
		b.insert(9);b.insert(10);
		b.insert(17);b.insert(4);b.insert(3);b.insert(7);b.insert(14);b.insert(16);
		b.insert(15);b.insert(19);
		System.out.println("Original Tree : ");
		b.display(b.root);
		System.out.println("");
		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
		System.out.println("Delete Node with no children (2) : " + b.delete(2));		
		b.display(b.root);
		System.out.println("\n Delete Node with one child (4) : " + b.delete(4));		
		b.display(b.root);
		System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));		
		b.display(b.root);
		
	}

}
