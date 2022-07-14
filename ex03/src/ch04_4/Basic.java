package ch04_4;

public class Basic {
	public static void main (String args[]) 
	{
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		//ArrayParameter ap1 = new ArrayParameter();
		
		
		ArrayParameter.printCharArray(c);
		ArrayParameter.replaceSpace(c);
		ArrayParameter.printCharArray(c);
	}
}
