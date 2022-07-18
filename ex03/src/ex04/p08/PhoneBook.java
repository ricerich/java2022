package ex04.p08;

import java.util.Scanner;

public class PhoneBook 
{
	private Scanner sc;
	private Phone arrPhone[];
	
	public PhoneBook()
	{
		sc = new Scanner(System.in);
	}
	
	void run()
	{
		input();
		search();
		
		sc.close();
	}
	
	//1.입력
	void input()
	{
		System.out.print("인원수>>");
		int n = sc.nextInt();
		
		arrPhone = new Phone[n];
		
		for(int i=0; i<arrPhone.length; ++i)
		{
			System.out.print("이름과 전화번호 입력>>");
			String name = sc.next();
			String tel = sc.next();
			arrPhone[i] = new Phone(name, tel);
		}
		
		System.out.println("저장되었습니다...");
		
	}
	//2.검색
	void search()
	{
		while(true)
		{
			System.out.print("검색할 이름>>");
			String name = sc.next();
						
			if(name.equals("그만"))
			{
				System.out.println("종료합니다!");
				break;
			}
			
			for(int i=0; i<arrPhone.length; ++i)
			{
				//arrPhone[i].getName().equals(name);
				if(name.equals(arrPhone[i].getName()))
				{
					System.out.println(name+"의 전화번호는 "+arrPhone[i].getTel()+" 입니다");
					break;
				}
				else
				{
					if(i == arrPhone.length-1)//마지막일때
						System.out.println(name +"이 없습니다.");
				}
			}
			
		}
		
	}
//	//3.종료
//	void finish()
//	{
//		
//	}

}
