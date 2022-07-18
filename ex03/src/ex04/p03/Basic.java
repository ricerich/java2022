package ex04.p03;

public class Basic {

	public static void main(String[] args) 
	{
		Song song1 = new Song("댄싱퀸","아바",1978,"스웨덴");
		song1.show();
		
		new Song("좋은날", "아이유", 2015, "한국").show();

		Song s2 = new Song();
		s2.show();
	}

}
