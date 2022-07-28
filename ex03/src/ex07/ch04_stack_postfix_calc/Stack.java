package ex07.ch04_stack_postfix_calc;

public interface Stack{
	boolean isEmpty();
	void push(int item);
	int pop();
	void delete();
	int peek();
}
