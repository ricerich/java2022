package ex05.p12;

import java.util.Scanner;

public class LinkedList 
{
	
	Scanner sc = new Scanner(System.in);

	//0.입력이든 삭제든 기능을 하는 메뉴
	void run()
	{
		System.out.println("그래픽 에디터를 실행합니다.");
		int choice = 0;
		
		int type = 0; //1:Line, 2:Rect 3:Circle
		int loc = 0; //삭제할 위치 //스캐너로 입력 받을 위치
		while(choice != 4)
		{
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4) >>");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 :
					//삽입: insertLastNode()
					System.out.print("Line(1), Rect(2), Circle(3)>>");
					type = sc.nextInt();
					insert(type);
					break;
				case 2 :
					//삭제 : deleteLastNode() 참고해서 만들기
					System.out.print("삭제할 위치를 입력해주세요>>");
					loc = sc.nextInt();
					delete(loc);
					break;
				case 3 :
					//모두보기 //printList()참고하기
					printList();
					break;
				case 4 :
					//종료
					break;
			}
			
		}
		
		
	}
	


	//1.입력
	private void insert(int type) {
		// TODO Auto-generated method stub
		
	}

	//2.삭제
	private void delete(int loc) {
		// TODO Auto-generated method stub
		
	}
	
	
	//3.조회:모두보기(출력)
	private void printList() {
		// TODO Auto-generated method stub
		
	}
}
