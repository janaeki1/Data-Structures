// Simple ArrayList Implementation

import java.util.Arrays;

public class MyArrayList {
	
	private Object[] data; // hidden array for ArrayList
	private int count = 0; // keeps track of how many elements are in the array
	private int FIXED_SIZE = 10;
	
	public MyArrayList(){
		data = new Object[this.FIXED_SIZE];
	}
	
	public MyArrayList(int c){
		data = new Object[c];
	}
	
	// Returns the object from a specified index
	public Object get(int index){
		if(index < count){ // if "count-1" is the largest index in this array list
			return data[index];
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	// Resizes the array
	public void reSizeArray(){
		data = Arrays.copyOf(data, data.length *2);
	}
	
	// Adds a new object to the array list
	public void add(Object obj){
		if(data.length - count < 1) { // if the hidden array is full
			this.reSizeArray();
		}
		data[count++] = obj;
	}
	
	// Removes the object from the list at a specified index
	public Object remove(int index){
		if(index < count){
			// step 1: remove the element with the given index
			Object obj = data[index];
			int temp = index;
			data[index] = null;
			// step 2: move the elements after the index to the left
			while(temp < count){
				data[temp] = data[temp + 1];
				data[temp + 1] = null;
				temp++;
			}
			count--;
			return obj;
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	// Returns the number of elements in the list
	public int size(){
		return count;
	}
			
}
