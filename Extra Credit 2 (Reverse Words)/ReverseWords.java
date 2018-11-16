
public class ReverseWords {

	public static void main(String[] args) {

		System.out.println(reverseWords("The sky looks blue"));

	}
	
	public static String reverseWords(String s) {
		if(s.length() == 0){
			return null;
		}
		
		String reverse = "";
		String string[] = s.split(" ");
		
		for(int i = string.length-1; i >= 0; i--){
			reverse += string[i] + " ";
		}
		
		return reverse;
	}
	
}
