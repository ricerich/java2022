package ex05.p13_14;

public class Circle implements Shape {

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원 입니다!");
	}

	@Override
	public double getArea() {
		// 원의 넓이 = 반지름 * 반지름 * 3.14(PI)
		return radius * radius * PI;
	}

}
