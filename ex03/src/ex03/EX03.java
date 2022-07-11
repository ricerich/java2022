package ex03;

import java.util.Scanner;

public class EX03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력해주세요>>>");
		int n = sc.nextInt();
		
		//예외처리
		if(n<=0)
		{
			System.out.println("0보다 큰수를 입력해주세요!");
			sc.close();
			return;
		}
		
		for(int i=n; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
