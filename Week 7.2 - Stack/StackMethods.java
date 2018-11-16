import java.util.Stack;

//Implementation of Stack methods (subclass of Vector class)

public class StackMethods {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("fly");
		stack.push("worm");
		stack.push("butterfly");
		
		// Peek at the top of the stack
		String peekResult = stack.peek();
		System.out.println("Peek at top of stack: " + peekResult);
		
		/* Searches for an object's position in the stack 
		 * (Returns "-1" if object is not found) */
		int fly = stack.search("fly");
		System.out.println("Position of \"fly\" in stack: " + fly);
		
		// Pop the top of the stack and display the result
		String popResult = stack.pop();
		System.out.println("Pop at top of stack: " + popResult);
		
		// Pop and display again
		popResult = stack.pop();
		System.out.println("Pop at top of stack: " + popResult);
		
		// Test if stack is empty
		Boolean emptyStack = stack.empty();
		System.out.println("Is the stack empty? " + emptyStack);

	}

}
