import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

// This program tests whether or not a string is a palindrome using Stack and Queue

public class PalindromeWithStackAndQueue {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("level"));

	}
	
	// Tests if given string is a palindrome using Stack and Queue
	 public static boolean isPalindrome(String word){   
		 Stack<Character> stack = new Stack<Character>( );
		 Queue<Character> queue = new LinkedList<Character>( );
	     char character;
	     
	     // Pushes each letter in the stack and queue at the same time
	     int i = 0;
	     while(i < word.length( )){
	    	 character = word.charAt(i);
	    	 stack.push(character);
	    	 queue.add(character);
	    	 i++;
	     }
	     /* Returns false if last letter of string (popped from top of stack) 
	      * does not equal first letter of string (removed from front of queue)*/
	     while (!stack.isEmpty( )){
	    	 if (stack.pop( ) != queue.remove( )){
	    		 return false;
	         }
	     }
	     return true; 
	}

}
