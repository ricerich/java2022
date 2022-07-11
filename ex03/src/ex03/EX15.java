package ex03;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		
//		do {
//			
//			if()
//				break;
//		}
//		while(true);
		
		do {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
				break;
			}
			catch(Exception e)
			{
				System.out.println("실수를 입력하시면 안되요! 정수~!");
				scanner.nextLine();
				continue;
			}			
		}
		while(true);
		
		scanner.close();
	}

}
