/* Checks to see if user input is a palindrome (removing case-sensitivity), 
 * and then prints the result */

import java.util.Scanner;
	
public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Please type in a word: ");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		word = word.toLowerCase();
		System.out.println("Result: " + checkPalindrome(word));
		

	}
	
	// Checks to see if user input is a palindrome
	public static boolean checkPalindrome(String s){
		for (int i = 0; i <= s.length()/2; i++) {	
		    if (s.charAt(i) != s.charAt(s.length()-i-1)){
		         return false;
		    }
		}
		return true;
	}
	
}
