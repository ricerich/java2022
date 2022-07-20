package ex05.p01_02;

public class IPTV extends ColorTV{

	private String ip;
	
	public IPTV(String ip, int size, int color) 
	{
		super(size, color);
		this.ip = ip;
	}

	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ip+"주소의");
		System.out.print(getSize()+"인치 ");
		System.out.println(color+"컬러");
	}
	
	


}
