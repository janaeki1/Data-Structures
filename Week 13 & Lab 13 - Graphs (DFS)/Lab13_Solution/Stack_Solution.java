package Lab13_Solution;


/*
 * class: Stack
 * csc 2720, Spring 2017
 */

class Stack
{
	private final int SIZE = 50;
	private int[] st;
	private int top;
//constructor
	public Stack()           
	{
		st = new int[SIZE];    // make array
		top = -1;
	}
// put item on stack
	public void push(int j)   
   { st[++top] = j; }
//take item off stack
	public int pop()          
   { return st[top--]; }
//peek at top of stack
   public int peek()         
   { return st[top]; }
//true if nothing on stack
public boolean isEmpty()  
   { return (top == -1); }

}  
// end class Stack
