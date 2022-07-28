package ex08.ch02_queue_array_circular;

public class Basic {

	public static void main(String[] args) {
		int queueSize = 4;
		char deletedItem;
		ArrayCQueue cQ = new ArrayCQueue(queueSize);
		
		cQ.enQueue('A');
		cQ.printQueue();
		
		cQ.enQueue('B');
		cQ.printQueue();
		
		deletedItem = cQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		cQ.printQueue();
		
		cQ.enQueue('C');
		cQ.printQueue();
		
		cQ.enQueue('D');
		cQ.printQueue();
		
		cQ.enQueue('E');
		cQ.printQueue();
		
		deletedItem = cQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		cQ.printQueue();
		
		cQ.enQueue('Z');
		cQ.printQueue();

	}

}
