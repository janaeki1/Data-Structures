// Tests the created Stack
public class MyStack_Test {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack(); // Capacity of 10 Character objects
		stack.push(new Character('1'));
		
		System.out.println("Elements in the stack are (top->bottom): " );
		stack.stString();
		
		stack.push(new Character('2'));
		System.out.println("Element 2 is pushed to Stack!");
		System.out.println("Elements in the stack are (top->bottom): ");
		stack.stString();
		
		stack.push(new Character('3'));
		System.out.println("Element 3 is pushed to Stack!");
		System.out.println("Elements in the stack are (top->bottom): ");
		stack.stString();
		
		stack.push(new Character('4'));
		System.out.println("Element 4 is pushed to Stack!");
		System.out.println("Elements in the stack are (top->bottom): ");
		stack.stString();
		
		stack.push(new Character('5'));
		System.out.println("Element 5 is pushed to Stack!");
		System.out.println("Elements in the stack are (top->bottom): ");
		stack.stString();
		
		stack.pop();
		System.out.println("Pop operation is done!");
		System.out.println("Element 5 is popped!");
		System.out.println("Elements in the stack are (top->bottom): ");
		stack.stString();
		
		System.out.println("Peek is: " + stack.peek());
		System.out.println("Elements in the stack are (top->bottom): ");
		stack.stString();
		
		System.out.println("Is the stack empty? " + stack.isEmpty());

	}

}
