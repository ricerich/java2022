package ex05.p09;

public class StringStack implements Stack
{
	private int top;
	private int stackSize;
	private String itemArray[];

	public StringStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new String[this.stackSize];
	}

	@Override
	public int length() {
		return top+1;
	}

	@Override
	public int capacity() {
		return stackSize;
	}

	@Override
	public String pop() {
		if(top == -1) {
			System.out.println("Deleting fail! Array Stack is empty!!");
			return null;
		}
		else{ 
			String str1 = itemArray[top];
			top--;
			return str1;	
		}
	}

	@Override
	public boolean push(String val) {
		if(top == stackSize-1){
			System.out.println("Inserting fail! Array Stack is full!!");
			return false;
		}
		else{ 			
			itemArray[++top] = val;
			System.out.println("Inserted Item : " + val);
			return true;
		}
	}

}
