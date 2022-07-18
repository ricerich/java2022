package ex04.p04;

public class Rectangle 
{
	private int x, y;
	private int width, height;
	
	public Rectangle(int x, int y, int width, int height) 
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public boolean contains(Rectangle r) {
		
		if(   (x < r.x) && (x+width > r.x+r.width)
		   && (y < r.y) && (y+height > r.y+r.height))
			return true;
		else
			return false;
	}
	
	public int square()
	{
		return width * height;
	}
	
	public void show() 
	{
		System.out.print("("+x+","+y+")에서 ");
		System.out.println("크기가 "+ width +"x"+height+"인 사각형");
		System.out.println();
	}



	

	
}





