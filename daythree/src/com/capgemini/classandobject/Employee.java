// program to demonstrate on class and object
package com.capgemini.classandobject;
//class declaration
public class Employee {
	
	//default data members
	int empID;
	String empName;
	float Salary;
	String Department;
	
	//method declaration and definition
	void display()
	{
		System.out.println("EMP ID: "+empID+" "+"EMP NAME: "+empName+" "+
				"Salary : "+Salary+" "+"Department: "+Department+" ");
	}
}
