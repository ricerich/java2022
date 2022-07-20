package ex05.p01_02;

public class Basic {

	public static void main(String[] args) {
		//1번
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		//2번
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048 컬러 
		iptv.printProperty();
	}

}
