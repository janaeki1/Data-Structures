// Tests the created Queue
public class MyQueue_Test {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		System.out.println(queue.pop());
		queue.push(4);
		queue.push(5);

	}

}
