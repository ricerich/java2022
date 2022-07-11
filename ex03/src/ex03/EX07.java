package ex03;

public class EX07 {

	public static void main(String[] args) 
	{
		//1.배열 만들기 10개짜리
		//2.배열에 값 입력, for, 랜덤
		//3.배열 사용하기, 요소의 합 구하기, 평균 구하기
		
		int arr1[] = new int[10];
		
		for(int i=0; i<arr1.length; i++)
			arr1[i]=(int)(Math.random()*10+1);
		
		double sum=0;
		for(int i=0; i<arr1.length; i++)
			sum = sum + arr1[i];
		
		System.out.print("랜덤한 정수들->");
		for(int i=0; i<arr1.length; i++)
			System.out.print(arr1[i] + " ");
		
		System.out.println();
		System.out.print("평균은 "+ (double)sum/arr1.length);
	}
}
