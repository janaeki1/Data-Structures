// Object created with initialized variables using constructor and toString method
public class Address_Object {

	String street;
	String city;
	int zipcode;
	
	public Address_Object(String s, String c, int z) {
		this.street = s;
		this.city = c;
		this.zipcode = z;
	}
	
	public String toString() {
		return street + "\n" + city + " " + zipcode;
	}

}
