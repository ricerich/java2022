package ex04.p12;

import java.util.Scanner;

public class ConcertSystem 
{
	Scanner sc;
	
	Group groupArr[];
	
	public ConcertSystem()
	{
		sc = new Scanner(System.in);
		
		groupArr = new Group[3];
		groupArr[0] = new Group('S', 10);
		groupArr[1] = new Group('A', 10);
		groupArr[2] = new Group('B', 10);
	}
	//1.예약, 2.조회, 3.취소, 4.끝내기
	void run()
	{
		int choice=0;
		while(choice != 4)
		{
			System.out.print("1.예약, 2.조회, 3.취소, 4.끝내기>>");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					reserve();
					break;
				case 2:
					printAll();
					break;
				case 3:
					cancel();
					break;
				case 4:
					System.out.println("종료합니다!");
					break;
				default :
					System.out.println("1~4위 숫자를 입력해주세요");
			}
		}

		
	}
	
	private void reserve() 
	{
		System.out.print("좌석 구분 S(1), A(2), B(3)>>");
		int type = sc.nextInt();
		
//		Group g1 = new Group('S', 10);
//		g1.reserve();
		
//		int index = type-1;
		groupArr[type-1].reserve();//0:S, 1:A, 2:B
		
	}
	
	private void printAll() {
//		for(int i=0; i<3;++i)
		for(int i=0; i<groupArr.length;++i)
			groupArr[i].printAll();
	}
	
	private void cancel() {
		// TODO Auto-generated method stub
		
	}
}
