package Lab13;


/*
 * class: Test
 * csc 2720, Spring 2017
 */


public class Test
   {
   public static void main(String[] args)
      {
      Graph theGraph = new Graph();
      theGraph.addVertex('A');    // 0  (start for dfs)
      theGraph.addVertex('B');    // 1
      theGraph.addVertex('C');    // 2
      theGraph.addVertex('D');    // 3
      theGraph.addVertex('E');    // 4
      theGraph.addVertex('F');    // 5

      theGraph.addEdge(0, 1);     // AB
      theGraph.addEdge(0, 2);     // AC
      theGraph.addEdge(1, 3);     // BD
      theGraph.addEdge(2, 4);     // CE
      theGraph.addEdge(2, 3);     // CD
      theGraph.addEdge(0, 3);     // AD
      theGraph.addEdge(3, 4);     // DE
      theGraph.addEdge(3, 5);     // DF
      
      System.out.print("Stack based dfs visits:----------------------- ");
      theGraph.dfs();            
      System.out.println();
      System.out.print("recursive dfs visits:----------------------- ");
      theGraph.recursive_dfs(0);
      
      
      }  // end main()
   }  // end class DFSApp
////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////

