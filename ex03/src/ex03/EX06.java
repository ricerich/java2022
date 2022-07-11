package ex03;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) 
	{
		//1.money 갱신 (현재돈)
		//2.result 갱신 (각화폐개수)
		
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력해주세요>>>");
		int money = sc.nextInt();
		int result = 0;
		
		for(int i=0; i<unit.length;i++)
		{
			result = money / unit[i];
			money  = money % unit[i];
			
			if(result > 0)
				System.out.println(unit[i]+"원 짜리 " + result + "개 입니다");
			
		}
		
		
		sc.close();
	}

}
