package call_by_refence;

public class Math 
{
	//메소드 만들기
	void add(int a, int b)
	{
		a =  a + 10;
		System.out.println("Math의 add의 a는 " + a);
	}
	
	void changeArr(int arr1[]) {
		arr1[0] = 77;
		System.out.println("Math의 changeArr의 arr1는 " + arr1[0]);
	}
	
	void changeAge(User u)
	{
		u.age = 22;
		System.out.println("Math의 changeAge의 u.age는 " + u.age);
	}
	
	int substract(int b)
	{
		b = b-10;
		System.out.println("Math의 add의 b는 " + b);
		return b;
	}

}








