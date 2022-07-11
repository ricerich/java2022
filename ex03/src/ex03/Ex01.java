package ex03;

public class Ex01 {

	public static void main(String[] args) 
	{
		int sum=0;
		
//		int i=0;		
//		while(i<100)
//		{
//			sum += i;//sum = sum + i;
//			i = i + 2;	//i +=2;		
//		}
		
		for(int i=0; i<100; i=i+2)
		{
			sum += i;
		}
		
		System.out.println("1~99까지의 짝수의 합계"+sum);
	}
}
