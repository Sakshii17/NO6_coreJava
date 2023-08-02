package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	static String Name="Sakshi";
	static float percentage=89.5f;
	//static method
	/* if any method outside the main function and if you want to access that method inside the 
	 * main function, make it as static*/
	static void displayScore(int Score)
	{
		//System.out.println(String);
		System.out.println(percentage);
		/*we can't use non-static variable inside the static method*/
		System.out.println("Score is : "+Score);
		
	}

	public static void main(String[] args) {
		displayScore(56);

	}

}
