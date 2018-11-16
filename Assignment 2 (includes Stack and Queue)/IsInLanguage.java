import java.util.Stack;

/* This program uses Stack to test whether a string is in the language:
 * L={w$w’: w is a string of characters other than $, w’=reverse(w)} */

public class IsInLanguage {

	public static void main(String[] args) {

		System.out.println(testL("test$test"));
		System.out.println(testL("test$tset"));

	}
	
	// Tests if given string is in the language
	public static boolean testL(String s){
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		char w = s.charAt(i);
		
		// Push characters from string in stack until "$"
		while(w != '$'){
			stack.push(w);
			i++;
			w = s.charAt(i);
		}
		i++; // Sets index equal to character right after "$"
		while(i < s.length()){
			if (stack.isEmpty()){
				return false; // Returns false if no characters before "$"
			}
			else{
				char reverseW = s.charAt(i);
				if(stack.pop() == reverseW){
					i++; // Increments index if character after "$" equals character on top of stack
				}
				else{
					return false;
				}
			}
			
		}
		if(stack.isEmpty()){
			return true; // Returns true if every character after "$" equals the top of the stack
		}
		else{
			return false;
		}
	}

}
