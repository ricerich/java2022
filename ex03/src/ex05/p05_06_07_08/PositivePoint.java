package ex05.p05_06_07_08;

public class PositivePoint extends Point{

	public PositivePoint() {
		super(0,0);
	}
	
	public PositivePoint(int x, int y) {
		super(x,y); //-10, -10
		
		if(x<0 || y<0)
			move(0, 0);
	}
	
	protected void move(int x, int y)
	{
		if(x>=0 && y>=0)
			super.move(x,y);
	}	
	
	public String toString()
	{
		String str = "("+getX()+","+getY()+")의 점";
		return str;
	}



}
