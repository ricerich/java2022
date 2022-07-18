package ex04.p07;

import java.util.Scanner;

public class MonthSchedule 
{
	Scanner sc;
	
	Day day[];
	int totalDay;

	public MonthSchedule(int n) {
		 sc = new Scanner(System.in);
		 day = new Day[n];
		 totalDay = n;
	}
	
	private void input()
	{
		System.out.print("날짜(1~30)?");	
		int n = sc.nextInt();
		
		if(n<1 || n>totalDay)
		{
			System.out.println("없는 날짜입니다!");
			return;
		}
		
		System.out.print("할일(빈칸없이입력)");
		String todo = sc.next();
		
		day[n-1] = new Day();
		day[n-1].set(todo);
	}
	
	private void view()
	{
		System.out.print("날짜(1~30)?");	
		int n = sc.nextInt();
		
		if(n<1 || n>totalDay)
		{
			System.out.println("없는 날짜입니다!");
			return;
		}
		
		if(day[n-1] != null) {
			System.out.println(n+"일의 할 일은 ");
			day[n-1].show();
		}
		else
			System.out.println("스케쥴이 없는 날입니다!");
	}
	
	private void finish()
	{
		System.out.println("프로그램을 종료합니다!");
	}

	public void run() {
		
		System.out.println("이번 달 스케쥴 관리 프로그램~!");
		
		while(true)
		{
			System.out.print("할일(1:입력, 2:보기, 3:끝내기) >>");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1://입력
					input();
					break;
				case 2://보기
					view();
					break;
				case 3://끝내기
					finish();
					return;
				default :
					System.out.println("1~3 사이의 수를 입력해주세요!");
			}
			System.out.println();
			
		}
	}

}












