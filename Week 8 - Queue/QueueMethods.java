import java.util.Queue;
import java.util.LinkedList;

// Implementation of Queue methods

public class QueueMethods {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println("Remove front: " + queue.remove());
		System.out.println("Print front: " + queue.peek());
		System.out.println("Remove front: " + queue.poll());
		System.out.println("Print front: " + queue.element());
		System.out.println("What is the size? " + queue.size());
		System.out.println("Is object added? " + queue.offer(7)); // also adds an object
		System.out.println("Now, what is the size? " + queue.size());
		System.out.println("Is the queue empty? " + queue.isEmpty());

	}

}
