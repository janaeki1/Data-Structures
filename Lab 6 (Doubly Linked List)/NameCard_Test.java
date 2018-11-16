
public class NameCard_Test {

	public static void main(String[] args) {
		
		DoublyNameCardList myList = new DoublyNameCardList(null, null, 0);
		NameCard nick = new NameCard("Nick",10,"GSU");
		NameCard matt = new NameCard("Matt",21,"3M");
		NameCard marcus = new NameCard("Marcus",32,"Dell");
		NameCard lucas = new NameCard("Lucas",43,"HP");
		NameCard johnathon = new NameCard("Johnathon",54,"Microsoft");
		NameCard kevin = new NameCard("Kevin",65,"Water,INC");
		NameCard steve = new NameCard("Steve",76,"Loads of Codes");
		NameCard daniel = new NameCard("Daniel",87,"WebTech");
		myList.addEnd(nick);
		myList.addEnd(matt);
		myList.addEnd(marcus);
		myList.addEnd(lucas);
		myList.addEnd(johnathon);
		
		System.out.println("List of name cards:");
		System.out.println(myList.toString() + "\n");
		
		System.out.println("List of name cards in reverse order:");
		System.out.println(myList.reverseString() + "\n");
		
		System.out.println("Adds card at the end:");
		myList.addEnd(steve);
		System.out.println(myList.toString() + "\n");
		
		System.out.println("Adds card at the beginning:");
		myList.addHead(kevin);
		System.out.println(myList.toString() + "\n");
		
		System.out.println("Adds card after given index:");
		myList.add(1, daniel);
		System.out.println(myList.toString() + "\n");
		
		System.out.println("Returns card at given index:");
		System.out.println(myList.get(2) + "\n");
		
		System.out.println("Removes card at given index:");
		myList.delete(1);
		System.out.println(myList.toString() + "\n");
		
		System.out.println("Removes the first card:");
		myList.deleteHead();
		System.out.println(myList.toString() + "\n");
		
		System.out.println("Removes the last card:");
		myList.deleteTail();
		System.out.println(myList.toString() + "\n");

		System.out.println("Checks if card exists in list:");
		System.out.println(myList.exist(marcus));
		
	}

}
