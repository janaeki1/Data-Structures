package Assignment3_Solution;

/*
 * Csc 2720
 */


import java.util.LinkedList;
import java.util.Queue;


public class AdjMatGraph {
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; // list of vertices
	private int adjMatrix[][];      // adjacency matrix
	private int nVerts;          // current number of vertices

	private LinkedList<Integer> queue;
	 
    public AdjMatGraph()
    {
    	vertexList = new Vertex[MAX_VERTS];
        // adjacency matrix
    	adjMatrix = new int[MAX_VERTS][MAX_VERTS];
    	nVerts = 0;
    	for(int y=0; y<MAX_VERTS; y++)      // set adjacency
    		for(int x=0; x<MAX_VERTS; x++)   //    matrix to 0
    			adjMatrix[x][y] = 0;
        queue = new LinkedList<Integer>();
    }
 
    
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
       }
    //display vertax
    public void displayVertex(int v)
       {
       System.out.print(vertexList[v].data);
       }
    
    
    
    public void bfs(){
    //	System.out.println("the total number of node is "+nVerts);
        int first=1;
    	int number_of_nodes = nVerts;
 
        int[] visited = new int[number_of_nodes];
        int[] queued=new int[number_of_nodes]; 
       int i=0, element;
 
        visited[first] = 1;
        queued[first] =1;
        queue.add(first);
        //queue.add(first);
        
 
        while (!queue.isEmpty())
        {
            i = queue.remove();
            
           System.out.print(i + "\t");
            visited[i] = 1;
            queued[i] =1;
            //while (i <= number_of_nodes)
            	 int j=0;
            	 while(j<number_of_nodes){
            		// System.out.println(j+"-- "+i);
            		 if (adjMatrix[i][j] == 1 && visited[j] == 0 && queued[j] ==0){
            			 queue.add(j);
            			 queued[j] =1;
            			 
            			 
            		
            	}	
            		 j++;
            	}	
                
          
                
                
            }
        
    }

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
}



