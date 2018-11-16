// Array implementation of a created Stack class

public class MyStack {
	
	private int top = -1;
	private Character[] stack;
	private int capacity = 10;
	
	// Initializes the stack
	public MyStack(){
		stack = new Character[this.capacity];
	}
	
	// Deletes the element on top of the stack
	public boolean pop(){
		if(top > -1){
			stack[top] = 0;
			top--;
			return true;
		}
		else{
			return false;
		}
	}
	
	// Pushes the element onto the stack
	public Character push(Character c){
		if(top < capacity){
			top++;
			stack[top] = c;
			return c;
		}
		else{
			System.out.println("Stack is overcapacity!");
			return null;
		}
		
	}
	
	// Returns the element on top of the stack
	public Character peek(){
		return stack[top];
	}
	
	// Checks whether the stack is empty
	public boolean isEmpty(){
		if (top == -1){
			return true;
		}
		else{
			return false;
		}
	}
	
	// Displays the elements on the stack (top->bottom)
	public void stString(){
		for(int i = top; i > -1; i--){
			System.out.print(stack[i] + " ");
		}
		System.out.println();
		System.out.println();
		
	}

}
