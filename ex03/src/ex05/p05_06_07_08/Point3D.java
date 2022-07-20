package ex05.p05_06_07_08;

public class Point3D extends Point{

	private int z ;
	
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	private int getZ() {
		return this.z;
	}

	public void moveUp() {
		z++;
	}

	public void moveDown() {
		z--;
	}

	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	
	public String toString()
	{
		String str = "("+getX()+","+getY()+","+getZ()+")의 점";
		return str;
	}



}
