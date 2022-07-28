package ex08.ch05_queue_generic;

public interface QueueInterface<E> {
	public void enqueue(E x);
	public E dequeue();
	public E front();
	public boolean isEmpty();
	public void dequeueAll();
}  // 코드 7-1
