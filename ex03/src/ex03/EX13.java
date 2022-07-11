package ex03;

public class EX13 {

	public static void main(String[] args) 
	{
		
		//1.10자리수와 1의 자리수를 구한다.
		//2.각자리의 수가 3의 배수이면, 카운팅한다.
		
		
		int cnt = 0;
		
		for(int i=0; i<100; ++i)
		{
			//10의 자리수 구하기
			int ten = i/10;//10의 자리수 구하기
			int one = i%10;// 1의 자리수 구하기
			
			if(ten==3 || ten==6 || ten==9)//3의 배수 (3,6,9
				cnt++;
			
			if(one==3 || one==6 || one==9)//3의 배수 (3,6,9
				cnt++;
			
//			String str1="";
//			if(cnt == 1)
//			{
//				str1="박수짝";
//				System.out.println(i + str1);
//			}
//			else if(cnt==2)
//			{
//				str1="박수짝짝";
//				System.out.println(i + str1);
//			}
			
			String str1[] = {"박수짝","박수짝짝"};
			
			if(cnt > 0)//cnt가 1개이면 박수짝, 배열의 [0]인덱스
				System.out.println(i + str1[cnt-1]);
			
			cnt=0;
		}
	}
	
	
	
	
	
	

}
