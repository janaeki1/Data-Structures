// An empty double linked list
public class DoublyNameCardList {
	
	private NameCard head;
	private NameCard tail;
	private int count;
	
	// Initializes the list
	public DoublyNameCardList(NameCard head, NameCard tail, int count){
		head = null;
		tail = null;
		count = 0;
	}
	
	// Places name card at the end of the list
	public void addEnd(NameCard x){
		x = new NameCard(x.getName(), x.getAge(), x.getComp());
		NameCard newCard = x;
		if(count == 0){
			head = newCard;
			tail = newCard;
		}
		else{
			newCard.setPrev(tail);
			tail.setNext(newCard);
			tail = newCard;
		}
		count++;
	}
	
	// Places name card at the beginning of the list
	public void addHead(NameCard x){
		x = new NameCard(x.getName(), x.getAge(), x.getComp());
		NameCard newCard = x;
		if(count == 0){
			head = newCard;
			tail = newCard;
		}
		else{
			newCard.setNext(head);
			head.setPrev(newCard);
			head = newCard;
		}
		count++;
	}

	// Places name card after given location
	public void add(int index, NameCard x){
		x = new NameCard(x.getName(), x.getAge(), x.getComp());
		NameCard newCard  = x;
		if(index<=0 || index >= count){
			return;
		// If you would like to insert element at the head, use this: "if(index == 0)"
		}		
		/* Starts at the head node and crawls to the specified index or 
		 * the last element in the list, whichever comes first */
		NameCard temp = head;
		for(int i = 0; i < index && temp.getNext() != null; i++){
			temp= temp.getNext();
		}
		// Sets the new node's next-node reference to this node's next-node reference
		newCard.setNext(temp.getNext());
		// Sets this node's next-node reference to the new node
		temp.setNext(newCard);
		count++; // Increments the count for number of elements
	}
	
	// Retrieves a name card from a given location
	public NameCard get(int index){
		if(index < 0 || index >= count){
			System.out.println("The index is out of bounds of the list!");
			return null;
		}
		NameCard current = head;
		for(int i = 0; i < index; i++){
			current = current.getNext();
		}
		NameCard x = new NameCard(current.getName(), current.getAge(), current.getComp());
		return x;
	}
	
	// Returns the number of elements in list
	public int size(){
		return count;
	}
	
	// Removes a name card at the given index
	public boolean delete(int index){
		if(index < 0 || index >= size()){
			return false;
		}
		NameCard current = head;
		for(int i = 0; i < index-1; i++){
			if(current.getNext() == null){
				return false;
			}
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		count--;
		return true;
	}
	
	// Tests if given name card is in the list
	public boolean exist(NameCard n){
		n = new NameCard(n.getName(), n.getAge(), n.getComp());
		NameCard current = head;
		for(int i = 0; i < count; i++){
			if(n.equals(current)){
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
	
	// Prints the information of a NameCard
	public String toString(){
		if(head == null){
    		System.out.println("No name cards found in this list!");
    	}
		NameCard current = head;
		String list = "";
		while(current != null){
			list += "[" + current.getName() + ", " + current.getAge() + ", " + current.getComp() + "]";
			current = current.getNext();
		}
		return list;
	}
	
	public String reverseString(){
		NameCard current = tail;
		String list = "";
		while(current != head){
		list += "[" + current.getName() + ", " + current.getAge() + ", " + current.getComp() + "]";
		current = current.getPrev();
		}
		return list;
	}
	
	// Deletes the first name card of the list
    public void deleteHead(){
        if(count == 0){
            System.out.println("List is Empty");
        }
        else{
            head = head.getNext();
            count--;
        }
    }
    
 // Deletes the last name card of the list
    public void deleteTail(){
        if(count == 0){
            System.out.println("List is Empty");
        }
        else if(count == 1){
            deleteHead();
        }
        else{
            tail = tail.getPrev();
            tail.setNext(null);
            count--;
        }
    }
	
}
