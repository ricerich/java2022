package ex05.p11;

public abstract class Calc 
{
	protected int x;
	protected int y;
	
	void setValue(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public abstract int calculator();
	
}
