package ex05.p11;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		char op1 = sc.next().charAt(0);
		
		Calc calc = null;
		
		switch(op1)
		{
			case '+':
				calc = new Add();
				break;
			case '-':
				calc = new Sub();
				break;
			case '*':
				calc = new Mul();
				break;
			case '/':
				calc = new Div();
				break;		
		}
		
		calc.setValue(a, b);
		System.out.println(calc.calculator());
		
		sc.close();
		
	}
}
