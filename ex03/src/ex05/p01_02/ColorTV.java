package ex05.p01_02;

public class ColorTV extends TV{
	
	//private int size;
	protected int color;

	public ColorTV(int size, int color) 
	{
		//this.size = size;
		super(size);
		this.color = color;
	}

	public void printProperty() 
	{
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
}
