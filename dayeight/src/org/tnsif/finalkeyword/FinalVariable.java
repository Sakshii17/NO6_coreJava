// program to demonstrate on final keyword
package org.tnsif.finalkeyword;
public class FinalVariable {
	/*final variable must be initialize during declaration*/
	//final int x;
	
	final float SALARY=8000.56f;
	
	void print()
	{
		// we can't change the value of the final variable 
		//SALARY=45612.12f;
		System.out.println("Salary is: "+SALARY);
	}
}
