package ex08.ch05_queue_generic;

// 연결 리스트 클래스 LinkedList<E> 상속받기
public class GenericQueue<E> extends LinkedList<E> implements QueueInterface<E> {
	public GenericQueue() {
		super();
	}

	public void enqueue(E newItem) {
		append(newItem);
	}

	public E dequeue() {
		return remove(0);
	}

	public E front() {
		return get(0);
	}

	public void dequeueAll() {
		clear();
	}
	
} 