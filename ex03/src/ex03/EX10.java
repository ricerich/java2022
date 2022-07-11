package ex03;

public class EX10 {

	public static void main(String[] args) 
	{
		int arr1[][] = new int[4][4];
		
		//1.배열에 0으로 값넣기
		for(int i=0; i< arr1.length; ++i)
			for(int j=0; j<arr1[i].length;++j)
				arr1[i][j] = 0;
		
		//1-2.배열에 랜덤값 10개, 랜덤위치
		
		int cnt=0; 
		while(cnt<10)
		{
			int r_i = (int)(Math.random()*4);
			int r_j = (int)(Math.random()*4);
			
			if(arr1[r_i][r_j] != 0)
				continue;
				
			arr1[r_i][r_j] = (int)(Math.random()*10+1);
			
			cnt++;
		}
		
		//2.배열 사용하기
		for(int i=0; i< arr1.length; ++i){
			for(int j=0; j<arr1[i].length;++j){
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}		

	}

}
