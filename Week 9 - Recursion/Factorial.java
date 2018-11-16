// This program evaluates factorial

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Calculates the factorial of the non-negative integer n
	public static int fact(int n){
		if(n == 0){
			return 1;
		}
		else{
			return n * fact(n-1); //n*(n-1)!
		}
	}

}
