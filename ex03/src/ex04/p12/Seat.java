package ex04.p12;

public class Seat 
{
	private String name;
	//private int seatNum;//이건 배열의 인덱스를 활용할 예정

	//1.예약
	public void reserve(String name) {
		this.name = name;
	}
	
	//2.조회
	public String getName() {
		return name;
	}
	
	//3.취소(예약 취소)
	public void cancel() {
		this.name = null;
	}
}
