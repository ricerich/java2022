package ex03;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳을 1개만 입력해주세요>>");
		String str1 = sc.next();
		
		//예외처리1 - 1글자가 아니면, 종료
		if(str1.length() != 1)
		{
			System.out.println("알파벳은 1개만 입력하셔야 합니다!");
			sc.close();
			return;
		}
		
		//예외처리2 - 소문자가 아니면, 종료
		char ch1 = str1.charAt(0);
		if(ch1<'a' || ch1>'z')
		{
			System.out.println("소문자만 입력하셔야 합니다!");
			sc.close();
			return;
		}
		
		for(char i=ch1; i>='a'; i--)
		{
			for(char j='a'; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}










