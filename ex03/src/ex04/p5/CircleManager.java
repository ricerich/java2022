package ex04.p5;

import java.util.Scanner;

public class CircleManager 
{
	public void run()
	{
		Scanner scanner =new Scanner(System.in);
		Circle c[] =new Circle[3];
		for(int i=0; i<c.length;++i)
		{
			System.out.print("x, y, radius >>>");
			double x =scanner.nextDouble();
			double y =scanner.nextDouble();
			int radius =scanner.nextInt();
			
			c[i]= new Circle(x, y, radius);
		}
						
//		for(int i=0; i<c.length;++i)
//			c[i].show();
		
		//최대값 구하기(객체 배열중에서 면적이 최대값을 갖는 객체 구하기)
		int max = 0;
		int max_index = 0;
		for(int i=0; i<c.length;++i)
		{
			int radius = c[i].getRadius();
			
			if(radius > max)
			{
				max = radius;
				max_index = i;
			}
		}
		
		c[max_index].show();
		
				
	}

}





