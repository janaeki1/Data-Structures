//Designs a user exception which extends from the Exception class

class MyException extends Exception {
	
	String message;
	
	//constructor of this class
	MyException(int age) {
		message = "Age can not be positive!";
	}
	
	public String toString() {
		return message;
	}
	
}
