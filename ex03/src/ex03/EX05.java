package ex03;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) 
	{
		//1.배열을 만든다. 10개짜
		//2.배열에 값을 입력받는다. Scanner로, 반복문을 통해서
		//3.배열을 사용한다. 예:3의 배수 걸러내기
		
		int arr1[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 10개 입력해주세요>>>");

//		for(int i=0; i<arr1.length;i++)
//		{
////			int n = sc.nextInt();
////			arr1[i]=n;
//			arr1[i] = sc.nextInt();
//		}
		
		for(int i=0; i<arr1.length;i++)
			arr1[i] = sc.nextInt();
		
		for(int i=0; i<arr1.length;i++)
		{
			if((arr1[i]%3)==0)
				System.out.print(arr1[i] + " ");
		}
		
		sc.close();
	}
}
