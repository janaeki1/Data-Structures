package Assignment3_Solution;
/*
 * Csc 2720
 */

//import java.util.InputMismatchException;
//import java.util.Scanner;



public class Test {
	
	public static void main(String[] args) {
	//AdjMatGraph theGraph = new AdjMatGraph();
	AdjMatGraph x=new AdjMatGraph();
    x.addVertex('A');    // 0  (start for bfs)
    x.addVertex('B');    // 1
    x.addVertex('C');    // 2
    x.addVertex('D');    // 3
    x.addVertex('E');    // 4
    x.addVertex('F');    // 4

    x.addEdge(0, 1);     // AB
    x.addEdge(0, 2);     // AC
    x.addEdge(1, 3);     // BD
    x.addEdge(2, 4);     // CE
    x.addEdge(2, 3);     // CD
    x.addEdge(0, 3);     // AD
    x.addEdge(3, 4);     // DE
    x.addEdge(3, 5);     // DE

    System.out.print("Stack based bfs visits:----------------------- ");
    x.bfs();            
    System.out.println();
    
    
    }  // end main()
}
