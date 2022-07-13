package call_by_refence;

public class Basic {

	public static void main(String[] args) 
	{
		//1.call by value : 대상:기본자료형(예:int, char...)
		int a = 10;
		
		Math m1 = new Math();
		m1.add(a, 5);
		
		System.out.println("Basic의 main의 a는 " + a);
		
		//2.call by reference (2종류:배열, 객체)
		
		//2-1.배열일 경우(파라미터가)
		int arr[] = {10, 12, 8};
		System.out.println("Basic의 main의 arr[0]는 " + arr[0]);
		
		Math m2 = new Math();
		m2.changeArr(arr);
		
		System.out.println("Basic의 main의 arr[0]는 " + arr[0]);
		
		//2-2.객체일 경우(파라미터가)
		
		User u1 = new User();
		u1.age = 17;
		
		System.out.println("Basic의 main의 u1.age는 " + u1.age);
		
		Math m3 = new Math();
		m3.changeAge(u1);

		System.out.println("Basic의 main의 u1.age는 " + u1.age);
		
		//파라미터(in)이 아니고, 반환값(out)으로 받는 경우
		
		int b = 99;
		
		m3.substract(b);
		System.out.println("Basic의 main의 b는 " + b);
		
		b = m3.substract(b);
		System.out.println("Basic의 main의 b는 " + b);
	}
}
