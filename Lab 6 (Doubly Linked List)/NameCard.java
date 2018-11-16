//Node of a doubly linked list
public class NameCard {
	
	private NameCard prev;
	private NameCard next;
	private String name;
	private int age;
	private String company;	
	
	// Creates the NameCard node with the given name, age, company
	NameCard(String name, int age, String company, NameCard prev, NameCard next){
		this.name = name;
		this.age = age;
		this.company = company;
		this.prev = prev;
		this.next = next;		
	}
	
	// Creates the NameCard node with the given name, age, company
	NameCard(String name, int age, String company){
		this.name = name;
		this.age = age;
		this.company = company;
		prev = null;
		next = null;
	}
	
	// Returns the name
	public String getName(){
		return name;
	}
	
	// Returns the age
	public int getAge(){
		return age;
	}
	
	// Returns the company name
	public String getComp(){
		return company;
	}
	
	// Returns the previous node
	public NameCard getPrev(){
		return prev;
	}
		
	// Returns the next node
	public NameCard getNext(){
		return next;
	}
	
	// Sets the new name
	public void setName(String newName){
		name = newName;
	}
	
	// Sets the new age
	public void setAge(int newAge){
		age = newAge;
	}
	
	// Sets the new company name
	public void setComp(String newCompany){
		company = newCompany;
	}
	
	// Sets the previous node
	public void setPrev(NameCard newPrev){
		prev = newPrev;
	}
	
	// Sets the next node
	public void setNext(NameCard newNext){
		next = newNext;
	}
	
	// Prints the information of a NameCard node
	public String toString() {
		return "[" + name + ", " + age + ", " + company + "]";
	}

}
