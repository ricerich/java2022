package ex07.ch05_stack_generic;

public class GenericStack<E> extends LinkedList<E> implements StackInterface<E> 
{	
	public GenericStack() {
		super();
	}
 
	public void push(E newItem) {
 		add(0, newItem);
 	}
 
 	public E pop() {
 		if (!isEmpty()) {
 			return remove(0);
 		} else return null;
 	}
 		
 	public E top() {
 		return get(0);
 	}
 		
 	public void popAll() {
 		clear();
	}

	/////////////////////////////////////////////
	public void printAll() {
		super.printAll();
	}
} 
