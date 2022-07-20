package ex05.p13_14;

public class Oval implements Shape {
	
	private int width, height;

	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width+"x"+height+"에 내접하는 타원 입니다!");

	}

	@Override
	public double getArea() {
		return (width/2)*(height/2)*PI;
	}

}
