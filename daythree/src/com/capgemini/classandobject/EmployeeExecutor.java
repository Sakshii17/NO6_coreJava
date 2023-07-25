//driver class
package com.capgemini.classandobject;

public class EmployeeExecutor {
	public static void main(String[]args) {
		//object creation
		Employee e=new Employee();
		e.empID=123456;
		e.empName="Sakshi";
		e.Salary=80000;
		e.Department="IT";
		//method call
		e.display();
		
	}

}
