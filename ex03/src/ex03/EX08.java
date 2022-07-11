package ex03;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) 
	{
		//1.배열의 갯수를 입력 받는다.
		//2.배열을 만든다. 입력 크기로
		
		Scanner sc = new Scanner(System.in);
		System.out.print("갯수를 입력해주세요>>>");
		int size = sc.nextInt();
		
		int arr1[];
		
		if(size <= 0 || size > 100)
		{
			System.out.println("0~100 사이의 수를 입력해주세요");
			sc.close();
			return;
		}
		else
		{
			arr1 = new int[size];
		}
		
		for(int i=0; i <arr1.length; i++)
		{
			int rand1 = (int)(Math.random()*100+1);
			//중복체크			
			for(int j=0; j<i; j++)
			{
				if(arr1[j] == rand1)
				{
					i--;
					break;
				}
				
				arr1[i] = rand1;
			}
		}
		
		for(int i=0; i<arr1.length; i++)
		{
			if(i%10 ==0)
				System.out.println();

			System.out.print(arr1[i] + " ");
		}
		
		sc.close();
	}
}
