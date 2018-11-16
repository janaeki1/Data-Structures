// This program computes a term using the Fibonacci sequence

/* Assumption: A pair of rabbits give birth to another pair of rabbits every month, 
 * starting two months after birth*/

public class Rabbits {

	public static void main(String[] args) {
		
		System.out.println(rabbit(1));
		System.out.println(rabbit(2));
		System.out.println(rabbit(3));
		System.out.println(rabbit(4));
		System.out.println(rabbit(5));
		System.out.println(rabbit(6));
		System.out.println(rabbit(7));

	}
	
	// Calculates the number of rabbits born after given number of months
	public static int rabbit(int n){
		if(n <= 2){
			return 1;
		}
		else{
			return rabbit(n-1) + rabbit(n-2);
		}
	}

}
