package ex04.p10;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한영 단어 검색 프로그램입니다!");
		
		while(true)
		{
			System.out.print("한글 단어>>");
			String kor1 = sc.next();
			
			if(kor1.equals("그만"))
			{
				System.out.println("종료합니다");
				break;
			}
//			Dictionary dic1 = new Dictionary();
//			dic1.kor2Eng(kor1);
			
			String eng1 = Dictionary.kor2Eng(kor1);
			
			if(eng1 == null)
				System.out.println(kor1+"는 사전에 없습니다!");
			else
				System.out.println(kor1+"는 " + eng1);
			
		}
		sc.close();
	}
}
