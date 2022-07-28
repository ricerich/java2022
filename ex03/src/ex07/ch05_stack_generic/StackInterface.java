package ex07.ch05_stack_generic;

public interface StackInterface<E> {
	public void push(E newItem);
	public E pop();
	public E top();
	public boolean isEmpty();
	public void popAll();
} 