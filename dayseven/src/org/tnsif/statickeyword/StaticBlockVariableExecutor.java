package org.tnsif.statickeyword;
public class StaticBlockVariableExecutor {
	String str;
	static float salary;
	/* static block is used to initialize the static variable
	 * and we can't initialize any non-static variable inside the static block*/
	
	static {
		salary=5461.15f;
		//str="BKC";
		System.out.println(salary);
	}
	/*static void print()
	{
		System.out.println(salary);
	}
	*/

	public static void main(String[] args) {
		
		/*main function is static and hence it calls static block, method and variable
		 * by default*/
		// print(); 

	}

}
