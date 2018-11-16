import java.util.*;

// An array-based implementation of a binary search tree

public class BST_Array {

	public static void main(String[] args){   

		Random rand = new Random(); 
		int []  array1 = new int[10];
		
		for(int i=0;i<10;i++){
			array1[i] = rand.nextInt(100) + 1;
			System.out.print(array1[i]+" ");
		}
		System.out.println();

		arrayTree(array1, 10);

    }

	public static void arrayTree(int [] a1,int n){
		int []  a2 = new int[2000]; // The new array a2 would be the tree we create
		
		for(int i=0;i<2000;i++){
			a2[i] = -1;
		}
		a2[0] = a1[0];
		int maxim = -1;        //maxim will keep track on the most right leaf node for us to print out 
		for(int i=1;i<n;i++){
			int order = 0;     //Every comparison we start from the root node
			while(a2[order]!=-1){        
				if(a1[i] < a2[order]){
					order = order*2+1;
				}
				else{
					order = order*2+2;
				}
			}
			a2[order] = a1[i];
			if (order>maxim){
				maxim = order;
			}
		}
		for(int i=0;i<maxim;i++){
			System.out.print(a2[i] + " ");
		}
		//return Arrays.toString(a2);

	}

}