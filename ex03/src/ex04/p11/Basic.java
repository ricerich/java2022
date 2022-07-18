package ex04.p11;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		char op1 = sc.next().charAt(0);
		
		switch(op1)
		{
			case '+':
				Add add1 = new Add();
				add1.setValue(a, b);
				System.out.println(add1.calculate());
				
				break;
			case '-':
				Sub sub1 = new Sub();
				sub1.setValue(a, b);
				System.out.println(sub1.calculate());
				
				break;
			case '*':
				Mul mul1 = new Mul();
				mul1.setValue(a, b);
				System.out.println(mul1.calculate());
				break;
			case '/':
				Div div1 = new Div();
				div1.setValue(a, b);
				System.out.println(div1.calculate());
				break;
		
		}
		sc.close();
	}

}
