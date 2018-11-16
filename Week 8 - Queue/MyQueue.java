// Simple Queue Implementation
public class MyQueue {
	
	private int[] object;
	private int front;
	private int rear;
	private int queueCapacity;
	
	public MyQueue(){
		queueCapacity = 3;
		object = new int[queueCapacity];
		front = -1;
		rear = -1;
	}

	public void resize(){
		int[] temp = object;
		queueCapacity = queueCapacity * 2;
		object = new int[queueCapacity];
		for(int i = 0; i <= rear; i++){
			object[i] = temp[i];
		}
	}
	
	public void push(int data){
		if(rear+1 >= queueCapacity){
			resize();
		}
		object[++rear] = data;
	}
	
	public Integer pop(){
		if(rear > front){
			return object[++front];
		}
		return null;
	}
	
	public boolean isEmpty(){
		return rear <= front;
	}

}
