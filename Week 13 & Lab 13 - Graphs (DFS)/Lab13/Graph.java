package Lab13;


import java.util.ArrayList;

/*
 * class: Graph
 * csc 2720, Spring 2017
 */

class Graph
{
private final int MAX_VERTS = 20;
private Vertex vertexList[]; // list of vertices
private int adjMatrix[][];      // adjacency matrix
private int nVerts;          // current number of vertices
private Stack theStack;
private ArrayList<ArrayList<Integer>> adjVerts = new ArrayList<ArrayList<Integer>>(); // list of adjacent vertices
//------------------------------------------------------------
public Graph()               // constructor
   {
   vertexList = new Vertex[MAX_VERTS];
                                       // adjacency matrix
   adjMatrix = new int[MAX_VERTS][MAX_VERTS];
   nVerts = 0;
   for(int y=0; y<MAX_VERTS; y++)      // set adjacency
      for(int x=0; x<MAX_VERTS; x++)   //    matrix to 0
         adjMatrix[x][y] = 0;
   theStack = new Stack();
   }  // end constructor
//add vertex
public void addVertex(char lab)
   {
	vertexList[nVerts++] = new Vertex(lab);
   }
//add edge
public void addEdge(int start, int end)
   {
   adjMatrix[start][end] = 1;
   adjMatrix[end][start] = 1;
   
   // Create adjacent list for each vertex
   for(int i=0; i < nVerts; i++){
	   ArrayList<Integer> list = new ArrayList<Integer>();
       adjVerts.add(list);
   }
   adjVerts.get(start).add(end);
   adjVerts.get(end).add(start);
   }
//display vertex
public void displayVertex(int v)
   {
   System.out.print(vertexList[v].data);
   }
/*
 * depth-first search: Stack_based
 * 
 */
public void dfs()  
   { // begin at vertex 0      
	int vertex = 0;
    theStack.push(vertex);
    while(!theStack.isEmpty()){
        int a = theStack.pop();
        if(!vertexList[a].isVisited){ 
        	vertexList[a].isVisited = true;
            System.out.print(vertexList[a].data + " ");
           
            // Auxiliary stack to visit adjacent vertices in list
            Stack auxiliary = new Stack();
            for(int b : adjVerts.get(a)){
                if(!vertexList[b].isVisited){
                    auxiliary.push(b);
                }
            }
            while(!auxiliary.isEmpty()){
            	int aux = auxiliary.pop();
                theStack.push(aux);
            }
        }
    }
   }  // end dfs

/*
 * depth-first search: Recursive
 */
public void recursive_dfs(int start)
{
	vertexList[start].isVisited = true;
    System.out.print(vertexList[start].data + " ");
    for(int w : adjVerts.get(start)){
        if(!vertexList[w].isVisited){
        	recursive_dfs(w);
        }
    }
	
} // end depthFirstSearch





}  // end class Graph
////////////////////////////////////////////////////////////////

class Vertex
{
public char data;        // data 
public boolean isVisited;

public Vertex(char d)   // constructor
   {
   data = d;
   isVisited = false;
   }


}  // end class Vertex
