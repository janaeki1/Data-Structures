
/*
 * CSC 2720, Mar.22, 2017
 * Lab Instructor : Zhuojun Duan
 * 
*/

public class binaryTree {
	
	protected btNode root;
	 
    /* Constructor */
    public binaryTree()
    {
        root = null;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    /* Functions to insert data */
    public void insert(int data)
    {
        root = insert(root, data);
    }
    
    
    /* Function to insert data recursively */
    private btNode insert(btNode node, int data)
    {
        if (node == null)
            node = new btNode(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }


  
   
    /* Function for preorder traversal */
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(btNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    
    /* Function for inorder traversal */
    public void inorder(){
    	inorder(root);
    }
    private void inorder(btNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());  
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    
    /* Function for postorder traversal */
    public void postorder(){
    	postorder(root);
    }
    private void postorder(btNode r)
    {
        if (r != null)
        {
            postorder(r.getLeft());  
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }
    
    // Returns the height of the binary search tree
    public int findHeight(btNode r){
    	if(r == null){
    		return 0;
    	}
    	else{
			int lh = findHeight(r.getLeft());
        	int rh = findHeight(r.getRight());
        	if(lh > rh){
        		return lh + 1;
        	}
        	else{
        		return rh + 1;
        	}
    	}    	
    }
    
    // Deletes the given node from binary search tree
    public boolean delete(int m){
    	if(root == null){
    		return false;
    	}
    	else{
    		boolean left = true;
    		btNode current = root;
    		btNode parent = root;
		
    		while(m != current.getData()){
    			parent = current;
    			//Searches left subtree
    			if(m < current.getData()){
    				current = current.getLeft();
    				left = true;
    			}
    			//Searches right subtree
    			else{
    				current = current.getRight();
    				left = false;
    			}
			
    			// Returns false if target not found
    			if(current == null){
    				return false;
    			}
    		}
    		
    		// 1st Case: The node to be deleted is a leaf node 
    		if(current.getLeft() == null && current.getRight() == null){
    			if(current == root){
    				root = null;
    			}
    			else if(left == false){
    				parent.setRight(null);
    			}
    			else{
    				parent.setLeft(null);
    			}
    		}
    		
    		// 2nd Case: The node to be deleted has one child
    		else if(current.getLeft() == null){
    			if(current == root){
    				root = current.getRight();
    			}
    			else if(left == false){
    				parent.setRight(current.getRight());
    			}
    			else{
    				parent.setLeft(current.getRight());
    			}
    		}
    		else if(current.getRight() == null){
    			if(current == root){
    				root = current.getLeft();
    			}
    			else if(left == false){
    				parent.setRight(current.getLeft());
    			}
    			else{
    				parent.setLeft(current.getLeft());
    			}
    		}
    		
    		// 3rd Case: The node to be deleted has two children			
    		else if(current.getLeft() != null && current.getRight() != null){
    			btNode temp = current.getRight();
    			btNode successor = null;
    			btNode successorParent = null;
    			
    			while(temp != null){
    				successorParent = successor;
    				successor = temp;
    				temp = temp.getLeft();
    			}
    			if(successor != current.getRight()){
    				successorParent.setLeft(successor.getRight());
    				successor.setRight(current.getRight());
    			}
    			if(current == root){
    				root = successor;
    			}
    			else if(left == false){
    				parent.setRight(successor);
    			}
    			else{
    				parent.setLeft(successor);
    			}			
    			successor.setLeft(current.getLeft());
    		}		
    		return true;
    	}
	}
    
    // Counts the nodes in binary search tree
    public int countNodes(){
    	return countNodes(root);
    }
    private int countNodes(btNode r){
    	int count = 0;
    	if(r != null){
    		count += countNodes(r.getLeft());
    		count += countNodes(r.getRight());
    		count++;
    	}
    	return count;
    }
    
    // Searches for the given node and returns it
    public btNode search(int m){
    	search(root, m);
    	return root;
    }
    private void search(btNode r, int m){
    	if(r == null){
    		return;
    	}
    	else{
    		if(m == r.getData()){
    			System.out.println(r.getData());
    		}
    		else if(m < r.getData()) {
    			search(r.getLeft(), m);
    		}
    		else {
    			search(r.getRight(), m);
    		}
    	}
    }
    
    
    /*
     * Students in the LAB should complete three methods as follows
     */
    
    
  /* Function for inorder traversal *//////////////////////////////////////////////////
    
   /* public void inorder()
    {
        //TO DO by students
    }
    */
    
    /* Function for postorder traversal *//////////////////////////////////////////////////
   /* public void postorder()
    {
    	//TO DO by students
    }*/
   
    
    
    /* Recursive approach to find height of binary tree *//////////////////////////////////////////////////
   /* public int findHeight(btNode root) {
     // TO DO by students
    }
    */
    
    

}
