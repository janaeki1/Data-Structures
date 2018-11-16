// Counts the number of times "x" appears in a file
import java.io.File;
import java.util.Scanner;

public class numOfOccurrences_IO {
	
	public static void main(String[] args) {
		
		int count = 0;
		Scanner scan = null;
		
		try {
		File input = new File("input.txt"); //First create file and insert directory path
		scan =  new Scanner(input);
		}
		catch(Exception e) {
			System.out.println("Cannot read the file!");
		}
		
		while(scan.hasNextLine()) { // Checks whether the file is finished
			String temp = scan.nextLine(); // Reads the file the line by line
			for(int i = 0; i < temp.length(); i++) { // Check each character in the line
				if(temp.charAt(i) == 'x') {
					count++;
				}
			}
		}
		// Outputs the result
		System.out.println("There are " + count + " occurences of \"x\".");
		
	}
	
}