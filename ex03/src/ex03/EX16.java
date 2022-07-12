package ex03;

import java.util.Scanner;

public class EX16 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위, 바위, 보 게임을 합니다 ");
		
		int a=0;
		String me = "";
		String com = "";
		
		//반복
		while(true)
		{
			//1.내가 내는 거
			System.out.print("가위 바위 보!>>");
			me = sc.nextLine();
			
			if(me.equals("그만"))
			{
				System.out.print("끝");
				break;
			}
			
			//2.컴이 내는 거
			//랜덤 -> 정수 -> 스트링에 매칭
			int rand1 = (int)(Math.random()*3);
			
//			switch(rand1)
//			{
//				case 0:
//					com = "가위"; 
//					break;
//				case 1:
//					com = "바위";
//					break;
//				case 2:
//					com = "보";
//					break;
//			}
			
			String str[] = { "가위", "바위", "보" }; // "가위", "바위", "보" 문자열을 가진 배열
			com = str[rand1];

			
			//둘이 낸거 출력
			System.out.print("사용자 = " + me + " , ");
			System.out.print("컴퓨터 = " + com +" , ");
			
			//3.나와 컴퓨터 비교
			if(me.equals("가위")){
				//컴퓨터
				if(com.equals("가위"))
					System.out.println("비겼습니다");
				else if(com.equals("바위"))
					System.out.println("내가 졌습니다");
				else if(com.equals("보"))
					System.out.println("내가 이겼습니다");
			}
			else if(me.equals("바위")){
				//컴퓨터
				if(com.equals("가위"))
					System.out.println("내가 이겼습니다");
				else if(com.equals("바위"))
					System.out.println("비겼습니다");
				else if(com.equals("보"))
					System.out.println("내가 졌습니다");
			}
			else if(me.equals("보")){
				//컴퓨터
				if(com.equals("가위"))
					System.out.println("내가 졌습니다");
				else if(com.equals("바위"))
					System.out.println("내가 이겼습니다");
				else if(com.equals("보"))
					System.out.println("비겼습니다");
			}
			else 
				System.out.println("잘못냈습니다");
			
		}
	}
}


