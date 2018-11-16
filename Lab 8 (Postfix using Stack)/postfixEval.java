import java.util.Stack;
import java.util.Scanner;

// Using Stack class to evaluate a postfix expression 

public class postfixEval {

	public static void main(String[] args) {
		
		String exp1 = "6 8 2 / 1 - *";
		String exp2 = "8 5 * 7 4 2 + * +";
		String exp3 = "2 3 + 4 5 * +";
		System.out.println(postfixEvaluate(exp1));
		System.out.println(postfixEvaluate(exp2));
		System.out.println(postfixEvaluate(exp3));
		
	}

	// Evaluates a postfix expression and returns the result in the stack
	public static int postfixEvaluate(String s){
	    Stack<Integer> stack = new Stack<Integer>();
	    Scanner scan = new Scanner(s);
	    
	    // Pushes all operands from String object into stack
	    while (scan.hasNext()) {
	        if (scan.hasNextInt()) {
	            stack.push(scan.nextInt());
	            continue;
	        }
	        
	        String operation = scan.next();
	        int b = stack.pop(); // second operand will pop first
	        int a = stack.pop(); // first operand will pop AFTER second
	        
	        if(operation.equals("+")){
	        	int sum = a + b;
				stack.push(sum);
	        }
	        else if (operation.equals("-")){
	        	int difference = a - b;
				stack.push(difference);
	        }
	        else if(operation.equals("*")){
				int product = a * b;
				stack.push(product);
			}
	        else if(operation.equals("/")){
				int quotient = a / b;
				stack.push(quotient);
			}
	    }
	    int result = stack.peek();
	    return result;
	}

}
