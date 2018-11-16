/* This program uses recursion to test if a string input belongs to the following defined
 * language: L = {S: S is in the form of AnB4n, for some n >= 0} where n and 4n are powers
 * (Thus, 1 "A" for every 4 "B's") */

public class StringInLanguage {

	public static void main(String[] args) {
		
		String str = "AABBBBBBBB";
		if(isIn(str)){
			System.out.println("The string " + str + " is in the language.");
		}
		else{
			System.out.println("The string " + str + " is NOT in the language.");
		}

	}
	
	// Uses recursion to check to see if input string is in the language
	public static boolean isIn(String w){ 
		// returns true if string is empty (base case)
		if(w.length()==0){
			return true;
		}
		// catches loop error for certain examples
		else if(w.equals("A") || w.equals("AA") || w.equals("AAA") || w.equals("AB") || w.equals("ABB")){
			return false;
		}
		/* if there is one "A" in the beginning of string and three "B's" at the end of
		 * string, check the substring from index = 1 to index = length()-3 */
		else if(w.charAt(0) == 'A' &&  w.substring(w.length()-4,w.length()).equals("BBBB")){
			return isIn(w.substring(1,w.length()-4));
		}
		else
			return false;
	}

}
