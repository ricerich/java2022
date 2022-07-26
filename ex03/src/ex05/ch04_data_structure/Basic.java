package ex05.ch04_data_structure;

public class Basic 
{
	public static void main(String args[]) 
	{
		float a[] = new float[] { 4, 3, 5, 0 };
		float b[] = new float[] { 3, 1, 0, 2, 1 };

		Polynomial a1 = new Polynomial(3, a);
		Polynomial b1 = new Polynomial(4, b);
		
		OperatePoly optPoly = new OperatePoly();
		
		Polynomial c1 = optPoly.addPoly(a1, b1);
		
		System.out.printf("A(x)=");
		a1.printPoly();
		
		System.out.printf("B(x)=");
		b1.printPoly();
		
		System.out.printf("C(x)=");
		c1.printPoly();
	}
}



