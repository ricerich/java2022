package ex05.p05_06_07_08;

public class ColorPoint extends Point{

	private String color;
	
	public ColorPoint() {
		this(0,0);		
	}
	
	public ColorPoint(int x,int y) {
		super(x,y);
		color = "BLACK";
		
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}

	public void setXY(int x, int y) {
//		this.x = x;
//		this.y = y;
		move(x,y);
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString()
	{
		String str = color + "색 ("+getX()+","+getY()+")의 점";
		return str;
	}

}
