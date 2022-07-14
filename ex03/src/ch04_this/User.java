package ch04_this;

class User 
{
	//멤버 변수는 무조건 private
	private String name;
	private int 	age;
	
	
	public void setName(String name)
	{
		this.name = name;
		printName();
	}
	
	
	private void printName()
	{
		System.out.println("이름은= "+name);
	}

}
