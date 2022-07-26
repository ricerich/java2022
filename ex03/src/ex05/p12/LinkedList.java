package ex05.p12;

import java.util.Scanner;

public class LinkedList 
{
	
	private Shape head = null;
//	Shape link = null;
	
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
	private void insert(int type) 
	{
		Shape obj1 = null;
		switch(type)
		{
			case 1:
				obj1 = new Line();
				break;
			case 2:
				obj1 = new Rect();
				break;
			case 3:
				obj1 = new Circle();
				break;
		}
		
		if(head == null)
			head = obj1;
		else
		{
			Shape temp = head;
			while(temp.getNext() != null)
			{
				temp = temp.getNext();				
			}
			temp.setNext(obj1);
		}
	}

	//2.삭제
	private void delete(int loc) 
	{
		if(head ==null)
			return;
		
		Shape pre, temp;
		
		pre = head;
		temp = head;
		
		for(int i=0; i<loc; ++i)
		{
			pre = temp;
			temp = temp.getNext();
			if(temp == null)
			{
				System.out.println("해당위치는 너무 큽니다~!");
				return;
			}
		}
		
		if(temp==head) //첫번째 삭제하면, 두번째를 헤드로
			head = head.getNext();
		else if(temp.getNext()==null) //마지막 원소일 경우, null
			pre.setNext(null);
		else
			pre.setNext(temp.getNext());
		
	}
	
	
	//3.조회:모두보기(출력)
	private void printList() {
		
		while(head != null)
		{
			head.draw();
			head = head.getNext();
//			head = head.next;
		}
		
	}
}
