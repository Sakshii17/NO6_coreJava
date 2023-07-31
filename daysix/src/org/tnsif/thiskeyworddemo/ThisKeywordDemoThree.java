package org.tnsif.thiskeyworddemo;
class Team
{
	int size;
	Team()
	{
		this(7);
		System.out.println("Default Constructor");
	}
	Team (int size)
	{
		System.out.println("parameterized constructor: "+size);
	}
}
public class ThisKeywordDemoThree {

	public static void main(String[] args) {
		Team t=new Team();
		//t.display();
		

	}

}
