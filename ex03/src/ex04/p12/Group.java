package ex04.p12;

import java.util.Scanner;

public class Group 
{
	private char type; // 'S','A','B'
	private Seat seatArr[];
	
	private Scanner sc;
	
	public Group(char type,int cnt) 
	{
		sc = new Scanner(System.in);
		
		this.type = type;		
		this.seatArr = new Seat[cnt];
		for(int i=0; i<seatArr.length; ++i)
			seatArr[i] = new Seat();
	}
	
	//1.예약
	public void reserve() 
	{
//		Seat s1 = new Seat();
//		s1.reserve("홍길동");
		
		
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int no = sc.nextInt();
		
		//예) S타입 10자리 중에 하나인 3번째 자리 예약
//		seatArr[no-1].reserve("홍길동");
		seatArr[no-1].reserve(name);
	}
	
	//2.조회
	public void printAll() {
//		for(int i=0; i<10;++i)
		for(int i=0; i<seatArr.length;++i)
		{
			//이름이 없을경우, 있을 경우, 판별 메소드 필요
			//if(isSeat())
			String name = seatArr[i].getName();
			System.out.print(name);
//			else
//				System.out.print("--- ");
		}
	}
	
	//3.취소
	public void cancel()
	{
		
	}
	
	
	
}
