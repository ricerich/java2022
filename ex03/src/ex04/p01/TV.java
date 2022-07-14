package ex04.p01;

public class TV {

	private String name;
	private int year;
	private int inch;
	
	public TV(String name, int year, int inch) 
	{
		this.name = name;
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.print(name + "에서 만든 ");
		System.out.print(year +"년형");
		System.out.println(inch +"인치 TV");
	}
}
