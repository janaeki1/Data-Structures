import java.util.*;
/*
 * This program implements a graph by adjacency list and has a recursive DFS method
 */

class AdjListGraph
{
private final int VERTEX_MAX = 20;
private Vert vertList[]; 
private int adjacencyMatrix[][]; 
private int vertNum;        
private Stack stack;

public AdjListGraph()      
   {
   vertList = new Vert[VERTEX_MAX];
                           
   adjacencyMatrix = new int[VERTEX_MAX][VERTEX_MAX];
   vertNum = 0;
   for(int i=0; i<VERTEX_MAX; i++)    
      for(int j=0; j<VERTEX_MAX; j++)  
         adjacencyMatrix[j][i] = 0;
   stack = new Stack();
   } 

public void addVertex(char lab)
   {
   vertList[vertNum++] = new Vert(lab);
   }

public void addEdge(int beg, int last)
   {
   adjacencyMatrix[beg][last] = 1;
   adjacencyMatrix[last][beg] = 1;
   }

public void display(int vertex)
   {
   System.out.print(vertList[vertex].letter);
   }

//DFS
public void dfs()  
{                              
vertList[0].visited = true;  
display(0);              
stack.push(0);                 

while( !stack.isEmpty() )      
   {

   int vertex = adjUnvisitVertex( (int) stack.peek() );
   if(vertex == -1)                   
      stack.pop();
   else                          
      {
      vertList[vertex].visited = true; 
      display(vertex);             
      stack.push(vertex);                
      }
   }  


for(int j=0; j<vertNum; j++)   
   vertList[j].visited = false;
}

public int adjUnvisitVertex(int vertex)
   {
   for(int i=0; i<vertNum; i++)
      if(adjacencyMatrix[vertex][i]==1 && vertList[i].visited==false)
         return i;
   return -1;
   } 

} 


class Vert
{
public char letter;        
public boolean visited;

public Vert(char l)  
   {
   letter = l;
   visited = false;
   }

} 

