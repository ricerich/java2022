package ex03;

import java.util.Scanner;

public class EX14 {

	public static void main(String[] args) {

		String course [] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("과목 이름>>");
			String name = sc.next();
			
			//if(name == "그만")
			if(name.equals("그만"))
			{
				System.out.println("종료합니다!");
				break;
			}
			
			for(int i=0; i<course.length; ++i)
			{
//				if(course[i].equals(name))
				if(name.equals(course[i]))
				{
					System.out.println(name+"의 점수는 " + score[i]);
					break;
				}
				
				if(i==course.length-1)
					System.out.println("없는 과목입니다!");
			}
		}
		sc.close();
	}

}
