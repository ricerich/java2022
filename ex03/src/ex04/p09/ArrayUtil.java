package ex04.p09;

public class ArrayUtil {

	public static int[] concat(int[] array1, int[] array2) 
	{
		int array3[] = new int[array1.length + array2.length];
		
		//4개짜리 복사
		for(int i=0; i<array1.length;++i) 
			array3[i] = array1[i];
		
		//5개짜리 복사
		for(int i=0; i<array2.length;++i)  {
			int index = array1.length;
			array3[index+i] = array2[i];
		}
		
		return array3;//예)9개짜리 배열로 반환
	}

	public static void print(int[] arr) 
	{
		System.out.print("[");
		for(int i=0; i<arr.length;++i)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		
	}

}




