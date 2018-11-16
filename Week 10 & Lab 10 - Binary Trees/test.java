/*
 * CSC 2720, Mar.22, 2017
 * Lab Instructor : Zhuojun Duan
 * 
*/

import java.util.Scanner;

public class test {
	
	public static void main(String[] args)
    {                 
        Scanner scan = new Scanner(System.in);
        /* Creating object of BST (Binary Search Tree) */
        binaryTree bst = new binaryTree(); 
        System.out.println("Binary Search Tree Test\n");          
        char ch;
        int flag=0;
        /*  Perform tree operations  */
        do    
        {
        	
        	System.out.println("Enter integer element to insert.");
            bst.insert( scan.nextInt() );                     
            
            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);  
        	
        } while (ch == 'Y' || ch == 'y');
        BTreePrinter.printNode(bst.root);
        
        System.out.println(bst.countNodes());
        System.out.println();
        bst.delete(4);
        bst.delete(3);
        //System.out.println(bst.find(10));
        System.out.println(bst.search(15));
        BTreePrinter.printNode(bst.root);
        
        System.out.print("\nPreorder : ");
        bst.preorder();
        
        System.out.print("\nInorder : ");
        bst.inorder();
        
        System.out.print("\nPostorder : ");
		bst.postorder();
        
        System.out.print("\n\n Height of the tree is : " + bst.findHeight(bst.root));
        
    }




}
