/* Checks to see if user input is a legitimate Java identifier, and then 
 * prints the result*/
import java.util.Scanner;

public class LegitJavaIdentifier {

	public static void main(String[] args) {
		
		System.out.println("Please type in an identifier: ");
		Scanner scan = new Scanner(System.in);
		String identifier = scan.nextLine();
		legitimateJavaIdentifier(identifier);

	}
	
	/* Checks to see if the user input is a legitimate Java identifier by checking
	 * that it's not a keyword.
	 * It also checks to see if it starts with an upper or lower case letter, a 
	 * currency character ("$"), or an underscore ("_")*/
	public static boolean legitimateJavaIdentifier(String s) {
		Boolean result = true;
		char a = s.charAt(0);
		if (a >= 65 && a <= 90 || a >= 97 && a <= 122 || a == 36 || a == 95){
			for (int i = 1; i <= s.length(); i++) {
				a = s.charAt(i);
				if (a >= 65 && a <= 90 || a >= 97 && a <= 122 || a == 36 || a == 95 || a>= 48 && a <= 57) {
					System.out.println("This is a valid Java identifier.");
					break;
				}
			}
		}
		else {
			result = false;
			System.out.println("This is not a valid Java identifier.");
		}
		return result;
	}

}