// Designs a class which is used to test the age

public class Age {

	//First method: Decides whether the age is reasonable
	public void intage(int n) throws MyException {
		if(n < 0 || n > 120) {
			MyException e = new MyException(n);
			throw e;
		}
		if(n >= 0) {
			System.out.println("123");
		}
	}
	
	//Second method: Main function, entrance of this program
	public static void main(String[] args) {

		int a = -5;
		//try-catch
		try {
			Age age = new Age();
			//trigger exception
			age.intage(a);
			System.out.println("code after exception happens");
		}
		catch(MyException ex) {
			System.out.println(ex.toString());
		}
		finally {
			System.out.println("The codes in finally will be performed");
		}
 
	}

}
