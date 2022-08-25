package booklist;

public class Basic {

	public static void main(String args[]) { // 메소드이면서 프로그램실행에 관여함

//		new Booklist().sqlRun();
//		new Booklist().sqlRun2();
		
		Booklist so = new Booklist();
		
		so.conDB();
		so.getBookList();
		
		so.conDB();
		so.getCustomerList();
		

	}
}
