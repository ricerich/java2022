package ex05.p05_06_07_08;

public class Basic {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");

		//6번
//		ColorPoint zeroPoint = new ColorPoint(); // BLACK 색에 (0,0) 위치의 점
//		System.out.println(zeroPoint.toString() + "입니다.");
//		
//		ColorPoint cp = new ColorPoint(10, 10);
//		cp.setXY(5, 5);
//		cp.setColor("RED");
//		System.out.println(cp.toString() + "입니다.");
		
		//7번
//		Point3D p = new Point3D(1,2,3); // 1, 2, 3은 각각 x, y, z축의 값.
//		System.out.println(p.toString() + "입니다.");
//
//		p.moveUp(); // z 축으로 위쪽 이동 
//		System.out.println(p.toString() + "입니다.");
//
//		p.moveDown(); // z 축으로 아래쪽 이동
//		p.move(10, 10); // x, y 축으로 이동
//		System.out.println(p.toString() + "입니다.");
//
//		p.move(100, 200, 300); // x, y, z 축으로 이동
//		System.out.println(p.toString() + "입니다.");

		//8번
//		PositivePoint p = new PositivePoint();
//		p.move(10, 10);
//		System.out.println(p.toString() + "입니다.");
//		
//		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
//		System.out.println(p.toString() + "입니다.");
//
//		PositivePoint p2 = new PositivePoint(-10, -10);
//		System.out.println(p2.toString() + "입니다.");
	}

}
